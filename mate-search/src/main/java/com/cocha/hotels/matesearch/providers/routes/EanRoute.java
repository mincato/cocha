package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HeaderDataProcessor;

/**
 * Defines the camel route for Ean access service.
 */
@Component
public class EanRoute extends RouteBuilder {

    @Autowired
    private HeaderDataProcessor headerDataProcessor;

    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:jaxRsServer").process(headerDataProcessor).to("direct:sendEanAvailability");
    }
}
