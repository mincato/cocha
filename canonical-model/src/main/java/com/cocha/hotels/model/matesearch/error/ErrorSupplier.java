package com.cocha.hotels.model.matesearch.error;

import com.cocha.hotels.model.matesearch.response.SupplierServiceRespose;


public class ErrorSupplier extends SupplierServiceRespose{
	
	public ErrorSupplier() {
	}
	
	public ErrorSupplier(String supplier) {
		this.codeSupplier=supplier;
	}
	
	private String idSupplier;
	private String codeSupplier;
	
	public String getCodeSupplier() {
		return codeSupplier;
	}

	public void setCodeSupplier(String codeSupplier) {
		this.codeSupplier = codeSupplier;
	}

	public String getIdSupplier() {
		return idSupplier;
	}

	public void setIdSupplier(String idSupplier) {
		this.idSupplier = idSupplier;
	}
}
