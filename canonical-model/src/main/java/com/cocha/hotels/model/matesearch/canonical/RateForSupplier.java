package com.cocha.hotels.model.matesearch.canonical;

import com.cocha.hotels.model.matesearch.response.Status;
import com.cocha.hotels.model.matesearch.response.SupplierServiceRespose;

public class RateForSupplier {
	
	private Status status;
	private SupplierServiceRespose supplierServiceRespose;

	public SupplierServiceRespose getSupplierServiceRespose() {
		return supplierServiceRespose;
	}

	public void setSupplierServiceRespose(SupplierServiceRespose supplierServiceRespose) {
		this.supplierServiceRespose = supplierServiceRespose;
	}
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
}

