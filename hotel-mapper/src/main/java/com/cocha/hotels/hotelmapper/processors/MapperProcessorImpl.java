package com.cocha.hotels.hotelmapper.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class MapperProcessorImpl implements MapperProcessor {

    private Logger logger = Logger.getLogger(MapperProcessorImpl.class);

    public List<HotelMapping> process(List<Hotel> hotels) {
        logger.info("size:" + hotels.size());
        for (Hotel hotel : hotels) {
            logger.info(hotel.getId());

        }
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId1");
        hotelMapping.setSupplierCode("EAN");
        hotelMapping.setSupplierHotelId("eanHotelId1");
        hotelMapping.setConfidence(100);
        hotelMappings.add(hotelMapping);

        hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId1");
        hotelMapping.setSupplierCode("BKG");
        hotelMapping.setSupplierHotelId("bkgHotelId1");
        hotelMapping.setConfidence(70);
        hotelMappings.add(hotelMapping);

        hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId2");
        hotelMapping.setSupplierCode("BKG");
        hotelMapping.setSupplierHotelId("bkgHotelId2");
        hotelMapping.setConfidence(100);
        hotelMappings.add(hotelMapping);

        return hotelMappings;
    }
}
