package com.cocha.hotels.hotelmapper.managers;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingManager {

    public void init();

    public HotelMapping find(String supplierHotelId, String supplierCode, Integer confidence);

    public HotelMapping find(String hotelId, String supplierCode);

    public boolean noExistSabreMapping(HotelMapping hotelMapping);

    public void init(String countryCode);

    public HotelMapping findOwnerReference(String supplierHotelId, String supplierCode);

    public HotelMapping findMappedReference(String hotelId, String supplierCode);

}
