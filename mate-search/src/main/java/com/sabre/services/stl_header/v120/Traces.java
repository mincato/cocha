package com.sabre.services.stl_header.v120;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para Traces complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Traces"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Trace" type="{http://services.sabre.com/STL_Header/v120}TraceRecord" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traces", propOrder = { "trace" })
public class Traces {

    @XmlElement(name = "Trace")
    protected List<TraceRecord> trace;

    /**
     * Gets the value of the trace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the trace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTrace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraceRecord }
     * 
     * 
     */
    public List<TraceRecord> getTrace() {
        if (trace == null) {
            trace = new ArrayList<TraceRecord>();
        }
        return this.trace;
    }

}
