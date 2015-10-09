package com.cocha.hotels.matesearch.test.transformer.supplier.sabre;

import java.io.InputStream;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS;

public class TransformerResponseSabre extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supplierSabreTestContext.xml");
    }

    @Test
    public void transformerSabre() throws Exception {

        final InputStream resource = getClass().getClassLoader().getResourceAsStream(
                "respuestamocks/ResponseHotelSupplierSabre.xml");
        final String xml = context().getTypeConverter().convertTo(String.class, resource);

        OTAHotelAvailRS hotelRespose = template.requestBody("direct:unmarshal", xml, OTAHotelAvailRS.class);

        log.info("************************************");
        log.info("Transformer XML to Object");
//        log.info("ID Hotel: " + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getHotelCode());
//        log.info("Nombre Hotel: " + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getHotelName());
//        log.info("ID Area: " + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getAreaID());
//        log.info("Chain Code: " + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getChainCode());
//        log.info("Distancia: " + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getDistance());
//        log.info("Nivel de Confianza GEO: "
//                + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getGeoConfidenceLevel());
//        log.info("Codigo Ciudad: " + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getHotelCityCode());
//        log.info("Codigo Moneda: "
//                + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getRateRange().getCurrencyCode());
//        log.info("Precio Maximo: "
//                + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getRateRange().getMax());
//        log.info("Precio Minimo: "
//                + hotelRespose.getAvailabilityOption().getBasicPropertyInfo().getRateRange().getMin());
        log.info("************************************");

    }

}
