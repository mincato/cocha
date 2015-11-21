package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.hotelmapper.managers.HotelMappingManager;
import com.cocha.hotels.hotelmapper.repositories.content.ReplacementRuleRepository;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.HotelMatch;
import com.cocha.hotels.model.content.mapping.MultipleMatch;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;
import com.google.common.base.Objects;

@Service
public class HotelMappingService {

    private static final Integer INIT_CONFIDENCE = 100;
    private static final Integer MINIMUM_CONFIDENCE = 40;
    private static final Integer BEST_CONFIDENCE = 99;

    @Autowired
    private HotelMatchingService matchingService;

    @Autowired
    private ProximityFilterService proximityFilterService;

    @Autowired
    private CanonicalIdGenerator canonicalIdGenerator;

    @Autowired
    private HotelMappingManager hotelMappingManager;

    @Autowired
    private ReplacementRuleRepository replacementRuleRepository;

    public List<HotelMapping> map(List<Hotel> hotels) {
        // separo los hoteles de cada supplier
        Predicate<Hotel> byEANCode = (hotel) -> hotel.getSupplierCode().equals(Hotel.EAN_SUPPLIER_CODE);
        Predicate<Hotel> byBookingCode = (hotel) -> hotel.getSupplierCode().equals(Hotel.BOOKING_SUPPLIER_CODE);
        Stream<Hotel> eanHotels = hotels.stream().filter(byEANCode);
        List<Hotel> bookingHotels = hotels.stream().filter(byBookingCode).collect(Collectors.toList());

        String countryCode = hotels.get(0).getCountryCode();

        List<ReplacementRule> replacementRules = replacementRuleRepository
                .findByCountryCodeOrCountryCodeIsNull(countryCode);
        Map<HotelAttribute, List<ReplacementRule>> replacementRulesMap = replacementRules.stream().collect(
                Collectors.groupingBy(ReplacementRule::getHotelAttribute));

        hotelMappingManager.init(countryCode);

        List<HotelMapping> mappingEntries = new ArrayList<HotelMapping>();
        Map<MappingEntryKey, List<HotelMapping>> alreadyMappedHotelsMap = new HashMap<MappingEntryKey, List<HotelMapping>>();

        eanHotels
                .forEach((hotel) -> {

                    HotelMapping referenceEntry = hotelMappingManager.findOwnerReference(hotel.getId(),
                            hotel.getSupplierCode());
                    HotelMapping oldMappingForReference = null;
                    if (referenceEntry != null) {
                        oldMappingForReference = hotelMappingManager.findMappedReference(referenceEntry.getHotelId(),
                                Hotel.BOOKING_SUPPLIER_CODE);
                        referenceEntry.setActive(hotel.isActive());
                    } else {
                        // inicializo el mapping para el hotel
                referenceEntry = newEntryFor(hotel);
            }
            addEntry(referenceEntry, alreadyMappedHotelsMap);
            mappingEntries.add(referenceEntry);

            List<Hotel> hotelsToProcess = proximityFilterService.filter(hotel, bookingHotels);

            if (verifyAndUpdateMappedByUser(oldMappingForReference, hotelsToProcess)) {
                mappingEntries.add(oldMappingForReference);
                addEntry(oldMappingForReference, alreadyMappedHotelsMap);
            } else {
                String canonicalId = referenceEntry.getHotelId();

                // mapeo el hotel contra los del otro supplier
                MultipleMatch matches = matchingService.match(hotel, hotelsToProcess, replacementRulesMap);
                HotelMatch bestMatch = matches.findBestMatch();
                if (bestMatch.getConfidence() > BEST_CONFIDENCE) {
                    bestMatch.setConfidence(BEST_CONFIDENCE);
                }
                // si el mejor mapeo es al menos una sospecha, lo agrego
                if (bestMatch.getConfidence() >= MINIMUM_CONFIDENCE) {

                    HotelMapping mappingEntry = new HotelMapping(canonicalId, bestMatch);

                    if (isSameMapping(mappingEntry, oldMappingForReference)) {
                        oldMappingForReference.setConfidence(mappingEntry.getConfidence());
                        oldMappingForReference.map();
                        oldMappingForReference.setActive(bestMatch.getHotelToCompare().isActive());
                        mappingEntry = oldMappingForReference;
                        Optional<HotelMapping> mappingEntryForAnotherHotel = findHotelMapping(
                                mappingEntry.getSupplierHotelId(), mappingEntry.getSupplierCode(),
                                alreadyMappedHotelsMap);
                        if (mappingEntryForAnotherHotel.isPresent()) {
                            HotelMapping hotelMapping = mappingEntryForAnotherHotel.get();
                            if (hotelMapping.getConfidence().compareTo(mappingEntry.getConfidence()) < 0
                                    && !hotelMapping.isMappedByUser()) {
                                mappingEntries.remove(hotelMapping);
                                removeEntry(hotelMapping, alreadyMappedHotelsMap);
                            } else {
                                mappingEntry.unMap();
                            }
                        }
                        mappingEntries.add(mappingEntry);
                        addEntry(mappingEntry, alreadyMappedHotelsMap);
                    } else {
                        Optional<HotelMapping> mappingEntryForAnotherHotel = findHotelMapping(
                                mappingEntry.getSupplierHotelId(), mappingEntry.getSupplierCode(),
                                alreadyMappedHotelsMap);

                        if (mappingEntryForAnotherHotel.isPresent()) {
                            HotelMapping hotelMapping = mappingEntryForAnotherHotel.get();
                            if (hotelMapping.getConfidence().compareTo(mappingEntry.getConfidence()) < 0
                                    && !hotelMapping.isMappedByUser()) {
                                hotelMapping.setConfidence(mappingEntry.getConfidence());
                                hotelMapping.setHotelId(canonicalId);
                                if (oldMappingForReference != null) {
                                    oldMappingForReference.unMap();
                                    mappingEntries.add(oldMappingForReference);
                                    addEntry(oldMappingForReference, alreadyMappedHotelsMap);
                                }
                            }
                        } else {
                            mappingEntries.add(mappingEntry);
                            addEntry(mappingEntry, alreadyMappedHotelsMap);
                            if (oldMappingForReference != null) {
                                oldMappingForReference.unMap();
                                mappingEntries.add(oldMappingForReference);
                                addEntry(oldMappingForReference, alreadyMappedHotelsMap);
                            }
                        }
                    }

                } else {
                    if (oldMappingForReference != null) {
                        oldMappingForReference.unMap();
                        mappingEntries.add(oldMappingForReference);
                        addEntry(oldMappingForReference, alreadyMappedHotelsMap);
                    }
                }

            }
        });

        bookingHotels
                .forEach((hotel) -> {

                    HotelMapping referenceEntry = hotelMappingManager.findOwnerReference(hotel.getId(),
                            hotel.getSupplierCode());

                    // verifico que no exista mapeo previo
                    Optional<HotelMapping> canonicalIdFound = findHotelMapping(hotel.getId(), hotel.getSupplierCode(),
                            alreadyMappedHotelsMap);

                    if (!canonicalIdFound.isPresent()) {
                        if (referenceEntry != null) {
                            referenceEntry.setActive(hotel.isActive());
                            mappingEntries.add(referenceEntry);
                        } else {
                            HotelMapping newEntry = newEntryFor(hotel);
                            mappingEntries.add(newEntry);
                        }
                    } else {
                        if (referenceEntry != null) {
                            referenceEntry.unMap();
                            mappingEntries.add(referenceEntry);
                        }
                    }
                });

        return mappingEntries;
    }

