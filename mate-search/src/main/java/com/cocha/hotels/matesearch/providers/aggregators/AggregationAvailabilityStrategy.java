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
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.HotelList;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
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
    	} else {
    		exchange = null;
    	}
    	
    	return exchange;
    }
    
	private void addRates(HotelList hotels, ResposeSuppliers resposeSuppliers, Map<String, Object> parameters) {
		
		
		List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
		
		for(String id : ids) {
			
			Optional<Hotel> hotelOptinal = hotels.getHotel().stream().filter((Hotel hotel) -> hotel.getId().equals(id)).findFirst();
			
			IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getId());
			
			Optional<RateInfoForSupplier> rateForSupplierOptional = null;
			
			switch (resposeSuppliers.getCodeSupplier()) {
			
			case CodeSupplier.BOOKING_SUPPLIER_CODE:
				rateForSupplierOptional = resposeSuppliers.getRateForSupplier().stream().filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(idMapping.getSupplierBooking())).findFirst();
				break;
			case CodeSupplier.EAN_SUPPLIER_CODE:
				rateForSupplierOptional = resposeSuppliers.getRateForSupplier().stream().filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(idMapping.getSupplierEAN())).findFirst();
				break;
			case CodeSupplier.SABRE_SUPPLIER_CODE:
				rateForSupplierOptional = resposeSuppliers.getRateForSupplier().stream().filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().replaceFirst("^0+(?!$)", "").equals(idMapping.getSupplierSabre())).findFirst();
				break;
			}
			
			if(rateForSupplierOptional.isPresent()) {
				this.addRate(hotelOptinal.get(), rateForSupplierOptional.get());
			}
		}
	}

	private void addRate(Hotel hotel, RateInfoForSupplier rateInfoForSupplier) {

		RateInfo rateInfo = hotel.getRateInfo();
		rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
		rateInfo.add(rateInfoForSupplier);
		
	}
}
