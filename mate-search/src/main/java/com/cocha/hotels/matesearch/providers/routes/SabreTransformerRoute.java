package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SupplierHotelProcessor;
import com.cocha.hotels.model.matesearch.supplier.sabre.AvailabilityOptions;

@Component
public class SabreTransformerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:transformerResposeSabre").convertBodyTo(AvailabilityOptions.class)
                .bean(new SupplierHotelProcessor()).marshal().json(JsonLibrary.Jackson);

    }

}