package com.cocha.hotels.hazelcast;

import java.io.InputStream;
import java.util.Properties;

import com.hazelcast.config.Config;
import com.hazelcast.config.XmlConfigBuilder;
import com.hazelcast.core.Hazelcast;

/**
 * Hello world!
 *
 */
public class App {

    private static final String HAZELCAST_PROPERTIES = "hazelcast.properties";
    private static final String HAZELCAST_CONFIG = "hazelcast.xml";

    public static void main(String[] args) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        try (InputStream resourceStream = loader.getResourceAsStream(HAZELCAST_PROPERTIES)) {
            properties.load(resourceStream);
        }

        XmlConfigBuilder builder = new XmlConfigBuilder(loader.getResourceAsStream(HAZELCAST_CONFIG));
        builder.setProperties(properties);
        Config config = builder.build();
        Hazelcast.newHazelcastInstance(config);
    }
}
