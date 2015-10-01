package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SabreChangeContextClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreChangeContextClientResponseProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreChangeContextClientRoute extends RouteBuilder {

    @Autowired
    private SabreChangeContextClientProcessor sabreChangeContextClientProcessor;
    
    @Autowired
    private  SabreChangeContextClientResponseProcessor sabreChangeContextClientResponseProcessor;
    

    @Override
    public void configure() throws Exception {
		from("direct:sendSabreChangeContext").errorHandler(loggingErrorHandler(log))
				.process(sabreChangeContextClientProcessor).wireTap("direct:logInfo").to("cxf:bean:sabreChangeContext")
				.process(sabreChangeContextClientResponseProcessor);
    }
}
