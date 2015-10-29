package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMatch;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

@Service
public class HotelRulesProcessor {

    private static Logger log = Logger.getLogger(HotelRulesProcessor.class);
    private List<HotelRule> ruleList;

    public HotelRulesProcessor() {
        ruleList = Arrays.asList(new HotelNameRule(), new HotelAddressRule());
    }

    public HotelMatch applyRules(final Hotel hotelReference, final Hotel hotelToCompare,
            Map<HotelAttribute, List<ReplacementRule>> replacementRulesMap) {
        int confidence = 0;

        log.debug(String.format("Applying rules to compare ref[%s] with [%s].", hotelReference.getId(),
                hotelToCompare.getId()));

        for (HotelRule rule : ruleList) {
            RuleMatch match = rule.apply(hotelReference, hotelToCompare, replacementRulesMap);
            confidence += match.getConfidence();
        }

        log.debug(String.format("Applied rules between ref[%s] and [%s]. Confidence level: %d", hotelReference.getId(),
                hotelToCompare.getId(), confidence));
        return new HotelMatch(hotelReference, hotelToCompare, confidence);
    }

}
