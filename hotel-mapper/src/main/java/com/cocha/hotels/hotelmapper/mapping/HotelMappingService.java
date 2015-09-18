package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cocha.hotels.hotelmapper.algorithm.HotelMatch;
import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelMappingService {

    private HotelMatchingService matchingService;
    private String eanCode = "EAN";
    private String bookingCode = "BKG";
    private Predicate<Hotel> byEANCode = (hotel) -> hotel.getSupplierCode().equals(eanCode);
    private Predicate<Hotel> byBookingCode = (hotel) -> hotel.getSupplierCode().equals(bookingCode);

    public MappingResult map(List<Hotel> hotels) {
        Stream<Hotel> eanHotels = hotels.stream().filter(byEANCode);
        Stream<Hotel> bookingHotels = hotels.stream().filter(byBookingCode);
        
        List<MappingEntry> mappingEntries = new ArrayList<MappingEntry>();
        eanHotels.forEach((hotel) -> {
            MultipleMatch matches = matchingService.match(hotel, toList(bookingHotels));
            HotelMatch bestMatch = matches.findBestMatch();
            MappingEntry mappingEntry = new HotelMappingEntry(bestMatch);
            mappingEntries.add(mappingEntry);
        });
        
        return new HotelMappingResult();
    }

    private List<Hotel> toList(Stream<Hotel> bookingHotels) {
        return bookingHotels.collect(Collectors.toList());
    }

    public HotelMatchingService getMatchingService() {
        return matchingService;
    }

    public void setMatchingService(HotelMatchingService matchingService) {
        this.matchingService = matchingService;
    }

}
