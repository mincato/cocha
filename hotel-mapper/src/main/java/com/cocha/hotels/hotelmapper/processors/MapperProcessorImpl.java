package com.cocha.hotels.hotelmapper.processors;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.mapping.HotelMappingService;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class MapperProcessorImpl implements MapperProcessor {

    private Logger logger = Logger.getLogger(MapperProcessorImpl.class);

    @Autowired
    private HotelMappingService mappingService;
    
    public List<HotelMapping> process(List<Hotel> hotels) {
        logger.info("size:" + hotels.size());
        for (Hotel hotel : hotels) {
            logger.info(hotel.getId());

        }
        
        List<HotelMapping> mapping = mappingService.map(hotels);
        logger.info("MAPPING SIZE:" + mapping.size());
        
        return mapping;
    }
}
