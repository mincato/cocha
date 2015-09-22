package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SabreClientProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreClientRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:sendSabreAvailability").process(new SabreClientProcessor()).wireTap("direct:logInfo")
                .to("spring-ws:https://sws-crt.cert.sabre.com/OTA_HotelAvailRQ?soapAction=OTA_HotelAvailLLSRQ")
                .log("Testing message").to("direct:transformerResposeSabre");
    }
}
