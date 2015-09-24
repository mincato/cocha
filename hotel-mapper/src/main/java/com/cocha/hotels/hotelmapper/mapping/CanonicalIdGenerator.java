package com.cocha.hotels.hotelmapper.mapping;

import org.springframework.stereotype.Service;

import com.cocha.hotels.model.content.hotel.Hotel;

@Service
public class CanonicalIdGenerator {

    public String newId(Hotel hotel) {
        return hotel.getSupplierCode() + hotel.getId();
    }

}
