package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.aggregators.AggregationAvailabilityStrategy;
import com.cocha.hotels.matesearch.providers.processors.MateHeaderDataProcessor;

@Component
public class MateRoute extends RouteBuilder {

    @Autowired
    private MateHeaderDataProcessor mateHeaderDataProcessor;

    @Autowired
    AggregationAvailabilityStrategy aggregationAvailabilityStrategy;

    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:mateServer")
                .process(mateHeaderDataProcessor)
                .multicast()
                .aggregationStrategy(aggregationAvailabilityStrategy)
                .parallelProcessing()
                .to("direct:getHotelInformation", "direct:sendEanAvailability", "direct:sendBookingAvailability",
                        "direct:sendSabreAvailability").end().marshal().json(JsonLibrary.Jackson);
    }
}
