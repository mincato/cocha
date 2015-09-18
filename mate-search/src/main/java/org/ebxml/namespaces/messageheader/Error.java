package org.ebxml.namespaces.messageheader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

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
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Description" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.ebxml.org/namespaces/messageHeader}id"/&gt;
 *       &lt;attribute name="codeContext" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="urn:oasis:names:tc:ebxml-msg:service:errors" /&gt;
 *       &lt;attribute name="errorCode" use="required" type="{http://www.ebxml.org/namespaces/messageHeader}non-empty-string" /&gt;
 *       &lt;attribute name="severity" use="required" type="{http://www.ebxml.org/namespaces/messageHeader}severity.type" /&gt;
 *       &lt;attribute name="location" type="{http://www.ebxml.org/namespaces/messageHeader}non-empty-string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "description", "any" })
@XmlRootElement(name = "Error")
public class Error {

    @XmlElement(name = "Description")
    protected Description description;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "id", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "codeContext", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @XmlSchemaType(name = "anyURI")
    protected String codeContext;
    @XmlAttribute(name = "errorCode", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String errorCode;
    @XmlAttribute(name = "severity", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected SeverityType severity;
    @XmlAttribute(name = "location", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    protected String location;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *            allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad codeContext.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCodeContext() {
        if (codeContext == null) {
            return "urn:oasis:names:tc:ebxml-msg:service:errors";
        } else {
            return codeContext;
        }
    }

    /**
     * Define el valor de la propiedad codeContext.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad severity.
     * 
     * @return possible object is {@link SeverityType }
     * 
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Define el valor de la propiedad severity.
     * 
     * @param value
     *            allowed object is {@link SeverityType }
     * 
     */
    public void setSeverity(SeverityType value) {
        this.severity = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed
     * property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and the value is the string
     * value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute by
     * updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
