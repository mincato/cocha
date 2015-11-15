package com.cocha.hotels.matesearch.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.backoffice.repository.content.HotelMappingRepository;
import com.cocha.hotels.matesearch.backoffice.service.exception.NotFoundException;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Service
public class HotelMappingService {

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    public List<HotelMapping> getAll() {
        return hotelMappingRepository.findAll();
    }

    public HotelMapping find(Long id) {
        HotelMapping mapping = hotelMappingRepository.findOne(id);
        if (mapping == null) {
            throw new NotFoundException();
        }
        return mapping;
    }

}
