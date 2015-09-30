package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

@Component
public class SabreClientResponseProcessor implements Processor {	
	
    @Override
    public void process(Exchange exchange) throws Exception {
    
    	Message inMessage = exchange.getIn();;    	
    	MessageContentsList result = (MessageContentsList)inMessage.getBody();
    	
    
    	String status = "";
    	
    	
    	String token = "";   	
    	
    	String response = "<sessionCreate><status>"+status+"</status><token>"+token+"</token></sessionCreate>";
    	inMessage.setBody(response);
    }
}
