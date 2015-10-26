package com.cocha.hotels.hotelmapper.managers;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.repositories.content.HotelMappingRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.google.common.collect.Lists;

@Component
public class HotelMappingManagerImpl implements HotelMappingManager {

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    private List<HotelMapping> hotelMappings;

    @Override
    public void init() {
        hotelMappings = Lists.newArrayList(hotelMappingRepository.findAll());
    }

    @Override
    public HotelMapping find(String supplierHotelId, String supplierCode, Integer confidence) {
        Predicate<HotelMapping> bySupplierHotelId = hotelMapping -> hotelMapping.getSupplierHotelId().equals(
                supplierHotelId);
        Predicate<HotelMapping> bySupplierCode = hotelMapping -> hotelMapping.getSupplierCode().equals(supplierCode);
        Predicate<HotelMapping> byConfidence = hotelMapping -> hotelMapping.getConfidence().equals(supplierHotelId);

        HotelMapping hotelMapping = null;
        Optional<HotelMapping> optionalHotelMapping = hotelMappings.stream()
                .filter(bySupplierHotelId.and(bySupplierCode).and(byConfidence)).findFirst();
        if (optionalHotelMapping.isPresent()) {
            hotelMapping = optionalHotelMapping.get();
        }
        return hotelMapping;
        // return
        // hotelMappingRepository.findBySupplierHotelIdAndSupplierCodeAndConfidence(supplierHotelId,
        // supplierCode,
        // confidence);
    }

    @Override
    public HotelMapping find(String hotelId, String supplierCode) {
        Predicate<HotelMapping> byHotelId = hotelMapping -> hotelMapping.getHotelId().equals(hotelId);
        Predicate<HotelMapping> bySupplierCode = hotelMapping -> hotelMapping.getSupplierCode().equals(supplierCode);
        Predicate<HotelMapping> byUnmapped = hotelMapping -> !hotelMapping.isUnmapped();

        HotelMapping hotelMapping = null;
        Optional<HotelMapping> optionalHotelMapping = hotelMappings.stream().filter(byHotelId.and(bySupplierCode).and(byUnmapped))
                .findFirst();
        if (optionalHotelMapping.isPresent()) {
            hotelMapping = optionalHotelMapping.get();
        }
        return hotelMapping;

        // return
        // hotelMappingRepository.findByHotelIdAndSupplierCodeAndUnmapped(hotelId,
        // supplierCode, false);
    }

    @Override
    public boolean noExistSabreMapping(HotelMapping hotelMapping) {
        Predicate<HotelMapping> byHotelId = entry -> entry.getHotelId().equals(hotelMapping.getHotelId());
        Predicate<HotelMapping> bySupplierCode = entry -> entry.getSupplierCode().equals("SAB");

        return hotelMappings.stream().noneMatch(byHotelId.and(bySupplierCode));
        // return
        // hotelMappingRepository.findByHotelIdAndSupplierCode(hotelMapping.getHotelId(),
        // "SAB") != null;
    }

}
