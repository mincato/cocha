package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository extends JpaRepository<HotelMapping, String> {

    @Query("select h from HotelMapping h where h.confidence > 64 and h.active = true")
    public List<HotelMapping> findAll();

    @Cacheable(value = "hotelMappings", unless = "#result == null")
    @Query("select h from HotelMapping h where h.hotelId = :hotelId and h.active = true and h.confidence > 64")
    public List<HotelMapping> findByHotelId(@Param("hotelId") String hotelId);

}
