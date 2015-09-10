package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HeaderDataProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:sabreServer").wireTap("direct:logInfo").process(new HeaderDataProcessor())
                .to("direct:sendSabreAvailability");
    }
}
