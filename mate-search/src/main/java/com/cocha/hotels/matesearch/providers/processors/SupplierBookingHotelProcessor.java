package com.cocha.hotels.matesearch.providers.processors;

import org.apache.log4j.Logger;

import com.cocha.hotels.model.matesearch.canonical.Hotel;

public class SupplierBookingHotelProcessor {

    public final static Logger logger = Logger.getLogger(SupplierBookingHotelProcessor.class);

    public Hotel processCustomer(Hotel hotel) {

        logger.info("************************************");
        logger.info("Hotel Processor");
        logger.info("ID Hotel: " + hotel.getIdSupplier());
        logger.info("************************************");
        return hotel;
    }
}
