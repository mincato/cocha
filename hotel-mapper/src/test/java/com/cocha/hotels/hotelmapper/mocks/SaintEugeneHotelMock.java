package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class SaintEugeneHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 265100||St. Eugene Golf Resort & Casino|7777
     * Mission Road||||V1C7E5|CA|49.58598|-115.75502|||CAD|3.5
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-265100");
        hotel.setName("St. Eugene Golf Resort & Casino");
        hotel.setAddress("7777 Mission Road");
        hotel.setZipCode("V1C7E5");
        hotel.setCountryCode("CA");
        hotel.setLatitude(49.58598);
        hotel.setLongitude(-115.75502);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.5");
        return hotel;
    }

    /*
     * <address>7777 Mission Road</address> <countrycode>ca</countrycode>
     * <currencycode>CAD</currencycode> <exact_class>3.0</exact_class>
     * <hotel_id>24738</hotel_id> <location>
     * <latitude>49.5865525509768</latitude>
     * <longitude>-115.7563304901123</longitude> </location> <name>St. Eugene
     * Golf Resort Casino</name> <zip>V1C 7E5</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setAddress("7777 Mission Road");
        hotel.setCountryCode("ca");
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.0");
        hotel.setId("BKG-24738");
        hotel.setLatitude(49.5865525509768);
        hotel.setLongitude(-115.7563304901123);
        hotel.setName("St. Eugene Golf Resort Casino");
        hotel.setZipCode("V1C 7E5");
        return hotel;
    }
}
