package com.cocha.hotels.feeddownloader.ean.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoAirport;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoCity;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoNeighborhood;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoPOI;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoParentRegion;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierRegionHotel;
import com.cocha.hotels.model.content.geo.Airport;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.geo.RegionClass;
import com.cocha.hotels.model.content.geo.RegionCoordinates;
import com.cocha.hotels.model.content.geo.RegionHotel;
import com.cocha.hotels.model.content.geo.RegionType;
import com.cocha.hotels.model.content.hotel.Hotel;

@Component
public class EanGeoTransformer {

    public List<Region> toCanonicalRegions(List<EanSupplierGeoParentRegion> supplierRegions) {
        List<Region> regions = null;

        if (supplierRegions != null) {
            regions = new ArrayList<Region>();
            for (EanSupplierGeoParentRegion supplierRegion : supplierRegions) {
                regions.add(toCanonicalRegion(supplierRegion));
            }
        }
        return regions;
    }

    private Region toCanonicalRegion(EanSupplierGeoParentRegion supplierRegion) {
        Region canonicalRegion = null;
        if (supplierRegion != null) {
            canonicalRegion = new Region();
            canonicalRegion.setId(supplierRegion.getRegionId());
            canonicalRegion.setRegionType(RegionType.getValue(supplierRegion.getRegionType()));
            canonicalRegion.setSubClass(RegionClass.getValue(supplierRegion.getSubClass()));
            canonicalRegion.setIdParent(supplierRegion.getParentRegionID());
            canonicalRegion.setRegionName(supplierRegion.getRegionName());
            canonicalRegion.setRegionNameLong(supplierRegion.getRegionNameLong());
        }
        return canonicalRegion;
    }

    public List<RegionCoordinates> toCanonicalNeighborhoodsArea(
            List<EanSupplierGeoNeighborhood> supplierNeighborhoodsArea) {
        List<RegionCoordinates> neighborhoodsArea = null;

        if (supplierNeighborhoodsArea != null) {
            neighborhoodsArea = new ArrayList<RegionCoordinates>();
            for (EanSupplierGeoNeighborhood supplierNeighborhood : supplierNeighborhoodsArea) {
                neighborhoodsArea.add(toCanonicalNeighborhoodArea(supplierNeighborhood));
            }
        }
        return neighborhoodsArea;
    }

    private RegionCoordinates toCanonicalNeighborhoodArea(EanSupplierGeoNeighborhood supplierNeighborhoodArea) {
    	RegionCoordinates canonicalNeighborhoodArea = null;
        if (supplierNeighborhoodArea != null) {
            canonicalNeighborhoodArea = new RegionCoordinates();
            canonicalNeighborhoodArea.setId(supplierNeighborhoodArea.getRegionID());
            canonicalNeighborhoodArea.setRegionType(RegionType.NEIGHBORHOOD);
            canonicalNeighborhoodArea.setCoordinates(supplierNeighborhoodArea.getCoordinates());
        }
        return canonicalNeighborhoodArea;
    }
    
    public List<RegionCoordinates> toCanonicalCitiesArea(
            List<EanSupplierGeoCity> supplierCityArea) {
        List<RegionCoordinates> citiesArea = null;

        if (supplierCityArea != null) {
            citiesArea = new ArrayList<RegionCoordinates>();
            for (EanSupplierGeoCity supplierNeighborhood : supplierCityArea) {
                citiesArea.add(toCanonicalCityArea(supplierNeighborhood));
            }
        }
        return citiesArea;
    }

    private RegionCoordinates toCanonicalCityArea(EanSupplierGeoCity supplierCityArea) {
    	RegionCoordinates canonicalCityArea = null;
        if (supplierCityArea != null) {
            canonicalCityArea = new RegionCoordinates();
            canonicalCityArea.setId(supplierCityArea.getRegionID());
            canonicalCityArea.setRegionType(RegionType.CITY);
            canonicalCityArea.setCoordinates(supplierCityArea.getCoordinates());
        }
        return canonicalCityArea;
    }    
    
    public List<RegionCoordinates> toCanonicalPointsOfInterest(
            List<EanSupplierGeoPOI> supplierPOIs) {
        List<RegionCoordinates> pois = null;

        if (supplierPOIs != null) {
            pois = new ArrayList<RegionCoordinates>();
            for (EanSupplierGeoPOI supplierPOI : supplierPOIs) {
                pois.add(toCanonicalPointOfInterest(supplierPOI));
            }
        }
        return pois;
    }

    private RegionCoordinates toCanonicalPointOfInterest(EanSupplierGeoPOI supplierPOI) {
    	RegionCoordinates canonicalPOI = null;
        if (supplierPOI != null) {
            canonicalPOI = new RegionCoordinates();
            canonicalPOI.setId(supplierPOI.getRegionID());
            canonicalPOI.setRegionType(RegionType.POINT_OF_INTEREST);
            StringBuffer coordinateBuffer = new StringBuffer();
            coordinateBuffer.append(supplierPOI.getLatitude());
            coordinateBuffer.append(";");
            coordinateBuffer.append(supplierPOI.getLongitude());            
            canonicalPOI.setCoordinates(coordinateBuffer.toString());
        }
        return canonicalPOI;
    }
        
    
    
    public List<Airport> toCanonicalAirports(List<EanSupplierGeoAirport> supplierAirports) {
        List<Airport> airports = null;

        if (supplierAirports != null) {
            airports = new ArrayList<Airport>();
            for (EanSupplierGeoAirport supplierAirport : supplierAirports) {
                airports.add(toCanonicalAirport(supplierAirport));
            }
        }
        return airports;
    }

    private Airport toCanonicalAirport(EanSupplierGeoAirport supplierAirport) {
        Airport canonicalAirport = null;
        if (supplierAirport != null) {
            canonicalAirport = new Airport();
            canonicalAirport.setId(supplierAirport.getAirportID());
            canonicalAirport.setCode(supplierAirport.getAirportCode());
            canonicalAirport.setName(supplierAirport.getAirportName());
            canonicalAirport.setCountryCode(supplierAirport.getCountryCode());
            canonicalAirport.setIdParentCity(supplierAirport.getMainCityID());
            canonicalAirport.setLatitude(supplierAirport.getLatitude());
            canonicalAirport.setLongitude(supplierAirport.getLongitude());
        }
        return canonicalAirport;
    }

    public List<RegionHotel> toCanonicalRegionHotelMappings(List<EanSupplierRegionHotel> supplierRegionHotelMappings) {
        List<RegionHotel> regionHotelMappings = null;

        if (supplierRegionHotelMappings != null) {
            regionHotelMappings = new ArrayList<RegionHotel>();
            for (EanSupplierRegionHotel supplierRegionHotelMapping : supplierRegionHotelMappings) {
                regionHotelMappings.add(toCanonicalRegionHotelMapping(supplierRegionHotelMapping));
            }
        }
        return regionHotelMappings;
    }

    private RegionHotel toCanonicalRegionHotelMapping(EanSupplierRegionHotel supplierRegionHotelMapping) {
        RegionHotel canonicalRegionHotelMapping = null;
        if (supplierRegionHotelMapping != null) {
            canonicalRegionHotelMapping = new RegionHotel();
            canonicalRegionHotelMapping.setIdRegion(supplierRegionHotelMapping.getRegionID());
            canonicalRegionHotelMapping.setIdHotel(supplierRegionHotelMapping.getHotelID());
            canonicalRegionHotelMapping.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        }
        return canonicalRegionHotelMapping;
    }
}
