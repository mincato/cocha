package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class QualitySuitesHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 125347||Quality Suites|1120 Dearness
     * Dr||||N6E1N9|CA|42.93126|-81.21994|||CAD|2.5
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-125347");
        hotel.setName("Quality Suites");
        hotel.setAddress("1120 Dearness Dr");
        hotel.setZipCode("N6E1N9");
        hotel.setCountryCode("CA");
        hotel.setLatitude(42.93126);
        hotel.setLongitude(-81.21994);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("2.5");
        return hotel;
    }

    /*
     * <address>1120 Dearness Drive</address> <countrycode>ca</countrycode>
     * <currencycode>CAD</currencycode> <exact_class>2.0</exact_class>
     * <hotel_id>24734</hotel_id> <location>
     * <latitude>42.93149870957457</latitude>
     * <longitude>-81.21950715780252</longitude> </location> <name>Quality
     * Suites London</name> <zip>N6E 1N9</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setAddress("1120 Dearness Drive");
        hotel.setCountryCode("ca");
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("2.0");
        hotel.setId("BKG-24734");
        hotel.setLatitude(42.93149870957457);
        hotel.setLongitude(-81.21950715780252);
        hotel.setName("Quality Suites London");
        hotel.setZipCode("N6E 1N9");
        return hotel;
    }
}
