package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreSessionClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreSessionClientResponseProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class SabreSessionClientRoute extends RouteBuilder {

    @Autowired
    private SabreSessionClientProcessor sabreSessionClientProcessor;

    @Autowired
    private SabreSessionClientResponseProcessor sabreSessionClientResponseProcessor;
    
    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {
    	
    	onException(RuntimeException.class).handled(true).setHeader(Constant.SUPPLIER, simple(CodeSupplier.SABRE_SUPPLIER_CODE)).process(errorSupplierProcessor).end();
    	
        from("direct:sendSabreSessionCreate").errorHandler(loggingErrorHandler(log))
                .process(sabreSessionClientProcessor).wireTap("direct:logInfo").to("cxf:bean:sabreSessionCreate")
                .process(sabreSessionClientResponseProcessor);
    }
}
