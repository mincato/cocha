package com.cocha.hotels.matesearch.test.transformer.supplier.sabre;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.matesearch.supplier.sabre.AvailabilityOption;
import com.cocha.hotels.model.matesearch.supplier.sabre.AvailabilityOptions;
import com.cocha.hotels.model.matesearch.supplier.sabre.BasicPropertyInfo;
import com.cocha.hotels.model.matesearch.supplier.sabre.RateRange;

public class TramsformerObjectSabre extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supplierSabreDozerTestContext.xml");
    }

    @Test
    public void ObjectSabreToCanonicalModel() throws Exception {

        MockEndpoint mock = getMockEndpoint("mock:verify-model");
        mock.expectedMessageCount(1);

        AvailabilityOptions availabilityOptions = new AvailabilityOptions();
        AvailabilityOption availabilityOption = new AvailabilityOption();
        BasicPropertyInfo basicPropertyInfo = new BasicPropertyInfo();
        RateRange rateRange = new RateRange();
        
        rateRange.setCurrencyCode("CLP");
        rateRange.setMax("164076");
        rateRange.setMin("129498");
        
        basicPropertyInfo.setAreaID("000S");
        basicPropertyInfo.setChainCode("HI");
        basicPropertyInfo.setDistance("M");
        basicPropertyInfo.setGeoConfidenceLevel("7");
        basicPropertyInfo.setHotelCityCode("SCL");
        basicPropertyInfo.setHotelCode("0080052");
        basicPropertyInfo.setHotelName("HOLIDAY INN SANTIAGO AIRPORT");
        
        basicPropertyInfo.setRateRange(rateRange);
        
        availabilityOption.setBasicPropertyInfo(basicPropertyInfo);
        availabilityOptions.setAvailabilityOption(availabilityOption);
        
        template.sendBody("direct:service-in", availabilityOptions);

        assertMockEndpointsSatisfied();

    }

}
