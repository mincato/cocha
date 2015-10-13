package com.cocha.hotels.model.matesearch.canonical;

import java.util.ArrayList;
import java.util.List;

public class RateInfo {

    private Float hightRateBetweenSupplier;
    private Float lowRateBetweenSupplier;
    private List<RateInfoForSupplier> rateForSupplier;

    public RateInfo() {
        rateForSupplier = new ArrayList<RateInfoForSupplier>();

    }

    public Float getHightRateBetweenSupplier() {
        return hightRateBetweenSupplier;
    }

    public void setHightRateBetweenSupplier(Float hightRateBetweenSupplier) {
        this.hightRateBetweenSupplier = hightRateBetweenSupplier;
    }

    public Float getLowRateBetweenSupplier() {
        return lowRateBetweenSupplier;
    }

    public void setLowRateBetweenSupplier(Float lowRateBetweenSupplier) {
        this.lowRateBetweenSupplier = lowRateBetweenSupplier;
    }

    public List<RateInfoForSupplier> getRateForSupplier() {
        return rateForSupplier;
    }

    public void setRateForSupplier(List<RateInfoForSupplier> rateForSupplier) {
        this.rateForSupplier = rateForSupplier;
    }

    public void add(RateInfoForSupplier rateSupplier) {
        this.rateForSupplier.add(rateSupplier);
    }

    public void updateRatesHightandLow(Float hightRate, Float lowRate) {

        if (hightRateBetweenSupplier == null || hightRateBetweenSupplier < hightRate) {
            this.hightRateBetweenSupplier = hightRate;
        }
        if (lowRateBetweenSupplier == null || lowRateBetweenSupplier > lowRate) {
            this.lowRateBetweenSupplier = lowRate;
        }
    }

}
