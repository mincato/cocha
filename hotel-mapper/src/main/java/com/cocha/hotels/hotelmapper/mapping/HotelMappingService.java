package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cocha.hotels.hotelmapper.algorithm.HotelMatch;
import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelMappingService {

    private static final Integer INIT_CONFIDENCE = 100;
    private static final Integer MINIMUM_CONFIDENCE = 40;
    private String eanCode = "EAN";
    private String bookingCode = "BKG";

    private HotelMatchingService matchingService;
    private CanonicalIdGenerator canonicalIdGenerator;

    public MappingResult map(List<Hotel> hotels) {
        // separo los hoteles de cada supplier
        Predicate<Hotel> byEANCode = (hotel) -> hotel.getSupplierCode().equals(eanCode);
        Predicate<Hotel> byBookingCode = (hotel) -> hotel.getSupplierCode().equals(bookingCode);
        Stream<Hotel> eanHotels = hotels.stream().filter(byEANCode);
        List<Hotel> bookingHotels = hotels.stream().filter(byBookingCode).collect(Collectors.toList());

        List<MappingEntry> mappingEntries = new ArrayList<MappingEntry>();

        eanHotels.forEach((hotel) -> {
            // inicializo el mapping para la referencia
                MappingEntry referenceEntry = newEntryFor(hotel);
                mappingEntries.add(referenceEntry);

                String canonicalId = referenceEntry.getCanonicalId();

                // mapeo el hotel contra los del otro supplier
                MultipleMatch matches = matchingService.match(hotel, bookingHotels);
                HotelMatch bestMatch = matches.findBestMatch();
                // si el mejor mapeo es al menos una sospecha, lo agrego
                if (bestMatch.getConfidence() >= MINIMUM_CONFIDENCE) {
                    MappingEntry mappingEntry = new HotelMappingEntry(canonicalId, bestMatch);
                    mappingEntries.add(mappingEntry);
                }
            });

        bookingHotels.forEach((hotel) -> {
            // verifico que no exista mapeo previo
                Optional<String> canonicalIdFound = findCanonicalId(hotel, mappingEntries);

                if (!canonicalIdFound.isPresent()) {
                    // inicializo el mapping para el hotel
                    MappingEntry newEntry = newEntryFor(hotel);
                    mappingEntries.add(newEntry);
                }
            });

        return new HotelMappingResult(mappingEntries);
    }

    private Optional<String> findCanonicalId(Hotel hotel, List<MappingEntry> mappingEntries) {
        Predicate<MappingEntry> bySupplierId = (entry) -> entry.getSupplierId().equals(hotel.getId());
        Predicate<MappingEntry> bySupplierCode = (entry) -> entry.getSupplierCode().equals(hotel.getSupplierCode());
        return mappingEntries.stream().filter(bySupplierId.and(bySupplierCode)).map(entry -> entry.getCanonicalId())
                .findFirst();
    }

    private MappingEntry newEntryFor(Hotel hotel) {
        String canonicalId = canonicalIdGenerator.newId(hotel);
        HotelMatch match = new HotelMatch(hotel, hotel, INIT_CONFIDENCE);
        MappingEntry mappingEntry = new HotelMappingEntry(canonicalId, match);
        return mappingEntry;
    }

    // private List<Hotel> toList(Stream<Hotel> bookingHotels) {
    // return bookingHotels.collect(Collectors.toList());
    // }

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
}
