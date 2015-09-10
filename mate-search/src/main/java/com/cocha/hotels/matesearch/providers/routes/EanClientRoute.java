package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.EanClientProcessor;

/**
 * Defines the camel routes
 */
@Component
public class EanClientRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:sendEanAvailability").process(new EanClientProcessor()).to("cxfrs:bean:eanClient")
                .wireTap("direct:logInfo").log("Testing message");
    }
}
