package com.cocha.hotels.feeddownloader.ean.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class EanHotelConstructorImpl implements EanHotelConstructor {

    @Override
    public ArrayList addDescription(ArrayList hotels, ArrayList descriptions) {
        for (Object description : descriptions) {
            EanHotelDescription eanHotelDescription = (EanHotelDescription) description;
            String hotelId = eanHotelDescription.getHotelId();
            EanSupplierHotel eanSupplierHotel = (EanSupplierHotel) hotels.stream().filter(hotel -> {
                return ((EanSupplierHotel) hotel).getHotelId().equals(hotelId);
            }).findFirst().get();
            eanSupplierHotel.setDescription(eanHotelDescription.getPropertyDescription());
        }
        return hotels;
    }

}
