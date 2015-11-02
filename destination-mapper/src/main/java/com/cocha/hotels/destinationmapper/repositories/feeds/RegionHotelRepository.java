package com.cocha.hotels.destinationmapper.repositories.feeds;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.cocha.hotels.model.content.geo.RegionHotel;


public interface RegionHotelRepository extends CrudRepository<RegionHotel, Long> {

    public List<RegionHotel> findByidHotelAndSupplierCode(String hotelId, String supplierCode);    

}
