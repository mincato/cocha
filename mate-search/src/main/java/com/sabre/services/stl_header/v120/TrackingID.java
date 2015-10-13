package com.sabre.services.stl_header.v120;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Tracking Identifier is an identifier intended for use to a set of related
 * items and provide an optional sequence number for the items.
 * 
 * <p>
 * Clase Java para TrackingID complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrackingID"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120&gt;Identifier"&gt;
 *       &lt;attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingID", propOrder = { "value" })
public class TrackingID {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "seq")
    protected BigInteger seq;

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
     * Obtiene el valor de la propiedad seq.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Define el valor de la propiedad seq.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

}
