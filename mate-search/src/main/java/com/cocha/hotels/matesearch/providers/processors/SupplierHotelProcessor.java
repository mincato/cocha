package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Header;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;

@Component
public class SupplierHotelProcessor {

    private static final Logger log = Logger.getLogger(SupplierHotelProcessor.class);

    public ResposeSuppliers trasformer(ResposeSuppliers	 rateInfoSupplier, @Header(value = "supplier") String supplier) {
    	log.debug("Trasformer Supplier Hotel Processor");
    	for(RateInfoForSupplier rateInfo : rateInfoSupplier.getRateForSupplier()) {
    		rateInfo.setCodeSupplier(supplier);
    	}
        return rateInfoSupplier;
    }
}
