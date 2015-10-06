package com.cocha.hotels.matesearch.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StringUtilsTest  {
	
	
	@Test
	public void StringSeparatedByCommansToList() {
	
		List<String> listaComparacions = new ArrayList<String>();
		listaComparacions.add("EAN105621");
		listaComparacions.add("EAN106022");
		
		String stringSerparatedByCommans = "EAN105621,EAN106022";
		List<String> listaResultado = MessageUtils.parseStringHotelIdToHotelId(stringSerparatedByCommans);
		
		for(String id : listaResultado) {
			System.out.println(id);
		}
		
	}


}
