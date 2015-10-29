package com.cocha.hotels.hotelmapper.mocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public class ReplacementRuleMock {

    public List<ReplacementRule> buildAddressReplacements() {
        List<ReplacementRule> replacementRules = new ArrayList<>();
        ReplacementRule replacementRule = new ReplacementRule();
        replacementRule.setHotelAttribute(HotelAttribute.ADDRESS);
        replacementRule.setTokens(buildAddressTokens());
        replacementRules.add(replacementRule);
        return replacementRules;
    }

    public List<ReplacementRule> buildNameReplacements() {
        List<ReplacementRule> replacementRules = new ArrayList<>();
        ReplacementRule replacementRule = new ReplacementRule();
        replacementRule.setHotelAttribute(HotelAttribute.NAME);
        replacementRule.setTokens(buildNameTokens());
        replacementRules.add(replacementRule);
        return replacementRules;
    }

    private Map<String, String> buildNameTokens() {
        Map<String, String> tokens = new HashMap<String, String>();
        tokens.put("&AMP;", " ");
        tokens.put("AND", " ");
        tokens.put("SOUTH", "S");
        tokens.put("WEST", "W");
        tokens.put("EAST", "E");
        tokens.put("NORTH", "N");
        tokens.put("HOTELS", "");
        tokens.put("HOTEL", "");
        tokens.put("HACIENDA", "");
        tokens.put("DEL", "");
        return tokens;
    }

    private Map<String, String> buildAddressTokens() {
        Map<String, String> tokens = new HashMap<String, String>();
        tokens.put("SOUTH", "S");
        tokens.put("WEST", "W");
        tokens.put("EAST", "E");
        tokens.put("NORTH", "N");
        tokens.put("STREET", "ST");
        tokens.put("AVENUE", "AVE");
        tokens.put("ROAD", "RD");
        tokens.put("DRIVE", "DR");
        tokens.put("BOULEVARD", "BLVD");
        tokens.put("SQUARE", "SQ");
        tokens.put("HIGHWAY", "HWY");
        tokens.put("AVENIDA", "AV");
        return tokens;

    }

}
