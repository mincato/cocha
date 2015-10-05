package com.cocha.hotels.matesearch.providers.aggregators;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.model.content.mapping.HotelList;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;


@Component
public class AggregationAvailabilityStrategy implements AggregationStrategy {
	
	@Autowired
	HotelMappingRepository hotelMappingRepository;

	@Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    	
		HotelList hotels;
    	ResposeSuppliers resposeSuppliers;
    	Exchange exchange = null;
    	
    	if (oldExchange == null) {
    		   		
    		exchange = newExchange;
    		
    	} else  {
    		
    		hotels = oldExchange.getIn().getBody(HotelList.class);
    		resposeSuppliers = newExchange.getIn().getBody(ResposeSuppliers.class);
    		this.addRates(hotels,resposeSuppliers);
    		
    		oldExchange.getIn().setBody(hotels);
    		
    		exchange = oldExchange;
    	}
    	
    	return exchange;
    }

    
    
    
	private void addRates(HotelList hotels, ResposeSuppliers resposeSuppliers) {
		
		for(Hotel hotel : hotels.getHotel()) {
			for(RateInfoForSupplier rateInfoForSupplier : resposeSuppliers.getRateForSupplier()) {
				
				List<HotelMapping> hotelMapping =  hotelMappingRepository.findByHotelId(hotel.getId());
				
				if(hotelMapping.get(0).getSupplierHotelId().equals(rateInfoForSupplier.getIdSupplier()) || hotelMapping.get(1).getSupplierHotelId().equals(rateInfoForSupplier.getIdSupplier())) {
					this.addRate(hotel, rateInfoForSupplier);					
				}
				
			}
		}
		
	}




	private void addRate(Hotel hotel, RateInfoForSupplier rateInfoForSupplier) {

		RateInfo rateInfo = hotel.getRateInfo();
		rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
		rateInfo.add(rateInfoForSupplier);
		
	}
}
