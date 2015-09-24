package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelNameRule extends HotelRule {

    private static final Integer FULL_CONFIDENCE = 34;
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
        List<String> refWords = Arrays.asList(attrReference.split("\\s+"));
        List<String> compWords = Arrays.asList(attrToCompare.split("\\s+"));

        boolean comparison = compare(refWords, compWords);
        Integer confidence = comparison ? FULL_CONFIDENCE : NO_CONFIDENCE;
        return new HotelRuleMatch(confidence);
    }

    private boolean compare(List<String> refWords, List<String> compWords) {

        return refWords.size() == compWords.size() && compWords.containsAll(refWords);
    }

    private String flatten(String name) {
        return name.toUpperCase(Locale.ENGLISH).replace("HOTEL", "").replace("THE", "").replace("&AMP;", "")
                .replace("&", "").replace("AND", "").trim();
    }
}
