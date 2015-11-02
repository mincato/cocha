package com.cocha.hotels.destinationmapper.processors;

import java.util.List;
import java.util.Map;
import com.cocha.hotels.model.content.hotel.Hotel;

public interface ProvidersProcessor {

    public Map<String, List<Hotel>> process(List<Hotel> hotels);

}
