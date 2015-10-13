package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SabreClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreClientResponseProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreClientRoute extends RouteBuilder {

    @Autowired
    private SabreClientProcessor sabreClientProcessor;

    @Autowired
    private SabreClientResponseProcessor sabreClientResponseProcessor;

    @Override
    public void configure() throws Exception {

        from("direct:sendSabreAvailability").process(sabreClientProcessor).wireTap("direct:logInfo")
                .to("cxf:bean:sabreAvailability").log("Testing message").bean(sabreClientResponseProcessor)
                .to("direct:transformerResposeSabre");
    }
}
