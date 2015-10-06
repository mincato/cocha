package com.cocha.hotels.hotelmapper.processors;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class DynamicGiataUriProcessor implements Processor {

    public static final String DYNAMIC_URI_KEY = "dynamicUriHeader";
    
    private Logger logger = Logger.getLogger(DynamicGiataUriProcessor.class);
    
    @Value("${mate.provider.giata.address.xml}")
    private String staticUri;
    
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.setPattern(ExchangePattern.InOut);
        Message inMessage = exchange.getIn();
        
        String eanId = inMessage.getBody(HotelMapping.class).getSupplierHotelId();
        String uri = staticUri + "/" + eanId;
        inMessage.setHeader(Exchange.HTTP_URI, uri);
        inMessage.setBody(null);
        
        logger.info("GIATA URI: " + uri);
    }

}
