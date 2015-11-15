package com.cocha.hotels.matesearch.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public HotelMapping create(HotelMapping mapping) {
        hotelMappingRepository.create(mapping);
        return find(mapping.getId());
    }

    @Transactional
    public HotelMapping update(HotelMapping mapping) {
        hotelMappingRepository.update(mapping);
        return find(mapping.getId());
    }

    public void delete(Long id) {
        HotelMapping mapping = find(id);
        hotelMappingRepository.delete(mapping);
    }
}
