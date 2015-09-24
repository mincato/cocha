package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class TaybridgeSuitesHotelMock implements HotelMock {

    /*
     * EANHotelID||Name|Address1||||PostalCode|Country|Latitude|Longitude|||
     * PropertyCurrency|StarRating 264991||Staybridge Suites Guelph|11 Corporate
     * Court||||N1G5G5|CA|43.49122|-80.20964|||CAD|3.0
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-264991");
        hotel.setSupplierCode("EAN");
        hotel.setName("Staybridge Suites Guelph");
        hotel.setAddress("11 Corporate Court");
        hotel.setZipCode("N1G5G5");
        hotel.setCountryCode("CA");
        hotel.setLatitude(43.49122);
        hotel.setLongitude(-80.20964);
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.0");
        return hotel;
    }

    /*
     * <address>11 Corporate Court</address> <countrycode>ca</countrycode>
     * <currencycode>CAD</currencycode> <exact_class>3.0</exact_class>
     * <hotel_id>24735</hotel_id> <location>
     * <latitude>43.49156859296362</latitude>
     * <longitude>-80.21018654108053</longitude> </location> <name>Staybridge
     * Suites Guelph</name> <zip>N1G 5G5</zip>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setAddress("11 Corporate Court");
        hotel.setCountryCode("ca");
        hotel.setCurrencyCode("CAD");
        hotel.setStarRating("3.0");
        hotel.setId("BKG-24735");
        hotel.setSupplierCode("BKG");
        hotel.setLatitude(43.49156859296362);
        hotel.setLongitude(-80.21018654108053);
        hotel.setName("Staybridge Suites Guelph");
        hotel.setZipCode("N1G 5G5");
        return hotel;
    }
}
