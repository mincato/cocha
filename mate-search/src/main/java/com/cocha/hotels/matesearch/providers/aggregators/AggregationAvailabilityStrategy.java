package com.cocha.hotels.matesearch.providers.aggregators;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.matesearch.util.ErrorInternal;
import com.cocha.hotels.model.matesearch.canonical.ErrorSupplier;
import com.cocha.hotels.model.matesearch.canonical.RateForSupplier;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelSummary;
import com.cocha.hotels.model.matesearch.respose.supplier.IdMapping;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;

@Component
public class AggregationAvailabilityStrategy implements AggregationStrategy {

    private static final Logger log = Logger.getLogger(AggregationAvailabilityStrategy.class);

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        try {

    		HotelList hotels;
    		ResposeSuppliers resposeSuppliers;
    		ErrorInternal errorInternal;
    		
            if (newExchange.getIn().getBody(HotelList.class) instanceof HotelList) {

                hotels = newExchange.getIn().getBody(HotelList.class);
                return newExchange;

            } else if (newExchange.getIn().getBody(ResposeSuppliers.class) instanceof ResposeSuppliers) {

                hotels = oldExchange.getIn().getBody(HotelList.class);

                Map<String, Object> parameters = oldExchange.getIn().getHeaders();

                resposeSuppliers = newExchange.getIn().getBody(ResposeSuppliers.class);

                this.addRates(hotels, resposeSuppliers, parameters);
                
                oldExchange.getIn().setBody(hotels);

            } else if (newExchange.getIn().getBody(ErrorInternal.class) instanceof ErrorInternal) {

                hotels = oldExchange.getIn().getBody(HotelList.class);
                errorInternal = newExchange.getIn().getBody(ErrorInternal.class);
                Map<String, Object> parameters = oldExchange.getIn().getHeaders();

                this.addErrors(hotels, errorInternal, parameters);

            }

            return oldExchange;

        } catch (Exception e) {
            log.info("Error al reunir las respuestas de los supplier");
            if (oldExchange == null) {
                return newExchange;
            } else {
                return oldExchange;
            }
        }

    }

	private void addRates(HotelList hotels, ResposeSuppliers resposeSuppliers, Map<String, Object> parameters) throws ParseException {

        List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));

        Long diffDays = this.diffDays((String)parameters.get(Constant.ARRIVAL_DATE), (String) parameters.get(Constant.DEPARTURE_DATE)); 
        
        for (String id : ids) {

            Optional<HotelSummary> hotelOptinal = hotels.getHotelSummary().stream()
                    .filter((HotelSummary hotel) -> hotel.getHotelId().equals(id)).findFirst();

            IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getHotelId());

            Optional<RateInfoForSupplier> rateForSupplierOptional = null;

            switch (resposeSuppliers.getCodeSupplier()) {

                case CodeSupplier.BOOKING_SUPPLIER_CODE:
                    rateForSupplierOptional = resposeSuppliers
                            .getRateForSupplier()
                            .stream()
                            .filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(
                                    idMapping.getSupplierBooking())).findFirst();
                    break;
                case CodeSupplier.EAN_SUPPLIER_CODE:
                    rateForSupplierOptional = resposeSuppliers
                            .getRateForSupplier()
                            .stream()
                            .filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(
                                    idMapping.getSupplierEAN())).findFirst();
                    break;
                case CodeSupplier.SABRE_SUPPLIER_CODE:
                    rateForSupplierOptional = resposeSuppliers
                            .getRateForSupplier()
                            .stream()
                            .filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier()
                                    .replaceFirst("^0+(?!$)", "").equals(idMapping.getSupplierSabre())).findFirst();
                    break;
            }
            
            
            if (rateForSupplierOptional.isPresent()) {
            	
            	if(this.isAvailability(rateForSupplierOptional.get())) {

            		this.calculateAverage(rateForSupplierOptional.get(), diffDays);
            		
            		this.addRate(hotelOptinal.get(), rateForSupplierOptional.get());
            		
            	} else {
            		this.addNotAvailability(hotelOptinal.get(), rateForSupplierOptional.get());
            	}
       
            } else if(resposeSuppliers.getRateForSupplier().isEmpty()) {
            	RateInfoForSupplier rateInfoForSupplier = new RateInfoForSupplier();
            	rateInfoForSupplier.setIdSupplier(idMapping.getSupplierBooking());
            	rateInfoForSupplier.setCodeSupplier(resposeSuppliers.getCodeSupplier());
            	this.addNotAvailability(hotelOptinal.get(), rateInfoForSupplier);
            }
        }

    }

    private void addRate(HotelSummary hotel, RateInfoForSupplier rateInfoForSupplier) {
	
	    RateInfo rateInfo = hotel.getRateInfo();
	    rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
	    Status status = new Status("200", "success");
	    RateForSupplier rateForSupplier = new RateForSupplier();
	    rateForSupplier.setStatus(status);
	    rateForSupplier.setAvailability((RateInfoForSupplier) rateInfoForSupplier);
	    rateInfo.getRateForSupplier().add(rateForSupplier);
	
	}

	private void addErrors(HotelList hotels, ErrorInternal errorInternal, Map<String, Object> parameters) {
	
	    List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
	
	    for (String id : ids) {
	    	
	    	ErrorSupplier errorSupplier = new ErrorSupplier(errorInternal.getCodeSupplier());
	
	        Optional<HotelSummary> hotelOptinal = hotels.getHotelSummary().stream()
	                .filter((HotelSummary hotel) -> hotel.getHotelId().equals(id)).findFirst();
	
	        IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getHotelId());
	
			switch (errorInternal.getCodeSupplier()) {
	
			case CodeSupplier.BOOKING_SUPPLIER_CODE:
				errorSupplier.setIdSupplier(idMapping.getSupplierBooking());
				break;
			case CodeSupplier.EAN_SUPPLIER_CODE:
				errorSupplier.setIdSupplier(idMapping.getSupplierEAN());
				break;
			case CodeSupplier.SABRE_SUPPLIER_CODE:
				errorSupplier.setIdSupplier(idMapping.getSupplierSabre());
				break;
			}
	        this.addError(hotelOptinal.get(), errorSupplier, new Status("500", errorInternal.getCause()));
	    }
	}

	private void addError(HotelSummary hotel, ErrorSupplier errorSupplier, Status statusError) {
	
		if(!StringUtils.isBlank(errorSupplier.getIdSupplier())) {
			RateInfo rateInfo = hotel.getRateInfo();
			RateForSupplier rateForSupplier = new RateForSupplier();
			rateForSupplier.setStatus(statusError);
			rateForSupplier.setAvailability(errorSupplier);
			rateInfo.getRateForSupplier().add(rateForSupplier);			
		}
	
	}

	private void addNotAvailability(HotelSummary hotelSummary, RateInfoForSupplier rateInfoForSupplier) {
		
	    RateInfo rateInfo = hotelSummary.getRateInfo();
	    Status status = new Status("201", "No Availability");
	    RateForSupplier rateForSupplier = new RateForSupplier();
	    rateForSupplier.setStatus(status);
	    rateForSupplier.setAvailability((RateInfoForSupplier) rateInfoForSupplier);
	    rateInfo.getRateForSupplier().add(rateForSupplier);
		
	}

	private boolean isAvailability(RateInfoForSupplier rateInfoForSupplier) {
 
    	return rateInfoForSupplier.getLowRate() != null && rateInfoForSupplier.getHigtRate() != null;

    }

    private void calculateAverage(RateInfoForSupplier rateInfoForSupplier, Long diffDays) {
    	
    	if(!CodeSupplier.EAN_SUPPLIER_CODE.equals(rateInfoForSupplier.getCodeSupplier())) {

    		Float averageRate = rateInfoForSupplier.getLowRate() / diffDays;
    		DecimalFormat decimalFormat = new DecimalFormat("0.00");
    		String value = decimalFormat.format(averageRate.doubleValue());
    		averageRate = new Float(value.replace(",","."));
    		rateInfoForSupplier.setAverageBaseRate(averageRate);
    		
    	}
    	
	}

	private Long diffDays(String arrivalDate , String departureDate) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		Date arrival = format.parse(arrivalDate);
		Date departure = format.parse(departureDate);
		
		Long diff = departure.getTime() - arrival.getTime();
		
		Long diffDays = diff / (24 * 60 * 60 * 1000);
		
		return diffDays;
	}

}
