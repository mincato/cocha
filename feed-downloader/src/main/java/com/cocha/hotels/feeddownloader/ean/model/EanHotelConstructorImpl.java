package com.cocha.hotels.feeddownloader.ean.model;

import java.util.ArrayList;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class EanHotelConstructorImpl implements EanHotelConstructor {

    private Logger logger = Logger.getLogger(EanHotelConstructorImpl.class);
    
    @Override
    public ArrayList addDescription(ArrayList hotels, ArrayList descriptions) {
        hotels.parallelStream().forEach(hotel -> {
            EanSupplierHotel eanSupplierHotel = (EanSupplierHotel) hotel;
            String hotelId = eanSupplierHotel.getHotelId();
            logger.info("Procesando hotel: " + hotelId);
            Optional<EanHotelDescription> optional = descriptions.stream().filter(description -> {
                return ((EanHotelDescription) description).getHotelId().equals(hotelId);
            }).findFirst();
            if (optional.isPresent()) {
                EanHotelDescription eanHotelDescription = optional.get();
                eanSupplierHotel.setDescription(eanHotelDescription.getPropertyDescription());
            }            
        });
        return hotels;
    }

}
