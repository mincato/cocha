package com.cocha.hotels.hotelmapper.processors;

import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface MapperProcessor {

    public List<HotelMapping> process(List<Hotel> hotels);

}
