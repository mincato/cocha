package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class ComfortInnHotelMock implements HotelMock {

    /*
     * EANHotelID|Name|Address1|PostalCode|Country|Latitude|Longitude|
     * PropertyCurrency|StarRating 164305|Comfort Inn Conference Center
     * Midtown|3200 W Broad St|23230|US|37.56611|-77.47481|USD|2.5
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-164305");
        hotel.setName("Comfort Inn Conference Center Midtown");
        hotel.setAddress("3200 W Broad St");
        hotel.setZipCode("23230");
        hotel.setCountryCode("US");
        hotel.setLatitude(37.56611);
        hotel.setLongitude(-77.47481);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("2.5");
        return hotel;
    }

    /*
     * <address>3200 West Broad Street</address> <countrycode>us</countrycode>
     * <currencycode>USD</currencycode> <exact_class>2.0</exact_class>
     * <hotel_id>24732</hotel_id> <location>
     * <latitude>37.56674241664355</latitude>
     * <longitude>-77.47532844543457</longitude> </location> <name>Comfort Inn
     * Conference Center Midtown</name> <zip>23230</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setId("BKG-24732");
        hotel.setName("Comfort Inn Conference Center Midtown");
        hotel.setAddress("3200 West Broad Street");
        hotel.setZipCode("23230");
        hotel.setCountryCode("us");
        hotel.setLatitude(37.56674241664355);
        hotel.setLongitude(-77.47532844543457);
        hotel.setCurrencyCode("USD");
        hotel.setStarRating("2.0");
        return hotel;
    }
}
