package com.cocha.hotels.destinationmapper.repositories.content;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

public interface GeoMappingRepository extends CrudRepository<RegionHotelMapping, Long> {

    public HotelMapping findByHotelIdAndSupplierCode(String hotelId, String supplierCode);

    public HotelMapping findBySupplierHotelIdAndSupplierCode(String supplierHotelId, String supplierCode);
    
    

}
