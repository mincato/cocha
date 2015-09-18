package com.cocha.hotels.feeddownloader.booking.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookingHotelConstructorImpl implements BookingHotelConstructor {

    @Override
    public GetHotelsResponse addDescription(GetHotelsResponse hotelResponse,
            GetHotelDescriptionTranslations descriptions) {
        List<BookingSupplierHotel> hotels = hotelResponse.getHotels();
        List<HotelDescriptionTranslation> descriptionTranslations = descriptions.getDescriptionTranslations();
        for (HotelDescriptionTranslation hotelDescriptionTranslation : descriptionTranslations) {
            String hotelId = hotelDescriptionTranslation.getHotelId();
            BookingSupplierHotel bookingSupplierHotel = hotels.stream().filter(hotel -> {
                return hotel.getHotelId().equals(hotelId);
            }).findFirst().get();
            bookingSupplierHotel.setDescription(hotelDescriptionTranslation.getDescription());
        }
        return hotelResponse;
    }

}
