package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.NoErrorHandlerBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.BookingClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.FailureResponseProcessor;

/**
 * Defines the camel routes
 */
@Component
public class BookingClientRoute extends RouteBuilder {

    @Autowired
    private BookingClientProcessor bookingProcessor;

    @Override
    public void configure() throws Exception {
        onException(Exception.class).handled(true).process(new FailureResponseProcessor());

        errorHandler(new NoErrorHandlerBuilder());

        from("direct:sendBookingAvailability").errorHandler(loggingErrorHandler(log)).process(bookingProcessor)
                .wireTap("direct:logInfo").to("cxfrs:bean:bookingClient").to("direct:transformerResposeBooking");

    }
}
