package com.cocha.hotels.hotelmapper.algorithm;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelZipCodeRule implements HotelRule {

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // TODO obtener atributos, uniformizarlos, compararlos
        String nameReference = flatten(reference.getZipCode());
        String nameToCompare = flatten(toCompare.getZipCode());
        return compare(nameReference, nameToCompare);
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        int comparison = attrReference.compareTo(attrToCompare);
        Integer confidence = comparison == 0 ? 30 : 0;
        return new HotelRuleMatch(confidence);
    }

    private String flatten(String name) {
        // primer paso, todo el mayusculas, remuevo los espacios
        return name.toUpperCase().replaceAll("\\s", "");
    }

}
