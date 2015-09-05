package com.cocha.hotels.feeddownloader.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloBeanRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:hello").beanRef("helloBean");
    }
}
