package com.cocha.hotels.matesearch.providers.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;

@Component
public class SupplierHotelProcessor  implements Processor{

    private static final Logger log = Logger.getLogger(SupplierHotelProcessor.class);


    @Override
    public void process(Exchange exchange) throws Exception {
    	
    	ResposeSuppliers rateInfoSupplier = exchange.getIn().getBody(ResposeSuppliers.class);
    	Map<String, Object> header = exchange.getIn().getHeaders();
    	
    	exchange.getIn().setBody(trasformer(rateInfoSupplier, (String) header.get("supplier")));
    	
    }

    public ResposeSuppliers trasformer(ResposeSuppliers	 rateInfoSupplier, @Header(value = "supplier") String supplier) {
     	log.debug("Trasformer Supplier Hotel Processor");
     	if(rateInfoSupplier != null ) {
     		for(RateInfoForSupplier rateInfo : rateInfoSupplier.getRateForSupplier()) {
     			rateInfo.setCodeSupplier(supplier);
     		}     		
     	} else {
     		rateInfoSupplier = new ResposeSuppliers();
     	}
     	rateInfoSupplier.setCodeSupplier(supplier);

        return rateInfoSupplier;
    }

}
