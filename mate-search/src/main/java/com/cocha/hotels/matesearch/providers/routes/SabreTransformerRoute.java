package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SupplierHotelProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS;

@Component
public class SabreTransformerRoute extends RouteBuilder {

    @Autowired
    private SupplierHotelProcessor supplirHotelProcessor;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {

        onException(Exception.class).handled(true)
                .setHeader(Constant.SUPPLIER, simple(CodeSupplier.SABRE_SUPPLIER_CODE)).process(errorSupplierProcessor)
                .end();

        from("direct:transformerResposeSabre").convertBodyTo(OTAHotelAvailRS.class)
                .setHeader("supplier", simple(CodeSupplier.SABRE_SUPPLIER_CODE)).bean(supplirHotelProcessor);

    }

}
