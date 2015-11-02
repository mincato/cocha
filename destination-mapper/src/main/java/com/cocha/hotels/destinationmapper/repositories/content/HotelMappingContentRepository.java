package com.cocha.hotels.destinationmapper.repositories.content;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingContentRepository extends CrudRepository<HotelMapping, Long> {

    HotelMapping findByhotelIdAndSupplierCode(String hotelId, String supplierCode);
}
