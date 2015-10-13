package com.sabre.webservices.sabrexml._2011._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.sabre.services.stl.v01.ApplicationResults;

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
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/&gt;
 *         &lt;element name="SecurityToken" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "applicationResults", "securityToken", "text" })
@XmlRootElement(name = "ContextChangeRS")
public class ContextChangeRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "SecurityToken")
    protected ContextChangeRS.SecurityToken securityToken;
    @XmlElement(name = "Text")
    protected List<String> text;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad applicationResults.
     * 
     * @return possible object is {@link ApplicationResults }
     * 
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Define el valor de la propiedad applicationResults.
     * 
     * @param value
     *            allowed object is {@link ApplicationResults }
     * 
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Obtiene el valor de la propiedad securityToken.
     * 
     * @return possible object is {@link ContextChangeRS.SecurityToken }
     * 
     */
    public ContextChangeRS.SecurityToken getSecurityToken() {
        return securityToken;
    }

    /**
     * Define el valor de la propiedad securityToken.
     * 
     * @param value
     *            allowed object is {@link ContextChangeRS.SecurityToken }
     * 
     */
    public void setSecurityToken(ContextChangeRS.SecurityToken value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     * 
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class SecurityToken {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Updated")
        protected Boolean updated;

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
         * Obtiene el valor de la propiedad updated.
         * 
         * @return possible object is {@link Boolean }
         * 
         */
        public Boolean isUpdated() {
            return updated;
        }

        /**
         * Define el valor de la propiedad updated.
         * 
         * @param value
         *            allowed object is {@link Boolean }
         * 
         */
        public void setUpdated(Boolean value) {
            this.updated = value;
        }

    }

}
