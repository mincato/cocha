package com.cocha.hotels.hotelmapper.processors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;
import com.cocha.hotels.model.content.hotel.HotelKey;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelContentProcessorImpl implements HotelContentProcessor {

    private static final Integer PERFECT_CONFIDENCE = 100;

    @Autowired
    private HotelFeedRepository hotelFeedRepository;

    @Override
    public List<Hotel> process(List<HotelMapping> hotelMappings) {
        List<Hotel> hotels = new ArrayList<Hotel>();
        if (hotelMappings != null) {
            Stream<HotelMapping> hotelMappingsPerfect = hotelMappings.stream().filter(
                    (hotelMapping) -> PERFECT_CONFIDENCE.equals(hotelMapping.getConfidence()));
            hotelMappingsPerfect.forEach((hotelMapping) -> {
                Hotel hotel = process(hotelMappings, hotelMapping);
                if (hotel != null) {
                    hotels.add(hotel);
                }
            });
        }
        return hotels;
    }

    private Hotel process(List<HotelMapping> hotelMappings, HotelMapping hotelMapping) {
        Hotel contentHotel = null;
        if (hotelMapping != null && hotelMapping.getSupplierHotelId() != null && hotelMapping.getSupplierCode() != null
                && hotelMapping.getHotelId() != null) {

            HotelKey hotelKey = new HotelKey();
            hotelKey.setId(hotelMapping.getSupplierHotelId());
            hotelKey.setSupplierCode(hotelMapping.getSupplierCode());
            Hotel feedHotel = hotelFeedRepository.findOne(hotelKey);
            contentHotel = createHotelContent(feedHotel, hotelMapping.getHotelId());
            contentHotel.setActive(checkActive(hotelMappings, hotelMapping.getHotelId()));

        }
        return contentHotel;
    }

    private boolean checkActive(List<HotelMapping> hotelMappings, String hotelId) {
        Predicate<HotelMapping> hotelIdPredicate = hotelMapping -> hotelMapping.getHotelId().equals(hotelId);
        Predicate<HotelMapping> activatePredicate = hotelMapping -> hotelMapping.isActive();
        Stream<HotelMapping> hotelMappingsByHotelId = hotelMappings.stream().filter(
                hotelIdPredicate.and(activatePredicate));
        return hotelMappingsByHotelId.findAny().isPresent();
    }

    private Hotel createHotelContent(Hotel feedHotel, String contentId) {
        Hotel contentHotel = null;
        if (feedHotel != null) {
            contentHotel = new Hotel();
            contentHotel.setId(contentId);
            contentHotel.setAddress(feedHotel.getAddress());
            contentHotel.setCountryCode(feedHotel.getCountryCode());
            contentHotel.setCurrencyCode(feedHotel.getCurrencyCode());
            contentHotel.setDescription(createDescription(feedHotel.getDescription(), contentId));
            contentHotel.setLatitude(feedHotel.getLatitude());
            contentHotel.setLongitude(feedHotel.getLongitude());
            contentHotel.setName(feedHotel.getName());
            contentHotel.setStarRating(feedHotel.getStarRating());
            contentHotel.setSupplierCode(feedHotel.getSupplierCode());
            contentHotel.setZipCode(feedHotel.getZipCode());
        }
        return contentHotel;
    }

    private HotelDescription createDescription(HotelDescription feedDescription, String contentId) {
        HotelDescription contentDescription = null;
        if (feedDescription != null) {
            contentDescription = new HotelDescription();
            contentDescription.setDescription(feedDescription.getDescription());
            contentDescription.setLanguageCode(feedDescription.getLanguageCode());
            contentDescription.setHotelId(contentId);
            contentDescription.setSupplierCode(feedDescription.getSupplierCode());
        }
        return contentDescription;
    }

}
