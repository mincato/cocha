package com.cocha.hotels.model.content.geo;

import java.util.HashMap;
import java.util.Map;

public enum RegionClass {
	AIRPORT("airport"),
	ANCHOR("anchor"),
	BUSINESS("business"),	
	CASINO("casino"),
	CITY("city"),	
	CIVIC("civic"),
	COMBO("combo"),
	DOWNTOWN("downtown"),
	GOLF("golf"),
	HISTORIC("historic"),
	ICECREAM("icecream"),
	MEDICAL("medical"),
	MONUMENT("monument"),
	MUSEUMS("museums"),
	NEIGHBOR("neighbor"),
	REGIONAL("regional"),
	SCHOOL("school"),
	SHOPPING("shopping"),	
	SIGN("sign"),
	SKIING("skiing"),
	STADIUM("stadium"),	
	SUNGLASS("sunglass"),
	THEATER("theater"),
	TRAIN("train"),
	TREE("tree"),	
	WINERY("winery");
	
    private String subClass;
	
    static final Map<String,RegionClass> regionClassMap =
	        new HashMap<String,RegionClass>();
    
	static {
        for (RegionClass r : RegionClass.values())
        	regionClassMap.put(r.subClass, r);
    }
    
	private RegionClass(String subClass) {
		this.subClass = subClass;
	}	

	public String getSubClass() {
		return this.subClass;
	}	
	
	public static RegionClass getValue(String subClass) {
		return regionClassMap.get(subClass);
	}
	
}
