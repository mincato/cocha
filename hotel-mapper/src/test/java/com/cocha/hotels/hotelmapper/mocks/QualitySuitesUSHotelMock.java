package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class QualitySuitesUSHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 241051||Quality Inn & Suites|5200 Lincoln
     * Hwy||||60443|US|41.50736|-87.73638|||USD|2.5
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-241051");
        hotel.setName("Quality Inn & Suites");
        hotel.setAddress("5200 Lincoln Hwy");
        hotel.setZipCode("60443");
        hotel.setCountryCode("US");
        hotel.setLatitude(41.50736);
        hotel.setLongitude(-87.73638);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("2.5");
        return hotel;
    }

    /*
     * <address>5200 West Lincoln Highway</address>
     * <countrycode>us</countrycode> <currencycode>USD</currencycode>
     * <exact_class>2.0</exact_class> <hotel_id>24737</hotel_id> <location>
     * <latitude>41.507329951219745</latitude>
     * <longitude>-87.73694783449173</longitude> </location> <name>Quality Inn
     * and Suites Matteson</name> <zip>60443</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setAddress("5200 West Lincoln Highway");
        hotel.setCountryCode("us");
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("2.0");
        hotel.setId("BKG-24737");
        hotel.setLatitude(41.507329951219745);
        hotel.setLongitude(-87.73694783449173);
        hotel.setName("Quality Inn and Suites Matteson");
        hotel.setZipCode("60443");
        return hotel;
    }
}
