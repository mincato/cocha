package com.cocha.hotels.feeddownloader.example;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBeanRouteTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("spring/camel-context.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
        String reply = template.requestBody("direct:hello", "Camel in action", String.class);
        assertEquals("Hello Camel in action", reply);
    }
}
