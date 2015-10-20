package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.hotelmapper.managers.HotelMappingManager;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.HotelMatch;
import com.cocha.hotels.model.content.mapping.MultipleMatch;

@Service
public class HotelMappingService {

    private static final Integer INIT_CONFIDENCE = 100;
    private static final Integer MINIMUM_CONFIDENCE = 1;
    private static final Integer BEST_CONFIDENCE = 99;
    private String eanCode = "EAN";
    private String bookingCode = "BKG";

    @Autowired
    private HotelMatchingService matchingService;

    @Autowired
    private ProximityFilterService proximityFilterService;

    @Autowired
    private CanonicalIdGenerator canonicalIdGenerator;

    @Autowired
    private HotelMappingManager hotelMappingManager;

    public List<HotelMapping> map(List<Hotel> hotels) {
        // separo los hoteles de cada supplier
        Predicate<Hotel> byEANCode = (hotel) -> hotel.getSupplierCode().equals(eanCode);
        Predicate<Hotel> byBookingCode = (hotel) -> hotel.getSupplierCode().equals(bookingCode);
        Stream<Hotel> eanHotels = hotels.stream().filter(byEANCode);
        List<Hotel> bookingHotels = hotels.stream().filter(byBookingCode).collect(Collectors.toList());

        List<HotelMapping> mappingEntries = new ArrayList<HotelMapping>();

        eanHotels.forEach((hotel) -> {

            HotelMapping referenceEntry = hotelMappingManager.find(hotel.getId(), hotel.getSupplierCode(),
                    INIT_CONFIDENCE);
            // List<HotelMapping> oldMappingsForReference = new
            // ArrayList<HotelMapping>();
                HotelMapping oldMappingForReference = null;
                if (referenceEntry != null) {
                    // oldMappingsForReference =
                    // hotelMappingManager.findMatches(referenceEntry.getHotelId(),
                    // BEST_CONFIDENCE);
                    oldMappingForReference = hotelMappingManager.find(referenceEntry.getHotelId(), bookingCode);
                    // unMapAllHotelMappings(oldMappingsForReference);
                    referenceEntry.setActive(hotel.isActive());
                } else {
                    // inicializo el mapping para el hotel
                    referenceEntry = newEntryFor(hotel);
                }
                mappingEntries.add(referenceEntry);

                List<Hotel> hotelsToProcess = proximityFilterService.filter(hotel, bookingHotels);
                // HotelMapping oldMappingForReference =
                // findOldMappingForReference(oldMappingsForReference,
                // bookingCode);

                if (verifyAndUpdateMappedByUser(oldMappingForReference, hotelsToProcess)) {
                    mappingEntries.add(oldMappingForReference);
                } else {
                    String canonicalId = referenceEntry.getHotelId();

                    // mapeo el hotel contra los del otro supplier
                    MultipleMatch matches = matchingService.match(hotel, hotelsToProcess);
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
                                    mappingEntry.getSupplierHotelId(), mappingEntry.getSupplierCode(), mappingEntries);
                            if (mappingEntryForAnotherHotel.isPresent()) {
                                HotelMapping hotelMapping = mappingEntryForAnotherHotel.get();
                                if (hotelMapping.getConfidence().compareTo(mappingEntry.getConfidence()) < 0
                                        && !hotelMapping.isMappedByUser()) {
                                    mappingEntries.remove(hotelMapping);
                                } else {
                                    mappingEntry.unMap();
                                }
                            }
                            mappingEntries.add(mappingEntry);
                        } else {
                            Optional<HotelMapping> mappingEntryForAnotherHotel = findHotelMapping(
                                    mappingEntry.getSupplierHotelId(), mappingEntry.getSupplierCode(), mappingEntries);

                            if (mappingEntryForAnotherHotel.isPresent()) {
                                HotelMapping hotelMapping = mappingEntryForAnotherHotel.get();
                                if (hotelMapping.getConfidence().compareTo(mappingEntry.getConfidence()) < 0
                                        && !hotelMapping.isMappedByUser()) {
                                    hotelMapping.setConfidence(mappingEntry.getConfidence());
                                    hotelMapping.setHotelId(canonicalId);
                                    if (oldMappingForReference != null) {
                                        oldMappingForReference.unMap();
                                        mappingEntries.add(oldMappingForReference);
                                    }
                                }
                            } else {
                                mappingEntries.add(mappingEntry);
                                if (oldMappingForReference != null) {
                                    oldMappingForReference.unMap();
                                    mappingEntries.add(oldMappingForReference);
                                }
                            }
                        }

                    } else {
                        if (oldMappingForReference != null) {
                            oldMappingForReference.unMap();
                            mappingEntries.add(oldMappingForReference);
                        }
                    }

                }
            });

        bookingHotels.forEach((hotel) -> {

            HotelMapping referenceEntry = hotelMappingManager.find(hotel.getId(), hotel.getSupplierCode(),
                    INIT_CONFIDENCE);

            // verifico que no exista mapeo previo
                Optional<HotelMapping> canonicalIdFound = findHotelMapping(hotel.getId(), hotel.getSupplierCode(),
                        mappingEntries);

                if (!canonicalIdFound.isPresent()) {
                    if (referenceEntry != null) {
                        referenceEntry.setActive(hotel.isActive());
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

    private Optional<HotelMapping> findHotelMapping(String supplierHotelId, String supplierCode,
            List<HotelMapping> mappingEntries) {
        Optional<HotelMapping> hotelMapping;
        Predicate<HotelMapping> bySupplierId = (entry) -> entry.getSupplierHotelId().equals(supplierHotelId);
        Predicate<HotelMapping> bySupplierCode = (entry) -> entry.getSupplierCode().equals(supplierCode);
        Predicate<HotelMapping> byMap = (entry) -> !entry.isUnmapped();
        hotelMapping = mappingEntries.stream().filter(bySupplierId.and(bySupplierCode).and(byMap)).findFirst();
        return hotelMapping;
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
}
