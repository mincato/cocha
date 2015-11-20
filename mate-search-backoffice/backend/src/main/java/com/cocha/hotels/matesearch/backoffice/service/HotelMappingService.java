package com.cocha.hotels.matesearch.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cocha.hotels.matesearch.backoffice.dto.HotelMappingDTO;
import com.cocha.hotels.matesearch.backoffice.model.HotelMappingCount;
import com.cocha.hotels.matesearch.backoffice.model.HotelMappingReview;
import com.cocha.hotels.matesearch.backoffice.repository.content.HotelMappingRepository;
import com.cocha.hotels.matesearch.backoffice.repository.feeds.HotelRepository;
import com.cocha.hotels.matesearch.backoffice.service.exception.NotFoundException;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.HotelMatch;

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
        if (howMany == null || howMany == 0) {
            // TODO parametrizar
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

        Hotel reference = hotelRepository.findOne(referenceMapping.getSupplierHotelId(),
                referenceMapping.getSupplierCode());
        Hotel mapped = hotelRepository.findOne(mapping.getSupplierHotelId(), mapping.getSupplierCode());
        return new HotelMappingReview(reference, mapped, mapping);
    }

    @Transactional
    public HotelMapping create(HotelMappingDTO dto) {
        Hotel reference = hotelRepository.findOne(dto.getReferenceId(), dto.getReferenceSupplierCode());
        Hotel mapped = hotelRepository.findOne(dto.getMapId(), dto.getMapSupplierCode());
        HotelMatch match = new HotelMatch(reference, mapped, 99);
        HotelMapping mapping = new HotelMapping("100" + reference.getId(), match);
        mapping.mappedByUser();

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

    public void confirmMapping(Long id) {
        HotelMapping mapping = find(id);

        // TODO parametrizar ésto
        mapping.setConfidence(99);
        mapping.mappedByUser();

        hotelMappingRepository.update(mapping);
    }

    public void rejectMapping(Long id) {
        HotelMapping mapping = find(id);
        String newId = buildNewId(mapping);
        mapping.setHotelId(newId);
        mapping.setConfidence(100);
        mapping.setActive(true);
        mapping.mappedByUser();

        hotelMappingRepository.update(mapping);
    }

    // TODO parametrizar ésto y hacerlo multi supplier
    private String buildNewId(HotelMapping mapping) {
        if ("BKG".equals(mapping.getSupplierCode())) {
            return "200" + mapping.getSupplierHotelId();
        }
        return "999" + mapping.getSupplierHotelId();
    }

    public HotelMapping deactivateMapping(Long id) {
        HotelMapping mapping = find(id);
        // TODO revisar la funcionalidad con lo que hace el mate
        // mapping.setActive(false);

        return update(mapping);

    }

    public HotelMapping activateMapping(Long id) {
        HotelMapping mapping = find(id);
        // TODO revisar la funcionalidad con lo que hace el mate
        // mapping.setActive(true);

        return update(mapping);

    }

}
