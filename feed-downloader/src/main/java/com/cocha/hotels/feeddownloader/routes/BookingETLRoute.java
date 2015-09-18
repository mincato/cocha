package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.booking.model.BookingHotelConstructor;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelDescriptionTranslations;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;

@Component
public class BookingETLRoute extends SpringRouteBuilder {

    public static final String BOOKING_ETL_ROUTE = "BookingEtlRoute";

    @Autowired
    private BookingHotelConstructor bookingHotelConstructor;

    @Override
    public void configure() throws Exception {
        from("file:{{feeds.input.booking}}").routeId(BOOKING_ETL_ROUTE).errorHandler(loggingErrorHandler(log))
                .convertBodyTo(GetHotelsResponse.class)
                .enrich("direct:description", AggregationStrategies.bean(bookingHotelConstructor))
                .to("jpa:com.cocha.hotels.model.content.hotel.Hotel?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "Booking hotels store on database successfully");

        from("direct:description").pollEnrich("file:{{feeds.input.booking.description}}").convertBodyTo(
                GetHotelDescriptionTranslations.class);

    }
}
