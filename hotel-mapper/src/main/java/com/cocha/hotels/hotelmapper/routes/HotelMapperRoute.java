package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Predicate;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.managers.HotelMappingManager;
import com.cocha.hotels.hotelmapper.processors.DynamicGiataUriProcessor;
import com.cocha.hotels.hotelmapper.processors.GiataMapperProcessor;
import com.cocha.hotels.hotelmapper.processors.MapperProcessor;
import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.matesearch.canonical.factory.StatusFactory;

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

    @Autowired
    private HotelMappingManager hotelMappingManager;

    @Override
    public void configure() throws Exception {

        from("{{mapper.consumer.uri}}").errorHandler(loggingErrorHandler(log)).choice()
                .when(header("countryCode").isNotNull()).transform().simple("${header[countryCode]}")
                .to("direct:processMapper").to("direct:marshalResponse").otherwise()
                .to("sql:select distinct(countryCode) from Hotel?dataSource=#feedDataSource").split(body()).transform()
                .simple("${body[countryCode]}").to("direct:processMapper").end().end().to("direct:marshalResponse");

        from("direct:marshalResponse").bean(StatusFactory.class, "buildSuccessStatus").marshal()
                .json(JsonLibrary.Jackson).log(LoggingLevel.INFO, "Run Hotel Mapper successfully");

        from("direct:processMapper")
                .bean(hotelFeedRepository, "findByCountryCode")
                .bean(algorithmicMapperProcessor)
                .multicast()
                .to("jpaContent:" + HotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager",
                        "direct:content", "direct:sabreMappingThruGiata").end();

        from("direct:sabreMappingThruGiata")
                .split(body())
                .transform()
                .simple("${body}")
                .filter()
                .simple("${body.supplierCode} == \"EAN\" && ${body.confidence} == 100")
                .filter()
                .method(hotelMappingManager, "noExistSabreMapping")
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
                .to("jpaContent:" + HotelMapping.class.getName() + "?entityType=" + HotelMapping.class.getName()
                        + "&transactionManager=#contentTransactionManager").end()
                .log(LoggingLevel.INFO, "Run sabreMappingThruGiata successfully");
    }

}
