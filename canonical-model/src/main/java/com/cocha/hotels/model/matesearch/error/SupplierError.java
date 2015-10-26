package com.cocha.hotels.model.matesearch.error;

import com.cocha.hotels.model.matesearch.canonical.ErrorSupplier;

public class SupplierError extends ErrorSupplier{

	public SupplierError(String codeSupplier) {
		super.setCodeSupplier(codeSupplier);
	}
}
