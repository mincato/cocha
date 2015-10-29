package com.cocha.hotels.destinationmapper.processors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.hotel.Hotel;

@Component
public class ProvidersProcessorImpl implements ProvidersProcessor {

    private Logger logger = Logger.getLogger(ProvidersProcessorImpl.class);    	
    
    public Map<String,List<Hotel>> process(List<Hotel> hotels) {
	   logger.info("Started mapping Region Hotels: parsing hotels by providers");
	   
	   Predicate<Hotel> byEANCode = (hotel) -> hotel.getSupplierCode().equals(Hotel.EAN_SUPPLIER_CODE);
       Predicate<Hotel> byBookingCode = (hotel) -> hotel.getSupplierCode().equals(Hotel.BOOKING_SUPPLIER_CODE);
                     
       List<Hotel> eanHotels = hotels.stream().filter(byEANCode).collect(Collectors.toList());
       List<Hotel> bookingHotels = hotels.stream().filter(byBookingCode).collect(Collectors.toList());
		
       Map<String,List<Hotel>> providersMapping = new HashMap<String, List<Hotel>>();
	
       providersMapping.put(Hotel.EAN_SUPPLIER_CODE,eanHotels);
       providersMapping.put(Hotel.BOOKING_SUPPLIER_CODE,bookingHotels);		
		
		return providersMapping;
	}
}
