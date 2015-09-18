package org.ebxml.namespaces.messageheader;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}MessageId"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Timestamp"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}RefToMessageId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}TimeToLive" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Timeout" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "messageId", "timestamp", "refToMessageId", "timeToLive", "timeout" })
@XmlRootElement(name = "MessageData")
public class MessageData {

    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "Timestamp", required = true)
    protected String timestamp;
    @XmlElement(name = "RefToMessageId")
    protected String refToMessageId;
    @XmlElement(name = "TimeToLive")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeToLive;
    @XmlElement(name = "Timeout")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger timeout;

    /**
     * Obtiene el valor de la propiedad messageId.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Define el valor de la propiedad messageId.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad refToMessageId.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRefToMessageId() {
        return refToMessageId;
    }

    /**
     * Define el valor de la propiedad refToMessageId.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRefToMessageId(String value) {
        this.refToMessageId = value;
    }

    /**
     * Obtiene el valor de la propiedad timeToLive.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getTimeToLive() {
        return timeToLive;
    }

    /**
     * Define el valor de la propiedad timeToLive.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setTimeToLive(XMLGregorianCalendar value) {
        this.timeToLive = value;
    }

    /**
     * Obtiene el valor de la propiedad timeout.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTimeout() {
        return timeout;
    }

    /**
     * Define el valor de la propiedad timeout.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTimeout(BigInteger value) {
        this.timeout = value;
    }

}
