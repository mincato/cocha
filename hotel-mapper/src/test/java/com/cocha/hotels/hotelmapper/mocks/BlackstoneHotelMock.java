package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class BlackstoneHotelMock implements HotelMock {

    /*
     * EANHotelID|Name|Address1|PostalCode|Country|Latitude|Longitude|
     * PropertyCurrency|StarRating 144665|The Blackstone Renaissance Chicago
     * Hotel|636 S Michigan Ave|60605|US|41.87337|-87.62428|USD|4.0
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-144665");
        hotel.setName("The Blackstone Renaissance Chicago Hotel");
        hotel.setAddress("636 S Michigan Ave");
        hotel.setZipCode("60605");
        hotel.setCountryCode("US");
        hotel.setLatitude(41.87337);
        hotel.setLongitude(-87.62428);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("4.0");
        return hotel;
    }

    /*
         <address>636 South Michigan Avenue</address>
         <countrycode>us</countrycode>
         <currencycode>USD</currencycode>
         <exact_class>4.0</exact_class>
         <hotel_id>24730</hotel_id>
         <location>
             <latitude>41.873409605523726</latitude>
             <longitude>-87.6244130730629</longitude>
         </location>
         <name>Renaissance Blackstone Chicago Hotel</name>
         <zip>60605</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setId("BKG-24730");
        hotel.setName("Renaissance Blackstone Chicago Hotel");
        hotel.setAddress("636 South Michigan Avenue");
        hotel.setZipCode("60605");
        hotel.setCountryCode("us");
        hotel.setLatitude(41.873409605523726);
        hotel.setLongitude(-87.6244130730629);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("4.0");
        return hotel;
    }
}
