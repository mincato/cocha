package com.cocha.hotels.matesearch.util;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class BasicBeanRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:test").beanRef("basicBean");
    }
}
