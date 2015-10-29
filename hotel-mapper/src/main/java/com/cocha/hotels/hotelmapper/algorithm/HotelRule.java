package com.cocha.hotels.hotelmapper.algorithm;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public abstract class HotelRule {

    private static Logger log = Logger.getLogger(HotelRule.class);

    public abstract RuleMatch apply(Hotel eanHotel, Hotel bookingHotel,
            Map<HotelAttribute, List<ReplacementRule>> replacementRulesMap);

    protected String flatten(String charSequence, List<ReplacementRule> replacementRules) {
        // primer paso, saco acentos y diaresis, paso todo a mayuscula, saco
        // caracteres especiales
        charSequence = toAscii(charSequence);
        charSequence = charSequence.toUpperCase(Locale.ENGLISH);
        charSequence = charSequence.replaceAll("[^\\w\\s]", " ");

        Map<String, String> tokens = new HashMap<String, String>();
        for (ReplacementRule replacementRule : replacementRules) {
            tokens.putAll(replacementRule.getTokens());
        }

        return replaceAll(charSequence, tokens);

    }

    private String replaceAll(String charSequence, Map<String, String> tokens) {
        String result = charSequence;
        if (charSequence != null && tokens != null && !tokens.isEmpty()) {
            String patternString = "(\\b" + StringUtils.join(tokens.keySet(), "\\b|\\b") + "\\b)";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(charSequence);
            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(sb, tokens.get(matcher.group(1)));
            }
            matcher.appendTail(sb);
            result = sb.toString();

        }
        return result;
    }

    private String toAscii(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Nos quedamos unicamente con los caracteres ASCII
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");

    }

    protected void log(String ruleName, Hotel reference, Hotel toCompare, String attrReference, String attrToCompare,
            RuleMatch match) {
        String refId = reference.getId();
        String compId = toCompare.getId();

        log.debug(String.format("[%s : %s] -> [%s] -> [%s : %s] -> %d", refId, compId, ruleName, attrReference,
                attrToCompare, match.getConfidence()));
    }

}
