package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.collections4.ListUtils;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelNameRule extends HotelRule {

    private static final Integer FULL_CONFIDENCE = 40;
    private static final Integer NO_CONFIDENCE = 0;

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getName());
        String attrToCompare = flatten(toCompare.getName());
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

        double commonWords = ListUtils.intersection(refWords, compWords).size();
        
        if (commonWords > 0){
            double max = Math.max(refWords.size(), compWords.size());
            double rate = commonWords / max;
            Integer confidence = (int) Math.round(FULL_CONFIDENCE * rate);
            return new HotelRuleMatch(confidence);
        }
        return new HotelRuleMatch(NO_CONFIDENCE);
    }

    private String flatten(String name) {
        return name.toUpperCase(Locale.ENGLISH)
                .replace("HOTEL", "")
                .replace("THE", "")
                .replace("&AMP;", "")
                .replace("&", "")
                .replace("AND", "")
                .replace("SOUTH", "S")
                .replace("WEST", "W")
                .replace("EAST", "E")
                .replace("NORTH", "N")
                .trim();
    }
}
