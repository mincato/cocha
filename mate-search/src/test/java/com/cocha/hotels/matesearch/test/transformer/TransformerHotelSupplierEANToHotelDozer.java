package com.cocha.hotels.matesearch.test.transformer;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.mateSearch.supplier.ean.HotelRoomAvailabilityResponse;
import com.cocha.hotels.model.mateSearch.supplier.ean.HotelSupplierEAN;

public class TransformerHotelSupplierEANToHotelDozer extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("dozerEANTestContext.xml");
	}
	
	@Test
	public void HotelSupplierEANToHotelDozer() throws Exception {
		
		MockEndpoint mock = getMockEndpoint("mock:verify-model");
	    mock.expectedMessageCount(1);
		
		HotelSupplierEAN hotelSupplierEAN = new HotelSupplierEAN();
		HotelRoomAvailabilityResponse hotelroomavailabilityresponse = new HotelRoomAvailabilityResponse();
		hotelroomavailabilityresponse.setHotelid(125727);
		hotelroomavailabilityresponse.setHotelname("Motif Seattle");
		hotelroomavailabilityresponse.setArrivaldate("09/30/2015");
		hotelroomavailabilityresponse.setDeparturedate("10/02/2015");
		hotelSupplierEAN.setHotelroomavailabilityresponse(hotelroomavailabilityresponse);
		
		
		template.sendBody("direct:service-in", hotelSupplierEAN);
		
		assertMockEndpointsSatisfied();
	}

}
