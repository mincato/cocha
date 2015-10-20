package com.cocha.hotels.hotelmapper.mocks;

import com.cocha.hotels.model.content.hotel.Hotel;

public class ArmadaHotelMock implements HotelMock {

    /*
     * -EANHotelID:341264 -Name:Armada Hotel -Address1:Keizersgracht 713-715
     * -PostalCode:1017 DX -Country:NL -Latitude:52.36403 -Longitude:4.89845
     * -PropertyCurrency:EUR -StarRating:2.0
     */
    public Hotel buildWithEan() {
        Hotel hotel = new Hotel();
        hotel.setId("EAN-341264");
        hotel.setSupplierCode("EAN");
        hotel.setName("Armada Hotel");
        hotel.setAddress("Keizersgracht 713-715");
        hotel.setZipCode("1017 DX");
        hotel.setCountryCode("NL");
        hotel.setLatitude(52.36403);
        hotel.setLongitude(4.89845);
        hotel.setCurrencyCode("EUR");
        hotel.setStarRating("2.0");
        hotel.setActive(true);
        return hotel;
    }

    /*
     * <result> <address>Keizersgracht 713 - 715</address>
     * <city_id>-2140479</city_id> <class>2</class>
     * <countrycode>nl</countrycode> <currencycode>EUR</currencycode>
     * <exact_class>2.0</exact_class> <hotel_id>10007</hotel_id> <location>
     * <latitude>52.364054522557396</latitude>
     * <longitude>4.8984455689787865</longitude> </location> <name>Armada
     * Hotel</name> <zip>1017 DX</zip> </result>
     */
    public Hotel buildWithBooking() {
        Hotel hotel = new Hotel();
        hotel.setId("BKG-10007");
        hotel.setSupplierCode("BKG");
        hotel.setName("Armada Hotel");
        hotel.setAddress("Keizersgracht 713 - 715");
        hotel.setZipCode("1017 DX");
        hotel.setCountryCode("nl");
        hotel.setLatitude(52.364054522557396);
        hotel.setLongitude(4.8984455689787865);
        hotel.setCurrencyCode("EUR");
        hotel.setStarRating("2.0");
        hotel.setActive(true);
        return hotel;
    }
}
