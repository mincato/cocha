package com.cocha.hotels.destinationmapper.example;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

    public String hello(String name) {
        System.out.println("Invoking HelloBean with " + name);
        return "Hello " + name;
    }

}
