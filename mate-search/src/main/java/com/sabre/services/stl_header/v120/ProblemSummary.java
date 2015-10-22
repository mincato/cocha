package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Clase Java para ProblemSummary complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
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
@XmlType(name = "ProblemSummary", propOrder = { "source", "reportingSystem", "message", "shortText" })
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
     * Obtiene el valor de la propiedad source.
     * 
     * @return possible object is {@link IdentifierSystem }
     * 
     */
    public IdentifierSystem getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *            allowed object is {@link IdentifierSystem }
     * 
     */
    public void setSource(IdentifierSystem value) {
        this.source = value;
    }

    /**
     * Obtiene el valor de la propiedad reportingSystem.
     * 
     * @return possible object is {@link IdentifierSystem }
     * 
     */
    public IdentifierSystem getReportingSystem() {
        return reportingSystem;
    }

    /**
     * Define el valor de la propiedad reportingSystem.
     * 
     * @param value
     *            allowed object is {@link IdentifierSystem }
     * 
     */
    public void setReportingSystem(IdentifierSystem value) {
        this.reportingSystem = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return possible object is {@link MessageCondition }
     * 
     */
    public MessageCondition getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *            allowed object is {@link MessageCondition }
     * 
     */
    public void setMessage(MessageCondition value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad shortText.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * Define el valor de la propiedad shortText.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setShortText(String value) {
        this.shortText = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return possible object is {@link ErrorType }
     * 
     */
    public ErrorType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *            allowed object is {@link ErrorType }
     * 
     */
    public void setType(ErrorType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return possible object is {@link CompletionCodes }
     * 
     */
    public CompletionCodes getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *            allowed object is {@link CompletionCodes }
     * 
     */
    public void setStatus(CompletionCodes value) {
        this.status = value;
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
