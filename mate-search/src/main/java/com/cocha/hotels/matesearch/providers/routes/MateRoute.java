package com.cocha.hotels.matesearch.providers.routes;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.aggregators.AggregationAvailabilityStrategy;
import com.cocha.hotels.matesearch.providers.processors.ErrorMateProcessor;
import com.cocha.hotels.matesearch.providers.processors.MateHeaderDataProcessor;
import com.cocha.hotels.matesearch.providers.services.rest.response.HotelListResponseBuilder;
import com.cocha.hotels.model.matesearch.canonical.response.HotelListResponse;

@Component
public class MateRoute extends RouteBuilder {

    @Autowired
    private MateHeaderDataProcessor mateHeaderDataProcessor;

    @Autowired
    AggregationAvailabilityStrategy aggregationAvailabilityStrategy;

    @Autowired
    ErrorMateProcessor errorMateProcessor;

    @Autowired
    private HotelListResponseBuilder hotelListResponseBuilder;

    @Override
    public void configure() throws Exception {

        JaxbDataFormat jaxb = createHotelListJaxbDataFormat();

        Predicate isJson = header("Content-Type").isEqualTo(MediaType.APPLICATION_JSON);
        Predicate isXml = header("Content-Type").isEqualTo(MediaType.APPLICATION_XML);

        onException(Exception.class).handled(true).process(errorMateProcessor).choice().when(isJson)
                .to("direct:JsonRespose").when(isXml).to("direct:XmlRespose");

        from("cxfrs:bean:mateServer")
                .process(mateHeaderDataProcessor)
                .multicast()
                .aggregationStrategy(aggregationAvailabilityStrategy)
                .parallelProcessing()
                .to("direct:getHotelInformation", "direct:sendEanAvailability", "direct:sendBookingAvailability",
                        "direct:sendSabreAvailability").end().bean(hotelListResponseBuilder).choice().when(isJson)
                .to("direct:JsonRespose").when(isXml).to("direct:XmlRespose");

        from("direct:JsonRespose").marshal().json(JsonLibrary.Jackson).end();
        from("direct:XmlRespose").marshal(jaxb).end();

    }

    private JaxbDataFormat createHotelListJaxbDataFormat() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(HotelListResponse.class);
        JaxbDataFormat jaxb = new JaxbDataFormat(jaxbContext);
        jaxb.setContextPath(HotelListResponse.class.getPackage().toString());
        jaxb.setIgnoreJAXBElement(true);
        return jaxb;
    }
}
