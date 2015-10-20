package com.cocha.hotels.model.matesearch.canonical;

import com.cocha.hotels.model.matesearch.response.Status;
import com.cocha.hotels.model.matesearch.response.Availability;

public class RateForSupplier {
	
	private Status status;
	private Availability availability;

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
}

