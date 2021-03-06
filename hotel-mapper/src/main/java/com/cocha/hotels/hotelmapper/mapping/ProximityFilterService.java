package com.cocha.hotels.hotelmapper.mapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cocha.hotels.model.content.hotel.Hotel;

@Service
public class ProximityFilterService {

    private Logger logger = Logger.getLogger(ProximityFilterService.class);

    private static final Double EARTH_RADIUS = 6371000d; // meters

    // TODO: parametrizar. Distancia en metros
    private Float maxProximity = 1500f;

    public List<Hotel> filter(Hotel hotel, List<Hotel> hotelsToFilter) {
        Stream<Hotel> filtered = hotelsToFilter.stream().filter(
                (hotelToCompare) -> {
                    if (hotel.getLatitude() != null && hotel.getLongitude() != null
                            && hotelToCompare.getLatitude() != null && hotelToCompare.getLongitude() != null) {
                        return maxProximity >= distBetween(hotel, hotelToCompare);
                    } else {
                        return false;
                    }
                });

        return filtered.collect(Collectors.toList());
    }

    public Float distBetween(final Hotel hotel, final Hotel hotelToCompare) {
        final Float latReference = hotel.getLatitude().floatValue();
        final Float lngReference = hotel.getLongitude().floatValue();
        final Float latDestination = hotelToCompare.getLatitude().floatValue();
        final Float lngDestination = hotelToCompare.getLongitude().floatValue();
        return distFrom(latReference, lngReference, latDestination, lngDestination);
    }

    private Float distFrom(final Float latReference, final Float lngReference, final Float latDestination,
            final Float lngDestination) {
        Double dLat = Math.toRadians(latDestination - latReference);
        Double dLng = Math.toRadians(lngDestination - lngReference);
        Double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(latReference))
                * Math.cos(Math.toRadians(latDestination)) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        Float dist = (float) (EARTH_RADIUS * c);

        logger.debug(String.format("[%f %f] [%f %f] -> %f", latReference, lngReference, latDestination, lngDestination,
                dist));
        return dist;
    }

}
