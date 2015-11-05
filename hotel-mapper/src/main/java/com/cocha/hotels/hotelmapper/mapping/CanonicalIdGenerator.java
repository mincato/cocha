package com.cocha.hotels.hotelmapper.mapping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cocha.hotels.model.content.hotel.Hotel;

@Service
public class CanonicalIdGenerator {

    private static final String BOOKING_CODING = "200";
    private static final String EAN_CODING = "100";

    private Map<String, String> mapSupplierCodeCanonicalId;

    public CanonicalIdGenerator() {
        mapSupplierCodeCanonicalId = new HashMap<String, String>();
        mapSupplierCodeCanonicalId.put(Hotel.EAN_SUPPLIER_CODE, EAN_CODING);
        mapSupplierCodeCanonicalId.put(Hotel.BOOKING_SUPPLIER_CODE, BOOKING_CODING);
    }

    public String newId(Hotel hotel) {
        return mapSupplierCodeCanonicalId.get(hotel.getSupplierCode()) + hotel.getId();
    }

}
