package com.cocha.hotels.matesearch.providers.processors;

import org.apache.log4j.Logger;

import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.Room;

public class HotelProcessor {

    public final static Logger logger = Logger.getLogger(HotelProcessor.class);

    public Hotel processCustomer(Hotel hotel) {

        logger.info("************************************");
        logger.info("Hotel Processor");
        logger.info("ID Hotel: " + hotel.getIdSupplier());
        logger.info("Date Arrival: " + hotel.getArrivalDate());
        logger.info("Date Departure: " + hotel.getDepartureDate());
        for (Room room : hotel.getRooms()) {
            logger.info(room.getRateDescription());
            logger.info(room.getRoomTypeDescription());
        }
        logger.info("************************************");
        return hotel;
    }
}
