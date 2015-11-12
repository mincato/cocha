package com.cocha.hotels.matesearch.cache.processor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.cache.CacheManagerService;
import com.cocha.hotels.model.matesearch.canonical.Status;

@Service
public class CacheProcessor {

    @Autowired
    private CacheManagerService cacheManagerService;

    private Logger logger = Logger.getLogger(CacheProcessor.class);

    public Status refreshCache() {
        Status status = null;
        try {
            cacheManagerService.refreshCache();
            status = new Status("200", "success");
        } catch (Exception ex) {
            logger.error("Error al refrescal las caches: " + ex.getMessage());
            status = new Status("200", "Error al refrescar las caches");
        }
        return status;
    }
}
