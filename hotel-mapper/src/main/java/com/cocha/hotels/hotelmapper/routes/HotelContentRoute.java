package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.processors.HotelContentProcessor;
import com.cocha.hotels.model.content.hotel.Hotel;

@Component
public class HotelContentRoute extends SpringRouteBuilder {

    @Autowired
    private HotelContentProcessor hotelContentProcessor;

    @Override
    public void configure() throws Exception {

        from("direct:content")
                .routeId("HotelContentRoute")
                .errorHandler(loggingErrorHandler(log))
                .bean(hotelContentProcessor, "process")
                .to("jpaContent:" + Hotel.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager")
                .log(LoggingLevel.INFO, "Hotels content store on database successfully");
        ;

    }
}
