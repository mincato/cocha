package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.booking.model.GetRegionsResponse;
import com.cocha.hotels.model.content.geo.Region;

@Component
public class BookingETLGeoRoute extends SpringRouteBuilder {

    public static final String BOOKING_REGION_FEED_ROUTE = "BookingRegionFeedRoute";

    @Override
    public void configure() throws Exception {

        from("file:{{feeds.input.booking.geo.reg}}").errorHandler(loggingErrorHandler(log)).choice()
                .when(simple("${file:onlyname} contains 'regions'")).to("direct:processBookingRegions").otherwise()
                .log(LoggingLevel.INFO, "File not supported");

        from("direct:processBookingRegions").routeId(BOOKING_REGION_FEED_ROUTE).errorHandler(loggingErrorHandler(log))
                .log(LoggingLevel.INFO, "Processing Booking regions").convertBodyTo(GetRegionsResponse.class)
                .to("jpa:" + Region.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "Booking Region store on database successfully");
    }
}
