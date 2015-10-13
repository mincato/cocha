package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository extends JpaRepository<HotelMapping, String> {

    public List<HotelMapping> findByHotelId(String hotelId);

    @Query("select h from HotelMapping h where h.hotelId in (:hotelIds)")
    public List<HotelMapping> findByHotelIds(@Param("hotelIds") List<String> hotelIds);

}
