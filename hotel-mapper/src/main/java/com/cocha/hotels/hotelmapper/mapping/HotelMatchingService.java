package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.List;

import com.cocha.hotels.hotelmapper.algorithm.HotelRulesProcessor;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMatch;
import com.cocha.hotels.model.content.mapping.MultipleMatch;

public class HotelMatchingService {

    private HotelRulesProcessor rulesProcessor;

    public HotelMatchingService() {
    }

    public HotelMatchingService(HotelRulesProcessor hotelRulesProcessor) {
        this.rulesProcessor = hotelRulesProcessor;
    }

    public MultipleMatch match(final Hotel reference, List<Hotel> hotelsFromOtherSupplier) {
        List<HotelMatch> matches = new ArrayList<HotelMatch>();

        hotelsFromOtherSupplier.forEach((hotel) -> {
            HotelMatch match = rulesProcessor.applyRules(reference, hotel);
            matches.add(match);
        });
        return new MultipleMatch(matches);
    }

    public HotelRulesProcessor getRulesProcessor() {
        return rulesProcessor;
    }

    public void setRulesProcessor(HotelRulesProcessor rulesProcessor) {
        this.rulesProcessor = rulesProcessor;
    }

}
