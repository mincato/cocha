package com.cocha.hotels.hotelmapper.mapping;

import com.cocha.hotels.model.content.hotel.Hotel;

public class CanonicalIdGenerator {

    public String newId(Hotel hotel) {
        return hotel.getSupplierCode() + hotel.getId();
    }

}
