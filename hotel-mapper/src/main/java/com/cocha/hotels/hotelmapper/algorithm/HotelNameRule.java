package com.cocha.hotels.hotelmapper.algorithm;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import org.apache.commons.collections4.ListUtils;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelNameRule extends HotelRule {

    private static final Integer FULL_CONFIDENCE = 49;
    private static final Integer NO_CONFIDENCE = 0;

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(toAscii(reference.getName()));
        String attrToCompare = flatten(toAscii(toCompare.getName()));
        RuleMatch match = compare(attrReference, attrToCompare);
        log("HotelNameRule", reference, toCompare, attrReference, attrToCompare, match);
        return match;
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        String noSpacesRef = attrReference.replaceAll("[^\\w]", "");
        String noSpacesCom = attrToCompare.replaceAll("[^\\w]", "");
        if (noSpacesRef.compareTo(noSpacesCom) == 0) {
            return new HotelRuleMatch(FULL_CONFIDENCE);
        }

        List<String> refWords = Arrays.asList(attrReference.split("\\s+"));
        List<String> compWords = Arrays.asList(attrToCompare.split("\\s+"));
        
        Integer confidence = NO_CONFIDENCE;
        if (refWords.size() <= compWords.size()) {
        	confidence = compare(refWords, compWords);
        } else {
        	confidence = compare(compWords, refWords);
        }
        return new HotelRuleMatch(confidence);
    }

    private Integer compare(List<String> refWords, List<String> compWords) {
    	double rate = 0;
    	if (compWords.containsAll(refWords)) {
    		rate = 1;
    	} else {
    		double commonWords = ListUtils.intersection(refWords, compWords).size();
    		double max = Math.max(refWords.size(), compWords.size());
            rate = commonWords / max;
    	}
    	return (int) Math.round(FULL_CONFIDENCE * rate);
	}

	private String flatten(String name) {
        return name.toUpperCase(Locale.ENGLISH)
                .replace("&AMP;", " ")
                .replace("AND", " ")
                .replace("SOUTH", "S")
                .replace("WEST", "W")
                .replace("EAST", "E")
                .replace("NORTH", "N")
                .replaceAll("[^\\w\\s]", " ")
                .trim();
    }
    
    private String toAscii(String input) {
    	String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
    	// Nos quedamos únicamente con los caracteres ASCII
    	Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    	return pattern.matcher(normalized).replaceAll("");
    	
    }
    
}
