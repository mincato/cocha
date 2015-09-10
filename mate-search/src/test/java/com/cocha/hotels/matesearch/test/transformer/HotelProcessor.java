package com.cocha.hotels.matesearch.test.transformer;

import org.apache.log4j.Logger;

import com.cocha.hotels.model.matesearch.canonical.Hotel;

public class HotelProcessor {

    public final static Logger logger = Logger.getLogger(HotelProcessor.class);

    public Hotel processCustomer(Hotel hotel) {
        logger.info("************************************");
        logger.info("Hotel Processor");
        logger.info("ID Hotel: " + hotel.getIdEAN());
        logger.info("Nombre Hotel: " + hotel.getHotelName());
        logger.info("************************************");
        return hotel;
    }
}
