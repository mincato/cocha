package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Defines the camel routes
 */
@Component
public class EanRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Defines the starting endpoint as the Spring bean jxRsServer (in
        // applicationContext.xml)
        from("cxfrs:bean:jaxRsServer").process(new Processor() {

            // Anonymous processor
            public void process(Exchange exchange) throws Exception {
                System.out.println(exchange.getIn().toString());
            }
        }).setBody(constant("['SUCCESS']"));
    }
}
