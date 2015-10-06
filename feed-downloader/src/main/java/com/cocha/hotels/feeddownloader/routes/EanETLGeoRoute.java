package com.cocha.hotels.feeddownloader.routes;

import java.nio.charset.Charset;

import org.apache.camel.LoggingLevel;
import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;
import com.cocha.hotels.model.content.geo.Region;

@Component
public class EanETLGeoRoute extends SpringRouteBuilder {

    public static final String EAN_GEO_PARENT_REGION_FEED_ROUTE = "EanGeoParentRegionFeedRoute";

    @Override
    public void configure() throws Exception {

        BeanIODataFormat geoParentRegionsDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml",
                "eanGeoParentRegions");
        geoParentRegionsDataFormat.setEncoding(Charset.forName("UTF-8"));

        BeanIODataFormat descriptionDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml",
                "eanHotelDescription");
        descriptionDataFormat.setEncoding(Charset.forName("UTF-8"));

        from("file:{{feeds.input.ean.geo.reg}}").errorHandler(loggingErrorHandler(log)).choice()
                .when(simple("${file:onlyname} contains 'ParentRegionList'")).to("direct:processEanGeoParentRegions")
                .otherwise().log(LoggingLevel.INFO, "File not supported");

        from("direct:processEanGeoParentRegions").routeId(EAN_GEO_PARENT_REGION_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).unmarshal(geoParentRegionsDataFormat)
                .log(LoggingLevel.INFO, "Processing EAN regions")
                .beanRef("eanGeoParentRegionTransformer", "toCanonicalRegions")
                .to("jpa:" + Region.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo Parent Region store on database successfully");
    }

}
