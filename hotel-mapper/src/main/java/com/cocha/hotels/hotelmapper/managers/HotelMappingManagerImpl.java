package com.cocha.hotels.hotelmapper.managers;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.repositories.content.HotelMappingRepository;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;

@Component
public class HotelMappingManagerImpl implements HotelMappingManager {

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    private List<HotelMapping> hotelMappings;

    private Map<HotelIdKey, HotelMapping> hotelMappingsByHotelId;

    private Map<SupplierHotelIdKey, HotelMapping> hotelMappingByOwner;

    @Override
    public void init(String countryCode) {
        List<HotelMapping> hotelMappingByCountryCode = hotelMappingRepository.findByCountryCodeAndUnmapped(countryCode,
                false);
        Function<HotelMapping, HotelIdKey> hotelIdFunction = hotelMapping -> new HotelIdKey(hotelMapping.getHotelId(),
                hotelMapping.getSupplierCode());

        hotelMappingsByHotelId = hotelMappingByCountryCode.stream().collect(
                Collectors.toMap(hotelIdFunction, Function.identity()));

        Function<HotelMapping, SupplierHotelIdKey> hotelOwnerFunction = hotelMapping -> new SupplierHotelIdKey(
                hotelMapping.getSupplierHotelId(), hotelMapping.getSupplierCode());

        hotelMappingByOwner = hotelMappingByCountryCode.stream()
                .filter(hotelMapping -> hotelMapping.getConfidence() == 100)
                .collect(Collectors.toMap(hotelOwnerFunction, Function.identity()));
    }

    @Override
    public HotelMapping findOwnerReference(String supplierHotelId, String supplierCode) {
        HotelMapping hotelMapping = null;
        if (this.hotelMappingByOwner != null && !this.hotelMappingByOwner.isEmpty()) {
            hotelMapping = this.hotelMappingByOwner.get(new SupplierHotelIdKey(supplierHotelId, supplierCode));
        }
        return hotelMapping;
    }

    @Override
    public HotelMapping findMappedReference(String hotelId, String supplierCode) {
        HotelMapping hotelMapping = null;
        if (this.hotelMappingsByHotelId != null && !this.hotelMappingsByHotelId.isEmpty()) {
            hotelMapping = this.hotelMappingsByHotelId.get(new HotelIdKey(hotelId, supplierCode));
        }
        return hotelMapping;
    }

    @Override
    public boolean noExistSabreMapping(HotelMapping hotelMapping) {
        boolean noExist = true;
        if (this.hotelMappingsByHotelId != null && !this.hotelMappingsByHotelId.isEmpty()) {
            noExist = !this.hotelMappingsByHotelId.containsKey(new HotelIdKey(hotelMapping.getHotelId(),
                    Hotel.SABRE_SUPPLIER_CODE));
        }
        return noExist;
        // return
        // hotelMappingRepository.findByHotelIdAndSupplierCode(hotelMapping.getHotelId(),
        // "SAB") != null;
    }

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
        Optional<HotelMapping> optionalHotelMapping = hotelMappings.stream()
                .filter(byHotelId.and(bySupplierCode).and(byUnmapped)).findFirst();
        if (optionalHotelMapping.isPresent()) {
            hotelMapping = optionalHotelMapping.get();
        }
        return hotelMapping;

        // return
        // hotelMappingRepository.findByHotelIdAndSupplierCodeAndUnmapped(hotelId,
        // supplierCode, false);
    }

    // @Override
    // public boolean noExistSabreMapping(HotelMapping hotelMapping) {
    // Predicate<HotelMapping> byHotelId = entry -> entry.getHotelId().equals(
    // hotelMapping.getHotelId());
    // Predicate<HotelMapping> bySupplierCode = entry -> entry
    // .getSupplierCode().equals(Hotel.SABRE_SUPPLIER_CODE);
    //
    // return hotelMappings.stream().noneMatch(byHotelId.and(bySupplierCode));
    // // return
    // //
    // hotelMappingRepository.findByHotelIdAndSupplierCode(hotelMapping.getHotelId(),
    // // "SAB") != null;
    // }

    private class HotelIdKey {

        private String hotelId;
        private String supplierCode;

        public HotelIdKey(String hotelId, String supplierCode) {
            this.hotelId = hotelId;
            this.supplierCode = supplierCode;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(hotelId, supplierCode);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HotelIdKey) {
                final HotelIdKey other = (HotelIdKey) obj;
                return Objects.equal(hotelId, other.hotelId) && Objects.equal(supplierCode, other.supplierCode);
            } else {
                return false;
            }
        }
    }

    private class SupplierHotelIdKey {

        private String supplierHotelId;
        private String supplierCode;

        public SupplierHotelIdKey(String supplierHotelId, String supplierCode) {
            this.supplierHotelId = supplierHotelId;
            this.supplierCode = supplierCode;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(supplierHotelId, supplierCode);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupplierHotelIdKey) {
                final SupplierHotelIdKey other = (SupplierHotelIdKey) obj;
                return Objects.equal(supplierHotelId, other.supplierHotelId)
                        && Objects.equal(supplierCode, other.supplierCode);
            } else {
                return false;
            }
        }
    }

}
