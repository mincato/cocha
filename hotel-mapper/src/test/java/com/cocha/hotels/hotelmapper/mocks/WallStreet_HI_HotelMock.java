package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class WallStreet_HI_HotelMock implements HotelMock {

    /*
     * EANHotelID|Name|Address1|PostalCode|Country|Latitude|Longitude|
     * PropertyCurrency|StarRating 272124|Holiday Inn New York City - Wall
     * Street|51 Nassau St.|10038|US|40.70888|-74.00908|USD|3.5
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-272124");
        hotel.setSupplierCode("EAN");
        hotel.setName("Holiday Inn New York City - Wall Street");
        hotel.setAddress("51 Nassau St.");
        hotel.setZipCode("10038");
        hotel.setCountryCode("US");
        hotel.setLatitude(40.70888);
        hotel.setLongitude(-74.00908);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("3.5");
        return hotel;
    }

    /*
     * <address>51 Nassau Street</address> <countrycode>us</countrycode>
     * <currencycode>USD</currencycode> <exact_class>3.0</exact_class>
     * <hotel_id>24727</hotel_id> <location>
     * <latitude>40.708968164510175</latitude>
     * <longitude>-74.00909230113024</longitude> </location> <name>Holiday Inn
     * Wall Street</name> <zip>10038</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setId("BKG-24727");
        hotel.setSupplierCode("BKG");
        hotel.setName("Holiday Inn Wall Street");
        hotel.setAddress("51 Nassau Street");
        hotel.setZipCode("10038");
        hotel.setCountryCode("us");
        hotel.setLatitude(40.708968164510175);
        hotel.setLongitude(-74.00909230113024);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("3.0");
        return hotel;
    }
}
