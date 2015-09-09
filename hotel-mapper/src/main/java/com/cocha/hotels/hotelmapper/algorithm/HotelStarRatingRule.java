package com.cocha.hotels.hotelmapper.algorithm;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelStarRatingRule extends HotelRule {

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getStarRating());
        String attrToCompare = flatten(toCompare.getStarRating());
        RuleMatch match = compare(attrReference, attrToCompare);
        log("HotelStarRatingRule", reference, toCompare, attrReference, attrToCompare, match);
        return match;
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        if (attrReference.compareTo(attrToCompare) == 0) {
            return new HotelRuleMatch(10);
        }

        Double refRating = Math.floor(Double.parseDouble(attrReference));
        Double compRating = Math.floor(Double.parseDouble(attrToCompare));
        int comparison = refRating.compareTo(compRating);

        return new HotelRuleMatch(comparison == 0 ? 10 : 0);
    }

    private String flatten(String name) {
        // nada que hacer acá más que quitar los espacios alrededor
        return name.trim();
    }

}
