package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreChangeContextClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreChangeContextClientResponseProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class SabreChangeContextClientRoute extends RouteBuilder {

    @Autowired
    private SabreChangeContextClientProcessor sabreChangeContextClientProcessor;

    @Autowired
    private SabreChangeContextClientResponseProcessor sabreChangeContextClientResponseProcessor;
    
    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {
    	
    	onException(RuntimeException.class).handled(true).setHeader(Constant.SUPPLIER, simple(CodeSupplier.SABRE_SUPPLIER_CODE)).process(errorSupplierProcessor).end();
    	
        from("direct:sendSabreChangeContext").errorHandler(loggingErrorHandler(log))
                .process(sabreChangeContextClientProcessor).wireTap("direct:logInfo").to("cxf:bean:sabreChangeContext")
                .process(sabreChangeContextClientResponseProcessor);
    }
}
