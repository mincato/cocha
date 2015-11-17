package com.cocha.hotels.matesearch.providers.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;

@Component
public class SupplierRequestAggregationStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        ResposeSuppliers oldResponseSuppliers = oldExchange.getIn().getBody(ResposeSuppliers.class);
        ResposeSuppliers newResponseSuppliers = newExchange.getIn().getBody(ResposeSuppliers.class);

        if (oldResponseSuppliers != null || newResponseSuppliers != null) {
            ResposeSuppliers responseSuppliers = oldResponseSuppliers == null ? newResponseSuppliers
                    : oldResponseSuppliers;
            if (oldResponseSuppliers != null) {
                if (newResponseSuppliers != null && newResponseSuppliers.getRateForSupplier() != null) {
                    if (responseSuppliers.getCodeSupplier() == null) {
                        responseSuppliers.setRateForSupplier(newResponseSuppliers.getRateForSupplier());
                    } else {
                        responseSuppliers.getRateForSupplier().addAll(newResponseSuppliers.getRateForSupplier());
                    }
                }
            }
            oldExchange.getIn().setBody(responseSuppliers);
        }

        return oldExchange;
    }

}
