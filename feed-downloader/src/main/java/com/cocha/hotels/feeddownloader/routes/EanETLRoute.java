package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class EanETLRoute extends SpringRouteBuilder {

    public static final String EAN_ETL_ROUTE = "EanEtlRoute";

    @Override
    public void configure() throws Exception {

        DataFormat dataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanSupplierHotels");

        from("file:{{feeds.input.ean}}").routeId(EAN_ETL_ROUTE).errorHandler(loggingErrorHandler(log))
                .unmarshal(dataFormat).split(body()).to("jpa:com.cocha.hotels.model.content.hotel.Hotel")
                .log(LoggingLevel.INFO, "EAN hotel store on database successfully");

    }

}
