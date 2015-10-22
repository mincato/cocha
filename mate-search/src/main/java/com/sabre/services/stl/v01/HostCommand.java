package com.sabre.services.stl.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Clase Java para HostCommand complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HostCommand"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120&gt;Text.Long"&gt;
 *       &lt;attribute name="LNIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCommand", propOrder = { "value" })
public class HostCommand {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LNIATA")
    protected String lniata;

    /**
     * Same as STL Text.Long - A field text characters and no other constraints.
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
     * Obtiene el valor de la propiedad lniata.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLNIATA() {
        return lniata;
    }

    /**
     * Define el valor de la propiedad lniata.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLNIATA(String value) {
        this.lniata = value;
    }

}
