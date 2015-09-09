package com.cocha.hotels.matesearch.test.transformer;

import java.io.InputStream;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.mateSearch.supplier.ean.HotelSupplierEAN;

public class TransformerResposeEANAndHotelSupplierEAN extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("supplierEANTestContext.xml");
	}
	
	@Test
	public void transformerEAN() throws Exception {
		
		final InputStream resource = getClass().getClassLoader().getResourceAsStream("responseEAN.json");
		final String json = context().getTypeConverter().convertTo(String.class, resource);
		
		HotelSupplierEAN hotelRespose = template.requestBody("direct:unmarshal", json, HotelSupplierEAN.class);
		
		log.info("************************************");
		log.info("Transformer Json to Object");
		log.info("ID Hotel: " + hotelRespose.getHotelroomavailabilityresponse().getHotelid());
		log.info("Nombre Hotel: " + hotelRespose.getHotelroomavailabilityresponse().getHotelname());
		log.info("Direccion Hotel: " + hotelRespose.getHotelroomavailabilityresponse().getHoteladdress());
		log.info("Ciudad Hotel: " + hotelRespose.getHotelroomavailabilityresponse().getHotelcity());
		log.info("Provincia Hotel: " + hotelRespose.getHotelroomavailabilityresponse().getHotelstateprovince());
		log.info("Pais Hotel: " + hotelRespose.getHotelroomavailabilityresponse().getHotelstateprovince());
		log.info("************************************");
		
	}

}
