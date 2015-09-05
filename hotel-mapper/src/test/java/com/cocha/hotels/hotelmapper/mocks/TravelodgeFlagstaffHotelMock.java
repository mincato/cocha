package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class TravelodgeFlagstaffHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 208813||Travelodge Flagstaff|1560 E Route
     * 66||||86001|US|35.19473|-111.63004|||USD|2.0
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-208813");
        hotel.setName("Travelodge Flagstaff");
        hotel.setAddress("1560 E Route 66");
        hotel.setZipCode("86001");
        hotel.setCountryCode("US");
        hotel.setLatitude(35.19473);
        hotel.setLongitude(-111.63004);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("2.0");
        return hotel;
    }

    /*
     * <address>1008 East Route 66</address> <countrycode>us</countrycode>
     * <currencycode>USD</currencycode> <exact_class>3.0</exact_class>
     * <hotel_id>24736</hotel_id> <location>
     * <latitude>35.19435.19422632529751</latitude>
     * <longitude>-111.63761883974075</longitude> </location> <name>Hotel Aspen
     * Flagstaff/ Grand Canyon InnSuites</name> <zip>86001</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setAddress("1008 East Route 66");
        hotel.setCountryCode("us");
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("3.0");
        hotel.setId("BKG-24736");
        hotel.setLatitude(35.1943519422632529751);
        hotel.setLongitude(-111.63761883974075);
        hotel.setName("Hotel Aspen Flagstaff/ Grand Canyon InnSuites");
        hotel.setZipCode("86001");
        return hotel;
    }
}
