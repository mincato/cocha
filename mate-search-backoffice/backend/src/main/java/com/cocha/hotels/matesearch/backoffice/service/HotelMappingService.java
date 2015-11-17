package com.cocha.hotels.matesearch.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cocha.hotels.matesearch.backoffice.model.HotelMappingCount;
import com.cocha.hotels.matesearch.backoffice.model.HotelMappingReview;
import com.cocha.hotels.matesearch.backoffice.repository.content.HotelMappingRepository;
import com.cocha.hotels.matesearch.backoffice.repository.feeds.HotelRepository;
import com.cocha.hotels.matesearch.backoffice.service.exception.NotFoundException;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Service
public class HotelMappingService {

    @Autowired
    private HotelMappingRepository hotelMappingRepository;
    
    @Autowired
    private HotelRepository hotelRepository;

    public List<HotelMapping> getAll() {
        return hotelMappingRepository.findAll();
    }
    
    public List<HotelMapping> getAllByCountry(String id) {
        return hotelMappingRepository.findAllByCountry(id);
    }

    public List<HotelMappingCount> getTopMappings(Integer howMany) {
        if (howMany == null || howMany == 0){
            //TODO parametrizar
            howMany = 20;
        }
        return hotelMappingRepository.findTopMappings(howMany);
    }

    public HotelMapping find(Long id) {
        HotelMapping mapping = hotelMappingRepository.findOne(id);
        if (mapping == null) {
            throw new NotFoundException();
        }
        return mapping;
    }
    

    public HotelMappingReview findReview(Long id) {
        HotelMapping mapping = hotelMappingRepository.findOne(id);
        if (mapping == null)
            throw new NotFoundException();
        
        HotelMapping referenceMapping = hotelMappingRepository.findReferenceMapping(mapping.getHotelId());
        
        Hotel reference = hotelRepository.findOne(referenceMapping.getSupplierHotelId(), referenceMapping.getSupplierCode());
        Hotel mapped = hotelRepository.findOne(mapping.getSupplierHotelId(), mapping.getSupplierCode());
        return new HotelMappingReview(reference, mapped, mapping);
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
