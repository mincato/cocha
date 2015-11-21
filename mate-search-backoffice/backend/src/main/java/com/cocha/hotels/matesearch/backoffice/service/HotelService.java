package com.cocha.hotels.matesearch.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.backoffice.repository.feeds.HotelRepository;
import com.cocha.hotels.matesearch.backoffice.service.exception.NotFoundException;
import com.cocha.hotels.model.content.hotel.Hotel;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    public Hotel find(String id, String supplierCode) {
        Hotel hotel = hotelRepository.findOne(id, supplierCode);
        if (hotel == null) {
            throw new NotFoundException();
        }
        return hotel;
    }

}
