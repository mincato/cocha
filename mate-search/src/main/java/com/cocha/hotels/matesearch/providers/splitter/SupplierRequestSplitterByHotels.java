package com.cocha.hotels.matesearch.providers.splitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cocha.hotels.matesearch.util.Constant;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class SupplierRequestSplitterByHotels implements SupplierRequestSplitter {

    private String idHotelsParameterKey;

    private int maxHotelsPerRequest;

    @Override
    public List<Map<String, String>> splitRequest(Map<String, String> parameters) {
        List<Map<String, String>> requests = new ArrayList<Map<String, String>>();
        String hotelIds = parameters.get(idHotelsParameterKey);
        List<String> listHotelIds = Arrays.asList(hotelIds.split(Constant.HOTEL_IDS_SEPARATOR));
        List<List<String>> hotelIdsPerRequest = Lists.partition(listHotelIds, maxHotelsPerRequest);
        for (List<String> hotelIdRequest : hotelIdsPerRequest) {
            Map<String, String> request = new HashMap<String, String>(parameters);
            request.replace(idHotelsParameterKey, Joiner.on(Constant.HOTEL_IDS_SEPARATOR).join(hotelIdRequest));
            requests.add(request);
        }
        return requests;
    }

    public void setIdHotelsParameterKey(String idHotelsParameterKey) {
        this.idHotelsParameterKey = idHotelsParameterKey;
    }

    public void setMaxHotelsPerRequest(int maxHotelsPerRequest) {
        this.maxHotelsPerRequest = maxHotelsPerRequest;
    }

}
