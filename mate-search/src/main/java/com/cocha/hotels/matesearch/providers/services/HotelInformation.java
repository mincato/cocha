package com.cocha.hotels.matesearch.providers.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.manager.HotelManager;
import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelSummary;

@Service
public class HotelInformation {

    @Autowired
    HotelManager hotelManager;

    @Handler
    public HotelList getHotelInformation(List<String> ids) {

        HotelList hotelList = new HotelList();
        List<HotelSummary> hotelSummaries = new ArrayList<HotelSummary>();
        for (String hotelId : ids) {
            Hotel hotel = hotelManager.findByHotelId(hotelId);
            if (hotel != null) {
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
                hotelSummaries.add(hotelSummary);
            }
        }

        hotelList.setHotelSummary(hotelSummaries);
        hotelList.setSize(hotelSummaries.size());

        return hotelList;
    }

}
