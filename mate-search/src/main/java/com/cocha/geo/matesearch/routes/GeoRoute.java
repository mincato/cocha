package com.cocha.geo.matesearch.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cocha.geo.matesearch.processors.GeoRegionHotelProcessor;

/**
 * Defines the camel routes
 */
@Component
public class GeoRoute extends RouteBuilder {

    @Autowired
    private GeoRegionHotelProcessor geoRegionHotelProcessor;

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:geoServer").wireTap("direct:logInfo").choice()
                .when(simple("${headers.operationName} == 'getHotelsByRegionId'")).to("direct:getRegionHotel");

        from("direct:getRegionHotel").process(geoRegionHotelProcessor).wireTap("direct:logInfo");
    }
}
