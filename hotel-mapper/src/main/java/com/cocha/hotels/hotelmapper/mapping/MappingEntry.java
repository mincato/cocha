package com.cocha.hotels.hotelmapper.mapping;

import com.cocha.hotels.model.content.hotel.Hotel;


public interface MappingEntry {

    String getCanonicalId();
    Hotel getEANHotel();
    Hotel getBookingHotel();

}
