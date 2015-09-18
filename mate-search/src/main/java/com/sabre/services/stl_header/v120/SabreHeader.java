package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para SabreHeader complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SabreHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Service"/&gt;
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Identification"/&gt;
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}ResultSummary" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Security" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Traces" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Diagnostics" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SabreHeader", propOrder = { "service", "identification", "resultSummary", "security", "traces",
        "diagnostics" })
public class SabreHeader {

    @XmlElement(name = "Service", required = true)
    protected Service service;
    @XmlElement(name = "Identification", required = true)
    protected Identification identification;
    @XmlElement(name = "ResultSummary")
    protected ResultSummary resultSummary;
    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Traces")
    protected Traces traces;
    @XmlElement(name = "Diagnostics")
    protected Diagnostics diagnostics;

    /**
     * Obtiene el valor de la propiedad service.
     * 
     * @return possible object is {@link Service }
     * 
     */
    public Service getService() {
        return service;
    }

    /**
     * Define el valor de la propiedad service.
     * 
     * @param value
     *            allowed object is {@link Service }
     * 
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * Obtiene el valor de la propiedad identification.
     * 
     * @return possible object is {@link Identification }
     * 
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Define el valor de la propiedad identification.
     * 
     * @param value
     *            allowed object is {@link Identification }
     * 
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Obtiene el valor de la propiedad resultSummary.
     * 
     * @return possible object is {@link ResultSummary }
     * 
     */
    public ResultSummary getResultSummary() {
        return resultSummary;
    }

    /**
     * Define el valor de la propiedad resultSummary.
     * 
     * @param value
     *            allowed object is {@link ResultSummary }
     * 
     */
    public void setResultSummary(ResultSummary value) {
        this.resultSummary = value;
    }

    /**
     * Obtiene el valor de la propiedad security.
     * 
     * @return possible object is {@link Security }
     * 
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Define el valor de la propiedad security.
     * 
     * @param value
     *            allowed object is {@link Security }
     * 
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Obtiene el valor de la propiedad traces.
     * 
     * @return possible object is {@link Traces }
     * 
     */
    public Traces getTraces() {
        return traces;
    }

    /**
     * Define el valor de la propiedad traces.
     * 
     * @param value
     *            allowed object is {@link Traces }
     * 
     */
    public void setTraces(Traces value) {
        this.traces = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnostics.
     * 
     * @return possible object is {@link Diagnostics }
     * 
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * Define el valor de la propiedad diagnostics.
     * 
     * @param value
     *            allowed object is {@link Diagnostics }
     * 
     */
    public void setDiagnostics(Diagnostics value) {
        this.diagnostics = value;
    }

}
