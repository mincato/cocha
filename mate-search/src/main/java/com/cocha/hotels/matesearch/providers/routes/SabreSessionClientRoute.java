package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SabreSessionClientProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreSessionClientRoute extends RouteBuilder {

    @Autowired
    private SabreSessionClientProcessor sabreSessionClientProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:sendSabreSessionCreate").wireTap("direct:logInfo").process(sabreSessionClientProcessor)
                .to("cxf:bean:sabreSessionCreate");
    }
}
