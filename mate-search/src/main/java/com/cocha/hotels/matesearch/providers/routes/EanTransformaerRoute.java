package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.SupplierHotelProcessor;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.SupplierEANHotelResponse;

@Component
public class EanTransformaerRoute extends RouteBuilder {
	
	@Autowired
	private SupplierHotelProcessor supplirHotelProcessor;

    @Override
    public void configure() throws Exception {

        from("direct:transfomerResposeEAN").unmarshal().json(JsonLibrary.Jackson, SupplierEANHotelResponse.class)
                .bean(supplirHotelProcessor);
    }

}
