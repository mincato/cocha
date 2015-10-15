package com.cocha.hotels.model.matesearch.error;

public class ErrorSupplier {
	
	public ErrorSupplier() {
	}
	
	public ErrorSupplier(String supplier) {
		this.codeSupplier=supplier;
	}
	
	private String idSupplier;
	private String codeSupplier;
	private String detail;
	
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
