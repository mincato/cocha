package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocha.hotels.matesearch.model.HotelMapping;


public interface HotelMappingRepository extends JpaRepository<HotelMapping, String> {

	List<HotelMapping> findByHotelId(String hotelId);

}
