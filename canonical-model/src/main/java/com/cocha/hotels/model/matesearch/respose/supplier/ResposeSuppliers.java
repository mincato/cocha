package com.cocha.hotels.model.matesearch.respose.supplier;

import java.util.List;

import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;

public class ResposeSuppliers {

    private List<RateInfoForSupplier> rateForSupplier;

    public List<RateInfoForSupplier> getRateForSupplier() {
        return rateForSupplier;
    }

    public void setRateForSupplier(List<RateInfoForSupplier> rateForSupplier) {
        this.rateForSupplier = rateForSupplier;
    }
}
