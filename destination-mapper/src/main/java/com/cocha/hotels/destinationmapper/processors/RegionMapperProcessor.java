package com.cocha.hotels.destinationmapper.processors;

import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

public interface RegionMapperProcessor {

    public List<RegionHotelMapping> process(List<Hotel> hotel);

}
