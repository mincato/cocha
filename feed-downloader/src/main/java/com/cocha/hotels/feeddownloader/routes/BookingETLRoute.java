package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;

@Component
public class BookingETLRoute extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:{{feeds.input.booking}}").convertBodyTo(GetHotelsResponse.class).to(
                "jpa:com.cocha.hotels.model.content.hotel.Hotel?entityType=java.util.ArrayList");

    }

}
