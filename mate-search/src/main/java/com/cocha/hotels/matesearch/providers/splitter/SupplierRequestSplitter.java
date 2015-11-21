package com.cocha.hotels.matesearch.providers.splitter;

import java.util.List;
import java.util.Map;

public interface SupplierRequestSplitter {

    public List<Map<String, String>> splitRequest(Map<String, String> parameters);

}
