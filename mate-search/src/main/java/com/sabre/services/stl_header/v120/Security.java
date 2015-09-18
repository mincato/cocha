package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Header records no longer contain user credentials (username/password) as
 * these are needed only for SessionCreateRQ in which the credentials should be
 * in the payload.
 * 
 * <p>
 * Clase Java para Security complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Security"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SecurityToken" type="{http://services.sabre.com/STL_Header/v120}Text.Long"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security", propOrder = { "securityToken" })
public class Security {

    @XmlElement(name = "SecurityToken")
    protected String securityToken;

    /**
     * Obtiene el valor de la propiedad securityToken.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Define el valor de la propiedad securityToken.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

}
