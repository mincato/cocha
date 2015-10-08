package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;

import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS;

@Component
public class SabreClientResponseProcessor implements Processor {	
	
    @Override
    public void process(Exchange exchange) throws Exception {
    
    	Message inMessage = exchange.getIn();;    	
    	MessageContentsList result = (MessageContentsList)inMessage.getBody();
    
    	OTAHotelAvailRS hotelAvail = (OTAHotelAvailRS) result.get(0);
    	
    	inMessage.setBody(hotelAvail);
    }
}
