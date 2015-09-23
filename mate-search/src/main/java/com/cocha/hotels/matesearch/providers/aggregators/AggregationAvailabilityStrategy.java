package com.cocha.hotels.matesearch.providers.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class AggregationAvailabilityStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        String responses = "[";
        if (oldExchange == null) {
            String firstResult = (String) newExchange.getIn().getBody(String.class);
            responses += firstResult + "]";
            newExchange.getIn().setBody(responses);
            return newExchange;
        } else {
            String oldResults = (String) oldExchange.getIn().getBody(String.class);
            if (oldResults.endsWith("]")) {
                oldResults = oldResults.substring(0, oldResults.length() - 1);
            }
            String newResult = newExchange.getIn().getBody(String.class);
            oldResults += "," + newResult + "]";
            oldExchange.getIn().setBody(oldResults);
            return oldExchange;
        }
    }
}
