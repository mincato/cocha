package com.cocha.hotels.hotelmapper.algorithm;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelZipCodeRule extends HotelRule {

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getZipCode());
        String attrToCompare = flatten(toCompare.getZipCode());
        RuleMatch match = compare(attrReference, attrToCompare);
        log("HotelZipCodeRule", reference,toCompare,attrReference,attrToCompare,match);
        return match;
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        int comparison = attrReference.compareTo(attrToCompare);
        Integer confidence = comparison == 0 ? 10 : 0;
        return new HotelRuleMatch(confidence);
    }

    private String flatten(String name) {
        // primer paso, todo el mayusculas, remuevo los espacios
        return name.toUpperCase().replaceAll("\\s", "");
    }

}
