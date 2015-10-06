
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Record for all systems (consumer, proxies and gateways, providers) to use to trace the message. 
 * 			The value is the common system name.
 * 
 * <p>Clase Java para TraceRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TraceRecord"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120&gt;Identifier"&gt;
 *       &lt;attribute name="key" type="{http://services.sabre.com/STL_Header/v120}Text.Long" /&gt;
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="appInstance" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *       &lt;attribute name="cluster" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *       &lt;attribute name="host" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *       &lt;attribute name="targetURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="role" type="{http://services.sabre.com/STL_Header/v120}TraceRole" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceRecord", propOrder = {
    "value"
})
public class TraceRecord {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "end")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlAttribute(name = "appInstance")
    protected String appInstance;
    @XmlAttribute(name = "cluster")
    protected String cluster;
    @XmlAttribute(name = "host")
    protected String host;
    @XmlAttribute(name = "targetURI")
    @XmlSchemaType(name = "anyURI")
    protected String targetURI;
    @XmlAttribute(name = "role")
    protected TraceRole role;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Define el valor de la propiedad key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Obtiene el valor de la propiedad start.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Define el valor de la propiedad start.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Obtiene el valor de la propiedad end.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Define el valor de la propiedad end.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Obtiene el valor de la propiedad appInstance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInstance() {
        return appInstance;
    }

    /**
     * Define el valor de la propiedad appInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInstance(String value) {
        this.appInstance = value;
    }

    /**
     * Obtiene el valor de la propiedad cluster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * Define el valor de la propiedad cluster.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCluster(String value) {
        this.cluster = value;
    }

    /**
     * Obtiene el valor de la propiedad host.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Define el valor de la propiedad host.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Obtiene el valor de la propiedad targetURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetURI() {
        return targetURI;
    }

    /**
     * Define el valor de la propiedad targetURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetURI(String value) {
        this.targetURI = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link TraceRole }
     *     
     */
    public TraceRole getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceRole }
     *     
     */
    public void setRole(TraceRole value) {
        this.role = value;
    }

}
