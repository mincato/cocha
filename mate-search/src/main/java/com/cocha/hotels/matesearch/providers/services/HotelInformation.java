package com.cocha.hotels.matesearch.providers.services;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.model.content.mapping.HotelList;
import com.cocha.hotels.model.matesearch.canonical.Hotel;


@Service
public class HotelInformation {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Handler
	public HotelList getHotelInformation(Map<String, String> parameters) {
		
		HotelList hotelList = new HotelList();
		
		List<String> ids = Arrays.asList(parameters.get("idHotel").split("\\s*,\\s*"));
		
		List<Hotel> hotels = hotelRepository.findByHotelIds(ids);
		
		hotelList.setHotel(hotels);
		
		return hotelList; 
	}

}
