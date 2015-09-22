package com.cocha.hotels.model.matesearch.supplier.sabre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AvailabilityOptions")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailabilityOptions {
	
	@XmlElement(name="AvailabilityOption")
	private AvailabilityOption availabilityOption;

	public AvailabilityOption getAvailabilityOption() {
		return availabilityOption;
	}

	public void setAvailabilityOption(AvailabilityOption availabilityOption) {
		this.availabilityOption = availabilityOption;
	}
}
