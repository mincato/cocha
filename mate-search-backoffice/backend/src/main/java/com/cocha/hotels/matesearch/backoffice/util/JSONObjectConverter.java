package com.cocha.hotels.matesearch.backoffice.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;

public class JSONObjectConverter {
    
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    @SuppressWarnings("unchecked")
    public static <T> T convertToObject(String json, Class<?> clazz) {

        ObjectMapper mapper = createMapper();

        try {
            return (T) mapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Ocurrio un ERROR en la des-serializacion de "
                            + clazz.getSimpleName(), e);
        }
    }

    public static String convertToJSON(Object obj) {

        ObjectMapper mapper = createMapper();

        try {
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Ocurrio un ERROR en la serializacion de "
                            + obj.getClass().getSimpleName(), e);
        }
    }
    
    private static ObjectMapper createMapper() {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(df);
        return mapper;
    }
}
