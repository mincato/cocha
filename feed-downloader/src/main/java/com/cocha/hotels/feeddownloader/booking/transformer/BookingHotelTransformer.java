package com.cocha.hotels.feeddownloader.booking.transformer;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Converter;

import com.cocha.hotels.feeddownloader.booking.model.BookingSupplierHotel;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;
import com.cocha.hotels.model.content.hotel.Hotel;

@Converter
public class BookingHotelTransformer {

    @SuppressWarnings("rawtypes")
    @Converter
    public static ArrayList toCanonicalHotels(GetHotelsResponse hotelsResponse) {
        ArrayList<Hotel> hotels = null;
        if (hotelsResponse != null) {
            hotels = new ArrayList<Hotel>();
            List<BookingSupplierHotel> supplierHotels = hotelsResponse.getHotels();
            if (supplierHotels != null) {
                for (BookingSupplierHotel supplierHotel : supplierHotels) {
                    hotels.add(toCanonicalHotel(supplierHotel));
                }
            }
        }
        return hotels;
    }

    private static Hotel toCanonicalHotel(BookingSupplierHotel supplierHotel) {
        Hotel canonicalHotel = null;
        if (supplierHotel != null) {
            canonicalHotel = new Hotel();
            canonicalHotel.setId(supplierHotel.getHotelId());
            canonicalHotel.setAddress(supplierHotel.getAddress());
            canonicalHotel.setCountryCode(supplierHotel.getCountryCode());
            canonicalHotel.setCurrencyCode(supplierHotel.getCurrencyCode());
            if (supplierHotel.getLocation() != null) {
                canonicalHotel.setLatitude(Double.parseDouble(supplierHotel.getLocation().getLatitude()));
                canonicalHotel.setLongitude(Double.parseDouble(supplierHotel.getLocation().getLongitude()));
            }
            canonicalHotel.setName(supplierHotel.getName());
            canonicalHotel.setStarRating(supplierHotel.getStars());
            canonicalHotel.setZipCode(supplierHotel.getZip());
            canonicalHotel.setSupplierCode(Hotel.BOOKING_SUPPLIER_CODE);
            canonicalHotel.setDescription(supplierHotel.getDescription());
        }
        return canonicalHotel;
    }

}
