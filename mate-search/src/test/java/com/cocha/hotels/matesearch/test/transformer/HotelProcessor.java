package com.cocha.hotels.matesearch.test.transformer;

import org.apache.log4j.Logger;

import com.cocha.hotels.model.matesearch.canonical.Hotel;
import com.cocha.hotels.model.matesearch.canonical.Room;

public class HotelProcessor {

    public final static Logger logger = Logger.getLogger(HotelProcessor.class);

    public Hotel processCustomer(Hotel hotel) {
    	
        logger.info("************************************");
        logger.info("Hotel Processor");
        logger.info("ID Hotel: " + hotel.getIdSupplier());
        logger.info("Nombre Hotel: " + hotel.getHotelName());
        logger.info("Date Arrival: " + hotel.getArrivalDate());
        logger.info("Date Departure: " + hotel.getDepartureDate());
        	for(Room room : hotel.getRooms()) {
        		logger.info(room.getRateCode());
        		logger.info(room.getRoomTypeCode());
        	}
        logger.info("************************************");
        return hotel;
    }
}
