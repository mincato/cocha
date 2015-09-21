package com.cocha.hotels.model.matesearch.supplier.sabre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class BasicPropertyInfo {
	
	@XmlAttribute(name="AreaID")
	private String areaID;
	@XmlAttribute(name="ChainCode")
	private String chainCode;
	@XmlAttribute(name="Distance")
	private String distance;
	@XmlAttribute(name="GEO_ConfidenceLevel")
	private String GeoConfidenceLevel;
	@XmlAttribute(name="HotelCityCode")
	private String hotelCityCode;
	@XmlAttribute(name="HotelCode")
	private String hotelCode;
	@XmlAttribute(name="HotelName")
	private String hotelName;
	@XmlElement(name="RateRange")
	private RateRange rateRange;

	
	public RateRange getRateRange() {
		return rateRange;
	}
	public void setRateRange(RateRange rateRange) {
		this.rateRange = rateRange;
	}
	public String getAreaID() {
		return areaID;
	}
	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}
	public String getChainCode() {
		return chainCode;
	}
	public void setChainCode(String chainCode) {
		this.chainCode = chainCode;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getGeoConfidenceLevel() {
		return GeoConfidenceLevel;
	}
	public void setGeoConfidenceLevel(String geoConfidenceLevel) {
		GeoConfidenceLevel = geoConfidenceLevel;
	}
	public String getHotelCityCode() {
		return hotelCityCode;
	}
	public void setHotelCityCode(String hotelCityCode) {
		this.hotelCityCode = hotelCityCode;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
