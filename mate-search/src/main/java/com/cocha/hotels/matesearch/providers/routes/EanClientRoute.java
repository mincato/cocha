package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.EanClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class EanClientRoute extends RouteBuilder {

    @Autowired
    private EanClientProcessor eanClientProcessor;
    
    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {
    	onException(RuntimeException.class).handled(true).setHeader(Constant.SUPPLIER, simple(CodeSupplier.EAN_SUPPLIER_CODE)).process(errorSupplierProcessor).end();
    	
        from("direct:sendEanAvailability").errorHandler(loggingErrorHandler(log)).process(eanClientProcessor)
                .wireTap("direct:logInfo").to("cxfrs:bean:eanClient").to("direct:transfomerResposeEAN");
    }
}
