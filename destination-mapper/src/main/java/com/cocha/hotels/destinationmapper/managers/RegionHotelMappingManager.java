package com.cocha.hotels.destinationmapper.managers;

import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

public interface RegionHotelMappingManager {

    public RegionHotelMapping find(String supplierHotelId, String supplierCode);

    public HotelMapping findHotelMapping(String supplierHotelId, String supplierCode);

}