    private void removeEntry(HotelMapping hotelMapping, Map<MappingEntryKey, List<HotelMapping>> map) {
        MappingEntryKey mappingEntryKey = new MappingEntryKey(hotelMapping.getSupplierHotelId(),
                hotelMapping.getSupplierCode());
        List<HotelMapping> list = map.get(mappingEntryKey);
        if (list != null) {
            list.remove(hotelMapping);
        }
    }

    private Optional<HotelMapping> findHotelMapping(String supplierHotelId, String supplierCode,
            Map<MappingEntryKey, List<HotelMapping>> map) {
        Optional<HotelMapping> hotelMapping;
        List<HotelMapping> mappingEntries = new ArrayList<HotelMapping>();
        List<HotelMapping> list = map.get(new MappingEntryKey(supplierHotelId, supplierCode));
        if (list != null) {
            mappingEntries = list;
        }
        Predicate<HotelMapping> byMap = (entry) -> !entry.isUnmapped();
        hotelMapping = mappingEntries.stream().filter(byMap).findFirst();
        return hotelMapping;
    }

    private void addEntry(HotelMapping hotelMapping, Map<MappingEntryKey, List<HotelMapping>> map) {
        MappingEntryKey mappingEntryKey = new MappingEntryKey(hotelMapping.getSupplierHotelId(),
                hotelMapping.getSupplierCode());
        List<HotelMapping> list = map.get(mappingEntryKey);
        if (list == null) {
            list = new ArrayList<HotelMapping>();
            map.put(mappingEntryKey, list);
        }
        list.add(hotelMapping);
    }

