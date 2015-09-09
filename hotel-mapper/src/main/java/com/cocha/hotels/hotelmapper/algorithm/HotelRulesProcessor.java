package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelRulesProcessor {

    private static Logger log = Logger.getLogger(HotelRulesProcessor.class.getName());
    private List<HotelRule> ruleList;
    
    public HotelRulesProcessor(){
        ruleList = Arrays.asList(
            new HotelNameRule(), 
            new HotelAddressRule(), 
            new HotelZipCodeRule(),
            new HotelStarRatingRule(), 
            new HotelCurrencyCodeRule()
        );
    }
    
    public HotelMatch applyRules(final Hotel hotelReference, final Hotel hotelToCompare) {
        int confidence = 0;

        log.info(String.format("Applying rules to compare ref[%s] with [%s].", hotelReference.getId(), hotelToCompare.getId()));

        for (HotelRule rule : ruleList) {
            RuleMatch match = rule.apply(hotelReference, hotelToCompare);
            confidence += match.getConfidence();
        }
        
        log.info(String.format("Applied rules between ref[%s] and [%s]. Confidence level: %d", hotelReference.getId(), hotelToCompare.getId(), confidence));
        return new HotelMatch(confidence);
    }

}
