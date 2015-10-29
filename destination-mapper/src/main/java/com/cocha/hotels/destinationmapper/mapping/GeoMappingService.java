package com.cocha.hotels.destinationmapper.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.destinationmapper.managers.RegionHotelMappingManager;
import com.cocha.hotels.model.content.geo.RegionHotel;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.HotelMatch;
import com.cocha.hotels.model.content.mapping.MultipleMatch;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Service
public class GeoMappingService {

    @Autowired
    private RegionHotelMappingManager regionHotelMappingManager;

    
	public List<RegionHotelMapping> map(List<RegionHotel> regionHotels) {        
        
        List<RegionHotelMapping> mappingEntries = new ArrayList<RegionHotelMapping>();      
        regionHotels.forEach((regionHotel) -> {

            HotelMapping referenceEntry = regionHotelMappingManager.findHotelMapping(regionHotel.getIdHotel(),regionHotel.getSupplierCode());           
                
                if (referenceEntry != null && referenceEntry.isActive()){
                	RegionHotelMapping regionHotelMapping = regionHotelMappingManager.find(referenceEntry.getHotelId(),regionHotel.getIdRegion());
                	if(regionHotelMapping == null){
                		regionHotelMapping = new RegionHotelMapping();
                		
                		

                		mappingEntries.add(regionHotelMapping);
                	}                    	
                                      
                }                
                
                

        });
        return mappingEntries;
    }
}
