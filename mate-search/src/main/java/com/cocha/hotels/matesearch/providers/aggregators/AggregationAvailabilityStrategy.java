package com.cocha.hotels.matesearch.providers.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;



public class AggregationAvailabilityStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    	
    	Hotel hotel;
    	Exchange exchange = null;
    	RateInfoForSupplier rateInfoForSupplier;
    	
    	if (newExchange.getIn().getBody(Hotel.class) instanceof Hotel) {
    		   		
    		exchange = newExchange;
    		
    	} else if (newExchange.getIn().getBody(RateInfoForSupplier.class) instanceof RateInfoForSupplier) {
    		
    		hotel = oldExchange.getIn().getBody(Hotel.class);
    		rateInfoForSupplier = newExchange.getIn().getBody(RateInfoForSupplier.class);
    		this.addRate(hotel,rateInfoForSupplier);
    		
    		oldExchange.getIn().setBody(hotel);
    		
    		exchange = oldExchange;
    	}
    	
    	return exchange;
    }

	private void addRate(Hotel hotel, RateInfoForSupplier rateInfoForSupplier) {

		RateInfo rateInfo = hotel.getRateInfo();
		rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
		rateInfo.add(rateInfoForSupplier);
		
	}
}
