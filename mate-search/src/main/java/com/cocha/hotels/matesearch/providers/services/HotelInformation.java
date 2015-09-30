package com.cocha.hotels.matesearch.providers.services;

import java.util.Map;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.model.matesearch.canonical.Hotel;


@Service
public class HotelInformation {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Handler
	public Hotel getHotelInformation(Map<String, String> parameters) {
		
		Hotel hotel = hotelRepository.findOne(parameters.get("idHotel"));
		
		return hotel; 
	}

}
