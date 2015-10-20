package com.cocha.hotels.model.matesearch.error;

import com.cocha.hotels.model.matesearch.response.Availability;


public class ErrorSupplier extends Availability implements Cloneable {
	
	private String idSupplier;
	private String codeSupplier;
	
	public ErrorSupplier(String supplier) {
		this.codeSupplier=supplier;
	}

	public ErrorSupplier() {
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

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
