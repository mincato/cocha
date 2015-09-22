package com.cocha.hotels.hotelmapper.processors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;
import com.cocha.hotels.model.content.hotel.HotelKey;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelContentProcessorImpl implements HotelContentProcessor {

    @Autowired
    private HotelFeedRepository hotelFeedRepository;

    @Override
    public Hotel process(HotelMapping hotelMapping) {
        Hotel contentHotel = null;
        if (hotelMapping != null && hotelMapping.getSupplierHotelId() != null && hotelMapping.getSupplierCode() != null
                && hotelMapping.getHotelId() != null) {

            HotelKey hotelKey = new HotelKey();
            hotelKey.setId(hotelMapping.getSupplierHotelId());
            hotelKey.setSupplierCode(hotelMapping.getSupplierCode());
            Hotel feedHotel = hotelFeedRepository.findOne(hotelKey);
            contentHotel = createHotelContent(feedHotel, hotelMapping.getHotelId());

        }
        Logger.getLogger(HotelContentProcessorImpl.class).info("Hotel description: " + contentHotel.getDescription());
        return contentHotel;
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
