package com.cocha.hotels.hotelmapper.processors;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class GiataProcessorImpl implements GiataProcessor {

    private Logger logger = Logger.getLogger(GiataProcessorImpl.class);

    public HotelMapping process(HotelMapping hotelMapping, Object giataResponse) {
        
        logger.info(String.format("Mapping: %s %s", hotelMapping.getSupplierCode(), hotelMapping.getConfidence()));
        logger.info("GIATA response class: " + giataResponse.getClass());
        
        return hotelMapping;
    }
}
