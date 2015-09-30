
package com.sabre.webservices.sabrexml._2011._10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailRequestSegment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AdditionalAvail" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Customer" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Corporate" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ID" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GuestCounts" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HotelSearchCriteria" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Criterion" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Address" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Award" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ContactNumbers" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ContactNumber"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CommissionProgram" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                                       &lt;element name="HotelAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                                       &lt;element name="HotelFeature" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="FireSafetyApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                               &lt;attribute name="AirportTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="HotelRef" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="UnitOfMeasure"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;enumeration value="KM"/&gt;
 *                                                     &lt;enumeration value="MI"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                                       &lt;element name="PointOfInterest" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="NonUS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                                       &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="DistanceDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="GeoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Index"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;enumeration value="A"/&gt;
 *                                                     &lt;enumeration value="C"/&gt;
 *                                                     &lt;enumeration value="R"/&gt;
 *                                                     &lt;enumeration value="S"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="NumProperties" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="POS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Source"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BookingChannel"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CompanyName"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Division" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RatePlanCandidates" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ContractNegotiatedRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="8" minOccurs="0"/&gt;
 *                             &lt;element name="RateAccessCode" maxOccurs="3" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element name="RateRange" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PromotionalSpot"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="C"/&gt;
 *                                 &lt;enumeration value="L"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="RateAssured" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="SuppressRackRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TimeSpan" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="End" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" /&gt;
 *                           &lt;attribute name="Start" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.2.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "availRequestSegment"
})
@XmlRootElement(name = "OTA_HotelAvailRQ")
public class OTAHotelAvailRQ {

