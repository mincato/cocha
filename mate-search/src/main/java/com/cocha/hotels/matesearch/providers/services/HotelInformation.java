package com.cocha.hotels.matesearch.providers.services;

import java.util.Map;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.matesearch.util.MessageUtils;
import com.cocha.hotels.model.content.hotel.Hotel;

@Service
public class HotelInformation {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Handler
	public Hotel getHotelInformation(String camelHttpQuery) {
		Map<String, String> parameters = MessageUtils.parseQueryParams(camelHttpQuery);
		
		Hotel hotel = new Hotel();
		
		return hotel; 
	}

}
