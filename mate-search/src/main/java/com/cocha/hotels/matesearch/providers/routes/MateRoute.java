package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.aggregators.AggregationAvailabilityStrategy;
import com.cocha.hotels.matesearch.providers.processors.MateHeaderDataProcessor;


@Component
public class MateRoute extends RouteBuilder {
    
	@Autowired
    private MateHeaderDataProcessor  mateHeaderDataProcessor;

    @Override
    public void configure() throws Exception {
		from("cxfrs:bean:mateServer")				
				 .process(mateHeaderDataProcessor)
				.multicast()
				.aggregationStrategy(new AggregationAvailabilityStrategy()).parallelProcessing()
				.to("direct:sendEanAvailability", "direct:sendBookingAvailability");
    }
}
