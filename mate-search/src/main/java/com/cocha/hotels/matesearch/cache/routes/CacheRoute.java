package com.cocha.hotels.matesearch.cache.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.cache.processor.CacheProcessor;

/**
 * Defines the camel routes
 */
@Component
public class CacheRoute extends RouteBuilder {

    @Autowired
    private CacheProcessor cacheProcessor;

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:cacheServer").wireTap("direct:logInfo").choice()
                .when(simple("${headers.operationName} == 'refresh'")).to("direct:refreshCache");

        from("direct:refreshCache").bean(cacheProcessor, "refreshCache").marshal().json(JsonLibrary.Jackson)
                .wireTap("direct:logInfo");
    }
}
