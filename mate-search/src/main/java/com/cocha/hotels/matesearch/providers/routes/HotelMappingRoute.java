package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HotelMappingProcessor;

/**
 * Defines the camel routes
 */
@Component
public class HotelMappingRoute extends RouteBuilder {

    @Autowired
    private HotelMappingProcessor hotelMappingProcessor;

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:hotelMappingsServer").wireTap("direct:logInfo").choice()
                .when(simple("${headers.operationName} == 'getHotelMappings'")).to("direct:getHotelMappings");

        from("direct:getHotelMappings").process(hotelMappingProcessor).marshal().json(JsonLibrary.Jackson)
                .wireTap("direct:logInfo");
    }
}
