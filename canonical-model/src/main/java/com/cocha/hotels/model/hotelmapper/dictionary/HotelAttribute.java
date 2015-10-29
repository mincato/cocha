package com.cocha.hotels.model.hotelmapper.dictionary;

import java.util.HashMap;
import java.util.Map;

public enum HotelAttribute {
    ADDRESS("address"), NAME("name");

    private String hotelAttribute;

    static final Map<String, HotelAttribute> hotelAttributeMap = new HashMap<String, HotelAttribute>();

    static {
        for (HotelAttribute attribute : HotelAttribute.values())
            hotelAttributeMap.put(attribute.hotelAttribute, attribute);
    }

    private HotelAttribute(String hotelAttribute) {
        this.hotelAttribute = hotelAttribute;
    }

    public String getHotelAttribute() {
        return this.hotelAttribute;
    }

    public static HotelAttribute getValue(String hotelAttribute) {
        return hotelAttributeMap.get(hotelAttribute);
    }
}
