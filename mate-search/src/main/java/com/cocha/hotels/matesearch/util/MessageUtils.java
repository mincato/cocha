package com.cocha.hotels.matesearch.util;

import java.util.HashMap;
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
    public static Map<String, String> parseQueryParams(String queryStrings) {
        Map<String, String> parameters = new HashMap<String, String>();
        String[] pairs = queryStrings.split("\\&");
        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            String[] keyValue = pair.split("\\=");
            parameters.put(keyValue[0], (keyValue[1]));
        }
        return parameters;
    }
}
