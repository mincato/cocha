package com.cocha.hotels.matesearch.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageUtils {

    /**
     * Parser for query params from url.
     *
     * @param queryStrings
     *            the string that contains the parameters in
     *            param=value&param=value format.
     * @return a map with parameters from url.
     */
    public static Map<String, Object> parseQueryParams(String queryStrings) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        String[] pairs = queryStrings.split("\\&");
        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            String[] keyValue = pair.split("\\=");
            if (keyValue != null && keyValue.length > 1) {
                parameters.put(keyValue[0], (keyValue[1]));
            }
        }
        return parameters;
    }

    public static List<String> parseStringHotelIdToHotelId(String stringIds) {

        List<String> ids = Arrays.asList(stringIds.split("\\s*,\\s*"));

        return ids;
    }
}
