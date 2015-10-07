
package com.sabre.services.stl.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All message roots should be created as an extension of this base type. Global message elements
 * 				must declare they are a member of the STL_Payload substitution group. This type may be used when an empty payload is
 * 				needed for error handling.
 * 
 * <p>Clase Java para STL_Payload complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="STL_Payload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="255"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STL_Payload", propOrder = {
    "applicationResults"
})
public class STLPayload {

    @XmlElement(name = "ApplicationResults")
    protected ApplicationResults applicationResults;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad applicationResults.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Define el valor de la propiedad applicationResults.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
