package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.processors.MapperProcessor;
import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelMapperRoute extends SpringRouteBuilder {

    @Autowired
    private HotelFeedRepository hotelFeedRepository;

    @Autowired
    private MapperProcessor mapperProcessor;

    @Override
    public void configure() throws Exception {

        from("timer://{{mapper.quartz.trigger}}").errorHandler(loggingErrorHandler(log))
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#feedDataSource").split(body()).transform()
                .simple("${body[countryCode]}").bean(hotelFeedRepository, "findByCountryCode").bean(mapperProcessor)
                .to("jpaContent:" + HotelMapping.class.getName() + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager&usePersist=true");

    }

}
