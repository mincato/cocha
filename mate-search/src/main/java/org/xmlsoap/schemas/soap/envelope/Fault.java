package org.xmlsoap.schemas.soap.envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Fault reporting structure
 * 
 * <p>
 * Clase Java para Fault complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}QName"/&gt;
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://schemas.xmlsoap.org/soap/envelope/}detail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = { "faultcode", "faultstring", "faultactor", "detail" })
public class Fault {

    @XmlElement(required = true)
    protected QName faultcode;
    @XmlElement(required = true)
    protected String faultstring;
    @XmlSchemaType(name = "anyURI")
    protected String faultactor;
    protected Detail detail;

    /**
     * Obtiene el valor de la propiedad faultcode.
     * 
     * @return possible object is {@link QName }
     * 
     */
    public QName getFaultcode() {
        return faultcode;
    }

    /**
     * Define el valor de la propiedad faultcode.
     * 
     * @param value
     *            allowed object is {@link QName }
     * 
     */
    public void setFaultcode(QName value) {
        this.faultcode = value;
    }

    /**
     * Obtiene el valor de la propiedad faultstring.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Define el valor de la propiedad faultstring.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

    /**
     * Obtiene el valor de la propiedad faultactor.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFaultactor() {
        return faultactor;
    }

    /**
     * Define el valor de la propiedad faultactor.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFaultactor(String value) {
        this.faultactor = value;
    }

    /**
     * Obtiene el valor de la propiedad detail.
     * 
     * @return possible object is {@link Detail }
     * 
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Define el valor de la propiedad detail.
     * 
     * @param value
     *            allowed object is {@link Detail }
     * 
     */
    public void setDetail(Detail value) {
        this.detail = value;
    }

}
