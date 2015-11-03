package com.cocha.hotels.destinationmapper.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cocha.hotels.destinationmapper.mapping.GeoMappingService;
import com.cocha.hotels.destinationmapper.repositories.content.HotelMappingContentRepository;
import com.cocha.hotels.destinationmapper.repositories.feeds.RegionCoordinatesRepository;
import com.cocha.hotels.destinationmapper.repositories.feeds.RegionRepository;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.geo.RegionCoordinates;
import com.cocha.hotels.model.content.geo.RegionType;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class CoordinateMapperProcessorImpl implements CoordinateMapperProcessor {

    private Logger logger = Logger.getLogger(CoordinateMapperProcessorImpl.class);

    @Value("${destination.mapper.poi.distance}")
    private Double poiDistance;

    @Autowired
    private RegionCoordinatesRepository regionCoordinatesRepository;

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private HotelMappingContentRepository hotelMappingContentRepository;

    @Autowired
    private GeoMappingService mappingService;

    public List<RegionHotelMapping> process(List<Hotel> hotels) {
        List<RegionHotelMapping> mapping = new ArrayList<RegionHotelMapping>();
        if (hotels != null & hotels.size() > 0) {
            // List<RegionCoordinates> neighborhoodAreas =
            // (List<RegionCoordinates>)
            // regionCoordinatesRepository.findByRegionType(RegionType.NEIGHBORHOOD);
            List<RegionCoordinates> cityAreas = (List<RegionCoordinates>) regionCoordinatesRepository
                    .findByRegionType(RegionType.CITY);
            for (Hotel hotel : hotels) {
                HotelMapping hotelMapping = hotelMappingContentRepository.findByhotelIdAndSupplierCode(hotel.getId(),
                        Hotel.BOOKING_SUPPLIER_CODE);

                String supplierHotelId = hotelMapping.getSupplierHotelId();
                logger.info("Started mapping regions-hotels. hotel id: " + hotel.getId());
                for (RegionCoordinates cityArea : cityAreas) {
                    if (mappingService.validatePointInArea(cityArea, hotel.getLatitude(), hotel.getLongitude())) {
                        // adding city
                        RegionHotelMapping regionHotelMapping = createRegionHotelMappingContent(supplierHotelId,
                                cityArea.getId(), hotel);
                        mapping.add(regionHotelMapping);

                        // adding parent city
                        Region cityRegion = regionRepository.findOne(cityArea.getId());
                        if (cityRegion != null) {
                            RegionHotelMapping parentRegionHotelMapping = createRegionHotelMappingContent(
                                    supplierHotelId, cityRegion.getIdParent(), hotel);
                            mapping.add(parentRegionHotelMapping);

                            // adding Point of Interest
                            List<Region> cityRegions = regionRepository.findByIdParent(cityRegion.getId());
                            for (Region point : cityRegions) {

                                if (point.getRegionType().equals(RegionType.POINT_OF_INTEREST)
                                        || point.getRegionType().equals(RegionType.POINT_OF_INTEREST_SHADOW)) {
                                    RegionCoordinates pointRegionCoordinates = regionCoordinatesRepository
                                            .findOne(point.getId());
                                    String[] pointCoordinate = pointRegionCoordinates.getCoordinates().split(";");
                                    if (mappingService.calculateDistance(Double.valueOf(pointCoordinate[0]),
                                            Double.valueOf(pointCoordinate[1]), hotel.getLatitude(),
                                            hotel.getLongitude()) > poiDistance) {
                                        RegionHotelMapping pointOfInterestHotelMapping = createRegionHotelMappingContent(
                                                supplierHotelId, point.getId(), hotel);
                                        mapping.add(pointOfInterestHotelMapping);
                                        logger.info("Mapping regions-hotels. hotel id: " + hotel.getId()
                                                + " was mapped succesfully into RegionCoordinate: POI " + point.getId());
                                    }
                                } else {
                                    if (point.getRegionType().equals(RegionType.NEIGHBORHOOD)) {
                                        RegionCoordinates neighborhoodArea = regionCoordinatesRepository.findOne(point
                                                .getId());
                                        if (mappingService.validatePointInArea(neighborhoodArea, hotel.getLatitude(),
                                                hotel.getLongitude())) {
                                            RegionHotelMapping neighborhoodHotelMapping = createRegionHotelMappingContent(
                                                    supplierHotelId, point.getId(), hotel);
                                            mapping.add(neighborhoodHotelMapping);
                                            logger.info("Mapping regions-hotels. hotel id: " + hotel.getId()
                                                    + " was mapped succesfully into RegionCoordinate: NEIGHBORHOOD "
                                                    + point.getId());
                                        }
                                    }
                                }
                            }

                        }
                        logger.info("Mapping regions-hotels. hotel id: " + hotel.getId()
                                + " was mapped succesfully into RegionCoordinate: CITY " + cityArea.getId());
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
