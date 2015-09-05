package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class EanETLRoute extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {
        DataFormat dataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanSupplierHotels");

        from("file:{{feeds.input.ean}}").unmarshal(dataFormat).split(body())
                .to("jpa:com.cocha.hotels.model.content.hotel.Hotel");

    }

}
