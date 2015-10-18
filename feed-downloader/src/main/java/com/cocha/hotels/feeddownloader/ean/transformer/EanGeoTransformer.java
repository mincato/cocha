package com.cocha.hotels.feeddownloader.ean.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoAirport;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoNeighborhood;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoParentRegion;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierRegionHotel;
import com.cocha.hotels.model.content.geo.Airport;
import com.cocha.hotels.model.content.geo.NeighborhoodArea;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.geo.RegionClass;
import com.cocha.hotels.model.content.geo.RegionType;
import com.cocha.hotels.model.content.geo.mapping.RegionHotelMapping;
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

    public List<NeighborhoodArea> toCanonicalNeighborhoodsArea(
            List<EanSupplierGeoNeighborhood> supplierNeighborhoodsArea) {
        List<NeighborhoodArea> neighborhoodsArea = null;

        if (supplierNeighborhoodsArea != null) {
            neighborhoodsArea = new ArrayList<NeighborhoodArea>();
            for (EanSupplierGeoNeighborhood supplierNeighborhood : supplierNeighborhoodsArea) {
                neighborhoodsArea.add(toCanonicalNeighborhoodArea(supplierNeighborhood));
            }
        }
        return neighborhoodsArea;
    }

    private NeighborhoodArea toCanonicalNeighborhoodArea(EanSupplierGeoNeighborhood supplierNeighborhoodArea) {
        NeighborhoodArea canonicalNeighborhoodArea = null;
        if (supplierNeighborhoodArea != null) {
            canonicalNeighborhoodArea = new NeighborhoodArea();
            canonicalNeighborhoodArea.setId(supplierNeighborhoodArea.getRegionID());
            canonicalNeighborhoodArea.setCoordinates(supplierNeighborhoodArea.getCoordinates());
        }
        return canonicalNeighborhoodArea;
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
    
    public List<RegionHotelMapping> toCanonicalRegionHotelMappings(List<EanSupplierRegionHotel> supplierRegionHotelMappings) {
        List<RegionHotelMapping> regionHotelMappings = null;

        if (supplierRegionHotelMappings != null) {
            regionHotelMappings = new ArrayList<RegionHotelMapping>();
            for (EanSupplierRegionHotel supplierRegionHotelMapping : supplierRegionHotelMappings) {
                regionHotelMappings.add(toCanonicalRegionHotelMapping(supplierRegionHotelMapping));
            }
        }
        return regionHotelMappings;
    }

    private RegionHotelMapping toCanonicalRegionHotelMapping(EanSupplierRegionHotel supplierRegionHotelMapping) {
    	RegionHotelMapping canonicalRegionHotelMapping = null;
        if (supplierRegionHotelMapping != null) {
        	canonicalRegionHotelMapping = new RegionHotelMapping();
        	canonicalRegionHotelMapping.setIdRegion(supplierRegionHotelMapping.getRegionID());
        	canonicalRegionHotelMapping.setIdHotel(supplierRegionHotelMapping.getHotelID());
        	canonicalRegionHotelMapping.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        }
        return canonicalRegionHotelMapping;
    }
}
