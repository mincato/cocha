package com.cocha.hotels.matesearch.providers.services;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelSummary;

@Service
public class HotelInformation {

    @Autowired
    HotelRepository hotelRepository;

    @Handler
    public HotelList getHotelInformation(List<String> ids) {

        List<Hotel> hotels = hotelRepository.findByHotelIds(ids);

        HotelList hotelList = new HotelList();

        List<HotelSummary> hotelSummaries = hotels.stream().map(hotel -> {
            HotelSummary hotelSummary = new HotelSummary();
            hotelSummary.setHotelId(hotel.getId());
            hotelSummary.setAddress1(hotel.getAddress());
            hotelSummary.setCity(hotel.getCity());
            hotelSummary.setCountryCode(hotel.getCountry());
            hotelSummary.setHotelRating(hotel.getStarRating());
            hotelSummary.setLatitude(hotel.getLatitude());
            hotelSummary.setLongitude(hotel.getLongitude());
            hotelSummary.setName(hotel.getName());
            hotelSummary.setPostalCode(hotel.getZipCode());
            return hotelSummary;
        }).collect(Collectors.toList());

        hotelList.setHotelSummary(hotelSummaries);
        hotelList.setSize(hotels.size());

        return hotelList;
    }

}
