package com.cocha.hotels.matesearch.providers.processors;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.Hotel;

@Component
public class SupplierHotelProcessor {

    private static final Logger log = Logger.getLogger(SupplierHotelProcessor.class);

    public Hotel processCustomer(Hotel hotel) {

        log.info("************************************");
        log.info("Hotel Processor");
        log.info("ID Hotel: " + hotel.getIdSupplier());
        log.info("Room Price: " + hotel.getRoomDetail().getRateInfo().getAverageRate());
        log.info("************************************");
        return hotel;
    }
}
