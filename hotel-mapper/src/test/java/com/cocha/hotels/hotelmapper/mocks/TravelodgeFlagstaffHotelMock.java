package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

/**
 * Los datos de cada supplier corresponden a DISTINTOS HOTELES!
 * https://www.google
 * .com.ar/maps/place/Hotel+Aspen+Flagstaff/@35.1948647,-111.63602
 * ,683m/data=!3m1
 * !1e3!4m2!3m1!1s0x0000000000000000:0x708a0555adb1168e!6m1!1e1?hl=en
 * https://www
 * .google.com.ar/maps/place/Travelodge+Flagstaff/@35.1948647,-111.63602
 * ,683m/data
 * =!3m1!1e3!4m2!3m1!1s0x0000000000000000:0x72bbc04c5c0014f2!6m1!1e1?hl=en
 *
 */
public class TravelodgeFlagstaffHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 208813||Travelodge Flagstaff|1560 E Route
     * 66||||86001|US|35.19473|-111.63004|||USD|2.0
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-208813");
        hotel.setSupplierCode("EAN");
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
        hotel.setSupplierCode("BKG");
        hotel.setLatitude(35.1943519422632529751);
        hotel.setLongitude(-111.63761883974075);
        hotel.setName("Hotel Aspen Flagstaff/ Grand Canyon InnSuites");
        hotel.setZipCode("86001");
        return hotel;
    }
}
