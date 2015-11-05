package com.cocha.hotels.hotelmapper.repositories.content;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository extends CrudRepository<HotelMapping, Long> {

    public HotelMapping findByHotelIdAndSupplierCodeAndUnmapped(String hotelId, String supplierCode, boolean unmapped);

    public HotelMapping findBySupplierHotelIdAndSupplierCodeAndConfidence(String supplierHotelId, String supplierCode,
            Integer confidence);

    public HotelMapping findByHotelIdAndSupplierCode(String hotelId, String supplierCode);

    public List<HotelMapping> findByCountryCodeAndUnmapped(String countryCode, boolean unmapped);

}
