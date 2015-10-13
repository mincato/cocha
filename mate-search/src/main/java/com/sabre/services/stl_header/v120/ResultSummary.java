package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para ResultSummary complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Success" type="{http://services.sabre.com/STL_Header/v120}EmptyElement"/&gt;
 *         &lt;element name="Error" type="{http://services.sabre.com/STL_Header/v120}ProblemSummary"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSummary", propOrder = { "success", "error" })
public class ResultSummary {

    @XmlElement(name = "Success")
    protected String success;
    @XmlElement(name = "Error")
    protected ProblemSummary error;

    /**
     * Obtiene el valor de la propiedad success.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Define el valor de la propiedad success.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSuccess(String value) {
        this.success = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return possible object is {@link ProblemSummary }
     * 
     */
    public ProblemSummary getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *            allowed object is {@link ProblemSummary }
     * 
     */
    public void setError(ProblemSummary value) {
        this.error = value;
    }

}
