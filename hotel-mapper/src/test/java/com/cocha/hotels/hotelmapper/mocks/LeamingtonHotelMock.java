package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class LeamingtonHotelMock implements HotelMock {

    /*
     * EANHotelID|Name|Address1|PostalCode|Country|Latitude|Longitude|
     * PropertyCurrency|StarRating 138289|Best Western Plus Leamington Hotel &
     * Conference Centre|566 Bevel Line Rd|N8H3V4|CA|42.01546|-82.57273|CAD|2.5
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-138289");
        hotel.setName("Best Western Plus Leamington Hotel & Conference Centre");
        hotel.setAddress("566 Bevel Line Rd");
        hotel.setZipCode("N8H3V4");
        hotel.setCountryCode("CA");
        hotel.setLatitude(42.01546);
        hotel.setLongitude(-82.57273);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("2.5");
        return hotel;
    }

    /*
     * <address>566 Bevel Line Road </address> <countrycode>ca</countrycode>
     * <currencycode>CAD</currencycode> <exact_class>3.0</exact_class>
     * <hotel_id>24731</hotel_id> <location>
     * <latitude>42.01542429091664</latitude>
     * <longitude>-82.57273524999619</longitude> </location> <name>Best Western
     * Plus Leamington Hotel &amp; Conference Centre</name> <zip>N8H 3V4</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setId("BKG-24731");
        hotel.setName("Best Western Plus Leamington Hotel &amp; Conference Centre");
        hotel.setAddress("566 Bevel Line Road ");
        hotel.setZipCode("N8H 3V4");
        hotel.setCountryCode("ca");
        hotel.setLatitude(42.01542429091664);
        hotel.setLongitude(-82.57273524999619);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.0");
        return hotel;
    }
}
