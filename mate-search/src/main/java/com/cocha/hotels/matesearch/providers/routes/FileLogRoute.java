package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Defines the camel routes
 */
@Component
public class FileLogRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:logInfo").setHeader(Exchange.FILE_NAME, constant("request.txt")).to("file:/tmp/reports");
    };

}
