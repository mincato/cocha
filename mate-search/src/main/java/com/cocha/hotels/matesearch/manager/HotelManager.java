package com.cocha.hotels.matesearch.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.model.matesearch.canonical.Hotel;

@Component
public class HotelManager {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> findByHotelIds(List<String> hotelIds) {
        List<Hotel> hotels = new ArrayList<Hotel>();
        for (String hotelId : hotelIds) {
            Hotel hotel = hotelRepository.findOne(hotelId);
            if (hotel != null) {
                hotels.add(hotel);
            }
        }
        return hotels;
    }

    public Hotel findByHotelId(String hotelId) {
        return hotelRepository.findOne(hotelId);
    };

}
