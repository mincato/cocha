package com.cocha.hotels.hotelmapper.algorithm;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelAddressRule extends HotelRule {

    public static final Integer FULL_CONFIDENCE = 49;
    public static final Integer NO_CONFIDENCE = 0;
    public static final Integer MAX_CONFIDENCE = 44;

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {

        // obtener atributos, uniformizarlos, compararlos
        String attrReference = flatten(toAscii(reference.getAddress()));
        String attrToCompare = flatten(toAscii(toCompare.getAddress()));
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

    private String flatten(String name) {
        // primer paso, todo el mayusculas, remuevo los espacios
        // TODO refactor: parametrizar esto!
        return name.toUpperCase(Locale.ENGLISH).replace("SOUTH", "S").replace("WEST", "W").replace("EAST", "E")
                .replace("NORTH", "N").replace("STREET", "ST").replace("AVENUE", "AVE").replace("ROAD", "RD")
                .replace("DRIVE", "DR").replace("BOULEVARD", "BLVD").replace("SQUARE", "SQ").replace("HIGHWAY", "HWY")
                .replace("AVENIDA", "AV").replaceAll("[^\\w\\s]", " ");
    }

    private String toAscii(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Nos quedamos unicamente con los caracteres ASCII
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");

    }

}
