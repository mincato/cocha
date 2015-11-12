package com.cocha.hotels.matesearch.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelMappingManager {

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    public List<HotelMapping> findByHotelIds(@Param("hotelIds") List<String> hotelIds) {
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        for (String hotelId : hotelIds) {
            hotelMappings.addAll(hotelMappingRepository.findByHotelId(hotelId));
        }
        return hotelMappings;
    };

}
