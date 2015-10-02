package com.cocha.hotels.hotelmapper.processors;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class GiataProcessorImpl implements GiataProcessor {

    private Logger logger = Logger.getLogger(GiataProcessorImpl.class);

    public List<HotelMapping> process(List<HotelMapping> hotelMappings) {
        
        logger.info("Mapping hotels size: " + hotelMappings.size());
        
        return hotelMappings;
    }
}
