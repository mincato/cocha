package com.cocha.hotels.model.matesearch.supplier.sabre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AvailabilityOption {
	
	@XmlElement(name="BasicPropertyInfo")
	private BasicPropertyInfo basicPropertyInfo;

	public BasicPropertyInfo getBasicPropertyInfo() {
		return basicPropertyInfo;
	}

	public void setBasicPropertyInfo(BasicPropertyInfo basicPropertyInfo) {
		this.basicPropertyInfo = basicPropertyInfo;
	}

}
