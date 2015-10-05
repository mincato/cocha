
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProblemSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://services.sabre.com/STL_Header/v120}Identifier.System" minOccurs="0"/&gt;
 *         &lt;element name="ReportingSystem" type="{http://services.sabre.com/STL_Header/v120}Identifier.System"/&gt;
 *         &lt;element name="Message" type="{http://services.sabre.com/STL_Header/v120}Message.Condition" minOccurs="0"/&gt;
 *         &lt;element name="ShortText" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://services.sabre.com/STL_Header/v120}ErrorType" /&gt;
 *       &lt;attribute name="status" use="required" type="{http://services.sabre.com/STL_Header/v120}CompletionCodes" /&gt;
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemSummary", propOrder = {
    "source",
    "reportingSystem",
    "message",
    "shortText"
})
public class ProblemSummary {

    @XmlElement(name = "Source")
    protected IdentifierSystem source;
    @XmlElement(name = "ReportingSystem", required = true)
    protected IdentifierSystem reportingSystem;
    @XmlElement(name = "Message")
    protected MessageCondition message;
    @XmlElement(name = "ShortText")
    protected String shortText;
    @XmlAttribute(name = "type", required = true)
    protected ErrorType type;
    @XmlAttribute(name = "status", required = true)
    protected CompletionCodes status;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierSystem }
     *     
     */
    public IdentifierSystem getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierSystem }
     *     
     */
    public void setSource(IdentifierSystem value) {
        this.source = value;
    }

    /**
     * Gets the value of the reportingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierSystem }
     *     
     */
    public IdentifierSystem getReportingSystem() {
        return reportingSystem;
    }

    /**
     * Sets the value of the reportingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierSystem }
     *     
     */
    public void setReportingSystem(IdentifierSystem value) {
        this.reportingSystem = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageCondition }
     *     
     */
    public MessageCondition getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageCondition }
     *     
     */
    public void setMessage(MessageCondition value) {
        this.message = value;
    }

    /**
     * Gets the value of the shortText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * Sets the value of the shortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortText(String value) {
        this.shortText = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setType(ErrorType value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CompletionCodes }
     *     
     */
    public CompletionCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionCodes }
     *     
     */
    public void setStatus(CompletionCodes value) {
        this.status = value;
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

}
