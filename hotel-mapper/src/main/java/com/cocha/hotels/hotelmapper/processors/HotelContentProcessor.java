package com.cocha.hotels.hotelmapper.processors;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelContentProcessor {

    public Hotel process(HotelMapping hotelMapping);

}
