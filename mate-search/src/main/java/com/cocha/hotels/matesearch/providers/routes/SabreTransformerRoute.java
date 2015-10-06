package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SupplierHotelProcessor;
import com.cocha.hotels.model.matesearch.supplier.sabre.AvailabilityOptions;

@Component
public class SabreTransformerRoute extends RouteBuilder {

	@Autowired
	private SupplierHotelProcessor supplirHotelProcessor;
	
    @Override
    public void configure() throws Exception {

        from("direct:transformerResposeSabre").convertBodyTo(AvailabilityOptions.class)
                .bean(supplirHotelProcessor);

    }

}
