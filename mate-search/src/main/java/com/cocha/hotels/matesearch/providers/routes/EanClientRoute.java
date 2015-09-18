package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.NoErrorHandlerBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.EanClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.FailureResponseProcessor;

/**
 * Defines the camel routes
 */
@Component
public class EanClientRoute extends RouteBuilder {

    @Autowired
    private EanClientProcessor eanClientProcessor;

    @Override
    public void configure() throws Exception {
        onException(Exception.class).handled(true).process(new FailureResponseProcessor());
        errorHandler(new NoErrorHandlerBuilder());
        from("direct:sendEanAvailability").errorHandler(loggingErrorHandler(log)).process(eanClientProcessor)
                .wireTap("direct:logInfo").to("cxfrs:bean:eanClient");
    }
}
