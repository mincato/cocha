package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HeaderDataProcessor;

/**
 * Defines the Sabre camel route
 */
@Component
public class BookingRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:jaxBookingServer")
        // FIXME refactor: el HeaderDataProcessor no puede inyectarse con IoC?
                .process(new HeaderDataProcessor()).to("direct:sendBookingAvailability").marshal().json(JsonLibrary.Jackson);
    }
}
