package com.cocha.hotels.matesearch.providers.processors;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;

@Component
public class SupplierHotelProcessor {

    private static final Logger log = Logger.getLogger(SupplierHotelProcessor.class);

    public RateInfoForSupplier trasformer(RateInfoForSupplier rateInfoSupplier) {
    	log.debug("Trasformer Supplier Hotel Processor");
        return rateInfoSupplier;
    }
}
