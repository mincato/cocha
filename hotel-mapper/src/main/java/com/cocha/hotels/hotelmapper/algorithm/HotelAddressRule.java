package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelAddressRule extends HotelRule {

    private static final Integer FULL_CONFIDENCE = 60;
    private static final Integer NO_CONFIDENCE = 0;

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getAddress());
        String attrToCompare = flatten(toCompare.getAddress());
        RuleMatch match = compare(attrReference, attrToCompare);
        log("HotelAddressRule", reference, toCompare, attrReference, attrToCompare, match);
        return match;
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        String noSpacesRef = attrReference.replaceAll("[\\s\\.]", "");
        String noSpacesCom = attrToCompare.replaceAll("[\\s\\.]", "");
        if (noSpacesRef.compareTo(noSpacesCom) == 0) {
            return new HotelRuleMatch(FULL_CONFIDENCE);
        }

        List<String> refWords = Arrays.asList(attrReference.split("\\s+"));
        List<String> compWords = Arrays.asList(attrToCompare.split("\\s+"));

        boolean comparison = compare(refWords, compWords);
        Integer confidence = comparison ? FULL_CONFIDENCE : NO_CONFIDENCE;
        return new HotelRuleMatch(confidence);
    }

    private boolean compare(List<String> refWords, List<String> compWords) {

        // las palabras de uno contienen al otro
        return compWords.containsAll(refWords) || refWords.containsAll(compWords);
    }

    private String flatten(String name) {
        // primer paso, todo el mayusculas, remuevo los espacios
        // TODO refactor: parametrizar esto!
        return name.toUpperCase(Locale.ENGLISH)
                .replace("SOUTH", "S")
                .replace("WEST", "W")
                .replace("EAST", "E")
                .replace("NORTH", "N")
                .replace("STREET", "ST")
                .replace("AVENUE", "AVE")
                .replace("ROAD", "RD")
                .replace("DRIVE", "DR")
                .replace("BOULEVARD", "BLVD")
                .replace("SQUARE", "SQ")
                .replace("HIGHWAY", "HWY");
    }

}
