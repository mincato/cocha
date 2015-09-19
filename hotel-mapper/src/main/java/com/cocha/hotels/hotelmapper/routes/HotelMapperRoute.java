package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.processors.MapperProcessor;
import com.cocha.hotels.hotelmapper.repositories.HotelRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelMapperRoute extends SpringRouteBuilder {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private MapperProcessor mapperProcessor;

    @Override
    public void configure() throws Exception {

        from("timer://{{mapper.quartz.trigger}}").errorHandler(loggingErrorHandler(log))
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#dataSource").split(body()).transform()
                .simple("${body[countryCode]}").bean(hotelRepository, "findByCountryCode").bean(mapperProcessor)
                .to("jpa:" + HotelMapping.class.getName() + "?entityType=java.util.ArrayList");

    }

}
