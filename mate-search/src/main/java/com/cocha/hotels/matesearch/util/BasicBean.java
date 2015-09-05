package com.cocha.hotels.matesearch.util;

import org.springframework.stereotype.Component;

@Component
public class BasicBean {

    public String test(String name) {
        System.out.println("Invoking BasicBean with " + name);
        return "Test " + name;
    }

}
