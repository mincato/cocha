package com.cocha.hotels.matesearch.providers.aggregators;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.model.matesearch.canonical.ErrorSupplier;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.HotelList;
import com.cocha.hotels.model.matesearch.canonical.RateForSupplier;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.error.SupplierError;
import com.cocha.hotels.model.matesearch.respose.supplier.IdMapping;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;

@Component
public class AggregationAvailabilityStrategy implements AggregationStrategy {

    @Autowired
    HotelMappingRepository hotelMappingRepository;

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    	
		HotelList hotels;
    	ResposeSuppliers resposeSuppliers;
    	ErrorSupplier errorSupplier;
    	Exchange exchange;
    	
    	if (newExchange.getIn().getBody(HotelList.class) instanceof HotelList) {
    		   		
    		exchange = newExchange;
    		
    	} else if (newExchange.getIn().getBody(ResposeSuppliers.class) instanceof ResposeSuppliers) {
    		
    		hotels = oldExchange.getIn().getBody(HotelList.class);
    		
    		Map<String, Object> parameters = oldExchange.getIn().getHeaders(); 
    		
    		resposeSuppliers = newExchange.getIn().getBody(ResposeSuppliers.class);
    		
    		this.addRates(hotels,resposeSuppliers,parameters);
    		
    		oldExchange.getIn().setBody(hotels);
    		
    		exchange = oldExchange;
    		
    	} else if (newExchange.getIn().getBody(ErrorSupplier.class) instanceof ErrorSupplier) {
    		
    		hotels = oldExchange.getIn().getBody(HotelList.class);
    		errorSupplier = newExchange.getIn().getBody(ErrorSupplier.class);
    		Map<String, Object> parameters = oldExchange.getIn().getHeaders(); 
    		
    		this.addErrors(hotels, errorSupplier, parameters);
    		
    		exchange = oldExchange;
    		
    	} else if (newExchange.getIn().getBody(SupplierError.class) instanceof SupplierError) {
    	
    		hotels = oldExchange.getIn().getBody(HotelList.class);
    		errorSupplier = newExchange.getIn().getBody(SupplierError.class);
    		Map<String, Object> parameters = oldExchange.getIn().getHeaders(); 
    		
    		this.addErrors(hotels,(ErrorSupplier) errorSupplier, parameters);
    		
    		exchange = oldExchange;
    		
    	} else {
    		
    		exchange = oldExchange;    		
    		
    	}
    	
    	return exchange;
    }
    
	private void addRates(HotelList hotels, ResposeSuppliers resposeSuppliers, Map<String, Object> parameters) {
		
		String idSupplier = null;
		
		List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
		
		for(String id : ids) {
			
			Optional<Hotel> hotelOptinal = hotels.getHotels().stream().filter((Hotel hotel) -> hotel.getId().equals(id)).findFirst();
			
			IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getId());
			
			Optional<RateInfoForSupplier> rateForSupplierOptional = null;
			
			switch (resposeSuppliers.getCodeSupplier()) {
			
			case CodeSupplier.BOOKING_SUPPLIER_CODE:
				rateForSupplierOptional = resposeSuppliers.getRateForSupplier().stream().filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(idMapping.getSupplierBooking())).findFirst();
				idSupplier = idMapping.getSupplierBooking();
				break;
			case CodeSupplier.EAN_SUPPLIER_CODE:
				rateForSupplierOptional = resposeSuppliers.getRateForSupplier().stream().filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(idMapping.getSupplierEAN())).findFirst();
				idSupplier = idMapping.getSupplierEAN();
				break;
			case CodeSupplier.SABRE_SUPPLIER_CODE:
				rateForSupplierOptional = resposeSuppliers.getRateForSupplier().stream().filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().replaceFirst("^0+(?!$)", "").equals(idMapping.getSupplierSabre())).findFirst();
				idSupplier = idMapping.getSupplierSabre();
				break;
			}
			
			if(rateForSupplierOptional.isPresent() && this.isAvailability(rateForSupplierOptional.get())) {

				this.addRate(hotelOptinal.get(), rateForSupplierOptional.get());
			
			} else {
				if(idSupplier == null) {
					idSupplier = "0000000";
				}
				ErrorSupplier errorSupplier = new ErrorSupplier();
				errorSupplier.setCodeSupplier(resposeSuppliers.getCodeSupplier());
				errorSupplier.setIdSupplier(idSupplier);
				this.addError(hotelOptinal.get(),errorSupplier);
			
			}
		}
	}
	
	
	private boolean isAvailability(RateInfoForSupplier rateInfoForSupplier) {
		return rateInfoForSupplier.getLowRate() != null && rateInfoForSupplier.getHigtRate() != null;
	}

	private void addErrors (HotelList hotels, ErrorSupplier errorSupplier, Map<String, Object> parameters) {
		
		List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
		
		for(String id : ids) {
			
			Optional<Hotel> hotelOptinal = hotels.getHotels().stream().filter((Hotel hotel) -> hotel.getId().equals(id)).findFirst();
			
			IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getId());
			
			switch (errorSupplier.getCodeSupplier()) {
			
			case CodeSupplier.BOOKING_SUPPLIER_CODE:
				if(idMapping.getSupplierBooking() != null) {
					errorSupplier.setIdSupplier(idMapping.getSupplierBooking());					
				} else {
					errorSupplier.setIdSupplier("");
				}
				break;
			case CodeSupplier.EAN_SUPPLIER_CODE:
				if(idMapping.getSupplierEAN() != null) {
					errorSupplier.setIdSupplier(idMapping.getSupplierEAN());					
				} else {
					errorSupplier.setIdSupplier("");
				}
				break;
			case CodeSupplier.SABRE_SUPPLIER_CODE:
				if(idMapping.getSupplierSabre() != null) {
					errorSupplier.setIdSupplier(idMapping.getSupplierSabre());					
				} else {
					errorSupplier.setIdSupplier("");
				}
				break;
			}
			this.addError(hotelOptinal.get(), errorSupplier);
		}
	}
	

	private void addRate(Hotel hotel, RateInfoForSupplier rateInfoForSupplier) {

		RateInfo rateInfo = hotel.getRateInfo();
		rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
		Status status = new Status();
		status.setCode("200");
		status.setCause("success");
		RateForSupplier rateForSupplier = new RateForSupplier();
		rateForSupplier.setStatus(status);
		rateForSupplier.setAvailability((RateInfoForSupplier) rateInfoForSupplier);
		rateInfo.getRateForSupplier().add(rateForSupplier);
		
	}
	
	private void addError(Hotel hotel, ErrorSupplier errorSupplier) {
		
		RateInfo rateInfo = hotel.getRateInfo();
		Status status = new Status();
		status.setCode("500");
		status.setCause("Supplier Error");
		RateForSupplier rateForSupplier = new RateForSupplier();
		rateForSupplier.setStatus(status);
		rateForSupplier.setAvailability((ErrorSupplier) ObjectUtils.clone(errorSupplier));
		rateInfo.getRateForSupplier().add(rateForSupplier);
		
	}
}
