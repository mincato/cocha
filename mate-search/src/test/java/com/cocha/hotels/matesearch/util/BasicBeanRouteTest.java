package com.cocha.hotels.matesearch.util;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicBeanRouteTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("mate-searchTestContext.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
        String reply = template.requestBody("direct:test", "Camel context", String.class);
        assertEquals("Test Camel context", reply);
    }
}
