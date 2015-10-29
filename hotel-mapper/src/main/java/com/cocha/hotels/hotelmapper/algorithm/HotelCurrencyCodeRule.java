package com.cocha.hotels.hotelmapper.algorithm;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public class HotelCurrencyCodeRule extends HotelRule {

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare,
            Map<HotelAttribute, List<ReplacementRule>> replacementRulesMap) {
        return apply(reference, toCompare);
    }

    private RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getCurrencyCode());
        String attrToCompare = flatten(toCompare.getCurrencyCode());
        RuleMatch match = compare(attrReference, attrToCompare);
        log("HotelCurrencyCodeRule", reference, toCompare, attrReference, attrToCompare, match);
        return match;
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        int comparison = attrReference.compareTo(attrToCompare);
        Integer confidence = comparison == 0 ? 10 : 0;
        return new HotelRuleMatch(confidence);
    }

    private String flatten(String name) {
        // primer paso, todo el mayusculas, remuevo los espacios
        return name.toUpperCase(Locale.ENGLISH).replaceAll("\\s", "");
    }

}
