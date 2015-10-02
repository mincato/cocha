package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.HotelMatch;
import com.cocha.hotels.model.content.mapping.MultipleMatch;

@Service
public class HotelMappingService {

	private static final Integer INIT_CONFIDENCE = 100;
	private static final Integer MINIMUM_CONFIDENCE = 1;
	private String eanCode = "EAN";
	private String bookingCode = "BKG";

	@Autowired
	private HotelMatchingService matchingService;

	@Autowired
	private ProximityFilterService proximityFilterService;

	@Autowired
	private CanonicalIdGenerator canonicalIdGenerator;

	public List<HotelMapping> map(List<Hotel> hotels) {
		// separo los hoteles de cada supplier
		Predicate<Hotel> byEANCode = (hotel) -> hotel.getSupplierCode().equals(
				eanCode);
		Predicate<Hotel> byBookingCode = (hotel) -> hotel.getSupplierCode()
				.equals(bookingCode);
		Stream<Hotel> eanHotels = hotels.stream().filter(byEANCode);
		List<Hotel> bookingHotels = hotels.stream().filter(byBookingCode)
				.collect(Collectors.toList());

		List<HotelMapping> mappingEntries = new ArrayList<HotelMapping>();

		eanHotels.forEach((hotel) -> {
			// inicializo el mapping para la referencia
				HotelMapping referenceEntry = newEntryFor(hotel);
				mappingEntries.add(referenceEntry);

				String canonicalId = referenceEntry.getHotelId();

				List<Hotel> hotelsToProcess = proximityFilterService.filter(
						hotel, bookingHotels);

				// mapeo el hotel contra los del otro supplier
				MultipleMatch matches = matchingService.match(hotel,
						hotelsToProcess);
				HotelMatch bestMatch = matches.findBestMatch();
				if (bestMatch.getConfidence() > 99) {
					bestMatch.setConfidence(99);
				}
				// si el mejor mapeo es al menos una sospecha, lo agrego
				if (bestMatch.getConfidence() >= MINIMUM_CONFIDENCE) {
					HotelMapping mappingEntry = new HotelMapping(canonicalId,
							bestMatch);
					Optional<HotelMapping> oldMappingEntry = findCanonicalId(
							mappingEntry.getSupplierHotelId(),
							mappingEntry.getSupplierCode(), mappingEntries);
					
					if (oldMappingEntry.isPresent()) {
						HotelMapping hotelMapping = oldMappingEntry.get();
						if (hotelMapping.getConfidence().compareTo(mappingEntry.getConfidence()) < 0) {
							hotelMapping.setConfidence(mappingEntry.getConfidence());
							hotelMapping.setHotelId(canonicalId);
						}
					} else {
						mappingEntries.add(mappingEntry);
					}
				}
			});

		bookingHotels.forEach((hotel) -> {
			// verifico que no exista mapeo previo
				Optional<HotelMapping> canonicalIdFound = findCanonicalId(
						hotel.getId(), hotel.getSupplierCode(), mappingEntries);

				if (!canonicalIdFound.isPresent()) {
					// inicializo el mapping para el hotel
				HotelMapping newEntry = newEntryFor(hotel);
				mappingEntries.add(newEntry);
			}
		});

		return mappingEntries;
	}

	private Optional<HotelMapping> findCanonicalId(String supplierHotelId,
			String supplierCode, List<HotelMapping> mappingEntries) {
		Predicate<HotelMapping> bySupplierId = (entry) -> entry
				.getSupplierHotelId().equals(supplierHotelId);
		Predicate<HotelMapping> bySupplierCode = (entry) -> entry
				.getSupplierCode().equals(supplierCode);
		return mappingEntries.stream().filter(bySupplierId.and(bySupplierCode))
				.findFirst();
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

	public void setCanonicalIdGenerator(
			CanonicalIdGenerator canonicalIdGenerator) {
		this.canonicalIdGenerator = canonicalIdGenerator;
	}

	public ProximityFilterService getProximityFilterService() {
		return proximityFilterService;
	}

	public void setProximityFilterService(
			ProximityFilterService proximityFilterService) {
		this.proximityFilterService = proximityFilterService;
	}
}
