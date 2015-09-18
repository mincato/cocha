package com.sabre.webservices.sabrexml._2011._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sabre.services.stl.v01.ApplicationResults;

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
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/&gt;
 *         &lt;element name="AdditionalAvail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AvailabilityOptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AvailabilityOption" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BasicPropertyInfo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Address" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ContactNumbers" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ContactNumber" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ContractualRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="DirectConnect" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Alt_Avail" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="DC_AvailParticipant" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="DC_SellParticipant" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RatesExceedMax" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="UnAvail" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="LocationDescription" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NegotiatedRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Property" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PropertyOptionInfo" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ADA_Accessible" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="AdultsOnly" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="BeachFront" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Breakfast" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="BusinessCenter" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="BusinessReady" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Conventions" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Dataport" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Dining" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="DryClean" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="EcoCertified" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ExecutiveFloors" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FitnessCenter" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FreeLocalCalls" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FreeParking" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FreeShuttle" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FreeWifiInMeetingRooms" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FreeWifiInPublicSpaces" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FreeWifiInRooms" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="FullServiceSpa" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="GameFacilities" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Golf" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="HighSpeedInternet" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="HypoallergenicRooms" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="IndoorPool" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="InRoomCoffeeTea" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="InRoomMiniBar" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="InRoomRefrigerator" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="InRoomSafe" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="InteriorDoorways" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Jacuzzi" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="KidsFacilities" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="KitchenFacilities" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="MealService" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="MeetingFacilities" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="NoAdultTV" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="NonSmoking" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="OutdoorPool" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Pets" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Pool" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PublicTransportationAdjacent" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RateAssured" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Recreation" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RestrictedRoomAccess" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RoomService" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RoomService24Hours" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="RoomsWithBalcony" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SkiInOutProperty" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SmokeFree" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SmokingRoomsAvail" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Tennis" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="WaterPurificationSystem" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Wheelchair" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RateRange" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AdditionalInfo" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CancelPolicy" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                   &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="HotelRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                 &lt;element name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="GuaranteeSurchargeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RateLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="XPM_GuaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SpecialOffers" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="GEO_ConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CityList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Line" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "applicationResults", "additionalAvail", "availabilityOptions", "cityList" })
