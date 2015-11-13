package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HotelProcessor;

/**
 * Defines the camel routes
 */
@Component
public class HotelContentRoute extends RouteBuilder {

    @Autowired
    private HotelProcessor hotelProcessor;

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:hotelContentServer").wireTap("direct:logInfo").choice()
                .when(simple("${headers.operationName} == 'getHotels'")).to("direct:getHotels");

        from("direct:getHotels").process(hotelProcessor).marshal().json(JsonLibrary.Jackson).wireTap("direct:logInfo");
    }
}
