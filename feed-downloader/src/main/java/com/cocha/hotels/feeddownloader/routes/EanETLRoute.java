package com.cocha.hotels.feeddownloader.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

@Component
public class EanETLRoute extends SpringRouteBuilder {

    public static final String EAN_HOTEL_FEED_ROUTE = "EanHotelFeedRoute";
    public static final String EAN_DESCRIPTION_FEED_ROUTE = "EanDescriptionFeedRoute";

    @Override
    public void configure() throws Exception {

        DataFormat hotelDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanSupplierHotels");
        DataFormat descriptionDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanHotelDescription");

        from("file:{{feeds.input.ean}}").errorHandler(loggingErrorHandler(log)).choice()
                .when(simple("${file:onlyname} contains 'ActivePropertyList'")).to("direct:processEanHotels")
                .when(simple("${file:onlyname} contains 'PropertyDescriptionList'"))
                .to("direct:processEanDescriptions").otherwise().log(LoggingLevel.INFO, "File not supported");

        from("direct:processEanHotels").routeId(EAN_HOTEL_FEED_ROUTE).errorHandler(loggingErrorHandler(log))
                .unmarshal(hotelDataFormat).log(LoggingLevel.INFO, "Processing EAN hotels")
                .beanRef("eanHotelTransformer", "toCanonicalHotels")
                .to("jpa:" + Hotel.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN hotels store on database successfully");
        ;

        from("direct:processEanDescriptions").routeId(EAN_DESCRIPTION_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).unmarshal(descriptionDataFormat)
                .log(LoggingLevel.INFO, "Processing EAN hotel descriptions")
                .beanRef("eanHotelTransformer", "toCanonicalHotelDescriptions")
                .to("jpa:" + HotelDescription.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN hotel descriptions store on database successfully");

    }

}