@XmlRootElement(name = "OTA_HotelAvailRS")
public class OTAHotelAvailRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "AdditionalAvail")
    protected OTAHotelAvailRS.AdditionalAvail additionalAvail;
    @XmlElement(name = "AvailabilityOptions")
    protected OTAHotelAvailRS.AvailabilityOptions availabilityOptions;
    @XmlElement(name = "CityList")
    protected OTAHotelAvailRS.CityList cityList;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad applicationResults.
     * 
     * @return possible object is {@link ApplicationResults }
     * 
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Define el valor de la propiedad applicationResults.
     * 
     * @param value
     *            allowed object is {@link ApplicationResults }
     * 
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAvail.
     * 
     * @return possible object is {@link OTAHotelAvailRS.AdditionalAvail }
     * 
     */
    public OTAHotelAvailRS.AdditionalAvail getAdditionalAvail() {
        return additionalAvail;
    }

    /**
     * Define el valor de la propiedad additionalAvail.
     * 
     * @param value
     *            allowed object is {@link OTAHotelAvailRS.AdditionalAvail }
     * 
     */
    public void setAdditionalAvail(OTAHotelAvailRS.AdditionalAvail value) {
        this.additionalAvail = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilityOptions.
     * 
     * @return possible object is {@link OTAHotelAvailRS.AvailabilityOptions }
     * 
     */
    public OTAHotelAvailRS.AvailabilityOptions getAvailabilityOptions() {
        return availabilityOptions;
    }

    /**
     * Define el valor de la propiedad availabilityOptions.
     * 
     * @param value
     *            allowed object is {@link OTAHotelAvailRS.AvailabilityOptions }
     * 
     */
    public void setAvailabilityOptions(OTAHotelAvailRS.AvailabilityOptions value) {
        this.availabilityOptions = value;
    }

    /**
     * Obtiene el valor de la propiedad cityList.
     * 
     * @return possible object is {@link OTAHotelAvailRS.CityList }
     * 
     */
    public OTAHotelAvailRS.CityList getCityList() {
        return cityList;
    }

    /**
     * Define el valor de la propiedad cityList.
     * 
     * @param value
     *            allowed object is {@link OTAHotelAvailRS.CityList }
     * 
     */
    public void setCityList(OTAHotelAvailRS.CityList value) {
        this.cityList = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVersion() {
        return version;
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
     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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

        @XmlAttribute(name = "Ind")
        protected Boolean ind;

        /**
         * Obtiene el valor de la propiedad ind.
         * 
         * @return possible object is {@link Boolean }
         * 
         */
        public Boolean isInd() {
            return ind;
        }

        /**
         * Define el valor de la propiedad ind.
         * 
         * @param value
         *            allowed object is {@link Boolean }
         * 
         */
        public void setInd(Boolean value) {
            this.ind = value;
        }

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
     *         &lt;element name="AvailabilityOption" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BasicPropertyInfo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Address" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ContactNumbers" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ContactNumber" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ContractualRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="DirectConnect" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Alt_Avail" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="DC_AvailParticipant" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="DC_SellParticipant" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RatesExceedMax" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="UnAvail" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LocationDescription" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NegotiatedRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Property" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PropertyOptionInfo" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ADA_Accessible" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="AdultsOnly" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="BeachFront" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Breakfast" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="BusinessCenter" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="BusinessReady" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Conventions" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Dataport" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Dining" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="DryClean" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="EcoCertified" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ExecutiveFloors" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FitnessCenter" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FreeLocalCalls" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FreeParking" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FreeShuttle" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FreeWifiInMeetingRooms" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FreeWifiInPublicSpaces" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FreeWifiInRooms" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FullServiceSpa" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="GameFacilities" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Golf" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="HighSpeedInternet" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="HypoallergenicRooms" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="IndoorPool" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="InRoomCoffeeTea" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="InRoomMiniBar" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="InRoomRefrigerator" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="InRoomSafe" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="InteriorDoorways" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Jacuzzi" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="KidsFacilities" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="KitchenFacilities" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="MealService" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="MeetingFacilities" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NoAdultTV" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NonSmoking" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="OutdoorPool" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Pets" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Pool" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PublicTransportationAdjacent" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RateAssured" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Recreation" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RestrictedRoomAccess" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RoomService" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RoomService24Hours" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="RoomsWithBalcony" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SkiInOutProperty" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SmokeFree" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SmokingRoomsAvail" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Tennis" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="WaterPurificationSystem" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Wheelchair" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
     *                             &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AdditionalInfo" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CancelPolicy" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                         &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="HotelRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                       &lt;element name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="GuaranteeSurchargeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RateLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="XPM_GuaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="SpecialOffers" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="GEO_ConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @XmlType(name = "", propOrder = { "availabilityOption" })
    public static class AvailabilityOptions {

        @XmlElement(name = "AvailabilityOption")
        protected List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption> availabilityOption;

        /**
         * Gets the value of the availabilityOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the availabilityOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getAvailabilityOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption }
         * 
         * 
         */
        public List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption> getAvailabilityOption() {
            if (availabilityOption == null) {
                availabilityOption = new ArrayList<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption>();
            }
            return this.availabilityOption;
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
         *         &lt;element name="BasicPropertyInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Address" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ContactNumbers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ContactNumber" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ContractualRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="DirectConnect" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Alt_Avail" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="DC_AvailParticipant" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="DC_SellParticipant" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RatesExceedMax" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="UnAvail" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LocationDescription" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NegotiatedRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Property" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PropertyOptionInfo" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ADA_Accessible" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="AdultsOnly" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="BeachFront" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Breakfast" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="BusinessCenter" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="BusinessReady" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Conventions" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Dataport" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Dining" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="DryClean" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="EcoCertified" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="ExecutiveFloors" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FitnessCenter" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FreeLocalCalls" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FreeParking" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FreeShuttle" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FreeWifiInMeetingRooms" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FreeWifiInPublicSpaces" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FreeWifiInRooms" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="FullServiceSpa" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="GameFacilities" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Golf" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="HighSpeedInternet" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="HypoallergenicRooms" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="IndoorPool" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="InRoomCoffeeTea" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="InRoomMiniBar" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="InRoomRefrigerator" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="InRoomSafe" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="InteriorDoorways" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Jacuzzi" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="KidsFacilities" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="KitchenFacilities" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="MealService" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="MeetingFacilities" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="NoAdultTV" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="NonSmoking" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="OutdoorPool" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Pets" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Pool" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="PublicTransportationAdjacent" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RateAssured" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Recreation" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RestrictedRoomAccess" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RoomService" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RoomService24Hours" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="RoomsWithBalcony" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="SkiInOutProperty" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="SmokeFree" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="SmokingRoomsAvail" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Tennis" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="WaterPurificationSystem" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Wheelchair" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
         *                   &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="AdditionalInfo" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CancelPolicy" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                               &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="HotelRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                             &lt;element name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="GuaranteeSurchargeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RateLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="XPM_GuaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="SpecialOffers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="GEO_ConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "basicPropertyInfo" })
        public static class AvailabilityOption {

            @XmlElement(name = "BasicPropertyInfo")
            protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo basicPropertyInfo;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * Obtiene el valor de la propiedad basicPropertyInfo.
             * 
             * @return possible object is
             *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo }
             * 
             */
            public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo getBasicPropertyInfo() {
                return basicPropertyInfo;
            }

            /**
             * Define el valor de la propiedad basicPropertyInfo.
             * 
             * @param value
             *            allowed object is
             *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo }
             * 
             */
            public void setBasicPropertyInfo(
                    OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo value) {
                this.basicPropertyInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad rph.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Define el valor de la propiedad rph.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setRPH(String value) {
                this.rph = value;
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
             *                   &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ContactNumbers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ContactNumber" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ContractualRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="DirectConnect" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Alt_Avail" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="DC_AvailParticipant" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="DC_SellParticipant" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RatesExceedMax" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="UnAvail" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LocationDescription" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NegotiatedRateCodeMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Property" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PropertyOptionInfo" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ADA_Accessible" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="AdultsOnly" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="BeachFront" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Breakfast" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="BusinessCenter" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="BusinessReady" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Conventions" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Dataport" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Dining" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="DryClean" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="EcoCertified" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="ExecutiveFloors" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FitnessCenter" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FreeLocalCalls" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FreeParking" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FreeShuttle" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FreeWifiInMeetingRooms" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FreeWifiInPublicSpaces" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FreeWifiInRooms" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="FullServiceSpa" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="GameFacilities" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Golf" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="HighSpeedInternet" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="HypoallergenicRooms" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="IndoorPool" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="InRoomCoffeeTea" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="InRoomMiniBar" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="InRoomRefrigerator" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="InRoomSafe" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="InteriorDoorways" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Jacuzzi" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="KidsFacilities" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="KitchenFacilities" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="MealService" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="MeetingFacilities" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="NoAdultTV" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="NonSmoking" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="OutdoorPool" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Pets" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Pool" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="PublicTransportationAdjacent" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RateAssured" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Recreation" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RestrictedRoomAccess" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RoomService" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RoomService24Hours" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="RoomsWithBalcony" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="SkiInOutProperty" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="SmokeFree" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="SmokingRoomsAvail" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Tennis" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="WaterPurificationSystem" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Wheelchair" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
             *         &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="AdditionalInfo" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CancelPolicy" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                     &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="HotelRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                   &lt;element name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="GuaranteeSurchargeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RateLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="XPM_GuaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SpecialOffers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="GEO_ConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            @XmlType(name = "", propOrder = { "address", "contactNumbers", "contractualRateCodeMatch", "directConnect",
                    "locationDescription", "negotiatedRateCodeMatch", "property", "propertyOptionInfo", "rateRange",
                    "roomRate", "specialOffers" })
            public static class BasicPropertyInfo {

                @XmlElement(name = "Address")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address address;
                @XmlElement(name = "ContactNumbers")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers contactNumbers;
                @XmlElement(name = "ContractualRateCodeMatch")
                protected String contractualRateCodeMatch;
                @XmlElement(name = "DirectConnect")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect directConnect;
                @XmlElement(name = "LocationDescription")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription locationDescription;
                @XmlElement(name = "NegotiatedRateCodeMatch")
                protected String negotiatedRateCodeMatch;
                @XmlElement(name = "Property")
                protected List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Property> property;
                @XmlElement(name = "PropertyOptionInfo")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo propertyOptionInfo;
                @XmlElement(name = "RateRange")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange rateRange;
                @XmlElement(name = "RoomRate")
                protected List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate> roomRate;
                @XmlElement(name = "SpecialOffers")
                protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers specialOffers;
                @XmlAttribute(name = "AreaID")
                protected String areaID;
                @XmlAttribute(name = "ChainCode")
                protected String chainCode;
                @XmlAttribute(name = "Distance")
                protected String distance;
                @XmlAttribute(name = "GEO_ConfidenceLevel")
                protected String geoConfidenceLevel;
                @XmlAttribute(name = "HotelCode")
                protected String hotelCode;
                @XmlAttribute(name = "HotelCityCode")
                protected String hotelCityCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;
                @XmlAttribute(name = "Latitude")
                protected String latitude;
                @XmlAttribute(name = "Longitude")
                protected String longitude;

                /**
                 * Obtiene el valor de la propiedad address.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address getAddress() {
                    return address;
                }

                /**
                 * Define el valor de la propiedad address.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address }
                 * 
                 */
                public void setAddress(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address value) {
                    this.address = value;
                }

                /**
                 * Obtiene el valor de la propiedad contactNumbers.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers getContactNumbers() {
                    return contactNumbers;
                }

                /**
                 * Define el valor de la propiedad contactNumbers.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers }
                 * 
                 */
                public void setContactNumbers(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers value) {
                    this.contactNumbers = value;
                }

                /**
                 * Obtiene el valor de la propiedad contractualRateCodeMatch.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getContractualRateCodeMatch() {
                    return contractualRateCodeMatch;
                }

                /**
                 * Define el valor de la propiedad contractualRateCodeMatch.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setContractualRateCodeMatch(String value) {
                    this.contractualRateCodeMatch = value;
                }

                /**
                 * Obtiene el valor de la propiedad directConnect.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect getDirectConnect() {
                    return directConnect;
                }

                /**
                 * Define el valor de la propiedad directConnect.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect }
                 * 
                 */
                public void setDirectConnect(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect value) {
                    this.directConnect = value;
                }

                /**
                 * Obtiene el valor de la propiedad locationDescription.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription getLocationDescription() {
                    return locationDescription;
                }

                /**
                 * Define el valor de la propiedad locationDescription.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription }
                 * 
                 */
                public void setLocationDescription(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription value) {
                    this.locationDescription = value;
                }

                /**
                 * Obtiene el valor de la propiedad negotiatedRateCodeMatch.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getNegotiatedRateCodeMatch() {
                    return negotiatedRateCodeMatch;
                }

                /**
                 * Define el valor de la propiedad negotiatedRateCodeMatch.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setNegotiatedRateCodeMatch(String value) {
                    this.negotiatedRateCodeMatch = value;
                }

                /**
                 * Gets the value of the property property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the property
                 * property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Property }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Property> getProperty() {
                    if (property == null) {
                        property = new ArrayList<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Property>();
                    }
                    return this.property;
                }

                /**
                 * Obtiene el valor de la propiedad propertyOptionInfo.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo getPropertyOptionInfo() {
                    return propertyOptionInfo;
                }

                /**
                 * Define el valor de la propiedad propertyOptionInfo.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo }
                 * 
                 */
                public void setPropertyOptionInfo(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo value) {
                    this.propertyOptionInfo = value;
                }

                /**
                 * Obtiene el valor de la propiedad rateRange.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange getRateRange() {
                    return rateRange;
                }

                /**
                 * Define el valor de la propiedad rateRange.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange }
                 * 
                 */
                public void setRateRange(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange value) {
                    this.rateRange = value;
                }

                /**
                 * Gets the value of the roomRate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the roomRate
                 * property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getRoomRate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate> getRoomRate() {
                    if (roomRate == null) {
                        roomRate = new ArrayList<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate>();
                    }
                    return this.roomRate;
                }

                /**
                 * Obtiene el valor de la propiedad specialOffers.
                 * 
                 * @return possible object is
                 *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers }
                 * 
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers getSpecialOffers() {
                    return specialOffers;
                }

                /**
                 * Define el valor de la propiedad specialOffers.
                 * 
                 * @param value
                 *            allowed object is
                 *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers }
                 * 
                 */
                public void setSpecialOffers(
                        OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers value) {
                    this.specialOffers = value;
                }

                /**
                 * Obtiene el valor de la propiedad areaID.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getAreaID() {
                    return areaID;
                }

                /**
                 * Define el valor de la propiedad areaID.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setAreaID(String value) {
                    this.areaID = value;
                }

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
                 * Obtiene el valor de la propiedad distance.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getDistance() {
                    return distance;
                }

                /**
                 * Define el valor de la propiedad distance.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setDistance(String value) {
                    this.distance = value;
                }

                /**
                 * Obtiene el valor de la propiedad geoConfidenceLevel.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getGEOConfidenceLevel() {
                    return geoConfidenceLevel;
                }

                /**
                 * Define el valor de la propiedad geoConfidenceLevel.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setGEOConfidenceLevel(String value) {
                    this.geoConfidenceLevel = value;
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
                 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { "addressLine" })
                public static class Address {

                    @XmlElement(name = "AddressLine")
                    protected List<String> addressLine;

                    /**
                     * Gets the value of the addressLine property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live
                     * list, not a snapshot. Therefore any modification you make
                     * to the returned list will be present inside the JAXB
                     * object. This is why there is not a <CODE>set</CODE>
                     * method for the addressLine property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * 
                     * <pre>
                     * getAddressLine().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getAddressLine() {
                        if (addressLine == null) {
                            addressLine = new ArrayList<String>();
                        }
                        return this.addressLine;
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
                 *         &lt;element name="ContactNumber" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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

                    @XmlElement(name = "ContactNumber")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber contactNumber;

                    /**
                     * Obtiene el valor de la propiedad contactNumber.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber getContactNumber() {
                        return contactNumber;
                    }

                    /**
                     * Define el valor de la propiedad contactNumber.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber }
                     * 
                     */
                    public void setContactNumber(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber value) {
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
                     *       &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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

                        @XmlAttribute(name = "Fax")
                        protected String fax;
                        @XmlAttribute(name = "Phone")
                        protected String phone;

                        /**
                         * Obtiene el valor de la propiedad fax.
                         * 
                         * @return possible object is {@link String }
                         * 
                         */
                        public String getFax() {
                            return fax;
                        }

                        /**
                         * Define el valor de la propiedad fax.
                         * 
                         * @param value
                         *            allowed object is {@link String }
                         * 
                         */
                        public void setFax(String value) {
                            this.fax = value;
                        }

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
                 *       &lt;sequence&gt;
                 *         &lt;element name="Alt_Avail" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="DC_AvailParticipant" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="DC_SellParticipant" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RatesExceedMax" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="UnAvail" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
                @XmlType(name = "", propOrder = { "altAvail", "dcAvailParticipant", "dcSellParticipant",
                        "ratesExceedMax", "unAvail" })
                public static class DirectConnect {

                    @XmlElement(name = "Alt_Avail")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail altAvail;
                    @XmlElement(name = "DC_AvailParticipant")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant dcAvailParticipant;
                    @XmlElement(name = "DC_SellParticipant")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant dcSellParticipant;
                    @XmlElement(name = "RatesExceedMax")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax ratesExceedMax;
                    @XmlElement(name = "UnAvail")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail unAvail;

                    /**
                     * Obtiene el valor de la propiedad altAvail.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail getAltAvail() {
                        return altAvail;
                    }

                    /**
                     * Define el valor de la propiedad altAvail.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail }
                     * 
                     */
                    public void setAltAvail(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail value) {
                        this.altAvail = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dcAvailParticipant.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant getDCAvailParticipant() {
                        return dcAvailParticipant;
                    }

                    /**
                     * Define el valor de la propiedad dcAvailParticipant.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant }
                     * 
                     */
                    public void setDCAvailParticipant(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant value) {
                        this.dcAvailParticipant = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dcSellParticipant.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant getDCSellParticipant() {
                        return dcSellParticipant;
                    }

                    /**
                     * Define el valor de la propiedad dcSellParticipant.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant }
                     * 
                     */
                    public void setDCSellParticipant(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant value) {
                        this.dcSellParticipant = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad ratesExceedMax.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax getRatesExceedMax() {
                        return ratesExceedMax;
                    }

                    /**
                     * Define el valor de la propiedad ratesExceedMax.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax }
                     * 
                     */
                    public void setRatesExceedMax(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax value) {
                        this.ratesExceedMax = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad unAvail.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail getUnAvail() {
                        return unAvail;
                    }

                    /**
                     * Define el valor de la propiedad unAvail.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail }
                     * 
                     */
                    public void setUnAvail(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail value) {
                        this.unAvail = value;
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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AltAvail {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DCAvailParticipant {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DCSellParticipant {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RatesExceedMax {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class UnAvail {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
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
                 *       &lt;sequence&gt;
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { "text" })
                public static class LocationDescription {

                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlAttribute(name = "Code")
                    protected String code;

                    /**
                     * Obtiene el valor de la propiedad text.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Define el valor de la propiedad text.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setText(String value) {
                        this.text = value;
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
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { "text" })
                public static class Property {

                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlAttribute(name = "Rating")
                    protected String rating;

                    /**
                     * Obtiene el valor de la propiedad text.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Define el valor de la propiedad text.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rating.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getRating() {
                        return rating;
                    }

                    /**
                     * Define el valor de la propiedad rating.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setRating(String value) {
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
                 *         &lt;element name="ADA_Accessible" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="AdultsOnly" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="BeachFront" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Breakfast" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="BusinessCenter" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="BusinessReady" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Conventions" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Dataport" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Dining" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="DryClean" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="EcoCertified" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="ExecutiveFloors" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FitnessCenter" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FreeLocalCalls" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FreeParking" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FreeShuttle" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FreeWifiInMeetingRooms" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FreeWifiInPublicSpaces" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FreeWifiInRooms" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="FullServiceSpa" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="GameFacilities" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Golf" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="HighSpeedInternet" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="HypoallergenicRooms" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="IndoorPool" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="InRoomCoffeeTea" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="InRoomMiniBar" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="InRoomRefrigerator" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="InRoomSafe" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="InteriorDoorways" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Jacuzzi" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="KidsFacilities" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="KitchenFacilities" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="MealService" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="MeetingFacilities" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="NoAdultTV" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="NonSmoking" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="OutdoorPool" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Pets" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Pool" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="PublicTransportationAdjacent" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RateAssured" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Recreation" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RestrictedRoomAccess" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RoomService" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RoomService24Hours" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="RoomsWithBalcony" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="SkiInOutProperty" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="SmokeFree" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="SmokingRoomsAvail" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Tennis" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="WaterPurificationSystem" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Wheelchair" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
                @XmlType(name = "", propOrder = { "adaAccessible", "adultsOnly", "beachFront", "breakfast",
                        "businessCenter", "businessReady", "conventions", "dataport", "dining", "dryClean",
                        "ecoCertified", "executiveFloors", "fitnessCenter", "freeLocalCalls", "freeParking",
                        "freeShuttle", "freeWifiInMeetingRooms", "freeWifiInPublicSpaces", "freeWifiInRooms",
                        "fullServiceSpa", "gameFacilities", "golf", "highSpeedInternet", "hypoallergenicRooms",
                        "indoorPool", "inRoomCoffeeTea", "inRoomMiniBar", "inRoomRefrigerator", "inRoomSafe",
                        "interiorDoorways", "jacuzzi", "kidsFacilities", "kitchenFacilities", "mealService",
                        "meetingFacilities", "noAdultTV", "nonSmoking", "outdoorPool", "pets", "pool",
                        "publicTransportationAdjacent", "rateAssured", "recreation", "restrictedRoomAccess",
                        "roomService", "roomService24Hours", "roomsWithBalcony", "skiInOutProperty", "smokeFree",
                        "smokingRoomsAvail", "tennis", "waterPurificationSystem", "wheelchair" })
                public static class PropertyOptionInfo {

                    @XmlElement(name = "ADA_Accessible")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible adaAccessible;
                    @XmlElement(name = "AdultsOnly")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly adultsOnly;
                    @XmlElement(name = "BeachFront")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront beachFront;
                    @XmlElement(name = "Breakfast")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast breakfast;
                    @XmlElement(name = "BusinessCenter")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter businessCenter;
                    @XmlElement(name = "BusinessReady")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady businessReady;
                    @XmlElement(name = "Conventions")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions conventions;
                    @XmlElement(name = "Dataport")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport dataport;
                    @XmlElement(name = "Dining")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining dining;
                    @XmlElement(name = "DryClean")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean dryClean;
                    @XmlElement(name = "EcoCertified")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified ecoCertified;
                    @XmlElement(name = "ExecutiveFloors")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors executiveFloors;
                    @XmlElement(name = "FitnessCenter")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter fitnessCenter;
                    @XmlElement(name = "FreeLocalCalls")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls freeLocalCalls;
                    @XmlElement(name = "FreeParking")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking freeParking;
                    @XmlElement(name = "FreeShuttle")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle freeShuttle;
                    @XmlElement(name = "FreeWifiInMeetingRooms")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms freeWifiInMeetingRooms;
                    @XmlElement(name = "FreeWifiInPublicSpaces")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces freeWifiInPublicSpaces;
                    @XmlElement(name = "FreeWifiInRooms")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms freeWifiInRooms;
                    @XmlElement(name = "FullServiceSpa")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa fullServiceSpa;
                    @XmlElement(name = "GameFacilities")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities gameFacilities;
                    @XmlElement(name = "Golf")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf golf;
                    @XmlElement(name = "HighSpeedInternet")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet highSpeedInternet;
                    @XmlElement(name = "HypoallergenicRooms")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms hypoallergenicRooms;
                    @XmlElement(name = "IndoorPool")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool indoorPool;
                    @XmlElement(name = "InRoomCoffeeTea")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea inRoomCoffeeTea;
                    @XmlElement(name = "InRoomMiniBar")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar inRoomMiniBar;
                    @XmlElement(name = "InRoomRefrigerator")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator inRoomRefrigerator;
                    @XmlElement(name = "InRoomSafe")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe inRoomSafe;
                    @XmlElement(name = "InteriorDoorways")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways interiorDoorways;
                    @XmlElement(name = "Jacuzzi")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi jacuzzi;
                    @XmlElement(name = "KidsFacilities")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities kidsFacilities;
                    @XmlElement(name = "KitchenFacilities")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities kitchenFacilities;
                    @XmlElement(name = "MealService")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService mealService;
                    @XmlElement(name = "MeetingFacilities")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities meetingFacilities;
                    @XmlElement(name = "NoAdultTV")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV noAdultTV;
                    @XmlElement(name = "NonSmoking")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking nonSmoking;
                    @XmlElement(name = "OutdoorPool")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool outdoorPool;
                    @XmlElement(name = "Pets")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets pets;
                    @XmlElement(name = "Pool")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool pool;
                    @XmlElement(name = "PublicTransportationAdjacent")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent publicTransportationAdjacent;
                    @XmlElement(name = "RateAssured")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured rateAssured;
                    @XmlElement(name = "Recreation")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation recreation;
                    @XmlElement(name = "RestrictedRoomAccess")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess restrictedRoomAccess;
                    @XmlElement(name = "RoomService")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService roomService;
                    @XmlElement(name = "RoomService24Hours")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours roomService24Hours;
                    @XmlElement(name = "RoomsWithBalcony")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony roomsWithBalcony;
                    @XmlElement(name = "SkiInOutProperty")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty skiInOutProperty;
                    @XmlElement(name = "SmokeFree")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree smokeFree;
                    @XmlElement(name = "SmokingRoomsAvail")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail smokingRoomsAvail;
                    @XmlElement(name = "Tennis")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis tennis;
                    @XmlElement(name = "WaterPurificationSystem")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem waterPurificationSystem;
                    @XmlElement(name = "Wheelchair")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair wheelchair;

                    /**
                     * Obtiene el valor de la propiedad adaAccessible.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible getADAAccessible() {
                        return adaAccessible;
                    }

                    /**
                     * Define el valor de la propiedad adaAccessible.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible }
                     * 
                     */
                    public void setADAAccessible(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible value) {
                        this.adaAccessible = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad adultsOnly.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly getAdultsOnly() {
                        return adultsOnly;
                    }

                    /**
                     * Define el valor de la propiedad adultsOnly.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly }
                     * 
                     */
                    public void setAdultsOnly(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly value) {
                        this.adultsOnly = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad beachFront.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront getBeachFront() {
                        return beachFront;
                    }

                    /**
                     * Define el valor de la propiedad beachFront.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront }
                     * 
                     */
                    public void setBeachFront(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront value) {
                        this.beachFront = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad breakfast.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast getBreakfast() {
                        return breakfast;
                    }

                    /**
                     * Define el valor de la propiedad breakfast.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast }
                     * 
                     */
                    public void setBreakfast(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast value) {
                        this.breakfast = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad businessCenter.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter getBusinessCenter() {
                        return businessCenter;
                    }

                    /**
                     * Define el valor de la propiedad businessCenter.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter }
                     * 
                     */
                    public void setBusinessCenter(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter value) {
                        this.businessCenter = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad businessReady.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady getBusinessReady() {
                        return businessReady;
                    }

                    /**
                     * Define el valor de la propiedad businessReady.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady }
                     * 
                     */
                    public void setBusinessReady(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady value) {
                        this.businessReady = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad conventions.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions getConventions() {
                        return conventions;
                    }

                    /**
                     * Define el valor de la propiedad conventions.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions }
                     * 
                     */
                    public void setConventions(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions value) {
                        this.conventions = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dataport.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport getDataport() {
                        return dataport;
                    }

                    /**
                     * Define el valor de la propiedad dataport.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport }
                     * 
                     */
                    public void setDataport(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport value) {
                        this.dataport = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dining.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining getDining() {
                        return dining;
                    }

                    /**
                     * Define el valor de la propiedad dining.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining }
                     * 
                     */
                    public void setDining(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining value) {
                        this.dining = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dryClean.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean getDryClean() {
                        return dryClean;
                    }

                    /**
                     * Define el valor de la propiedad dryClean.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean }
                     * 
                     */
                    public void setDryClean(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean value) {
                        this.dryClean = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad ecoCertified.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified getEcoCertified() {
                        return ecoCertified;
                    }

                    /**
                     * Define el valor de la propiedad ecoCertified.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified }
                     * 
                     */
                    public void setEcoCertified(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified value) {
                        this.ecoCertified = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad executiveFloors.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors getExecutiveFloors() {
                        return executiveFloors;
                    }

                    /**
                     * Define el valor de la propiedad executiveFloors.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors }
                     * 
                     */
                    public void setExecutiveFloors(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors value) {
                        this.executiveFloors = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fitnessCenter.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter getFitnessCenter() {
                        return fitnessCenter;
                    }

                    /**
                     * Define el valor de la propiedad fitnessCenter.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter }
                     * 
                     */
                    public void setFitnessCenter(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter value) {
                        this.fitnessCenter = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad freeLocalCalls.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls getFreeLocalCalls() {
                        return freeLocalCalls;
                    }

                    /**
                     * Define el valor de la propiedad freeLocalCalls.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls }
                     * 
                     */
                    public void setFreeLocalCalls(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls value) {
                        this.freeLocalCalls = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad freeParking.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking getFreeParking() {
                        return freeParking;
                    }

                    /**
                     * Define el valor de la propiedad freeParking.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking }
                     * 
                     */
                    public void setFreeParking(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking value) {
                        this.freeParking = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad freeShuttle.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle getFreeShuttle() {
                        return freeShuttle;
                    }

                    /**
                     * Define el valor de la propiedad freeShuttle.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle }
                     * 
                     */
                    public void setFreeShuttle(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle value) {
                        this.freeShuttle = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad freeWifiInMeetingRooms.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms getFreeWifiInMeetingRooms() {
                        return freeWifiInMeetingRooms;
                    }

                    /**
                     * Define el valor de la propiedad freeWifiInMeetingRooms.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms }
                     * 
                     */
                    public void setFreeWifiInMeetingRooms(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms value) {
                        this.freeWifiInMeetingRooms = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad freeWifiInPublicSpaces.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces getFreeWifiInPublicSpaces() {
                        return freeWifiInPublicSpaces;
                    }

                    /**
                     * Define el valor de la propiedad freeWifiInPublicSpaces.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces }
                     * 
                     */
                    public void setFreeWifiInPublicSpaces(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces value) {
                        this.freeWifiInPublicSpaces = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad freeWifiInRooms.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms getFreeWifiInRooms() {
                        return freeWifiInRooms;
                    }

                    /**
                     * Define el valor de la propiedad freeWifiInRooms.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms }
                     * 
                     */
                    public void setFreeWifiInRooms(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms value) {
                        this.freeWifiInRooms = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fullServiceSpa.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa getFullServiceSpa() {
                        return fullServiceSpa;
                    }

                    /**
                     * Define el valor de la propiedad fullServiceSpa.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa }
                     * 
                     */
                    public void setFullServiceSpa(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa value) {
                        this.fullServiceSpa = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad gameFacilities.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities getGameFacilities() {
                        return gameFacilities;
                    }

                    /**
                     * Define el valor de la propiedad gameFacilities.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities }
                     * 
                     */
                    public void setGameFacilities(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities value) {
                        this.gameFacilities = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad golf.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf getGolf() {
                        return golf;
                    }

                    /**
                     * Define el valor de la propiedad golf.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf }
                     * 
                     */
                    public void setGolf(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf value) {
                        this.golf = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad highSpeedInternet.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet getHighSpeedInternet() {
                        return highSpeedInternet;
                    }

                    /**
                     * Define el valor de la propiedad highSpeedInternet.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet }
                     * 
                     */
                    public void setHighSpeedInternet(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet value) {
                        this.highSpeedInternet = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad hypoallergenicRooms.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms getHypoallergenicRooms() {
                        return hypoallergenicRooms;
                    }

                    /**
                     * Define el valor de la propiedad hypoallergenicRooms.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms }
                     * 
                     */
                    public void setHypoallergenicRooms(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms value) {
                        this.hypoallergenicRooms = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad indoorPool.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool getIndoorPool() {
                        return indoorPool;
                    }

                    /**
                     * Define el valor de la propiedad indoorPool.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool }
                     * 
                     */
                    public void setIndoorPool(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool value) {
                        this.indoorPool = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad inRoomCoffeeTea.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea getInRoomCoffeeTea() {
                        return inRoomCoffeeTea;
                    }

                    /**
                     * Define el valor de la propiedad inRoomCoffeeTea.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea }
                     * 
                     */
                    public void setInRoomCoffeeTea(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea value) {
                        this.inRoomCoffeeTea = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad inRoomMiniBar.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar getInRoomMiniBar() {
                        return inRoomMiniBar;
                    }

                    /**
                     * Define el valor de la propiedad inRoomMiniBar.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar }
                     * 
                     */
                    public void setInRoomMiniBar(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar value) {
                        this.inRoomMiniBar = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad inRoomRefrigerator.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator getInRoomRefrigerator() {
                        return inRoomRefrigerator;
                    }

                    /**
                     * Define el valor de la propiedad inRoomRefrigerator.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator }
                     * 
                     */
                    public void setInRoomRefrigerator(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator value) {
                        this.inRoomRefrigerator = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad inRoomSafe.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe getInRoomSafe() {
                        return inRoomSafe;
                    }

                    /**
                     * Define el valor de la propiedad inRoomSafe.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe }
                     * 
                     */
                    public void setInRoomSafe(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe value) {
                        this.inRoomSafe = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad interiorDoorways.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways getInteriorDoorways() {
                        return interiorDoorways;
                    }

                    /**
                     * Define el valor de la propiedad interiorDoorways.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways }
                     * 
                     */
                    public void setInteriorDoorways(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways value) {
                        this.interiorDoorways = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad jacuzzi.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi getJacuzzi() {
                        return jacuzzi;
                    }

                    /**
                     * Define el valor de la propiedad jacuzzi.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi }
                     * 
                     */
                    public void setJacuzzi(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi value) {
                        this.jacuzzi = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad kidsFacilities.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities getKidsFacilities() {
                        return kidsFacilities;
                    }

                    /**
                     * Define el valor de la propiedad kidsFacilities.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities }
                     * 
                     */
                    public void setKidsFacilities(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities value) {
                        this.kidsFacilities = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad kitchenFacilities.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities getKitchenFacilities() {
                        return kitchenFacilities;
                    }

                    /**
                     * Define el valor de la propiedad kitchenFacilities.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities }
                     * 
                     */
                    public void setKitchenFacilities(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities value) {
                        this.kitchenFacilities = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad mealService.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService getMealService() {
                        return mealService;
                    }

                    /**
                     * Define el valor de la propiedad mealService.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService }
                     * 
                     */
                    public void setMealService(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService value) {
                        this.mealService = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad meetingFacilities.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities getMeetingFacilities() {
                        return meetingFacilities;
                    }

                    /**
                     * Define el valor de la propiedad meetingFacilities.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities }
                     * 
                     */
                    public void setMeetingFacilities(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities value) {
                        this.meetingFacilities = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad noAdultTV.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV getNoAdultTV() {
                        return noAdultTV;
                    }

                    /**
                     * Define el valor de la propiedad noAdultTV.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV }
                     * 
                     */
                    public void setNoAdultTV(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV value) {
                        this.noAdultTV = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nonSmoking.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking getNonSmoking() {
                        return nonSmoking;
                    }

                    /**
                     * Define el valor de la propiedad nonSmoking.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking }
                     * 
                     */
                    public void setNonSmoking(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking value) {
                        this.nonSmoking = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad outdoorPool.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool getOutdoorPool() {
                        return outdoorPool;
                    }

                    /**
                     * Define el valor de la propiedad outdoorPool.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool }
                     * 
                     */
                    public void setOutdoorPool(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool value) {
                        this.outdoorPool = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pets.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets getPets() {
                        return pets;
                    }

                    /**
                     * Define el valor de la propiedad pets.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets }
                     * 
                     */
                    public void setPets(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets value) {
                        this.pets = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pool.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool getPool() {
                        return pool;
                    }

                    /**
                     * Define el valor de la propiedad pool.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool }
                     * 
                     */
                    public void setPool(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool value) {
                        this.pool = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad
                     * publicTransportationAdjacent.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent getPublicTransportationAdjacent() {
                        return publicTransportationAdjacent;
                    }

                    /**
                     * Define el valor de la propiedad
                     * publicTransportationAdjacent.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent }
                     * 
                     */
                    public void setPublicTransportationAdjacent(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent value) {
                        this.publicTransportationAdjacent = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rateAssured.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured getRateAssured() {
                        return rateAssured;
                    }

                    /**
                     * Define el valor de la propiedad rateAssured.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured }
                     * 
                     */
                    public void setRateAssured(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured value) {
                        this.rateAssured = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad recreation.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation getRecreation() {
                        return recreation;
                    }

                    /**
                     * Define el valor de la propiedad recreation.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation }
                     * 
                     */
                    public void setRecreation(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation value) {
                        this.recreation = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad restrictedRoomAccess.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess getRestrictedRoomAccess() {
                        return restrictedRoomAccess;
                    }

                    /**
                     * Define el valor de la propiedad restrictedRoomAccess.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess }
                     * 
                     */
                    public void setRestrictedRoomAccess(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess value) {
                        this.restrictedRoomAccess = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad roomService.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService getRoomService() {
                        return roomService;
                    }

                    /**
                     * Define el valor de la propiedad roomService.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService }
                     * 
                     */
                    public void setRoomService(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService value) {
                        this.roomService = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad roomService24Hours.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours getRoomService24Hours() {
                        return roomService24Hours;
                    }

                    /**
                     * Define el valor de la propiedad roomService24Hours.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours }
                     * 
                     */
                    public void setRoomService24Hours(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours value) {
                        this.roomService24Hours = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad roomsWithBalcony.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony getRoomsWithBalcony() {
                        return roomsWithBalcony;
                    }

                    /**
                     * Define el valor de la propiedad roomsWithBalcony.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony }
                     * 
                     */
                    public void setRoomsWithBalcony(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony value) {
                        this.roomsWithBalcony = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad skiInOutProperty.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty getSkiInOutProperty() {
                        return skiInOutProperty;
                    }

                    /**
                     * Define el valor de la propiedad skiInOutProperty.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty }
                     * 
                     */
                    public void setSkiInOutProperty(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty value) {
                        this.skiInOutProperty = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad smokeFree.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree getSmokeFree() {
                        return smokeFree;
                    }

                    /**
                     * Define el valor de la propiedad smokeFree.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree }
                     * 
                     */
                    public void setSmokeFree(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree value) {
                        this.smokeFree = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad smokingRoomsAvail.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail getSmokingRoomsAvail() {
                        return smokingRoomsAvail;
                    }

                    /**
                     * Define el valor de la propiedad smokingRoomsAvail.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail }
                     * 
                     */
                    public void setSmokingRoomsAvail(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail value) {
                        this.smokingRoomsAvail = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad tennis.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis getTennis() {
                        return tennis;
                    }

                    /**
                     * Define el valor de la propiedad tennis.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis }
                     * 
                     */
                    public void setTennis(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis value) {
                        this.tennis = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad waterPurificationSystem.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem getWaterPurificationSystem() {
                        return waterPurificationSystem;
                    }

                    /**
                     * Define el valor de la propiedad waterPurificationSystem.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem }
                     * 
                     */
                    public void setWaterPurificationSystem(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem value) {
                        this.waterPurificationSystem = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wheelchair.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair getWheelchair() {
                        return wheelchair;
                    }

                    /**
                     * Define el valor de la propiedad wheelchair.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair }
                     * 
                     */
                    public void setWheelchair(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair value) {
                        this.wheelchair = value;
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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ADAAccessible {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AdultsOnly {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BeachFront {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Breakfast {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BusinessCenter {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BusinessReady {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Conventions {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Dataport {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Dining {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DryClean {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class EcoCertified {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ExecutiveFloors {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FitnessCenter {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FreeLocalCalls {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FreeParking {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FreeShuttle {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FreeWifiInMeetingRooms {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FreeWifiInPublicSpaces {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FreeWifiInRooms {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FullServiceSpa {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class GameFacilities {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Golf {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class HighSpeedInternet {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class HypoallergenicRooms {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class IndoorPool {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class InRoomCoffeeTea {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class InRoomMiniBar {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class InRoomRefrigerator {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class InRoomSafe {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class InteriorDoorways {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Jacuzzi {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class KidsFacilities {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class KitchenFacilities {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class MealService {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class MeetingFacilities {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NoAdultTV {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NonSmoking {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class OutdoorPool {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Pets {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Pool {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class PublicTransportationAdjacent {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RateAssured {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Recreation {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RestrictedRoomAccess {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RoomService {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RoomService24Hours {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RoomsWithBalcony {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SkiInOutProperty {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SmokeFree {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SmokingRoomsAvail {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Tennis {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class WaterPurificationSystem {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
                        }

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Wheelchair {

                        @XmlAttribute(name = "Ind")
                        protected Boolean ind;

                        /**
                         * Obtiene el valor de la propiedad ind.
                         * 
                         * @return possible object is {@link Boolean }
                         * 
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Define el valor de la propiedad ind.
                         * 
                         * @param value
                         *            allowed object is {@link Boolean }
                         * 
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
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
                 *         &lt;element name="AdditionalInfo" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CancelPolicy" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                           &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="HotelRateCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *         &lt;element name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="GuaranteeSurchargeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RateLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="XPM_GuaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { "additionalInfo", "hotelRateCode", "rateTypeCode" })
                public static class RoomRate {

                    @XmlElement(name = "AdditionalInfo")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo additionalInfo;
                    @XmlElement(name = "HotelRateCode")
                    protected List<String> hotelRateCode;
                    @XmlElement(name = "RateTypeCode")
                    protected List<String> rateTypeCode;
                    @XmlAttribute(name = "GuaranteeSurchargeRequired")
                    protected String guaranteeSurchargeRequired;
                    @XmlAttribute(name = "RateLevelCode")
                    protected String rateLevelCode;
                    @XmlAttribute(name = "XPM_GuaranteeRequired")
                    protected String xpmGuaranteeRequired;

                    /**
                     * Obtiene el valor de la propiedad additionalInfo.
                     * 
                     * @return possible object is
                     *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo }
                     * 
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo getAdditionalInfo() {
                        return additionalInfo;
                    }

                    /**
                     * Define el valor de la propiedad additionalInfo.
                     * 
                     * @param value
                     *            allowed object is
                     *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo }
                     * 
                     */
                    public void setAdditionalInfo(
                            OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo value) {
                        this.additionalInfo = value;
                    }

                    /**
                     * Gets the value of the hotelRateCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live
                     * list, not a snapshot. Therefore any modification you make
                     * to the returned list will be present inside the JAXB
                     * object. This is why there is not a <CODE>set</CODE>
                     * method for the hotelRateCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * 
                     * <pre>
                     * getHotelRateCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getHotelRateCode() {
                        if (hotelRateCode == null) {
                            hotelRateCode = new ArrayList<String>();
                        }
                        return this.hotelRateCode;
                    }

                    /**
                     * Gets the value of the rateTypeCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live
                     * list, not a snapshot. Therefore any modification you make
                     * to the returned list will be present inside the JAXB
                     * object. This is why there is not a <CODE>set</CODE>
                     * method for the rateTypeCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * 
                     * <pre>
                     * getRateTypeCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getRateTypeCode() {
                        if (rateTypeCode == null) {
                            rateTypeCode = new ArrayList<String>();
                        }
                        return this.rateTypeCode;
                    }

                    /**
                     * Obtiene el valor de la propiedad
                     * guaranteeSurchargeRequired.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getGuaranteeSurchargeRequired() {
                        return guaranteeSurchargeRequired;
                    }

                    /**
                     * Define el valor de la propiedad
                     * guaranteeSurchargeRequired.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setGuaranteeSurchargeRequired(String value) {
                        this.guaranteeSurchargeRequired = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rateLevelCode.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getRateLevelCode() {
                        return rateLevelCode;
                    }

                    /**
                     * Define el valor de la propiedad rateLevelCode.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setRateLevelCode(String value) {
                        this.rateLevelCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad xpmGuaranteeRequired.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getXPMGuaranteeRequired() {
                        return xpmGuaranteeRequired;
                    }

                    /**
                     * Define el valor de la propiedad xpmGuaranteeRequired.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setXPMGuaranteeRequired(String value) {
                        this.xpmGuaranteeRequired = value;
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
                     *       &lt;sequence&gt;
                     *         &lt;element name="CancelPolicy" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                 &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                    @XmlType(name = "", propOrder = { "cancelPolicy" })
                    public static class AdditionalInfo {

                        @XmlElement(name = "CancelPolicy")
                        protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy cancelPolicy;

                        /**
                         * Obtiene el valor de la propiedad cancelPolicy.
                         * 
                         * @return possible object is
                         *         {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy }
                         * 
                         */
                        public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy getCancelPolicy() {
                            return cancelPolicy;
                        }

                        /**
                         * Define el valor de la propiedad cancelPolicy.
                         * 
                         * @param value
                         *            allowed object is
                         *            {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy }
                         * 
                         */
                        public void setCancelPolicy(
                                OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy value) {
                            this.cancelPolicy = value;
                        }

                        /**
                         * <p>
                         * Clase Java para anonymous complex type.
                         * 
                         * <p>
                         * El siguiente fragmento de esquema especifica el
                         * contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="Option" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *       &lt;attribute name="Numeric" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class CancelPolicy {

                            @XmlAttribute(name = "Option")
                            protected String option;
                            @XmlAttribute(name = "Numeric")
                            protected String numeric;

                            /**
                             * Obtiene el valor de la propiedad option.
                             * 
                             * @return possible object is {@link String }
                             * 
                             */
                            public String getOption() {
                                return option;
                            }

                            /**
                             * Define el valor de la propiedad option.
                             * 
                             * @param value
                             *            allowed object is {@link String }
                             * 
                             */
                            public void setOption(String value) {
                                this.option = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad numeric.
                             * 
                             * @return possible object is {@link String }
                             * 
                             */
                            public String getNumeric() {
                                return numeric;
                            }

                            /**
                             * Define el valor de la propiedad numeric.
                             * 
                             * @param value
                             *            allowed object is {@link String }
                             * 
                             */
                            public void setNumeric(String value) {
                                this.numeric = value;
                            }

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
                 *       &lt;sequence&gt;
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { "text" })
                public static class SpecialOffers {

                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlAttribute(name = "Ind")
                    protected Boolean ind;

                    /**
                     * Obtiene el valor de la propiedad text.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Define el valor de la propiedad text.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad ind.
                     * 
                     * @return possible object is {@link Boolean }
                     * 
                     */
                    public Boolean isInd() {
                        return ind;
                    }

                    /**
                     * Define el valor de la propiedad ind.
                     * 
                     * @param value
                     *            allowed object is {@link Boolean }
                     * 
                     */
                    public void setInd(Boolean value) {
                        this.ind = value;
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
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Line" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @XmlType(name = "", propOrder = { "line" })
    public static class CityList {

        @XmlElement(name = "Line")
        protected List<OTAHotelAvailRS.CityList.Line> line;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.CityList.Line }
         * 
         * 
         */
        public List<OTAHotelAvailRS.CityList.Line> getLine() {
            if (line == null) {
                line = new ArrayList<OTAHotelAvailRS.CityList.Line>();
            }
            return this.line;
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
         *       &lt;attribute name="CountryStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Line {

            @XmlAttribute(name = "CountryStateCode")
            protected String countryStateCode;
            @XmlAttribute(name = "Latitude")
            protected String latitude;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "Longitude")
            protected String longitude;
            @XmlAttribute(name = "RPH")
            protected String rph;

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
             * Obtiene el valor de la propiedad locationName.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * Define el valor de la propiedad locationName.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setLocationName(String value) {
                this.locationName = value;
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

            /**
             * Obtiene el valor de la propiedad rph.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Define el valor de la propiedad rph.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setRPH(String value) {
                this.rph = value;
            }

        }

    }

}
