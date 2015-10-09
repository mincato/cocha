package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cocha.hotels.model.matesearch.canonical.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

	@Override
	public Hotel findOne(String idCocha);
	
    @Query("select h from Hotel h where h.id in (:hotelIds)")
    public List<Hotel> findByHotelIds(@Param("hotelIds") List<String> hotelIds);
	
}
