
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "", propOrder = {
    "applicationResults",
    "additionalAvail",
    "availabilityOptions",
    "cityList"
})
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
     * Gets the value of the applicationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Gets the value of the additionalAvail property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.AdditionalAvail }
     *     
     */
    public OTAHotelAvailRS.AdditionalAvail getAdditionalAvail() {
        return additionalAvail;
    }

    /**
     * Sets the value of the additionalAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.AdditionalAvail }
     *     
     */
    public void setAdditionalAvail(OTAHotelAvailRS.AdditionalAvail value) {
        this.additionalAvail = value;
    }

    /**
     * Gets the value of the availabilityOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.AvailabilityOptions }
     *     
     */
    public OTAHotelAvailRS.AvailabilityOptions getAvailabilityOptions() {
        return availabilityOptions;
    }

    /**
     * Sets the value of the availabilityOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.AvailabilityOptions }
     *     
     */
    public void setAvailabilityOptions(OTAHotelAvailRS.AvailabilityOptions value) {
        this.availabilityOptions = value;
    }

    /**
     * Gets the value of the cityList property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.CityList }
     *     
     */
    public OTAHotelAvailRS.CityList getCityList() {
        return cityList;
    }

    /**
     * Sets the value of the cityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.CityList }
     *     
     */
    public void setCityList(OTAHotelAvailRS.CityList value) {
        this.cityList = value;
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
        return version;
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
         * Gets the value of the ind property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInd(Boolean value) {
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
    @XmlType(name = "", propOrder = {
        "availabilityOption"
    })
    public static class AvailabilityOptions {

        @XmlElement(name = "AvailabilityOption")
        protected List<OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption> availabilityOption;

        /**
         * Gets the value of the availabilityOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availabilityOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailabilityOption().add(newItem);
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
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
        @XmlType(name = "", propOrder = {
            "basicPropertyInfo"
        })
        public static class AvailabilityOption {

            @XmlElement(name = "BasicPropertyInfo")
            protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo basicPropertyInfo;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * Gets the value of the basicPropertyInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo }
             *     
             */
            public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo getBasicPropertyInfo() {
                return basicPropertyInfo;
            }

            /**
             * Sets the value of the basicPropertyInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo }
             *     
             */
            public void setBasicPropertyInfo(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo value) {
                this.basicPropertyInfo = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
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
            @XmlType(name = "", propOrder = {
                "address",
                "contactNumbers",
                "contractualRateCodeMatch",
                "directConnect",
                "locationDescription",
                "negotiatedRateCodeMatch",
                "property",
                "propertyOptionInfo",
                "rateRange",
                "roomRate",
                "specialOffers"
            })
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
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address }
                 *     
                 */
                public void setAddress(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.Address value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the contactNumbers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers getContactNumbers() {
                    return contactNumbers;
                }

                /**
                 * Sets the value of the contactNumbers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers }
                 *     
                 */
                public void setContactNumbers(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers value) {
                    this.contactNumbers = value;
                }

                /**
                 * Gets the value of the contractualRateCodeMatch property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractualRateCodeMatch() {
                    return contractualRateCodeMatch;
                }

                /**
                 * Sets the value of the contractualRateCodeMatch property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContractualRateCodeMatch(String value) {
                    this.contractualRateCodeMatch = value;
                }

                /**
                 * Gets the value of the directConnect property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect getDirectConnect() {
                    return directConnect;
                }

                /**
                 * Sets the value of the directConnect property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect }
                 *     
                 */
                public void setDirectConnect(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect value) {
                    this.directConnect = value;
                }

                /**
                 * Gets the value of the locationDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription getLocationDescription() {
                    return locationDescription;
                }

                /**
                 * Sets the value of the locationDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription }
                 *     
                 */
                public void setLocationDescription(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.LocationDescription value) {
                    this.locationDescription = value;
                }

                /**
                 * Gets the value of the negotiatedRateCodeMatch property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNegotiatedRateCodeMatch() {
                    return negotiatedRateCodeMatch;
                }

                /**
                 * Sets the value of the negotiatedRateCodeMatch property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
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
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the property property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProperty().add(newItem);
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
                 * Gets the value of the propertyOptionInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo getPropertyOptionInfo() {
                    return propertyOptionInfo;
                }

                /**
                 * Sets the value of the propertyOptionInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo }
                 *     
                 */
                public void setPropertyOptionInfo(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo value) {
                    this.propertyOptionInfo = value;
                }

                /**
                 * Gets the value of the rateRange property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange getRateRange() {
                    return rateRange;
                }

                /**
                 * Sets the value of the rateRange property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange }
                 *     
                 */
                public void setRateRange(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RateRange value) {
                    this.rateRange = value;
                }

                /**
                 * Gets the value of the roomRate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the roomRate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRoomRate().add(newItem);
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
                 * Gets the value of the specialOffers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers }
                 *     
                 */
                public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers getSpecialOffers() {
                    return specialOffers;
                }

                /**
                 * Sets the value of the specialOffers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers }
                 *     
                 */
                public void setSpecialOffers(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.SpecialOffers value) {
                    this.specialOffers = value;
                }

                /**
                 * Gets the value of the areaID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAreaID() {
                    return areaID;
                }

                /**
                 * Sets the value of the areaID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAreaID(String value) {
                    this.areaID = value;
                }

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
                 * Gets the value of the distance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDistance() {
                    return distance;
                }

                /**
                 * Sets the value of the distance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDistance(String value) {
                    this.distance = value;
                }

                /**
                 * Gets the value of the geoConfidenceLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGEOConfidenceLevel() {
                    return geoConfidenceLevel;
                }

                /**
                 * Sets the value of the geoConfidenceLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGEOConfidenceLevel(String value) {
                    this.geoConfidenceLevel = value;
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
                @XmlType(name = "", propOrder = {
                    "addressLine"
                })
                public static class Address {

                    @XmlElement(name = "AddressLine")
                    protected List<String> addressLine;

                    /**
                     * Gets the value of the addressLine property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAddressLine().add(newItem);
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
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
                @XmlType(name = "", propOrder = {
                    "contactNumber"
                })
                public static class ContactNumbers {

                    @XmlElement(name = "ContactNumber")
                    protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber contactNumber;

                    /**
                     * Gets the value of the contactNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber getContactNumber() {
                        return contactNumber;
                    }

                    /**
                     * Sets the value of the contactNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber }
                     *     
                     */
                    public void setContactNumber(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.ContactNumbers.ContactNumber value) {
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
                         * Gets the value of the fax property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFax() {
                            return fax;
                        }

                        /**
                         * Sets the value of the fax property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFax(String value) {
                            this.fax = value;
                        }

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
                @XmlType(name = "", propOrder = {
                    "altAvail",
                    "dcAvailParticipant",
                    "dcSellParticipant",
                    "ratesExceedMax",
                    "unAvail"
                })
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
                     * Gets the value of the altAvail property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail getAltAvail() {
                        return altAvail;
                    }

                    /**
                     * Sets the value of the altAvail property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail }
                     *     
                     */
                    public void setAltAvail(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.AltAvail value) {
                        this.altAvail = value;
                    }

                    /**
                     * Gets the value of the dcAvailParticipant property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant getDCAvailParticipant() {
                        return dcAvailParticipant;
                    }

                    /**
                     * Sets the value of the dcAvailParticipant property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant }
                     *     
                     */
                    public void setDCAvailParticipant(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCAvailParticipant value) {
                        this.dcAvailParticipant = value;
                    }

                    /**
                     * Gets the value of the dcSellParticipant property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant getDCSellParticipant() {
                        return dcSellParticipant;
                    }

                    /**
                     * Sets the value of the dcSellParticipant property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant }
                     *     
                     */
                    public void setDCSellParticipant(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.DCSellParticipant value) {
                        this.dcSellParticipant = value;
                    }

                    /**
                     * Gets the value of the ratesExceedMax property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax getRatesExceedMax() {
                        return ratesExceedMax;
                    }

                    /**
                     * Sets the value of the ratesExceedMax property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax }
                     *     
                     */
                    public void setRatesExceedMax(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.RatesExceedMax value) {
                        this.ratesExceedMax = value;
                    }

                    /**
                     * Gets the value of the unAvail property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail getUnAvail() {
                        return unAvail;
                    }

                    /**
                     * Sets the value of the unAvail property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail }
                     *     
                     */
                    public void setUnAvail(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.DirectConnect.UnAvail value) {
                        this.unAvail = value;
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
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
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class LocationDescription {

                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlAttribute(name = "Code")
                    protected String code;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
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
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class Property {

                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlAttribute(name = "Rating")
                    protected String rating;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the rating property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRating() {
                        return rating;
                    }

                    /**
                     * Sets the value of the rating property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRating(String value) {
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
                @XmlType(name = "", propOrder = {
                    "adaAccessible",
                    "adultsOnly",
                    "beachFront",
                    "breakfast",
                    "businessCenter",
                    "businessReady",
                    "conventions",
                    "dataport",
                    "dining",
                    "dryClean",
                    "ecoCertified",
                    "executiveFloors",
                    "fitnessCenter",
                    "freeLocalCalls",
                    "freeParking",
                    "freeShuttle",
                    "freeWifiInMeetingRooms",
                    "freeWifiInPublicSpaces",
                    "freeWifiInRooms",
                    "fullServiceSpa",
                    "gameFacilities",
                    "golf",
                    "highSpeedInternet",
                    "hypoallergenicRooms",
                    "indoorPool",
                    "inRoomCoffeeTea",
                    "inRoomMiniBar",
                    "inRoomRefrigerator",
                    "inRoomSafe",
                    "interiorDoorways",
                    "jacuzzi",
                    "kidsFacilities",
                    "kitchenFacilities",
                    "mealService",
                    "meetingFacilities",
                    "noAdultTV",
                    "nonSmoking",
                    "outdoorPool",
                    "pets",
                    "pool",
                    "publicTransportationAdjacent",
                    "rateAssured",
                    "recreation",
                    "restrictedRoomAccess",
                    "roomService",
                    "roomService24Hours",
                    "roomsWithBalcony",
                    "skiInOutProperty",
                    "smokeFree",
                    "smokingRoomsAvail",
                    "tennis",
                    "waterPurificationSystem",
                    "wheelchair"
                })
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
                     * Gets the value of the adaAccessible property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible getADAAccessible() {
                        return adaAccessible;
                    }

                    /**
                     * Sets the value of the adaAccessible property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible }
                     *     
                     */
                    public void setADAAccessible(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ADAAccessible value) {
                        this.adaAccessible = value;
                    }

                    /**
                     * Gets the value of the adultsOnly property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly getAdultsOnly() {
                        return adultsOnly;
                    }

                    /**
                     * Sets the value of the adultsOnly property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly }
                     *     
                     */
                    public void setAdultsOnly(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.AdultsOnly value) {
                        this.adultsOnly = value;
                    }

                    /**
                     * Gets the value of the beachFront property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront getBeachFront() {
                        return beachFront;
                    }

                    /**
                     * Sets the value of the beachFront property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront }
                     *     
                     */
                    public void setBeachFront(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BeachFront value) {
                        this.beachFront = value;
                    }

                    /**
                     * Gets the value of the breakfast property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast getBreakfast() {
                        return breakfast;
                    }

                    /**
                     * Sets the value of the breakfast property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast }
                     *     
                     */
                    public void setBreakfast(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Breakfast value) {
                        this.breakfast = value;
                    }

                    /**
                     * Gets the value of the businessCenter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter getBusinessCenter() {
                        return businessCenter;
                    }

                    /**
                     * Sets the value of the businessCenter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter }
                     *     
                     */
                    public void setBusinessCenter(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessCenter value) {
                        this.businessCenter = value;
                    }

                    /**
                     * Gets the value of the businessReady property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady getBusinessReady() {
                        return businessReady;
                    }

                    /**
                     * Sets the value of the businessReady property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady }
                     *     
                     */
                    public void setBusinessReady(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.BusinessReady value) {
                        this.businessReady = value;
                    }

                    /**
                     * Gets the value of the conventions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions getConventions() {
                        return conventions;
                    }

                    /**
                     * Sets the value of the conventions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions }
                     *     
                     */
                    public void setConventions(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Conventions value) {
                        this.conventions = value;
                    }

                    /**
                     * Gets the value of the dataport property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport getDataport() {
                        return dataport;
                    }

                    /**
                     * Sets the value of the dataport property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport }
                     *     
                     */
                    public void setDataport(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dataport value) {
                        this.dataport = value;
                    }

                    /**
                     * Gets the value of the dining property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining getDining() {
                        return dining;
                    }

                    /**
                     * Sets the value of the dining property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining }
                     *     
                     */
                    public void setDining(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Dining value) {
                        this.dining = value;
                    }

                    /**
                     * Gets the value of the dryClean property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean getDryClean() {
                        return dryClean;
                    }

                    /**
                     * Sets the value of the dryClean property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean }
                     *     
                     */
                    public void setDryClean(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.DryClean value) {
                        this.dryClean = value;
                    }

                    /**
                     * Gets the value of the ecoCertified property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified getEcoCertified() {
                        return ecoCertified;
                    }

                    /**
                     * Sets the value of the ecoCertified property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified }
                     *     
                     */
                    public void setEcoCertified(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.EcoCertified value) {
                        this.ecoCertified = value;
                    }

                    /**
                     * Gets the value of the executiveFloors property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors getExecutiveFloors() {
                        return executiveFloors;
                    }

                    /**
                     * Sets the value of the executiveFloors property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors }
                     *     
                     */
                    public void setExecutiveFloors(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.ExecutiveFloors value) {
                        this.executiveFloors = value;
                    }

                    /**
                     * Gets the value of the fitnessCenter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter getFitnessCenter() {
                        return fitnessCenter;
                    }

                    /**
                     * Sets the value of the fitnessCenter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter }
                     *     
                     */
                    public void setFitnessCenter(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FitnessCenter value) {
                        this.fitnessCenter = value;
                    }

                    /**
                     * Gets the value of the freeLocalCalls property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls getFreeLocalCalls() {
                        return freeLocalCalls;
                    }

                    /**
                     * Sets the value of the freeLocalCalls property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls }
                     *     
                     */
                    public void setFreeLocalCalls(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeLocalCalls value) {
                        this.freeLocalCalls = value;
                    }

                    /**
                     * Gets the value of the freeParking property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking getFreeParking() {
                        return freeParking;
                    }

                    /**
                     * Sets the value of the freeParking property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking }
                     *     
                     */
                    public void setFreeParking(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeParking value) {
                        this.freeParking = value;
                    }

                    /**
                     * Gets the value of the freeShuttle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle getFreeShuttle() {
                        return freeShuttle;
                    }

                    /**
                     * Sets the value of the freeShuttle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle }
                     *     
                     */
                    public void setFreeShuttle(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeShuttle value) {
                        this.freeShuttle = value;
                    }

                    /**
                     * Gets the value of the freeWifiInMeetingRooms property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms getFreeWifiInMeetingRooms() {
                        return freeWifiInMeetingRooms;
                    }

                    /**
                     * Sets the value of the freeWifiInMeetingRooms property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms }
                     *     
                     */
                    public void setFreeWifiInMeetingRooms(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInMeetingRooms value) {
                        this.freeWifiInMeetingRooms = value;
                    }

                    /**
                     * Gets the value of the freeWifiInPublicSpaces property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces getFreeWifiInPublicSpaces() {
                        return freeWifiInPublicSpaces;
                    }

                    /**
                     * Sets the value of the freeWifiInPublicSpaces property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces }
                     *     
                     */
                    public void setFreeWifiInPublicSpaces(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInPublicSpaces value) {
                        this.freeWifiInPublicSpaces = value;
                    }

                    /**
                     * Gets the value of the freeWifiInRooms property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms getFreeWifiInRooms() {
                        return freeWifiInRooms;
                    }

                    /**
                     * Sets the value of the freeWifiInRooms property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms }
                     *     
                     */
                    public void setFreeWifiInRooms(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FreeWifiInRooms value) {
                        this.freeWifiInRooms = value;
                    }

                    /**
                     * Gets the value of the fullServiceSpa property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa getFullServiceSpa() {
                        return fullServiceSpa;
                    }

                    /**
                     * Sets the value of the fullServiceSpa property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa }
                     *     
                     */
                    public void setFullServiceSpa(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.FullServiceSpa value) {
                        this.fullServiceSpa = value;
                    }

                    /**
                     * Gets the value of the gameFacilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities getGameFacilities() {
                        return gameFacilities;
                    }

                    /**
                     * Sets the value of the gameFacilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities }
                     *     
                     */
                    public void setGameFacilities(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.GameFacilities value) {
                        this.gameFacilities = value;
                    }

                    /**
                     * Gets the value of the golf property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf getGolf() {
                        return golf;
                    }

                    /**
                     * Sets the value of the golf property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf }
                     *     
                     */
                    public void setGolf(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Golf value) {
                        this.golf = value;
                    }

                    /**
                     * Gets the value of the highSpeedInternet property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet getHighSpeedInternet() {
                        return highSpeedInternet;
                    }

                    /**
                     * Sets the value of the highSpeedInternet property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet }
                     *     
                     */
                    public void setHighSpeedInternet(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HighSpeedInternet value) {
                        this.highSpeedInternet = value;
                    }

                    /**
                     * Gets the value of the hypoallergenicRooms property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms getHypoallergenicRooms() {
                        return hypoallergenicRooms;
                    }

                    /**
                     * Sets the value of the hypoallergenicRooms property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms }
                     *     
                     */
                    public void setHypoallergenicRooms(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.HypoallergenicRooms value) {
                        this.hypoallergenicRooms = value;
                    }

                    /**
                     * Gets the value of the indoorPool property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool getIndoorPool() {
                        return indoorPool;
                    }

                    /**
                     * Sets the value of the indoorPool property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool }
                     *     
                     */
                    public void setIndoorPool(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.IndoorPool value) {
                        this.indoorPool = value;
                    }

                    /**
                     * Gets the value of the inRoomCoffeeTea property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea getInRoomCoffeeTea() {
                        return inRoomCoffeeTea;
                    }

                    /**
                     * Sets the value of the inRoomCoffeeTea property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea }
                     *     
                     */
                    public void setInRoomCoffeeTea(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomCoffeeTea value) {
                        this.inRoomCoffeeTea = value;
                    }

                    /**
                     * Gets the value of the inRoomMiniBar property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar getInRoomMiniBar() {
                        return inRoomMiniBar;
                    }

                    /**
                     * Sets the value of the inRoomMiniBar property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar }
                     *     
                     */
                    public void setInRoomMiniBar(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomMiniBar value) {
                        this.inRoomMiniBar = value;
                    }

                    /**
                     * Gets the value of the inRoomRefrigerator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator getInRoomRefrigerator() {
                        return inRoomRefrigerator;
                    }

                    /**
                     * Sets the value of the inRoomRefrigerator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator }
                     *     
                     */
                    public void setInRoomRefrigerator(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomRefrigerator value) {
                        this.inRoomRefrigerator = value;
                    }

                    /**
                     * Gets the value of the inRoomSafe property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe getInRoomSafe() {
                        return inRoomSafe;
                    }

                    /**
                     * Sets the value of the inRoomSafe property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe }
                     *     
                     */
                    public void setInRoomSafe(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InRoomSafe value) {
                        this.inRoomSafe = value;
                    }

                    /**
                     * Gets the value of the interiorDoorways property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways getInteriorDoorways() {
                        return interiorDoorways;
                    }

                    /**
                     * Sets the value of the interiorDoorways property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways }
                     *     
                     */
                    public void setInteriorDoorways(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.InteriorDoorways value) {
                        this.interiorDoorways = value;
                    }

                    /**
                     * Gets the value of the jacuzzi property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi getJacuzzi() {
                        return jacuzzi;
                    }

                    /**
                     * Sets the value of the jacuzzi property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi }
                     *     
                     */
                    public void setJacuzzi(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Jacuzzi value) {
                        this.jacuzzi = value;
                    }

                    /**
                     * Gets the value of the kidsFacilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities getKidsFacilities() {
                        return kidsFacilities;
                    }

                    /**
                     * Sets the value of the kidsFacilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities }
                     *     
                     */
                    public void setKidsFacilities(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KidsFacilities value) {
                        this.kidsFacilities = value;
                    }

                    /**
                     * Gets the value of the kitchenFacilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities getKitchenFacilities() {
                        return kitchenFacilities;
                    }

                    /**
                     * Sets the value of the kitchenFacilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities }
                     *     
                     */
                    public void setKitchenFacilities(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.KitchenFacilities value) {
                        this.kitchenFacilities = value;
                    }

                    /**
                     * Gets the value of the mealService property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService getMealService() {
                        return mealService;
                    }

                    /**
                     * Sets the value of the mealService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService }
                     *     
                     */
                    public void setMealService(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MealService value) {
                        this.mealService = value;
                    }

                    /**
                     * Gets the value of the meetingFacilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities getMeetingFacilities() {
                        return meetingFacilities;
                    }

                    /**
                     * Sets the value of the meetingFacilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities }
                     *     
                     */
                    public void setMeetingFacilities(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.MeetingFacilities value) {
                        this.meetingFacilities = value;
                    }

                    /**
                     * Gets the value of the noAdultTV property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV getNoAdultTV() {
                        return noAdultTV;
                    }

                    /**
                     * Sets the value of the noAdultTV property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV }
                     *     
                     */
                    public void setNoAdultTV(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NoAdultTV value) {
                        this.noAdultTV = value;
                    }

                    /**
                     * Gets the value of the nonSmoking property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking getNonSmoking() {
                        return nonSmoking;
                    }

                    /**
                     * Sets the value of the nonSmoking property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking }
                     *     
                     */
                    public void setNonSmoking(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.NonSmoking value) {
                        this.nonSmoking = value;
                    }

                    /**
                     * Gets the value of the outdoorPool property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool getOutdoorPool() {
                        return outdoorPool;
                    }

                    /**
                     * Sets the value of the outdoorPool property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool }
                     *     
                     */
                    public void setOutdoorPool(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.OutdoorPool value) {
                        this.outdoorPool = value;
                    }

                    /**
                     * Gets the value of the pets property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets getPets() {
                        return pets;
                    }

                    /**
                     * Sets the value of the pets property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets }
                     *     
                     */
                    public void setPets(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pets value) {
                        this.pets = value;
                    }

                    /**
                     * Gets the value of the pool property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool getPool() {
                        return pool;
                    }

                    /**
                     * Sets the value of the pool property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool }
                     *     
                     */
                    public void setPool(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Pool value) {
                        this.pool = value;
                    }

                    /**
                     * Gets the value of the publicTransportationAdjacent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent getPublicTransportationAdjacent() {
                        return publicTransportationAdjacent;
                    }

                    /**
                     * Sets the value of the publicTransportationAdjacent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent }
                     *     
                     */
                    public void setPublicTransportationAdjacent(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.PublicTransportationAdjacent value) {
                        this.publicTransportationAdjacent = value;
                    }

                    /**
                     * Gets the value of the rateAssured property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured getRateAssured() {
                        return rateAssured;
                    }

                    /**
                     * Sets the value of the rateAssured property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured }
                     *     
                     */
                    public void setRateAssured(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RateAssured value) {
                        this.rateAssured = value;
                    }

                    /**
                     * Gets the value of the recreation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation getRecreation() {
                        return recreation;
                    }

                    /**
                     * Sets the value of the recreation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation }
                     *     
                     */
                    public void setRecreation(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Recreation value) {
                        this.recreation = value;
                    }

                    /**
                     * Gets the value of the restrictedRoomAccess property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess getRestrictedRoomAccess() {
                        return restrictedRoomAccess;
                    }

                    /**
                     * Sets the value of the restrictedRoomAccess property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess }
                     *     
                     */
                    public void setRestrictedRoomAccess(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RestrictedRoomAccess value) {
                        this.restrictedRoomAccess = value;
                    }

                    /**
                     * Gets the value of the roomService property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService getRoomService() {
                        return roomService;
                    }

                    /**
                     * Sets the value of the roomService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService }
                     *     
                     */
                    public void setRoomService(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService value) {
                        this.roomService = value;
                    }

                    /**
                     * Gets the value of the roomService24Hours property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours getRoomService24Hours() {
                        return roomService24Hours;
                    }

                    /**
                     * Sets the value of the roomService24Hours property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours }
                     *     
                     */
                    public void setRoomService24Hours(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomService24Hours value) {
                        this.roomService24Hours = value;
                    }

                    /**
                     * Gets the value of the roomsWithBalcony property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony getRoomsWithBalcony() {
                        return roomsWithBalcony;
                    }

                    /**
                     * Sets the value of the roomsWithBalcony property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony }
                     *     
                     */
                    public void setRoomsWithBalcony(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.RoomsWithBalcony value) {
                        this.roomsWithBalcony = value;
                    }

                    /**
                     * Gets the value of the skiInOutProperty property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty getSkiInOutProperty() {
                        return skiInOutProperty;
                    }

                    /**
                     * Sets the value of the skiInOutProperty property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty }
                     *     
                     */
                    public void setSkiInOutProperty(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SkiInOutProperty value) {
                        this.skiInOutProperty = value;
                    }

                    /**
                     * Gets the value of the smokeFree property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree getSmokeFree() {
                        return smokeFree;
                    }

                    /**
                     * Sets the value of the smokeFree property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree }
                     *     
                     */
                    public void setSmokeFree(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokeFree value) {
                        this.smokeFree = value;
                    }

                    /**
                     * Gets the value of the smokingRoomsAvail property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail getSmokingRoomsAvail() {
                        return smokingRoomsAvail;
                    }

                    /**
                     * Sets the value of the smokingRoomsAvail property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail }
                     *     
                     */
                    public void setSmokingRoomsAvail(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.SmokingRoomsAvail value) {
                        this.smokingRoomsAvail = value;
                    }

                    /**
                     * Gets the value of the tennis property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis getTennis() {
                        return tennis;
                    }

                    /**
                     * Sets the value of the tennis property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis }
                     *     
                     */
                    public void setTennis(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Tennis value) {
                        this.tennis = value;
                    }

                    /**
                     * Gets the value of the waterPurificationSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem getWaterPurificationSystem() {
                        return waterPurificationSystem;
                    }

                    /**
                     * Sets the value of the waterPurificationSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem }
                     *     
                     */
                    public void setWaterPurificationSystem(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.WaterPurificationSystem value) {
                        this.waterPurificationSystem = value;
                    }

                    /**
                     * Gets the value of the wheelchair property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair getWheelchair() {
                        return wheelchair;
                    }

                    /**
                     * Sets the value of the wheelchair property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair }
                     *     
                     */
                    public void setWheelchair(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.PropertyOptionInfo.Wheelchair value) {
                        this.wheelchair = value;
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
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
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setInd(Boolean value) {
                            this.ind = value;
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
                @XmlType(name = "", propOrder = {
                    "additionalInfo",
                    "hotelRateCode",
                    "rateTypeCode"
                })
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
                     * Gets the value of the additionalInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo }
                     *     
                     */
                    public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo getAdditionalInfo() {
                        return additionalInfo;
                    }

                    /**
                     * Sets the value of the additionalInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo }
                     *     
                     */
                    public void setAdditionalInfo(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo value) {
                        this.additionalInfo = value;
                    }

                    /**
                     * Gets the value of the hotelRateCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the hotelRateCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHotelRateCode().add(newItem);
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
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the rateTypeCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRateTypeCode().add(newItem);
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
                     * Gets the value of the guaranteeSurchargeRequired property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGuaranteeSurchargeRequired() {
                        return guaranteeSurchargeRequired;
                    }

                    /**
                     * Sets the value of the guaranteeSurchargeRequired property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGuaranteeSurchargeRequired(String value) {
                        this.guaranteeSurchargeRequired = value;
                    }

                    /**
                     * Gets the value of the rateLevelCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRateLevelCode() {
                        return rateLevelCode;
                    }

                    /**
                     * Sets the value of the rateLevelCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRateLevelCode(String value) {
                        this.rateLevelCode = value;
                    }

                    /**
                     * Gets the value of the xpmGuaranteeRequired property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXPMGuaranteeRequired() {
                        return xpmGuaranteeRequired;
                    }

                    /**
                     * Sets the value of the xpmGuaranteeRequired property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXPMGuaranteeRequired(String value) {
                        this.xpmGuaranteeRequired = value;
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
                    @XmlType(name = "", propOrder = {
                        "cancelPolicy"
                    })
                    public static class AdditionalInfo {

                        @XmlElement(name = "CancelPolicy")
                        protected OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy cancelPolicy;

                        /**
                         * Gets the value of the cancelPolicy property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy }
                         *     
                         */
                        public OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy getCancelPolicy() {
                            return cancelPolicy;
                        }

                        /**
                         * Sets the value of the cancelPolicy property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy }
                         *     
                         */
                        public void setCancelPolicy(OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo.RoomRate.AdditionalInfo.CancelPolicy value) {
                            this.cancelPolicy = value;
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
                             * Gets the value of the option property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getOption() {
                                return option;
                            }

                            /**
                             * Sets the value of the option property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setOption(String value) {
                                this.option = value;
                            }

                            /**
                             * Gets the value of the numeric property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getNumeric() {
                                return numeric;
                            }

                            /**
                             * Sets the value of the numeric property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setNumeric(String value) {
                                this.numeric = value;
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
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class SpecialOffers {

                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlAttribute(name = "Ind")
                    protected Boolean ind;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the ind property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isInd() {
                        return ind;
                    }

                    /**
                     * Sets the value of the ind property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
    @XmlType(name = "", propOrder = {
        "line"
    })
    public static class CityList {

        @XmlElement(name = "Line")
        protected List<OTAHotelAvailRS.CityList.Line> line;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
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
             * Gets the value of the locationName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * Sets the value of the locationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
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

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

        }

    }

}
