package com.cocha.hotels.model.matesearch.canonical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.cocha.hotels.model.matesearch.response.Status;
import com.cocha.hotels.model.matesearch.response.Availability;

@XmlAccessorType(XmlAccessType.FIELD)
public class RateForSupplier {
	
	@XmlElement
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

