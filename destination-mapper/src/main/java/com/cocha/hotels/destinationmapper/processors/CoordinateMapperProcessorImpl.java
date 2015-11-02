package com.cocha.hotels.destinationmapper.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.destinationmapper.mapping.GeoMappingService;
import com.cocha.hotels.destinationmapper.repositories.content.HotelMappingContentRepository;
import com.cocha.hotels.destinationmapper.repositories.feeds.NeighborhoodCoordinatesRepository;
import com.cocha.hotels.model.content.geo.NeighborhoodArea;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class CoordinateMapperProcessorImpl implements CoordinateMapperProcessor {

    private Logger logger = Logger.getLogger(CoordinateMapperProcessorImpl.class);

    @Autowired
    private NeighborhoodCoordinatesRepository neighborhoodCoordinatesRepository;

    @Autowired
    private HotelMappingContentRepository hotelMappingContentRepository;

    @Autowired
    private GeoMappingService mappingService;

    public List<RegionHotelMapping> process(List<Hotel> hotels) {
        List<RegionHotelMapping> mapping = new ArrayList<RegionHotelMapping>();
        if (hotels != null & hotels.size() > 0) {
            List<NeighborhoodArea> neighborhoodAreas = (List<NeighborhoodArea>) neighborhoodCoordinatesRepository
                    .findAll();
            for (Hotel hotel : hotels) {
                HotelMapping hotelMapping = hotelMappingContentRepository.findByhotelIdAndSupplierCode(hotel.getId(),
                        Hotel.BOOKING_SUPPLIER_CODE);
                String supplierHotelId = hotelMapping.getSupplierHotelId();
                logger.info("Started mapping regions-hotels. hotel id: " + hotel.getId());
                for (NeighborhoodArea neighborhoodArea : neighborhoodAreas) {
                    if (mappingService.validatePointInArea(neighborhoodArea, hotel.getLatitude(), hotel.getLongitude())) {
                        RegionHotelMapping regionHotelMapping = createRegionHotelMappingContent(supplierHotelId,
                                neighborhoodArea.getId(), hotel);
                        mapping.add(regionHotelMapping);
                        logger.info("Mapping regions-hotels. hotel id: " + hotel.getId()
                                + " was mapped succesfully into NeighborhoodArea:" + neighborhoodArea.getId());
                        break;
                    }
                }

            }
        }
        return mapping;
    }

    private RegionHotelMapping createRegionHotelMappingContent(String supplierHotelId, String idRegion, Hotel hotel) {
        RegionHotelMapping contentRegionHotel = null;
        contentRegionHotel = new RegionHotelMapping();
        contentRegionHotel.setActive(true);
        contentRegionHotel.setHotelId(hotel.getId());
        contentRegionHotel.setRegionId(idRegion);
        contentRegionHotel.setSupplierCode(Hotel.BOOKING_SUPPLIER_CODE);
        contentRegionHotel.setSupplierHotelId(supplierHotelId);
        return contentRegionHotel;
    }

}
