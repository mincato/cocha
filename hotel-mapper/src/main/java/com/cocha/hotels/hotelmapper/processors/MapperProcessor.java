package com.cocha.hotels.hotelmapper.processors;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.hotel.Hotel;

@Component
public class MapperProcessor {

	private Logger logger = Logger.getLogger(MapperProcessor.class);
	
	public void process(List<Hotel> hotels) {
		logger.info("size:" + hotels.size());
		for (Hotel hotel : hotels) {
			logger.info(hotel.getId());
		}
	}
}
