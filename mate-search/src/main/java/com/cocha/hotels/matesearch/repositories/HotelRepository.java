package com.cocha.hotels.matesearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocha.hotels.model.content.hotel.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

	@Override
	public Hotel findOne(String idCocha);
	
}
