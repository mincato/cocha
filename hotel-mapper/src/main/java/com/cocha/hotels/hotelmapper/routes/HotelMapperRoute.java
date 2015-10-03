package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.processors.GiataProcessor;
import com.cocha.hotels.hotelmapper.processors.MapperProcessor;
import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelMapperRoute extends SpringRouteBuilder {

    @Autowired
    private HotelFeedRepository hotelFeedRepository;

    @Autowired
    private MapperProcessor mapperProcessor;
    
    @Autowired
    private GiataProcessor giataProcessor;

    @Override
    public void configure() throws Exception {

        from("timer://{{mapper.quartz.trigger}}")
                .errorHandler(loggingErrorHandler(log))
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#feedDataSource")
                .split(body())
                .transform()
                .simple("${body[countryCode]}")
                .bean(hotelFeedRepository, "findByCountryCode")
                .bean(mapperProcessor)
                .multicast()
                .to("jpaContent:"
                        + HotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager&usePersist=true",
                        "seda:content", "direct:sabreMappingThruGiata");

        from("direct:sabreMappingThruGiata")
                .split(body())
                .transform()
                .simple("${body}")
                .filter()
                .simple("${body.supplierCode} == \"EAN\" && ${body.confidence} == 100")
                .recipientList()
                //enrich("", AggregationStrategies.bean(giataProcessor))
                //TODO aggregator por acá para armar un List<HotelMapping>
                .to("jpaContent:"
                        + HotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager&usePersist=true")
                .log(LoggingLevel.INFO, "Run sabreMappingThruGiata successfully");
    }

}
