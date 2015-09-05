package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelNameRule implements HotelRule {

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getName());
        String attrToCompare = flatten(toCompare.getName());
        return compare(attrReference, attrToCompare);
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        List<String> refWords = Arrays.asList(attrReference.split("\\s+"));
        List<String> compWords = Arrays.asList(attrToCompare.split("\\s+"));

        boolean comparison = compare(refWords, compWords);
        Integer confidence = comparison ? 35 : 0;
        return new HotelRuleMatch(confidence);
    }

    private boolean compare(List<String> refWords, List<String> compWords) {

        return refWords.size() == compWords.size() && compWords.containsAll(refWords);
    }

    private String flatten(String name) {
        return name.toUpperCase().replace("HOTEL", "").replace("THE", "").replace("&AMP;", "").replace("&", "")
                .replace("AND", "").trim();
    }

}
