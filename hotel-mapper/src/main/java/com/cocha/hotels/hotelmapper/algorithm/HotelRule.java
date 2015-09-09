package com.cocha.hotels.hotelmapper.algorithm;

import java.util.logging.Logger;

import com.cocha.hotels.model.content.hotel.Hotel;

public abstract class HotelRule {

    private static Logger log = Logger.getLogger(HotelRule.class.getName());
    
    public abstract RuleMatch apply(Hotel eanHotel, Hotel bookingHotel);

    protected void log(String ruleName, Hotel reference, Hotel toCompare, String attrReference, String attrToCompare, RuleMatch match) {
        String refId = reference.getId();
        String compId = toCompare.getId();
        
        log.info(String.format("[%s : %s] -> [%s] -> [%s : %s] -> %d", refId, compId, ruleName, attrReference, attrToCompare, match.getConfidence()));
    }
}
