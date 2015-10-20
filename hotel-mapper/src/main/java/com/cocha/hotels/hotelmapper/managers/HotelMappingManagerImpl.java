package com.cocha.hotels.hotelmapper.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.repositories.content.HotelMappingRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class HotelMappingManagerImpl implements HotelMappingManager {

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    @Override
    public HotelMapping find(String supplierHotelId, String supplierCode, Integer confidence) {
        return hotelMappingRepository.findBySupplierHotelIdAndSupplierCodeAndConfidence(supplierHotelId, supplierCode,
                confidence);
    }

    @Override
    public HotelMapping find(String hotelId, String supplierCode) {
        return hotelMappingRepository.findByHotelIdAndSupplierCodeAndUnmapped(hotelId, supplierCode, false);
    }

}
