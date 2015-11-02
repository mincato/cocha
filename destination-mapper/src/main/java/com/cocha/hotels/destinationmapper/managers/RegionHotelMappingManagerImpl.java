package com.cocha.hotels.destinationmapper.managers;

import org.springframework.stereotype.Component;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class RegionHotelMappingManagerImpl implements RegionHotelMappingManager {

    @Override
    public HotelMapping findHotelMapping(String supplierHotelId, String supplierCode) {
        // return
        // hotelMappingRepository.findBySupplierHotelIdAndSupplierCodeAndConfidence(supplierHotelId,
        // supplierCode,confidence);
        return null;
    }

    @Override
    public RegionHotelMapping find(String hotelId, String regionId) {
        // return
        // hotelMappingRepository.findByHotelIdAndSupplierCodeAndUnmapped(hotelId,
        // supplierCode, false);
        return null;
    }

}
