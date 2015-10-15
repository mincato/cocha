package com.cocha.hotels.matesearch.providers.aggregators;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.HotelList;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.error.ErrorSupplier;
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
    		
    		if(resposeSuppliers.getRateForSupplier()  != null) {
    			this.addRates(hotels,resposeSuppliers,parameters);
    		}
    		
    		oldExchange.getIn().setBody(hotels);
    		
    		exchange = oldExchange;
    		
    	} else if (newExchange.getIn().getBody(ErrorSupplier.class) instanceof ErrorSupplier) {
    		
    		hotels = oldExchange.getIn().getBody(HotelList.class);
    		errorSupplier = newExchange.getIn().getBody(ErrorSupplier.class);
    		Map<String, Object> parameters = oldExchange.getIn().getHeaders(); 
    		
    		this.addErrors(hotels, errorSupplier, parameters);
    		
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
			
			if(rateForSupplierOptional.isPresent()) {
				this.addRate(hotelOptinal.get(), rateForSupplierOptional.get());
			} else {
				ErrorSupplier errorSupplier = new ErrorSupplier();
				errorSupplier.setCodeSupplier(resposeSuppliers.getCodeSupplier());
				errorSupplier.setIdSupplier(idSupplier);
				errorSupplier.setDetail("Error en la busqueda");
				this.addError(hotelOptinal.get(), errorSupplier);
			}
		}
	}
	
	
	private void addErrors (HotelList hotels, ErrorSupplier errorSupplier, Map<String, Object> parameters) {
		
		List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
		
		for(String id : ids) {
			
			Optional<Hotel> hotelOptinal = hotels.getHotels().stream().filter((Hotel hotel) -> hotel.getId().equals(id)).findFirst();
			
			IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getId());
			
			switch (errorSupplier.getCodeSupplier()) {
			
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
			
			errorSupplier.setDetail("Error en el Servicio");
			this.addError(hotelOptinal.get(), errorSupplier);
		}
	}
	

	private void addRate(Hotel hotel, RateInfoForSupplier rateInfoForSupplier) {

		RateInfo rateInfo = hotel.getRateInfo();
		rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
		rateInfo.add(rateInfoForSupplier);
		
	}
	
	private void addError(Hotel hotel, ErrorSupplier errorSupplier) {
		
		RateInfo rateInfo = hotel.getRateInfo();
		rateInfo.add(errorSupplier);
		
	}
}
