package com.cocha.hotels.model.matesearch.respose.supplier;

import java.util.ArrayList;
import java.util.List;

import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;

public class ResposeSuppliers {
	
	private List<RateInfoForSupplier> rateForSupplier;
	private String	codeSupplier;
	
	public ResposeSuppliers() {
		rateForSupplier = new ArrayList<RateInfoForSupplier>();
	}

	public void setRateForSupplier(List<RateInfoForSupplier> rateForSupplier) {
		this.rateForSupplier = rateForSupplier;
	}

	public String getCodeSupplier() {
		return codeSupplier;
	}

	public void setCodeSupplier(String codeSupplier) {
		this.codeSupplier = codeSupplier;
	}
    public List<RateInfoForSupplier> getRateForSupplier() {
        return rateForSupplier;
    }
}
