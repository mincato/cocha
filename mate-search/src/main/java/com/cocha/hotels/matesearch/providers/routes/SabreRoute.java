package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.HeaderDataProcessor;

/**
 * Defines the camel routes
 */
@Component
public class SabreRoute extends RouteBuilder {

    @Autowired
    private HeaderDataProcessor processor;

    @Override
    public void configure() throws Exception {

        from("cxfrs:bean:sabreServer").wireTap("direct:logInfo").choice()
                .when(simple("${headers.operationName} == 'send'")).process(processor)
                .to("direct:sendSabreAvailability").when(simple("${headers.operationName} == 'createsession'"))
                .process(processor).to("direct:sendSabreSessionCreate").end()
                .marshal().json(JsonLibrary.Jackson);

    }
}
