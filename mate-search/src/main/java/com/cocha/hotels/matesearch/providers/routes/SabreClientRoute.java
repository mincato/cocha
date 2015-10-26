package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreClientResponseProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class SabreClientRoute extends RouteBuilder {

    @Autowired
    private SabreClientProcessor sabreClientProcessor;

    @Autowired
    private SabreClientResponseProcessor sabreClientResponseProcessor;
    
    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {

    	onException(RuntimeException.class).handled(true).setHeader(Constant.SUPPLIER, simple(CodeSupplier.SABRE_SUPPLIER_CODE)).bean(errorSupplierProcessor).end();
    	
        from("direct:sendSabreAvailability").process(sabreClientProcessor).wireTap("direct:logInfo")
                .to("cxf:bean:sabreAvailability").log("Testing message").bean(sabreClientResponseProcessor)
                .to("direct:transformerResposeSabre");
    }
}
