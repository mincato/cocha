package com.cocha.hotels.hotelmapper.processors;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class DynamicGiataUriProcessor implements Processor {

    public static final String DYNAMIC_URI_KEY = "dynamicUriHeader";
    private static final String MAPPING_SABRE_SERVICE = "sabre_tn";
    
    private Logger logger = Logger.getLogger(DynamicGiataUriProcessor.class);
    
    @Value("${mate.provider.giata.address.xml}")
    private String staticUri;
    
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.setPattern(ExchangePattern.InOut);

        Message inMessage = exchange.getIn();

        // seteo nombre de servicio para el binding con la llamada al servicio rest.
        inMessage.setHeader(CxfConstants.OPERATION_NAME, MAPPING_SABRE_SERVICE);
        inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
        
        logger.info("in msg es hotel mapper? " + (inMessage instanceof HotelMapping));
        String eanId = inMessage.getBody(HotelMapping.class).getSupplierHotelId();
        String uri = staticUri + "/" + eanId;
        inMessage.setHeader(DYNAMIC_URI_KEY, uri);
    }

}
