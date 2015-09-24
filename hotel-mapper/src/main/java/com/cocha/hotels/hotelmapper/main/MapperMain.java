package com.cocha.hotels.hotelmapper.main;

import org.apache.camel.spring.Main;

public class MapperMain extends Main {

    public static void main(String[] args) throws Exception {
        MapperMain main = new MapperMain();
        main.setApplicationContextUri("classpath:/spring/camel-context.xml");
        main.enableHangupSupport();
        main.run();
    }
}