    private boolean isSameMapping(HotelMapping newMapping, HotelMapping oldMapping) {
        boolean same = false;
        if (oldMapping != null) {
            same = newMapping.getSupplierHotelId().equals(oldMapping.getSupplierHotelId());
        }
        return same;
    }

    private boolean verifyAndUpdateMappedByUser(HotelMapping oldMappingForReference, List<Hotel> hotelsToProcess) {
        boolean exist = false;
        if (oldMappingForReference != null && oldMappingForReference.isMappedByUser()) {
            exist = true;
            Hotel supplierHotel = findHotel(oldMappingForReference.getSupplierHotelId(), hotelsToProcess);
            oldMappingForReference.setActive(supplierHotel.isActive());
        }
        return exist;
    }

    private Hotel findHotel(String supplierHotelId, List<Hotel> hotelsToProcess) {
        Predicate<Hotel> byHotelId = hotel -> hotel.getId().equals(supplierHotelId);
        return hotelsToProcess.stream().filter(byHotelId).findFirst().get();
    }

    private HotelMapping newEntryFor(Hotel hotel) {
        String canonicalId = canonicalIdGenerator.newId(hotel);
        HotelMatch match = new HotelMatch(hotel, hotel, INIT_CONFIDENCE);
        HotelMapping mappingEntry = new HotelMapping(canonicalId, match);
        return mappingEntry;
    }

    public HotelMatchingService getMatchingService() {
        return matchingService;
    }

    public void setMatchingService(HotelMatchingService matchingService) {
        this.matchingService = matchingService;
    }

    public CanonicalIdGenerator getCanonicalIdGenerator() {
        return canonicalIdGenerator;
    }

    public void setCanonicalIdGenerator(CanonicalIdGenerator canonicalIdGenerator) {
        this.canonicalIdGenerator = canonicalIdGenerator;
    }

    public ProximityFilterService getProximityFilterService() {
        return proximityFilterService;
    }

    public void setProximityFilterService(ProximityFilterService proximityFilterService) {
        this.proximityFilterService = proximityFilterService;
    }

    private class MappingEntryKey {

        private String supplierHotelId;
        private String supplierCode;

        public MappingEntryKey(String supplierHotelId, String supplierCode) {
            this.supplierHotelId = supplierHotelId;
            this.supplierCode = supplierCode;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(supplierHotelId, supplierCode);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MappingEntryKey) {
                final MappingEntryKey other = (MappingEntryKey) obj;
                return Objects.equal(supplierHotelId, other.supplierHotelId)
                        && Objects.equal(supplierCode, other.supplierCode);
            } else {
                return false;
            }
        }
    }
}
