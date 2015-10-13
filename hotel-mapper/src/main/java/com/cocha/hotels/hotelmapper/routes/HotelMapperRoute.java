package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Predicate;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.processors.DynamicGiataUriProcessor;
import com.cocha.hotels.hotelmapper.processors.GiataMapperProcessor;
import com.cocha.hotels.hotelmapper.processors.MapperProcessor;
import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelMapperRoute extends SpringRouteBuilder {

    @Autowired
    private HotelFeedRepository hotelFeedRepository;

    @Autowired
    private MapperProcessor algorithmicMapperProcessor;

    @Autowired
    private GiataMapperProcessor giataMapperProcessor;

    @Autowired
    private DynamicGiataUriProcessor dynamicUriProcessor;

    @Value("${mate.provider.giata.address.xml}")
    private String giataUri;

    @Value("${mate.provider.giata.xpath.expression}")
    private String giataXpathExpression;

    @Override
    public void configure() throws Exception {

        from("timer://{{mapper.quartz.trigger}}")
                .errorHandler(loggingErrorHandler(log))
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#feedDataSource")
                .split(body())
                .transform()
                .simple("${body[countryCode]}")
                .bean(hotelFeedRepository, "findByCountryCode")
                .bean(algorithmicMapperProcessor)
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
                .process(dynamicUriProcessor)
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .to(giataUri)
                // overloaded by dynamicUriProcessor using Exchange.HTTP_URI
                .setHeader("sabreId", xpath(giataXpathExpression, String.class))
                .filter(new Predicate() {

                    @Override
                    public boolean matches(Exchange exchange) {
                        String sabreId = exchange.getIn().getHeader("sabreId", String.class);
                        return sabreId.length() > 0;
                    }
                })
                .bean(giataMapperProcessor)
                .to("jpaContent:" + HotelMapping.class.getName()
                        + "?transactionManager=#contentTransactionManager&usePersist=true")
                .log(LoggingLevel.INFO, "Run sabreMappingThruGiata successfully");
    }

}
