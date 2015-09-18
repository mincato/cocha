package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.ean.model.EanHotelConstructor;

@Component
public class EanETLRoute extends SpringRouteBuilder {

    public static final String EAN_ETL_ROUTE = "EanEtlRoute";

    @Autowired
    private EanHotelConstructor eanHotelConstructor;

    @Override
    public void configure() throws Exception {

        DataFormat hotelDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanSupplierHotels");
        DataFormat descriptionDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanHotelDescription");

        from("file:{{feeds.input.ean}}").routeId(EAN_ETL_ROUTE).errorHandler(loggingErrorHandler(log))
                .unmarshal(hotelDataFormat)
                .enrich("direct:eanDescription", AggregationStrategies.bean(eanHotelConstructor)).split(body())
                .to("jpa:com.cocha.hotels.model.content.hotel.Hotel")
                .log(LoggingLevel.INFO, "EAN hotel store on database successfully");

        from("direct:eanDescription").pollEnrich("file:{{feeds.input.ean.description}}").unmarshal(
                descriptionDataFormat);
    }

}
