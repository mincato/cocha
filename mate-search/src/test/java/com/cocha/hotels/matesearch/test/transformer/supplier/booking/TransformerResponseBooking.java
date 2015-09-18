package com.cocha.hotels.matesearch.test.transformer.supplier.booking;

import java.io.InputStream;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.matesearch.supplier.booking.GetHotelAvailabilityBooking;

public class TransformerResponseBooking extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supplierBookingTestContext.xml");
    }

    @Test
    public void transformerBooking() throws Exception {

         final InputStream resource =  getClass().getClassLoader().getResourceAsStream("respuestamocks/ResponseHotelSupplierBooking.xml");
         final String xml = context().getTypeConverter().convertTo(String.class, resource);

    	GetHotelAvailabilityBooking hotelRespose = template.requestBody("direct:unmarshal", xml, GetHotelAvailabilityBooking.class);

        log.info("************************************");
        log.info("Transformer XML to Object");
        log.info("ID Hotel: " + hotelRespose.getResult().getHotelId());
        log.info("Habitaciones: " + hotelRespose.getResult().getAvailableRooms());
        log.info("Codigo Pais: " + hotelRespose.getResult().getCurrencyCode());
        log.info("Mayor Precio: " + hotelRespose.getResult().getMaxPrice());
        log.info("Menor Precio: " + hotelRespose.getResult().getMinPrice());
        log.info("************************************");

    }

}
