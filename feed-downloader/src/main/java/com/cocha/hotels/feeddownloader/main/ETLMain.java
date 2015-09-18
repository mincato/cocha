package com.cocha.hotels.feeddownloader.main;

import org.apache.camel.spring.Main;

public class ETLMain extends Main {

    public static void main(String[] args) throws Exception {
        ETLMain main = new ETLMain();
        main.setApplicationContextUri("classpath:/spring/camel-context.xml");
        main.enableHangupSupport();
        main.run();
    }
}
