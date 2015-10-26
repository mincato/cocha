package com.cocha.hotels.hotelmapper.managers;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingManager {

    public void init();

    public HotelMapping find(String supplierHotelId, String supplierCode, Integer confidence);

    public HotelMapping find(String hotelId, String bookingCode);

    public boolean noExistSabreMapping(HotelMapping hotelMapping);

}
