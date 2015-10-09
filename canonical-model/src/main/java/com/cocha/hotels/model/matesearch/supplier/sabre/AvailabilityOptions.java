package com.cocha.hotels.model.matesearch.supplier.sabre;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AvailabilityOptions")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailabilityOptions {
	
	@XmlElement(name="AvailabilityOption")
	private List<AvailabilityOption> availabilityOption;

	public List<AvailabilityOption> getAvailabilityOption() {
		return availabilityOption;
	}

	public void setAvailabilityOption(List<AvailabilityOption> availabilityOption) {
		this.availabilityOption = availabilityOption;
	}
}
