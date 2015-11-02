package com.cocha.hotels.matesearch.providers.services;

import java.util.List;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.HotelList;

@Service
public class HotelInformation {

    @Autowired
    HotelRepository hotelRepository;

    @Handler
    public HotelList getHotelInformation(List<String> ids) {

        HotelList hotelList = new HotelList();

        List<Hotel> hotels = hotelRepository.findByHotelIds(ids);

        hotelList.setHotels(hotels);

        return hotelList;
    }
}