    @XmlElement(name = "AvailRequestSegment", required = true)
    protected OTAHotelAvailRQ.AvailRequestSegment availRequestSegment;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the availRequestSegment property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQ.AvailRequestSegment }
     *     
     */
    public OTAHotelAvailRQ.AvailRequestSegment getAvailRequestSegment() {
        return availRequestSegment;
    }

    /**
     * Sets the value of the availRequestSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQ.AvailRequestSegment }
     *     
     */
    public void setAvailRequestSegment(OTAHotelAvailRQ.AvailRequestSegment value) {
        this.availRequestSegment = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AdditionalAvail" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Customer" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Corporate" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ID" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GuestCounts" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HotelSearchCriteria" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Criterion" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Address" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Award" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ContactNumbers" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ContactNumber"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CommissionProgram" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
     *                             &lt;element name="HotelAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
     *                             &lt;element name="HotelFeature" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="FireSafetyApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                     &lt;attribute name="AirportTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="HotelRef" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="UnitOfMeasure"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;enumeration value="KM"/&gt;
     *                                           &lt;enumeration value="MI"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
     *                             &lt;element name="PointOfInterest" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="NonUS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
     *                             &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="DistanceDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="GeoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                     &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Index"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;enumeration value="A"/&gt;
     *                                           &lt;enumeration value="C"/&gt;
     *                                           &lt;enumeration value="R"/&gt;
     *                                           &lt;enumeration value="S"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="NumProperties" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="POS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Source"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="BookingChannel"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CompanyName"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Division" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RatePlanCandidates" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ContractNegotiatedRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="8" minOccurs="0"/&gt;
     *                   &lt;element name="RateAccessCode" maxOccurs="3" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element name="RateRange" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PromotionalSpot"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="C"/&gt;
     *                       &lt;enumeration value="L"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="RateAssured" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="SuppressRackRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TimeSpan" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="End" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" /&gt;
     *                 &lt;attribute name="Start" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalAvail",
        "customer",
        "guestCounts",
        "hotelSearchCriteria",
        "pos",
        "ratePlanCandidates",
        "timeSpan"
    })
    public static class AvailRequestSegment {

        @XmlElement(name = "AdditionalAvail")
        protected OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail additionalAvail;
        @XmlElement(name = "Customer")
        protected OTAHotelAvailRQ.AvailRequestSegment.Customer customer;
        @XmlElement(name = "GuestCounts")
        protected OTAHotelAvailRQ.AvailRequestSegment.GuestCounts guestCounts;
        @XmlElement(name = "HotelSearchCriteria")
        protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria;
        @XmlElement(name = "POS")
        protected OTAHotelAvailRQ.AvailRequestSegment.POS pos;
        @XmlElement(name = "RatePlanCandidates")
        protected OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates ratePlanCandidates;
        @XmlElement(name = "TimeSpan")
        protected OTAHotelAvailRQ.AvailRequestSegment.TimeSpan timeSpan;

        /**
         * Gets the value of the additionalAvail property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail getAdditionalAvail() {
            return additionalAvail;
        }

        /**
         * Sets the value of the additionalAvail property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail }
         *     
         */
        public void setAdditionalAvail(OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail value) {
            this.additionalAvail = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.Customer }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.Customer getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.Customer }
         *     
         */
        public void setCustomer(OTAHotelAvailRQ.AvailRequestSegment.Customer value) {
            this.customer = value;
        }

        /**
         * Gets the value of the guestCounts property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.GuestCounts }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.GuestCounts getGuestCounts() {
            return guestCounts;
        }

        /**
         * Sets the value of the guestCounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.GuestCounts }
         *     
         */
        public void setGuestCounts(OTAHotelAvailRQ.AvailRequestSegment.GuestCounts value) {
            this.guestCounts = value;
        }

        /**
         * Gets the value of the hotelSearchCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * Sets the value of the hotelSearchCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public void setHotelSearchCriteria(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
        }

        /**
         * Gets the value of the pos property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.POS getPOS() {
            return pos;
        }

        /**
         * Sets the value of the pos property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS }
         *     
         */
        public void setPOS(OTAHotelAvailRQ.AvailRequestSegment.POS value) {
            this.pos = value;
        }

        /**
         * Gets the value of the ratePlanCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * Sets the value of the ratePlanCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates }
         *     
         */
        public void setRatePlanCandidates(OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates value) {
            this.ratePlanCandidates = value;
        }

        /**
         * Gets the value of the timeSpan property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.TimeSpan }
         *     
         */
        public OTAHotelAvailRQ.AvailRequestSegment.TimeSpan getTimeSpan() {
            return timeSpan;
        }

        /**
         * Sets the value of the timeSpan property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailRQ.AvailRequestSegment.TimeSpan }
         *     
         */
        public void setTimeSpan(OTAHotelAvailRQ.AvailRequestSegment.TimeSpan value) {
            this.timeSpan = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdditionalAvail {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Corporate" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ID" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "corporate",
            "id"
        })
        public static class Customer {

            @XmlElement(name = "Corporate")
            protected OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate corporate;
            @XmlElement(name = "ID")
            protected OTAHotelAvailRQ.AvailRequestSegment.Customer.ID id;

            /**
             * Gets the value of the corporate property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate }
             *     
             */
            public OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate getCorporate() {
                return corporate;
            }

            /**
             * Sets the value of the corporate property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate }
             *     
             */
            public void setCorporate(OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate value) {
                this.corporate = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.ID }
             *     
             */
            public OTAHotelAvailRQ.AvailRequestSegment.Customer.ID getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.ID }
             *     
             */
            public void setID(OTAHotelAvailRQ.AvailRequestSegment.Customer.ID value) {
                this.id = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id"
            })
            public static class Corporate {

                @XmlElement(name = "ID", required = true)
                protected String id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "number"
            })
            public static class ID {

                @XmlElement(name = "Number", required = true)
                protected String number;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuestCounts {

            @XmlAttribute(name = "Count", required = true)
            protected BigInteger count;

            /**
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCount(BigInteger value) {
                this.count = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Criterion" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Address" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Award" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ContactNumbers" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ContactNumber"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CommissionProgram" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element name="HotelAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element name="HotelFeature" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="FireSafetyApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                           &lt;attribute name="AirportTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="HotelRef" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="UnitOfMeasure"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;enumeration value="KM"/&gt;
         *                                 &lt;enumeration value="MI"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element name="PointOfInterest" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="NonUS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="DistanceDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="GeoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Index"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;enumeration value="A"/&gt;
         *                                 &lt;enumeration value="C"/&gt;
         *                                 &lt;enumeration value="R"/&gt;
         *                                 &lt;enumeration value="S"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="NumProperties" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "criterion"
        })
        public static class HotelSearchCriteria {

            @XmlElement(name = "Criterion")
            protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion criterion;
            @XmlAttribute(name = "NumProperties")
            protected BigInteger numProperties;

            /**
             * Gets the value of the criterion property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion }
             *     
             */
            public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion getCriterion() {
                return criterion;
            }

            /**
             * Sets the value of the criterion property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion }
             *     
             */
            public void setCriterion(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion value) {
                this.criterion = value;
            }

            /**
             * Gets the value of the numProperties property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumProperties() {
                return numProperties;
            }

            /**
             * Sets the value of the numProperties property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumProperties(BigInteger value) {
                this.numProperties = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Address" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Award" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ContactNumbers" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ContactNumber"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CommissionProgram" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element name="HotelAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element name="HotelFeature" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="FireSafetyApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                 &lt;attribute name="AirportTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="HotelRef" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="UnitOfMeasure"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;enumeration value="KM"/&gt;
             *                       &lt;enumeration value="MI"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element name="PointOfInterest" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="NonUS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="DistanceDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="GeoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Index"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;enumeration value="A"/&gt;
             *                       &lt;enumeration value="C"/&gt;
             *                       &lt;enumeration value="R"/&gt;
             *                       &lt;enumeration value="S"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "address",
                "award",
                "contactNumbers",
                "commissionProgram",
                "hotelAmenity",
                "hotelFeature",
                "hotelRef",
                "_package",
                "pointOfInterest",
                "propertyType",
                "refPoint",
                "roomAmenity"
            })
            public static class Criterion {

                @XmlElement(name = "Address")
                protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address address;
                @XmlElement(name = "Award")
                protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award award;
                @XmlElement(name = "ContactNumbers")
                protected List<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers> contactNumbers;
                @XmlElement(name = "CommissionProgram")
                protected List<String> commissionProgram;
                @XmlElement(name = "HotelAmenity")
                protected List<String> hotelAmenity;
                @XmlElement(name = "HotelFeature")
                protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature hotelFeature;
                @XmlElement(name = "HotelRef")
                protected List<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef> hotelRef;
                @XmlElement(name = "Package")
                protected List<String> _package;
                @XmlElement(name = "PointOfInterest")
                protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest pointOfInterest;
                @XmlElement(name = "PropertyType")
                protected List<String> propertyType;
                @XmlElement(name = "RefPoint")
                protected List<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.RefPoint> refPoint;
                @XmlElement(name = "RoomAmenity")
                protected List<String> roomAmenity;

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address }
                 *     
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address }
                 *     
                 */
                public void setAddress(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the award property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award }
                 *     
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award getAward() {
                    return award;
                }

                /**
                 * Sets the value of the award property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award }
                 *     
                 */
                public void setAward(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award value) {
                    this.award = value;
                }

                /**
                 * Gets the value of the contactNumbers property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contactNumbers property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContactNumbers().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers> getContactNumbers() {
                    if (contactNumbers == null) {
                        contactNumbers = new ArrayList<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers>();
                    }
                    return this.contactNumbers;
                }

                /**
                 * Gets the value of the commissionProgram property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the commissionProgram property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCommissionProgram().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getCommissionProgram() {
                    if (commissionProgram == null) {
                        commissionProgram = new ArrayList<String>();
                    }
                    return this.commissionProgram;
                }

                /**
                 * Gets the value of the hotelAmenity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelAmenity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getHotelAmenity() {
                    if (hotelAmenity == null) {
                        hotelAmenity = new ArrayList<String>();
                    }
                    return this.hotelAmenity;
                }

                /**
                 * Gets the value of the hotelFeature property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature }
                 *     
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature getHotelFeature() {
                    return hotelFeature;
                }

                /**
                 * Sets the value of the hotelFeature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature }
                 *     
                 */
                public void setHotelFeature(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature value) {
                    this.hotelFeature = value;
                }

                /**
                 * Gets the value of the hotelRef property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelRef property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelRef().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef> getHotelRef() {
                    if (hotelRef == null) {
                        hotelRef = new ArrayList<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef>();
                    }
                    return this.hotelRef;
                }

                /**
                 * Gets the value of the package property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the package property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPackage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<String>();
                    }
                    return this._package;
                }

                /**
                 * Gets the value of the pointOfInterest property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest }
                 *     
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest getPointOfInterest() {
                    return pointOfInterest;
                }

                /**
                 * Sets the value of the pointOfInterest property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest }
                 *     
                 */
                public void setPointOfInterest(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest value) {
                    this.pointOfInterest = value;
                }

                /**
                 * Gets the value of the propertyType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the propertyType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPropertyType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPropertyType() {
                    if (propertyType == null) {
                        propertyType = new ArrayList<String>();
                    }
                    return this.propertyType;
                }

                /**
                 * Gets the value of the refPoint property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the refPoint property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRefPoint().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.RefPoint }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.RefPoint> getRefPoint() {
                    if (refPoint == null) {
                        refPoint = new ArrayList<OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.RefPoint>();
                    }
                    return this.refPoint;
                }

                /**
                 * Gets the value of the roomAmenity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the roomAmenity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRoomAmenity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getRoomAmenity() {
                    if (roomAmenity == null) {
                        roomAmenity = new ArrayList<String>();
                    }
                    return this.roomAmenity;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cityName",
                    "countryCode",
                    "postalCode",
                    "streetNmbr"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected String cityName;
                    @XmlElement(name = "CountryCode")
                    protected String countryCode;
                    @XmlElement(name = "PostalCode")
                    protected String postalCode;
                    @XmlElement(name = "StreetNmbr")
                    protected String streetNmbr;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityName(String value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the postalCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPostalCode() {
                        return postalCode;
                    }

                    /**
                     * Sets the value of the postalCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPostalCode(String value) {
                        this.postalCode = value;
                    }

                    /**
                     * Gets the value of the streetNmbr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStreetNmbr() {
                        return streetNmbr;
                    }

                    /**
                     * Sets the value of the streetNmbr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStreetNmbr(String value) {
                        this.streetNmbr = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Award {

                    @XmlAttribute(name = "Provider")
                    protected String provider;
                    @XmlAttribute(name = "Rating")
                    protected BigInteger rating;

                    /**
                     * Gets the value of the provider property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProvider() {
                        return provider;
                    }

                    /**
                     * Sets the value of the provider property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProvider(String value) {
                        this.provider = value;
                    }

                    /**
                     * Gets the value of the rating property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRating() {
                        return rating;
                    }

                    /**
                     * Sets the value of the rating property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRating(BigInteger value) {
                        this.rating = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="ContactNumber"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "contactNumber"
                })
                public static class ContactNumbers {

                    @XmlElement(name = "ContactNumber", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber contactNumber;

                    /**
                     * Gets the value of the contactNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber }
                     *     
                     */
                    public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber getContactNumber() {
                        return contactNumber;
                    }

                    /**
                     * Sets the value of the contactNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber }
                     *     
                     */
                    public void setContactNumber(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber value) {
                        this.contactNumber = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ContactNumber {

                        @XmlAttribute(name = "Phone", required = true)
                        protected String phone;

                        /**
                         * Gets the value of the phone property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPhone() {
                            return phone;
                        }

                        /**
                         * Sets the value of the phone property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPhone(String value) {
                            this.phone = value;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="FireSafetyApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *       &lt;attribute name="AirportTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelFeature {

                    @XmlAttribute(name = "FireSafetyApproved")
                    protected Boolean fireSafetyApproved;
                    @XmlAttribute(name = "AirportTransportation")
                    protected Boolean airportTransportation;

                    /**
                     * Gets the value of the fireSafetyApproved property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isFireSafetyApproved() {
                        return fireSafetyApproved;
                    }

                    /**
                     * Sets the value of the fireSafetyApproved property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setFireSafetyApproved(Boolean value) {
                        this.fireSafetyApproved = value;
                    }

                    /**
                     * Gets the value of the airportTransportation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isAirportTransportation() {
                        return airportTransportation;
                    }

                    /**
                     * Sets the value of the airportTransportation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setAirportTransportation(Boolean value) {
                        this.airportTransportation = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="UnitOfMeasure"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;enumeration value="KM"/&gt;
                 *             &lt;enumeration value="MI"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelRef {

                    @XmlAttribute(name = "ChainCode")
                    protected String chainCode;
                    @XmlAttribute(name = "UnitOfMeasure")
                    protected String unitOfMeasure;
                    @XmlAttribute(name = "HotelCityCode")
                    protected String hotelCityCode;
                    @XmlAttribute(name = "HotelCode")
                    protected String hotelCode;
                    @XmlAttribute(name = "HotelName")
                    protected String hotelName;
                    @XmlAttribute(name = "Latitude")
                    protected String latitude;
                    @XmlAttribute(name = "Longitude")
                    protected String longitude;

                    /**
                     * Gets the value of the chainCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChainCode() {
                        return chainCode;
                    }

                    /**
                     * Sets the value of the chainCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChainCode(String value) {
                        this.chainCode = value;
                    }

                    /**
                     * Gets the value of the unitOfMeasure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitOfMeasure() {
                        return unitOfMeasure;
                    }

                    /**
                     * Sets the value of the unitOfMeasure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitOfMeasure(String value) {
                        this.unitOfMeasure = value;
                    }

                    /**
                     * Gets the value of the hotelCityCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelCityCode() {
                        return hotelCityCode;
                    }

                    /**
                     * Sets the value of the hotelCityCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelCityCode(String value) {
                        this.hotelCityCode = value;
                    }

                    /**
                     * Gets the value of the hotelCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelCode() {
                        return hotelCode;
                    }

                    /**
                     * Sets the value of the hotelCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelCode(String value) {
                        this.hotelCode = value;
                    }

                    /**
                     * Gets the value of the hotelName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelName() {
                        return hotelName;
                    }

                    /**
                     * Sets the value of the hotelName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelName(String value) {
                        this.hotelName = value;
                    }

                    /**
                     * Gets the value of the latitude property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLatitude() {
                        return latitude;
                    }

                    /**
                     * Sets the value of the latitude property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLatitude(String value) {
                        this.latitude = value;
                    }

                    /**
                     * Gets the value of the longitude property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLongitude() {
                        return longitude;
                    }

                    /**
                     * Sets the value of the longitude property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLongitude(String value) {
                        this.longitude = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="NonUS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/simpleContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class PointOfInterest {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "CountryStateCode")
                    protected String countryStateCode;
                    @XmlAttribute(name = "NonUS")
                    protected Boolean nonUS;
                    @XmlAttribute(name = "RPH")
                    protected BigInteger rph;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the countryStateCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryStateCode() {
                        return countryStateCode;
                    }

                    /**
                     * Sets the value of the countryStateCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryStateCode(String value) {
                        this.countryStateCode = value;
                    }

                    /**
                     * Gets the value of the nonUS property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isNonUS() {
                        return nonUS;
                    }

                    /**
                     * Sets the value of the nonUS property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setNonUS(Boolean value) {
                        this.nonUS = value;
                    }

                    /**
                     * Gets the value of the rph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRPH() {
                        return rph;
                    }

                    /**
                     * Sets the value of the rph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRPH(BigInteger value) {
                        this.rph = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="DistanceDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="GeoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Index"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;enumeration value="A"/&gt;
                 *             &lt;enumeration value="C"/&gt;
                 *             &lt;enumeration value="R"/&gt;
                 *             &lt;enumeration value="S"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RefPoint {

                    @XmlAttribute(name = "DistanceDirection")
                    protected String distanceDirection;
                    @XmlAttribute(name = "GeoCode")
                    protected Boolean geoCode;
                    @XmlAttribute(name = "HotelCode")
                    protected String hotelCode;
                    @XmlAttribute(name = "Index")
                    protected String index;
                    @XmlAttribute(name = "Sort")
                    protected Boolean sort;

                    /**
                     * Gets the value of the distanceDirection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDistanceDirection() {
                        return distanceDirection;
                    }

                    /**
                     * Sets the value of the distanceDirection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDistanceDirection(String value) {
                        this.distanceDirection = value;
                    }

                    /**
                     * Gets the value of the geoCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isGeoCode() {
                        return geoCode;
                    }

                    /**
                     * Sets the value of the geoCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setGeoCode(Boolean value) {
                        this.geoCode = value;
                    }

                    /**
                     * Gets the value of the hotelCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelCode() {
                        return hotelCode;
                    }

                    /**
                     * Sets the value of the hotelCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelCode(String value) {
                        this.hotelCode = value;
                    }

                    /**
                     * Gets the value of the index property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndex() {
                        return index;
                    }

                    /**
                     * Sets the value of the index property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndex(String value) {
                        this.index = value;
                    }

                    /**
                     * Gets the value of the sort property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSort() {
                        return sort;
                    }

                    /**
                     * Sets the value of the sort property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSort(Boolean value) {
                        this.sort = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Source"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="BookingChannel"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CompanyName"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Division" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "source"
        })
        public static class POS {

            @XmlElement(name = "Source", required = true)
            protected OTAHotelAvailRQ.AvailRequestSegment.POS.Source source;

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source }
             *     
             */
            public OTAHotelAvailRQ.AvailRequestSegment.POS.Source getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source }
             *     
             */
            public void setSource(OTAHotelAvailRQ.AvailRequestSegment.POS.Source value) {
                this.source = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="BookingChannel"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CompanyName"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Division" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bookingChannel"
            })
            public static class Source {

                @XmlElement(name = "BookingChannel", required = true)
                protected OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel bookingChannel;

                /**
                 * Gets the value of the bookingChannel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel }
                 *     
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel getBookingChannel() {
                    return bookingChannel;
                }

                /**
                 * Sets the value of the bookingChannel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel }
                 *     
                 */
                public void setBookingChannel(OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel value) {
                    this.bookingChannel = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="CompanyName"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Division" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "companyName"
                })
                public static class BookingChannel {

                    @XmlElement(name = "CompanyName", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName companyName;

                    /**
                     * Gets the value of the companyName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName }
                     *     
                     */
                    public OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName getCompanyName() {
                        return companyName;
                    }

                    /**
                     * Sets the value of the companyName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName }
                     *     
                     */
                    public void setCompanyName(OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName value) {
                        this.companyName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="Division" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class CompanyName {

                        @XmlAttribute(name = "Division", required = true)
                        protected String division;

                        /**
                         * Gets the value of the division property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDivision() {
                            return division;
                        }

                        /**
                         * Sets the value of the division property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDivision(String value) {
                            this.division = value;
                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ContractNegotiatedRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="8" minOccurs="0"/&gt;
         *         &lt;element name="RateAccessCode" maxOccurs="3" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element name="RateRange" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PromotionalSpot"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="C"/&gt;
         *             &lt;enumeration value="L"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="RateAssured" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="SuppressRackRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contractNegotiatedRateCode",
            "rateAccessCode",
            "ratePlanCode",
            "rateRange"
        })
        public static class RatePlanCandidates {

            @XmlElement(name = "ContractNegotiatedRateCode")
            protected List<String> contractNegotiatedRateCode;
            @XmlElement(name = "RateAccessCode")
            protected List<OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateAccessCode> rateAccessCode;
            @XmlElement(name = "RatePlanCode")
            protected List<String> ratePlanCode;
            @XmlElement(name = "RateRange")
            protected OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange rateRange;
            @XmlAttribute(name = "PromotionalSpot")
            protected String promotionalSpot;
            @XmlAttribute(name = "RateAssured")
            protected Boolean rateAssured;
            @XmlAttribute(name = "SuppressRackRate")
            protected Boolean suppressRackRate;

            /**
             * Gets the value of the contractNegotiatedRateCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contractNegotiatedRateCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContractNegotiatedRateCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getContractNegotiatedRateCode() {
                if (contractNegotiatedRateCode == null) {
                    contractNegotiatedRateCode = new ArrayList<String>();
                }
                return this.contractNegotiatedRateCode;
            }

            /**
             * Gets the value of the rateAccessCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rateAccessCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRateAccessCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateAccessCode }
             * 
             * 
             */
            public List<OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateAccessCode> getRateAccessCode() {
                if (rateAccessCode == null) {
                    rateAccessCode = new ArrayList<OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateAccessCode>();
                }
                return this.rateAccessCode;
            }

            /**
             * Gets the value of the ratePlanCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ratePlanCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRatePlanCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRatePlanCode() {
                if (ratePlanCode == null) {
                    ratePlanCode = new ArrayList<String>();
                }
                return this.ratePlanCode;
            }

            /**
             * Gets the value of the rateRange property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange }
             *     
             */
            public OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange getRateRange() {
                return rateRange;
            }

            /**
             * Sets the value of the rateRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange }
             *     
             */
            public void setRateRange(OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange value) {
                this.rateRange = value;
            }

            /**
             * Gets the value of the promotionalSpot property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromotionalSpot() {
                return promotionalSpot;
            }

            /**
             * Sets the value of the promotionalSpot property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromotionalSpot(String value) {
                this.promotionalSpot = value;
            }

            /**
             * Gets the value of the rateAssured property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRateAssured() {
                return rateAssured;
            }

            /**
             * Sets the value of the rateAssured property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRateAssured(Boolean value) {
                this.rateAssured = value;
            }

            /**
             * Gets the value of the suppressRackRate property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSuppressRackRate() {
                return suppressRackRate;
            }

            /**
             * Sets the value of the suppressRackRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSuppressRackRate(Boolean value) {
                this.suppressRackRate = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class RateAccessCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Code", required = true)
                protected String code;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RateRange {

                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Max")
                protected String max;
                @XmlAttribute(name = "Min")
                protected String min;

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Gets the value of the max property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMax() {
                    return max;
                }

                /**
                 * Sets the value of the max property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMax(String value) {
                    this.max = value;
                }

                /**
                 * Gets the value of the min property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMin() {
                    return min;
                }

                /**
                 * Sets the value of the min property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMin(String value) {
                    this.min = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="End" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" /&gt;
         *       &lt;attribute name="Start" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TimeSpan {

            @XmlAttribute(name = "End", required = true)
            protected String end;
            @XmlAttribute(name = "Start", required = true)
            protected String start;

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

        }

    }

}
