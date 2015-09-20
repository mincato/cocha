package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.booking.model.GetHotelDescriptionTranslations;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

@Component
public class BookingETLRoute extends SpringRouteBuilder {

    public static final String BOOKING_HOTEL_FEED_ROUTE = "BookingHotelFeedRoute";
    public static final String BOOKING_DESCRIPTION_FEED_ROUTE = "BookingDescriptionFeedRoute";

    @Override
    public void configure() throws Exception {

        from("file:{{feeds.input.booking}}").errorHandler(loggingErrorHandler(log)).choice()
                .when(simple("${file:onlyname} contains 'hotels'")).to("direct:processBookingHotels")
                .when(simple("${file:onlyname} contains 'descriptions'")).to("direct:processBookingDescriptions")
                .otherwise().log(LoggingLevel.INFO, "File not supported");

        from("direct:processBookingDescriptions").routeId(BOOKING_DESCRIPTION_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).log(LoggingLevel.INFO, "Processing Booking descriptions")
                .convertBodyTo(GetHotelDescriptionTranslations.class)
                .to("jpa:" + HotelDescription.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "Booking hotel descriptions store on database successfully");

        from("direct:processBookingHotels").routeId(BOOKING_HOTEL_FEED_ROUTE).errorHandler(loggingErrorHandler(log))
                .log(LoggingLevel.INFO, "Processing Booking hotels").convertBodyTo(GetHotelsResponse.class)
                .to("jpa:" + Hotel.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "Booking hotels store on database successfully");

    }
}
