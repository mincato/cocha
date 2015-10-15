package com.cocha.hotels.model.content.geo;

import java.util.HashMap;
import java.util.Map;

public enum RegionType {

	CITY("City"), 
	CONTINENT("Continent"), 
	COUNTRY("Country"), 
	MULTI_CITY("Multi-City (Vicinity)"), 
	MULTI_REGION("Multi-Region (within a country)"),
	NEIGHBORHOOD("Neighborhood"),
	POINT_OF_INTEREST("Point of Interest"),
	POINT_OF_INTEREST_SHADOW("Point of Interest Shadow"),
	PROVINCE("Province (State)");

	private String type;
	
	static final Map<String,RegionType> regionTypeMap =
	        new HashMap<String,RegionType>();
    
	static {
        for (RegionType r : RegionType.values())
        	regionTypeMap.put(r.type, r);
    }	
	
	private RegionType(String type) {
		this.type = type;
	}	

	public String getType() {
		return this.type;
	}	
	
	public static RegionType getValue(String type) {
        return regionTypeMap.get(type);
    }
}
