package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;

@Component
public class BookingETLRoute extends SpringRouteBuilder {

    public static final String BOOKING_ETL_ROUTE = "BookingEtlRoute";

    @Override
    public void configure() throws Exception {
        from("file:{{feeds.input.booking}}").routeId(BOOKING_ETL_ROUTE).errorHandler(loggingErrorHandler(log))
                .convertBodyTo(GetHotelsResponse.class)
                .to("jpa:com.cocha.hotels.model.content.hotel.Hotel?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "Booking hotels store on database successfully");

    }
}
