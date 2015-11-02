package com.cocha.hotels.destinationmapper.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.destinationmapper.processors.CoordinateMapperProcessor;
import com.cocha.hotels.destinationmapper.processors.ProviderHashSplitter;
import com.cocha.hotels.destinationmapper.processors.ProvidersProcessor;
import com.cocha.hotels.destinationmapper.processors.RegionMapperProcessor;
import com.cocha.hotels.destinationmapper.repositories.content.HotelContentRepository;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class RegionMapperRoute extends SpringRouteBuilder {

    @Autowired
    private HotelContentRepository hotelContentRepository;

    @Autowired
    private ProvidersProcessor providersProcessor;

    @Autowired
    private RegionMapperProcessor regionMapperProcessor;

    @Autowired
    private CoordinateMapperProcessor coordinateMapperProcessor;

    @Override
    public void configure() throws Exception {
        from("{{mapper.consumer.uri}}").errorHandler(loggingErrorHandler(log))
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#contentDataSource").split(body())
                .transform().simple("${body[countryCode]}")
                .log(LoggingLevel.INFO, "processing Region Mapping STARTED :country code: " + "${body}")
                .bean(hotelContentRepository, "findByCountryCode").bean(providersProcessor).split()
                .method(ProviderHashSplitter.class, "splitBody").choice()
                .when(simple("${in.header.providers} contains 'EAN'")).to("direct:singleEANHotelChannel")
                .when(simple("${in.header.providers} contains 'BKG'")).to("direct:singleBKGHotelChannel").otherwise()
                .log(LoggingLevel.INFO, "Run Region Hotel Mapper : supplierCode not supported");

        from("direct:singleEANHotelChannel")
                .errorHandler(loggingErrorHandler(log))
                .bean(regionMapperProcessor, "process")
                .to("jpaContent:" + RegionHotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager")
                .log(LoggingLevel.INFO, "Region Hotels from EAN store on database successfully");

        from("direct:singleBKGHotelChannel")
                .errorHandler(loggingErrorHandler(log))
                .bean(coordinateMapperProcessor, "process")
                .to("jpaContent:" + RegionHotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager")
                .log(LoggingLevel.INFO, "Region Hotels from BKG store on database successfully");

    }
}
