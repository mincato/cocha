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
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
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
@XmlType(name = "", propOrder = { "availRequestSegment" })
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
     * Obtiene el valor de la propiedad availRequestSegment.
     * 
     * @return possible object is {@link OTAHotelAvailRQ.AvailRequestSegment }
     * 
     */
    public OTAHotelAvailRQ.AvailRequestSegment getAvailRequestSegment() {
        return availRequestSegment;
    }

    /**
     * Define el valor de la propiedad availRequestSegment.
     * 
     * @param value
     *            allowed object is {@link OTAHotelAvailRQ.AvailRequestSegment }
     * 
     */
    public void setAvailRequestSegment(OTAHotelAvailRQ.AvailRequestSegment value) {
        this.availRequestSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad returnHostCommand.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Define el valor de la propiedad returnHostCommand.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStamp.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return possible object is {@link String }
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
     * Define el valor de la propiedad version.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     * 
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
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
    @XmlType(name = "", propOrder = { "additionalAvail", "customer", "guestCounts", "hotelSearchCriteria", "pos",
            "ratePlanCandidates", "timeSpan" })
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
         * Obtiene el valor de la propiedad additionalAvail.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail getAdditionalAvail() {
            return additionalAvail;
        }

        /**
         * Define el valor de la propiedad additionalAvail.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail }
         * 
         */
        public void setAdditionalAvail(OTAHotelAvailRQ.AvailRequestSegment.AdditionalAvail value) {
            this.additionalAvail = value;
        }

        /**
         * Obtiene el valor de la propiedad customer.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.Customer }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.Customer getCustomer() {
            return customer;
        }

        /**
         * Define el valor de la propiedad customer.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.Customer }
         * 
         */
        public void setCustomer(OTAHotelAvailRQ.AvailRequestSegment.Customer value) {
            this.customer = value;
        }

        /**
         * Obtiene el valor de la propiedad guestCounts.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.GuestCounts }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.GuestCounts getGuestCounts() {
            return guestCounts;
        }

        /**
         * Define el valor de la propiedad guestCounts.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.GuestCounts }
         * 
         */
        public void setGuestCounts(OTAHotelAvailRQ.AvailRequestSegment.GuestCounts value) {
            this.guestCounts = value;
        }

        /**
         * Obtiene el valor de la propiedad hotelSearchCriteria.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * Define el valor de la propiedad hotelSearchCriteria.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria }
         * 
         */
        public void setHotelSearchCriteria(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
        }

        /**
         * Obtiene el valor de la propiedad pos.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.POS }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.POS getPOS() {
            return pos;
        }

        /**
         * Define el valor de la propiedad pos.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.POS }
         * 
         */
        public void setPOS(OTAHotelAvailRQ.AvailRequestSegment.POS value) {
            this.pos = value;
        }

        /**
         * Obtiene el valor de la propiedad ratePlanCandidates.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * Define el valor de la propiedad ratePlanCandidates.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates }
         * 
         */
        public void setRatePlanCandidates(OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates value) {
            this.ratePlanCandidates = value;
        }

        /**
         * Obtiene el valor de la propiedad timeSpan.
         * 
         * @return possible object is
         *         {@link OTAHotelAvailRQ.AvailRequestSegment.TimeSpan }
         * 
         */
        public OTAHotelAvailRQ.AvailRequestSegment.TimeSpan getTimeSpan() {
            return timeSpan;
        }

        /**
         * Define el valor de la propiedad timeSpan.
         * 
         * @param value
         *            allowed object is
         *            {@link OTAHotelAvailRQ.AvailRequestSegment.TimeSpan }
         * 
         */
        public void setTimeSpan(OTAHotelAvailRQ.AvailRequestSegment.TimeSpan value) {
            this.timeSpan = value;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
             * Obtiene el valor de la propiedad ind.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Define el valor de la propiedad ind.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
            }

        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
        @XmlType(name = "", propOrder = { "corporate", "id" })
        public static class Customer {

            @XmlElement(name = "Corporate")
            protected OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate corporate;
            @XmlElement(name = "ID")
            protected OTAHotelAvailRQ.AvailRequestSegment.Customer.ID id;

            /**
             * Obtiene el valor de la propiedad corporate.
             * 
             * @return possible object is
             *         {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate }
             * 
             */
            public OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate getCorporate() {
                return corporate;
            }

            /**
             * Define el valor de la propiedad corporate.
             * 
             * @param value
             *            allowed object is
             *            {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate }
             * 
             */
            public void setCorporate(OTAHotelAvailRQ.AvailRequestSegment.Customer.Corporate value) {
                this.corporate = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return possible object is
             *         {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.ID }
             * 
             */
            public OTAHotelAvailRQ.AvailRequestSegment.Customer.ID getID() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *            allowed object is
             *            {@link OTAHotelAvailRQ.AvailRequestSegment.Customer.ID }
             * 
             */
            public void setID(OTAHotelAvailRQ.AvailRequestSegment.Customer.ID value) {
                this.id = value;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             * 
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
            @XmlType(name = "", propOrder = { "id" })
            public static class Corporate {

                @XmlElement(name = "ID", required = true)
                protected String id;

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setID(String value) {
                    this.id = value;
                }

            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             * 
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
            @XmlType(name = "", propOrder = { "number" })
            public static class ID {

                @XmlElement(name = "Number", required = true)
                protected String number;

                /**
                 * Obtiene el valor de la propiedad number.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Define el valor de la propiedad number.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

            }

        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
             * Obtiene el valor de la propiedad count.
             * 
             * @return possible object is {@link BigInteger }
             * 
             */
            public BigInteger getCount() {
                return count;
            }

            /**
             * Define el valor de la propiedad count.
             * 
             * @param value
             *            allowed object is {@link BigInteger }
             * 
             */
            public void setCount(BigInteger value) {
                this.count = value;
            }

        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
        @XmlType(name = "", propOrder = { "criterion" })
        public static class HotelSearchCriteria {

            @XmlElement(name = "Criterion")
            protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion criterion;
            @XmlAttribute(name = "NumProperties")
            protected BigInteger numProperties;

            /**
             * Obtiene el valor de la propiedad criterion.
             * 
             * @return possible object is
             *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion }
             * 
             */
            public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion getCriterion() {
                return criterion;
            }

            /**
             * Define el valor de la propiedad criterion.
             * 
             * @param value
             *            allowed object is
             *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion }
             * 
             */
            public void setCriterion(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion value) {
                this.criterion = value;
            }

            /**
             * Obtiene el valor de la propiedad numProperties.
             * 
             * @return possible object is {@link BigInteger }
             * 
             */
            public BigInteger getNumProperties() {
                return numProperties;
            }

            /**
             * Define el valor de la propiedad numProperties.
             * 
             * @param value
             *            allowed object is {@link BigInteger }
             * 
             */
            public void setNumProperties(BigInteger value) {
                this.numProperties = value;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             * 
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
            @XmlType(name = "", propOrder = { "address", "award", "contactNumbers", "commissionProgram",
                    "hotelAmenity", "hotelFeature", "hotelRef", "_package", "pointOfInterest", "propertyType",
                    "refPoint", "roomAmenity" })
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
                 * Obtiene el valor de la propiedad address.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address }
                 * 
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address getAddress() {
                    return address;
                }

                /**
                 * Define el valor de la propiedad address.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address }
                 * 
                 */
                public void setAddress(OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Address value) {
                    this.address = value;
                }

                /**
                 * Obtiene el valor de la propiedad award.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award }
                 * 
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award getAward() {
                    return award;
                }

                /**
                 * Define el valor de la propiedad award.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.Award }
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
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * contactNumbers property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getContactNumbers().add(newItem);
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
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * commissionProgram property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getCommissionProgram().add(newItem);
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
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * hotelAmenity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getHotelAmenity().add(newItem);
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
                 * Obtiene el valor de la propiedad hotelFeature.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature }
                 * 
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature getHotelFeature() {
                    return hotelFeature;
                }

                /**
                 * Define el valor de la propiedad hotelFeature.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature }
                 * 
                 */
                public void setHotelFeature(
                        OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelFeature value) {
                    this.hotelFeature = value;
                }

                /**
                 * Gets the value of the hotelRef property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the hotelRef
                 * property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getHotelRef().add(newItem);
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
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the package
                 * property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getPackage().add(newItem);
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
                 * Obtiene el valor de la propiedad pointOfInterest.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest }
                 * 
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest getPointOfInterest() {
                    return pointOfInterest;
                }

                /**
                 * Define el valor de la propiedad pointOfInterest.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest }
                 * 
                 */
                public void setPointOfInterest(
                        OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.PointOfInterest value) {
                    this.pointOfInterest = value;
                }

                /**
                 * Gets the value of the propertyType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * propertyType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getPropertyType().add(newItem);
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
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the refPoint
                 * property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getRefPoint().add(newItem);
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
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * roomAmenity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getRoomAmenity().add(newItem);
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
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                @XmlType(name = "", propOrder = { "cityName", "countryCode", "postalCode", "streetNmbr" })
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
                     * Obtiene el valor de la propiedad cityName.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getCityName() {
                        return cityName;
                    }

                    /**
                     * Define el valor de la propiedad cityName.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setCityName(String value) {
                        this.cityName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad countryCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Define el valor de la propiedad countryCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad postalCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getPostalCode() {
                        return postalCode;
                    }

                    /**
                     * Define el valor de la propiedad postalCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setPostalCode(String value) {
                        this.postalCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad streetNmbr.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getStreetNmbr() {
                        return streetNmbr;
                    }

                    /**
                     * Define el valor de la propiedad streetNmbr.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setStreetNmbr(String value) {
                        this.streetNmbr = value;
                    }

                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                     * Obtiene el valor de la propiedad provider.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getProvider() {
                        return provider;
                    }

                    /**
                     * Define el valor de la propiedad provider.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setProvider(String value) {
                        this.provider = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rating.
                     * 
                     * @return possible object is {@link BigInteger }
                     * 
                     */
                    public BigInteger getRating() {
                        return rating;
                    }

                    /**
                     * Define el valor de la propiedad rating.
                     * 
                     * @param value
                     *            allowed object is {@link BigInteger }
                     * 
                     */
                    public void setRating(BigInteger value) {
                        this.rating = value;
                    }

                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                @XmlType(name = "", propOrder = { "contactNumber" })
                public static class ContactNumbers {

                    @XmlElement(name = "ContactNumber", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber contactNumber;

                    /**
                     * Obtiene el valor de la propiedad contactNumber.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber }
                     * 
                     */
                    public OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber getContactNumber() {
                        return contactNumber;
                    }

                    /**
                     * Define el valor de la propiedad contactNumber.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber }
                     * 
                     */
                    public void setContactNumber(
                            OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.ContactNumbers.ContactNumber value) {
                        this.contactNumber = value;
                    }

                    /**
                     * <p>
                     * Clase Java para anonymous complex type.
                     * 
                     * <p>
                     * El siguiente fragmento de esquema especifica el contenido
                     * que se espera que haya en esta clase.
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
                         * Obtiene el valor de la propiedad phone.
                         * 
                         * @return possible object is {@link String }
                         * 
                         */
                        public String getPhone() {
                            return phone;
                        }

                        /**
                         * Define el valor de la propiedad phone.
                         * 
                         * @param value
                         *            allowed object is {@link String }
                         * 
                         */
                        public void setPhone(String value) {
                            this.phone = value;
                        }

                    }

                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                     * Obtiene el valor de la propiedad fireSafetyApproved.
                     * 
                     * @return possible object is {@link Boolean }
                     * 
                     */
                    public Boolean isFireSafetyApproved() {
                        return fireSafetyApproved;
                    }

                    /**
                     * Define el valor de la propiedad fireSafetyApproved.
                     * 
                     * @param value
                     *            allowed object is {@link Boolean }
                     * 
                     */
                    public void setFireSafetyApproved(Boolean value) {
                        this.fireSafetyApproved = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad airportTransportation.
                     * 
                     * @return possible object is {@link Boolean }
                     * 
                     */
                    public Boolean isAirportTransportation() {
                        return airportTransportation;
                    }

                    /**
                     * Define el valor de la propiedad airportTransportation.
                     * 
                     * @param value
                     *            allowed object is {@link Boolean }
                     * 
                     */
                    public void setAirportTransportation(Boolean value) {
                        this.airportTransportation = value;
                    }

                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                     * Obtiene el valor de la propiedad chainCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getChainCode() {
                        return chainCode;
                    }

                    /**
                     * Define el valor de la propiedad chainCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setChainCode(String value) {
                        this.chainCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad unitOfMeasure.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getUnitOfMeasure() {
                        return unitOfMeasure;
                    }

                    /**
                     * Define el valor de la propiedad unitOfMeasure.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setUnitOfMeasure(String value) {
                        this.unitOfMeasure = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad hotelCityCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getHotelCityCode() {
                        return hotelCityCode;
                    }

                    /**
                     * Define el valor de la propiedad hotelCityCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setHotelCityCode(String value) {
                        this.hotelCityCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad hotelCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getHotelCode() {
                        return hotelCode;
                    }

                    /**
                     * Define el valor de la propiedad hotelCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setHotelCode(String value) {
                        this.hotelCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad hotelName.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getHotelName() {
                        return hotelName;
                    }

                    /**
                     * Define el valor de la propiedad hotelName.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setHotelName(String value) {
                        this.hotelName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad latitude.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getLatitude() {
                        return latitude;
                    }

                    /**
                     * Define el valor de la propiedad latitude.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setLatitude(String value) {
                        this.latitude = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad longitude.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getLongitude() {
                        return longitude;
                    }

                    /**
                     * Define el valor de la propiedad longitude.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setLongitude(String value) {
                        this.longitude = value;
                    }

                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                @XmlType(name = "", propOrder = { "value" })
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
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad countryStateCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getCountryStateCode() {
                        return countryStateCode;
                    }

                    /**
                     * Define el valor de la propiedad countryStateCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setCountryStateCode(String value) {
                        this.countryStateCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nonUS.
                     * 
                     * @return possible object is {@link Boolean }
                     * 
                     */
                    public Boolean isNonUS() {
                        return nonUS;
                    }

                    /**
                     * Define el valor de la propiedad nonUS.
                     * 
                     * @param value
                     *            allowed object is {@link Boolean }
                     * 
                     */
                    public void setNonUS(Boolean value) {
                        this.nonUS = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rph.
                     * 
                     * @return possible object is {@link BigInteger }
                     * 
                     */
                    public BigInteger getRPH() {
                        return rph;
                    }

                    /**
                     * Define el valor de la propiedad rph.
                     * 
                     * @param value
                     *            allowed object is {@link BigInteger }
                     * 
                     */
                    public void setRPH(BigInteger value) {
                        this.rph = value;
                    }

                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                     * Obtiene el valor de la propiedad distanceDirection.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getDistanceDirection() {
                        return distanceDirection;
                    }

                    /**
                     * Define el valor de la propiedad distanceDirection.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setDistanceDirection(String value) {
                        this.distanceDirection = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad geoCode.
                     * 
                     * @return possible object is {@link Boolean }
                     * 
                     */
                    public Boolean isGeoCode() {
                        return geoCode;
                    }

                    /**
                     * Define el valor de la propiedad geoCode.
                     * 
                     * @param value
                     *            allowed object is {@link Boolean }
                     * 
                     */
                    public void setGeoCode(Boolean value) {
                        this.geoCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad hotelCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getHotelCode() {
                        return hotelCode;
                    }

                    /**
                     * Define el valor de la propiedad hotelCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setHotelCode(String value) {
                        this.hotelCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad index.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getIndex() {
                        return index;
                    }

                    /**
                     * Define el valor de la propiedad index.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setIndex(String value) {
                        this.index = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sort.
                     * 
                     * @return possible object is {@link Boolean }
                     * 
                     */
                    public Boolean isSort() {
                        return sort;
                    }

                    /**
                     * Define el valor de la propiedad sort.
                     * 
                     * @param value
                     *            allowed object is {@link Boolean }
                     * 
                     */
                    public void setSort(Boolean value) {
                        this.sort = value;
                    }

                }

            }

        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
        @XmlType(name = "", propOrder = { "source" })
        public static class POS {

            @XmlElement(name = "Source", required = true)
            protected OTAHotelAvailRQ.AvailRequestSegment.POS.Source source;

            /**
             * Obtiene el valor de la propiedad source.
             * 
             * @return possible object is
             *         {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source }
             * 
             */
            public OTAHotelAvailRQ.AvailRequestSegment.POS.Source getSource() {
                return source;
            }

            /**
             * Define el valor de la propiedad source.
             * 
             * @param value
             *            allowed object is
             *            {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source }
             * 
             */
            public void setSource(OTAHotelAvailRQ.AvailRequestSegment.POS.Source value) {
                this.source = value;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             * 
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
            @XmlType(name = "", propOrder = { "bookingChannel" })
            public static class Source {

                @XmlElement(name = "BookingChannel", required = true)
                protected OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel bookingChannel;

                /**
                 * Obtiene el valor de la propiedad bookingChannel.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel }
                 * 
                 */
                public OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel getBookingChannel() {
                    return bookingChannel;
                }

                /**
                 * Define el valor de la propiedad bookingChannel.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel }
                 * 
                 */
                public void setBookingChannel(OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel value) {
                    this.bookingChannel = value;
                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 * 
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                @XmlType(name = "", propOrder = { "companyName" })
                public static class BookingChannel {

                    @XmlElement(name = "CompanyName", required = true)
                    protected OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName companyName;

                    /**
                     * Obtiene el valor de la propiedad companyName.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName }
                     * 
                     */
                    public OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName getCompanyName() {
                        return companyName;
                    }

                    /**
                     * Define el valor de la propiedad companyName.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName }
                     * 
                     */
                    public void setCompanyName(
                            OTAHotelAvailRQ.AvailRequestSegment.POS.Source.BookingChannel.CompanyName value) {
                        this.companyName = value;
                    }

                    /**
                     * <p>
                     * Clase Java para anonymous complex type.
                     * 
                     * <p>
                     * El siguiente fragmento de esquema especifica el contenido
                     * que se espera que haya en esta clase.
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
                         * Obtiene el valor de la propiedad division.
                         * 
                         * @return possible object is {@link String }
                         * 
                         */
                        public String getDivision() {
                            return division;
                        }

                        /**
                         * Define el valor de la propiedad division.
                         * 
                         * @param value
                         *            allowed object is {@link String }
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
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
        @XmlType(name = "", propOrder = { "contractNegotiatedRateCode", "rateAccessCode", "ratePlanCode", "rateRange" })
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
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the contractNegotiatedRateCode
             * property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getContractNegotiatedRateCode().add(newItem);
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
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the rateAccessCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getRateAccessCode().add(newItem);
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
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the ratePlanCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getRatePlanCode().add(newItem);
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
             * Obtiene el valor de la propiedad rateRange.
             * 
             * @return possible object is
             *         {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange }
             * 
             */
            public OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange getRateRange() {
                return rateRange;
            }

            /**
             * Define el valor de la propiedad rateRange.
             * 
             * @param value
             *            allowed object is
             *            {@link OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange }
             * 
             */
            public void setRateRange(OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange value) {
                this.rateRange = value;
            }

            /**
             * Obtiene el valor de la propiedad promotionalSpot.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getPromotionalSpot() {
                return promotionalSpot;
            }

            /**
             * Define el valor de la propiedad promotionalSpot.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setPromotionalSpot(String value) {
                this.promotionalSpot = value;
            }

            /**
             * Obtiene el valor de la propiedad rateAssured.
             * 
             * @return possible object is {@link Boolean }
             * 
             */
            public Boolean isRateAssured() {
                return rateAssured;
            }

            /**
             * Define el valor de la propiedad rateAssured.
             * 
             * @param value
             *            allowed object is {@link Boolean }
             * 
             */
            public void setRateAssured(Boolean value) {
                this.rateAssured = value;
            }

            /**
             * Obtiene el valor de la propiedad suppressRackRate.
             * 
             * @return possible object is {@link Boolean }
             * 
             */
            public Boolean isSuppressRackRate() {
                return suppressRackRate;
            }

            /**
             * Define el valor de la propiedad suppressRackRate.
             * 
             * @param value
             *            allowed object is {@link Boolean }
             * 
             */
            public void setSuppressRackRate(Boolean value) {
                this.suppressRackRate = value;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             * 
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
            @XmlType(name = "", propOrder = { "value" })
            public static class RateAccessCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Code", required = true)
                protected String code;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad code.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Define el valor de la propiedad code.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setCode(String value) {
                    this.code = value;
                }

            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             * 
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
                 * Obtiene el valor de la propiedad currencyCode.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Define el valor de la propiedad currencyCode.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad max.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getMax() {
                    return max;
                }

                /**
                 * Define el valor de la propiedad max.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setMax(String value) {
                    this.max = value;
                }

                /**
                 * Obtiene el valor de la propiedad min.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getMin() {
                    return min;
                }

                /**
                 * Define el valor de la propiedad min.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setMin(String value) {
                    this.min = value;
                }

            }

        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
             * Obtiene el valor de la propiedad end.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getEnd() {
                return end;
            }

            /**
             * Define el valor de la propiedad end.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * Obtiene el valor de la propiedad start.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getStart() {
                return start;
            }

            /**
             * Define el valor de la propiedad start.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setStart(String value) {
                this.start = value;
            }

        }

    }

}
