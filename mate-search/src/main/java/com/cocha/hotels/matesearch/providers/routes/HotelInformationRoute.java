package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.services.HotelInformation;

@Component
public class HotelInformationRoute extends RouteBuilder {

    @Autowired
    HotelInformation hotelInformation;

    @Override
    public void configure() throws Exception {
        from("direct:getHotelInformation").bean(hotelInformation);

    }

}
