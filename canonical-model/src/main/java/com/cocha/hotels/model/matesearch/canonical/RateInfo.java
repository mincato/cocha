package com.cocha.hotels.model.matesearch.canonical;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class RateInfo {

	@XmlElement
    private Float hightRateBetweenSupplier;
	
	@XmlElement
    private Float lowRateBetweenSupplier;
    
	@XmlElement
	private List<RateForSupplier> rateForSupplier;

	
	public void add(RateForSupplier rateForSupplier) {
		this.rateForSupplier.add(rateForSupplier);
	}
    
    public RateInfo() {
    	rateForSupplier = new ArrayList<RateForSupplier>();
	}
    
    public void updateRatesHightandLow(Float hightRate, Float lowRate) {

        if (hightRateBetweenSupplier == null || (hightRate != null && hightRateBetweenSupplier < hightRate)) {
            this.hightRateBetweenSupplier = hightRate;
        }
        if (lowRateBetweenSupplier == null || (lowRate != null && lowRateBetweenSupplier > lowRate)) {
            this.lowRateBetweenSupplier = lowRate;
        }
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

	public List<RateForSupplier> getRateForSupplier() {
		return rateForSupplier;
	}

	public void setRateForSupplier(List<RateForSupplier> rateForSupplier) {
		this.rateForSupplier = rateForSupplier;
	}
    
}
