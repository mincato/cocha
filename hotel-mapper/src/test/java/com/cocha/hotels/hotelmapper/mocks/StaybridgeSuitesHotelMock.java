package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class StaybridgeSuitesHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 264992||Staybridge Suites Oakville|2511
     * Wyecroft Rd||||L6L6P8|CA|43.40795|-79.73573|||CAD|3.0
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-264992");
        hotel.setName("Staybridge Suites Oakville");
        hotel.setAddress("2511 Wyecroft Rd");
        hotel.setZipCode("L6L6P8");
        hotel.setCountryCode("CA");
        hotel.setLatitude(43.40795);
        hotel.setLongitude(-79.73573);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.0");
        return hotel;
    }

    /*
     * <address>2511 Wyecroft Road</address> <countrycode>ca</countrycode>
     * <currencycode>CAD</currencycode> <exact_class>3.0</exact_class>
     * <hotel_id>24733</hotel_id> <location>
     * <latitude>43.40792364584188</latitude>
     * <longitude>-79.73550528287888</longitude> </location> <name>Staybridge
     * Suites Oakville Burlington</name> <zip>L6L 6P8</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setId("BKG-24733");
        hotel.setName("Staybridge Suites Oakville Burlington");
        hotel.setAddress("2511 Wyecroft Road");
        hotel.setZipCode("L6L 6P8");
        hotel.setCountryCode("ca");
        hotel.setLatitude(43.40792364584188);
        hotel.setLongitude(-79.73550528287888);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.0");
        return hotel;
    }
}
