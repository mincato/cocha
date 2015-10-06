
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Diagnostics complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Diagnostics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Level" type="{http://services.sabre.com/STL_Header/v120}DiagnosticLevels" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://services.sabre.com/STL_Header/v120}Text.Long" minOccurs="0"/&gt;
 *         &lt;element name="Diagnostic" type="{http://services.sabre.com/STL_Header/v120}DiagnosticResults" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnostics", propOrder = {
    "level",
    "data",
    "diagnostic"
})
public class Diagnostics {

    @XmlElement(name = "Level")
    @XmlSchemaType(name = "string")
    protected DiagnosticLevels level;
    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "Diagnostic")
    protected DiagnosticResults diagnostic;

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticLevels }
     *     
     */
    public DiagnosticLevels getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticLevels }
     *     
     */
    public void setLevel(DiagnosticLevels value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnostic.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticResults }
     *     
     */
    public DiagnosticResults getDiagnostic() {
        return diagnostic;
    }

    /**
     * Define el valor de la propiedad diagnostic.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticResults }
     *     
     */
    public void setDiagnostic(DiagnosticResults value) {
        this.diagnostic = value;
    }

}
