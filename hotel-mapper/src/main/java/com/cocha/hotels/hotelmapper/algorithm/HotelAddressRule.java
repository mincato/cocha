package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public class HotelAddressRule extends HotelRule {

    public static final Integer FULL_CONFIDENCE = 49;
    public static final Integer NO_CONFIDENCE = 0;
    public static final Integer MAX_CONFIDENCE = 44;

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare,
            Map<HotelAttribute, List<ReplacementRule>> replacementRulesMap) {

        List<ReplacementRule> addressReplacementRules = replacementRulesMap.get(HotelAttribute.ADDRESS);

        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(reference.getAddress(), addressReplacementRules);
        String attrToCompare = flatten(toCompare.getAddress(), addressReplacementRules);
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

        double rate = StringUtils.getJaroWinklerDistance(attrReference, attrToCompare);

        Integer confidence = NO_CONFIDENCE;
        if (rate > 0.65) {
            confidence = (int) Math.round(MAX_CONFIDENCE * rate);
        } else {
            List<String> refWords = Arrays.asList(attrReference.split("\\s+"));
            List<String> compWords = Arrays.asList(attrToCompare.split("\\s+"));

            confidence = NO_CONFIDENCE;
            if (refWords.size() <= compWords.size()) {
                confidence = compare(refWords, compWords);
            } else {
                confidence = compare(compWords, refWords);
            }
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
        return (int) Math.round(MAX_CONFIDENCE * rate);
    }

}
