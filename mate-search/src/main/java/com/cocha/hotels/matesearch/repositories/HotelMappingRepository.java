package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository extends JpaRepository<HotelMapping, String> {

    public List<HotelMapping> findByHotelId(String hotelId);

}
