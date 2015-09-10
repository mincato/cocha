package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.NoErrorHandlerBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.BookingClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.FailureResponseProcessor;

/**
 * Defines the camel routes
 */
@Component
public class BookingClientRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        onException(Exception.class).handled(true).process(new FailureResponseProcessor());
        errorHandler(new NoErrorHandlerBuilder());
        from("direct:sendBookingAvailability").handleFault().process(new BookingClientProcessor())
                .wireTap("direct:logInfo").to("cxfrs:bean:bookingClient").log("Testing message");
    }
}
