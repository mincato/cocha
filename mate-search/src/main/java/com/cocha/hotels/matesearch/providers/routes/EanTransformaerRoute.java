package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ApprovalResposeEAN;
import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SupplierHotelProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.SupplierEANHotelResponse;

@Component
public class EanTransformaerRoute extends RouteBuilder {

    @Autowired
    private SupplierHotelProcessor supplirHotelProcessor;

    @Autowired
    private ApprovalResposeEAN approvalResposeEAN;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {

        onException(RuntimeException.class).handled(true)
                .setHeader(Constant.SUPPLIER, simple(CodeSupplier.EAN_SUPPLIER_CODE)).process(errorSupplierProcessor)
                .end();

        from("direct:transfomerResposeEAN").bean(approvalResposeEAN).unmarshal()
                .json(JsonLibrary.Jackson, SupplierEANHotelResponse.class)
                .setHeader("supplier", simple(CodeSupplier.EAN_SUPPLIER_CODE)).bean(supplirHotelProcessor);
    }

}
