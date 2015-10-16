package com.cocha.hotels.matesearch.providers.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SupplierHotelProcessor;
import com.cocha.hotels.matesearch.providers.processors.View;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.model.matesearch.supplier.booking.GetHotelAvailabilityBooking;

@Component
public class BookingTransformerRoute extends RouteBuilder {

    @Autowired
    private SupplierHotelProcessor supplirHotelProcessor;
    
    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {
    	
    	onException(RuntimeException.class).handled(true).setHeader(Constant.SUPPLIER, simple(CodeSupplier.BOOKING_SUPPLIER_CODE)).process(errorSupplierProcessor).end();

        from("direct:transformerResposeBooking").process(new View()).convertBodyTo(GetHotelAvailabilityBooking.class)
                .setHeader("supplier", simple(CodeSupplier.BOOKING_SUPPLIER_CODE)).bean(supplirHotelProcessor);

    }

}
