package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HeaderDataProcessor;

/**
 * Defines the camel route for Ean access service.
 */
@Component
public class EanRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:jaxRsServer").process(new HeaderDataProcessor()).to("direct:sendEanAvailability");
    }
}
