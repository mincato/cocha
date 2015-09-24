package com.cocha.hotels.hotelmapper.processors;

import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelContentProcessor {

    public List<Hotel> process(List<HotelMapping> hotelMappings);

}
