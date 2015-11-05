package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.HeaderDataProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel route for Ean access service.
 */
@Component
public class EanRoute extends RouteBuilder {

    @Autowired
    private HeaderDataProcessor headerDataProcessor;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {

        onException(RuntimeException.class).handled(true)
                .setHeader(Constant.SUPPLIER, simple(CodeSupplier.EAN_SUPPLIER_CODE)).process(errorSupplierProcessor)
                .end();

        from("cxfrs:bean:jaxRsServer").process(headerDataProcessor).to("direct:sendEanAvailability").marshal()
                .json(JsonLibrary.Jackson);
    }
}
