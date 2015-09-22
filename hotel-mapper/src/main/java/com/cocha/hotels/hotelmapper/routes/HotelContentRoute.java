package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.processors.HotelContentProcessor;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelContentRoute extends SpringRouteBuilder {

    @Autowired
    private HotelContentProcessor hotelContentProcessor;

    @Override
    public void configure() throws Exception {

        from(
                "jpaContent:"
                        + HotelMapping.class.getName()
                        + "?consumer.namedQuery=getMappingByConfidence&consumeDelete=false&transactionManager=#contentTransactionManager")
                .routeId("HotelContentRoute").errorHandler(loggingErrorHandler(log))
                .bean(hotelContentProcessor, "process")
                .to("jpaContent:" + Hotel.class.getName() + "?transactionManager=#contentTransactionManager");

    }

}
