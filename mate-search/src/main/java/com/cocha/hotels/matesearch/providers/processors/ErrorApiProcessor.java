package com.cocha.hotels.matesearch.providers.processors;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.HotelList;
import com.cocha.hotels.model.matesearch.canonical.Status;

@Component
public class ErrorApiProcessor implements Processor {
	
    private static final Logger logg = Logger.getLogger(MateHeaderDataProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		
		if(exchange.getException() != null) {
			logg.info(exchange.getException());
		} else {
			logg.info("Ocurrio un error no tratados");
		}
		
		HotelList hotelList = new HotelList();
		Status	status = new Status("500","Error");
		hotelList.setStatus(status);
		hotelList.setHotels(new ArrayList<Hotel>());
		
		exchange.getIn().setBody(hotelList);
		
	}

}
