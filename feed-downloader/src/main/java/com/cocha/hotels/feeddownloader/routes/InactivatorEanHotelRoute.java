package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class InactivatorEanHotelRoute extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {

        from("{{feed.inactivate.ean.hotel.consumer}}").errorHandler(loggingErrorHandler(log))
                .log(LoggingLevel.INFO, "Inactivating EAN hotels")
                .to("sql:{{ean.query.inactivateHotels}}?dataSource=#dataSource")
                .log(LoggingLevel.INFO, "EAN Hotels successfully inactivated");
    }
}
