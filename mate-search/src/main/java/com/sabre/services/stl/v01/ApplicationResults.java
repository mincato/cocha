package com.sabre.services.stl.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sabre.services.stl_header.v120.CompletionCodes;

/**
 * <p>
 * Clase Java para ApplicationResults complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApplicationResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.sabre.com/STL/v01}Results"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Success" type="{http://services.sabre.com/STL/v01}ProblemInformation" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://services.sabre.com/STL/v01}ProblemInformation" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://services.sabre.com/STL/v01}ProblemInformation" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" use="required" type="{http://services.sabre.com/STL_Header/v120}CompletionCodes" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationResults", propOrder = { "success", "error", "warning" })
public class ApplicationResults extends Results {

    @XmlElement(name = "Success")
    protected List<ProblemInformation> success;
    @XmlElement(name = "Error")
    protected List<ProblemInformation> error;
    @XmlElement(name = "Warning")
    protected List<ProblemInformation> warning;
    @XmlAttribute(name = "status", required = true)
    protected CompletionCodes status;

    /**
     * Gets the value of the success property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the success property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblemInformation }
     * 
     * 
     */
    public List<ProblemInformation> getSuccess() {
        if (success == null) {
            success = new ArrayList<ProblemInformation>();
        }
        return this.success;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblemInformation }
     * 
     * 
     */
    public List<ProblemInformation> getError() {
        if (error == null) {
            error = new ArrayList<ProblemInformation>();
        }
        return this.error;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblemInformation }
     * 
     * 
     */
    public List<ProblemInformation> getWarning() {
        if (warning == null) {
            warning = new ArrayList<ProblemInformation>();
        }
        return this.warning;
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

}
