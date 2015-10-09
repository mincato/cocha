package com.cocha.hotels.matesearch.test.transformer.supplier.booking;

import java.io.InputStream;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.matesearch.supplier.booking.GetHotelAvailabilityBooking;
import com.cocha.hotels.model.matesearch.supplier.booking.Result;

public class TransformerResponseBooking extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supplierBookingTestContext.xml");
    }

    @Test
    public void transformerBooking() throws Exception {

        final InputStream resource = getClass().getClassLoader().getResourceAsStream(
                "respuestamocks/ResponseHotelSupplierBooking.xml");
        final String xml = context().getTypeConverter().convertTo(String.class, resource);

        GetHotelAvailabilityBooking hotelRespose = template.requestBody("direct:unmarshal", xml,
                GetHotelAvailabilityBooking.class);

        log.info("************************************");
        log.info("Transformer XML to Object");
        log.info("************************************");
        for (Result horel : hotelRespose.getResult()) {
            log.info("************************************");
        	log.info("ID Hotel: " + horel.getHotelId());
        	log.info("Habitaciones: " + horel.getAvailableRooms());
        	log.info("Codigo Pais: " + horel.getCurrencyCode());
        	log.info("Mayor Precio: " + horel.getMaxPrice());
        	log.info("Menor Precio: " + horel.getMinPrice());        	
        	log.info("************************************");
        }
        
    }

}
