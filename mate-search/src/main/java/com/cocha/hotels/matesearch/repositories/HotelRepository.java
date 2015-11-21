package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cocha.hotels.model.matesearch.canonical.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

    @Query("select h from Hotel h where h.active = true")
    public List<Hotel> findAll();

    @Override
    @Query("select h from Hotel h where h.id = :hotelId and h.active = true")
    @Cacheable(value = "hotels", unless = "#result == null")
    public Hotel findOne(@Param("hotelId") String id);

}
