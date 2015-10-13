package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * The Identification metadata uniquely identify each message instance.
 * 
 * <p>
 * Clase Java para Identification complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Identification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://services.sabre.com/STL_Header/v120}PseudoCityCodeOrOAC"/&gt;
 *         &lt;element name="CustomerAppID" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/&gt;
 *         &lt;element name="ConversationID" type="{http://services.sabre.com/STL_Header/v120}TrackingID"/&gt;
 *         &lt;element name="MessageID" type="{http://services.sabre.com/STL_Header/v120}Identifier"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification", propOrder = { "customerID", "customerAppID", "conversationID", "messageID",
        "timeStamp" })
public class Identification {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "CustomerAppID")
    protected String customerAppID;
    @XmlElement(name = "ConversationID", required = true)
    protected TrackingID conversationID;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAppID.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCustomerAppID() {
        return customerAppID;
    }

    /**
     * Define el valor de la propiedad customerAppID.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCustomerAppID(String value) {
        this.customerAppID = value;
    }

    /**
     * Obtiene el valor de la propiedad conversationID.
     * 
     * @return possible object is {@link TrackingID }
     * 
     */
    public TrackingID getConversationID() {
        return conversationID;
    }

    /**
     * Define el valor de la propiedad conversationID.
     * 
     * @param value
     *            allowed object is {@link TrackingID }
     * 
     */
    public void setConversationID(TrackingID value) {
        this.conversationID = value;
    }

    /**
     * Obtiene el valor de la propiedad messageID.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Define el valor de la propiedad messageID.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMessageID(String value) {
        this.messageID = value;
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

}
