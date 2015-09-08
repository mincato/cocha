package com.cocha.hotels.feeddownloader.example;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloBeanRoute extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:hello").beanRef("helloBean");
    }
}
