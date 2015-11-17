package com.cocha.hotels.matesearch.providers.services;

import org.apache.camel.Exchange;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;

import com.google.common.base.Joiner;

@Component
public class CacheKeyGenerator {

    public String generateKeyForGet(MessageContentsList messageContentList) {
        String arrivalDate = (String) messageContentList.get(0);
        String departureDate = (String) messageContentList.get(1);
        String currencyCode = (String) messageContentList.get(2);
        String regionId = (String) messageContentList.get(3);
        return generate(arrivalDate, departureDate, currencyCode, regionId);
    }

    public String generateKeyForPut(Exchange exchange) {
        String arrivalDate = (String) exchange.getIn().getHeader("arrivalDate");
        String departureDate = (String) exchange.getIn().getHeader("departureDate");
        String currencyCode = (String) exchange.getIn().getHeader("currencyCode");
        String regionId = (String) exchange.getIn().getHeader("regionId");
        return generate(arrivalDate, departureDate, currencyCode, regionId);
    }

    private String generate(String arrivalDate, String departureDate, String currencyCode, String regionId) {
        return Joiner.on(":").join(arrivalDate, departureDate, currencyCode, regionId);
    }

}
