package com.cocha.hotels.matesearch.providers.routes;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.hazelcast.HazelcastConstants;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.language.bean.BeanLanguage;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.aggregators.AggregationAvailabilityStrategy;
import com.cocha.hotels.matesearch.providers.processors.ErrorMateProcessor;
import com.cocha.hotels.matesearch.providers.processors.HotelListHeaderDataProcessor;
import com.cocha.hotels.matesearch.providers.services.CacheKeyGenerator;
import com.cocha.hotels.matesearch.providers.services.rest.response.HotelListResponseBuilder;
import com.cocha.hotels.model.matesearch.canonical.response.HotelListResponse;

/**
 * Defines the camel routes
 */
@Component
public class HotelRoute extends RouteBuilder {

    @Autowired
    private HotelListHeaderDataProcessor hotelListHeaderDataProcessor;

    @Autowired
    AggregationAvailabilityStrategy aggregationAvailabilityStrategy;

    @Autowired
    ErrorMateProcessor errorMateProcessor;

    @Autowired
    private HotelListResponseBuilder hotelListResponseBuilder;

    @Autowired
    private CacheKeyGenerator cacheKeyGenerator;

    @Override
    public void configure() throws Exception {

        JaxbDataFormat jaxb = createHotelListResponseJaxbDataFormat();

        Predicate isJson = header("Content-Type").isEqualTo(MediaType.APPLICATION_JSON);
        Predicate isXml = header("Content-Type").isEqualTo(MediaType.APPLICATION_XML);

        onException(Exception.class).handled(true).process(errorMateProcessor).choice().when(isJson)
                .to("direct:JsonResponse").when(isXml).to("direct:XmlResponse");

        from("cxfrs:bean:hotelServer")
                .wireTap("direct:logInfo")
                .setHeader(HazelcastConstants.OPERATION, constant(HazelcastConstants.GET_OPERATION))
                .setHeader(HazelcastConstants.OBJECT_ID, BeanLanguage.bean(cacheKeyGenerator, "generateKeyForGet"))
                .toF("hazelcast:%savailability", HazelcastConstants.MAP_PREFIX)
                .choice()
                .when(simple("${body} == null"))
                .process(hotelListHeaderDataProcessor)
                .multicast()
                .aggregationStrategy(aggregationAvailabilityStrategy)
                .parallelProcessing()
                .to("direct:getHotelInformation", "direct:sendEanAvailability", "direct:sendBookingAvailability",
                        "direct:sendSabreAvailability").end().bean(hotelListResponseBuilder)
                .setHeader(HazelcastConstants.OPERATION, constant(HazelcastConstants.PUT_OPERATION))
                .setHeader(HazelcastConstants.OBJECT_ID, BeanLanguage.bean(cacheKeyGenerator, "generateKeyForPut"))
                .toF("hazelcast:%savailability", HazelcastConstants.MAP_PREFIX).end().choice().when(isJson)
                .to("direct:JsonResponse").when(isXml).to("direct:XmlResponse");

        from("direct:JsonResponse").marshal().json(JsonLibrary.Jackson).end();
        from("direct:XmlResponse").marshal(jaxb).end();
    }

    private JaxbDataFormat createHotelListResponseJaxbDataFormat() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(HotelListResponse.class);
        JaxbDataFormat jaxb = new JaxbDataFormat(jaxbContext);
        jaxb.setContextPath(HotelListResponse.class.getPackage().toString());
        jaxb.setIgnoreJAXBElement(true);
        return jaxb;
    }
}
