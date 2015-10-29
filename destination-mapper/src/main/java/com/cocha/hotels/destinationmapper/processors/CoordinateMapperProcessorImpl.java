package com.cocha.hotels.destinationmapper.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.destinationmapper.mapping.GeoMappingService;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class CoordinateMapperProcessorImpl implements CoordinateMapperProcessor {

    private Logger logger = Logger.getLogger(CoordinateMapperProcessorImpl.class);

    @Autowired
    private GeoMappingService mappingService;

    public List<RegionHotelMapping> process(List<Hotel> hotels) {
    	List<RegionHotelMapping> mapping = new ArrayList<RegionHotelMapping>();
    	
    	for (Hotel hotel : hotels) {     
                logger.info("Started mapping regions-hotels. hotel id: " + hotel.getId());
        
        
        
        
        
        
    	}
        return mapping;
    }	
}
