package com.cocha.hotels.matesearch.test.transformer.supplier.booking;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.matesearch.supplier.booking.GetHotelAvailabilityBooking;
import com.cocha.hotels.model.matesearch.supplier.booking.RackRate;
import com.cocha.hotels.model.matesearch.supplier.booking.Result;

public class TramsformerObjectBooking extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supplierBookingDozerTestContext.xml");
    }

    @Test
    public void ObjectBookingToCanonicalModel() throws Exception {

        MockEndpoint mock = getMockEndpoint("mock:verify-model");
        mock.expectedMessageCount(1);

        GetHotelAvailabilityBooking getHotelAvailabilityBooking = new GetHotelAvailabilityBooking();
        Result result = new Result();
        RackRate rackRate = new RackRate();
        
        result.setAvailableRooms(new Long(170));
        result.setCurrencyCode("GBP");
        result.setHotelId(new Long(36913));
        result.setMaxPrice(new Float(2500.00));
        result.setMaxTotalPrice(new Float(5000.00));
        result.setMinPrice(new Float(263.00));
        result.setMinRotalPrice(new Float(526.00));
        rackRate.setCurrency("526.00");
        rackRate.setPrice("0.00");
        
        result.setRackRate(rackRate);
        getHotelAvailabilityBooking.setResult(result);

        template.sendBody("direct:service-in", getHotelAvailabilityBooking);

        assertMockEndpointsSatisfied();

    }

}
