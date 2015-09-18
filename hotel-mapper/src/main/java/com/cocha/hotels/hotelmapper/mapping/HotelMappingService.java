package com.cocha.hotels.hotelmapper.mapping;

import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;


public class HotelMappingService {

    private HotelMatchingService matchingService;
    
    public MappingResult map(List<Hotel> eanHotels, List<Hotel> bookingHotels) {
        return null;
    }

    public HotelMatchingService getMatchingService() {
        return matchingService;
    }

    public void setMatchingService(HotelMatchingService matchingService) {
        this.matchingService = matchingService;
    }

}
