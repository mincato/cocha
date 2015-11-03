package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.BookingClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class BookingClientRoute extends RouteBuilder {

    @Autowired
    private BookingClientProcessor bookingProcessor;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {

        onException(RuntimeException.class).handled(true)
                .setHeader(Constant.SUPPLIER, simple(CodeSupplier.BOOKING_SUPPLIER_CODE))
                .process(errorSupplierProcessor).end();

        from("direct:sendBookingAvailability").errorHandler(loggingErrorHandler(log)).process(bookingProcessor)
                .wireTap("direct:logInfo").to("cxfrs:bean:bookingClient").to("direct:transformerResposeBooking");

    }
}
