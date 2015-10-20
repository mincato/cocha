package com.cocha.hotels.destinationmapper.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class RegionMapperRoute extends SpringRouteBuilder {

    /*@Autowired
    private HotelFeedRepository hotelFeedRepository;

    @Autowired
    private MapperProcessor algorithmicMapperProcessor;*/       
 
    @Override
    public void configure() throws Exception {
        from("{{mapper.consumer.uri}}")
                .errorHandler(loggingErrorHandler(log))
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#feedDataSource")
                .split(body())
                .transform()
                .simple("${body[countryCode]}")
                //.bean(hotelFeedRepository, "findByCountryCode")
                //.bean(algorithmicMapperProcessor)
                .multicast()
                .parallelProcessing()
                .to("jpaContent:" + HotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager",
                        "seda:content", "direct:sabreMappingThruGiata").end()
                .log(LoggingLevel.INFO, "Run Hotel Mapper successfully");
    }
}
