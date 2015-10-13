package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SabreSessionClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreSessionClientResponseProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreSessionClientRoute extends RouteBuilder {

    @Autowired
    private SabreSessionClientProcessor sabreSessionClientProcessor;

    @Autowired
    private SabreSessionClientResponseProcessor sabreSessionClientResponseProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:sendSabreSessionCreate").errorHandler(loggingErrorHandler(log))
                .process(sabreSessionClientProcessor).wireTap("direct:logInfo").to("cxf:bean:sabreSessionCreate")
                .process(sabreSessionClientResponseProcessor);
    }
}
