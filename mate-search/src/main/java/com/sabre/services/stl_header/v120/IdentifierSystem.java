
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * System identifier used to uniquily identify the specific system.
 *  	"Source" is used to return the application name responsible for fulfilling the particular request transaction.
 * 	"ApplicationInstance" is used to return the application instance responsible for fulfilling the particular request transaction.
 * 	"Cluster" is used to return the application cluster responsible for fulfilling the particular request transaction.
 * 	"HostName" is used to return the particular server name responsible for fulfilling the particular request transaction.
 * 	 Example: Source ApplicationInstance="PROD1" Cluster="PROD TPF SCC" HostName="PSS" TPF Source
 * 
 * <p>Clase Java para Identifier.System complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Identifier.System"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120&gt;Identifier"&gt;
 *       &lt;attribute name="instance" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *       &lt;attribute name="cluster" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *       &lt;attribute name="host" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *       &lt;attribute name="uri" type="{http://services.sabre.com/STL_Header/v120}Identifier" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier.System", propOrder = {
    "value"
})
public class IdentifierSystem {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "instance")
    protected String instance;
    @XmlAttribute(name = "cluster")
    protected String cluster;
    @XmlAttribute(name = "host")
    protected String host;
    @XmlAttribute(name = "uri")
    protected String uri;

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
     * Obtiene el valor de la propiedad instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Define el valor de la propiedad instance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
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
     * Obtiene el valor de la propiedad uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Define el valor de la propiedad uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
