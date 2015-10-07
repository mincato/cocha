
package org.xmlsoap.schemas.ws._2002._12.secext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsernameToken" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SabreAth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BinarySecurityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usernameToken",
    "sabreAth",
    "binarySecurityToken"
})
@XmlRootElement(name = "Security")
public class Security {

    @XmlElement(name = "UsernameToken")
    protected Security.UsernameToken usernameToken;
    @XmlElement(name = "SabreAth")
    protected String sabreAth;
    @XmlElement(name = "BinarySecurityToken")
    protected String binarySecurityToken;

    /**
     * Obtiene el valor de la propiedad usernameToken.
     * 
     * @return
     *     possible object is
     *     {@link Security.UsernameToken }
     *     
     */
    public Security.UsernameToken getUsernameToken() {
        return usernameToken;
    }

    /**
     * Define el valor de la propiedad usernameToken.
     * 
     * @param value
     *     allowed object is
     *     {@link Security.UsernameToken }
     *     
     */
    public void setUsernameToken(Security.UsernameToken value) {
        this.usernameToken = value;
    }

    /**
     * Obtiene el valor de la propiedad sabreAth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSabreAth() {
        return sabreAth;
    }

    /**
     * Define el valor de la propiedad sabreAth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSabreAth(String value) {
        this.sabreAth = value;
    }

    /**
     * Obtiene el valor de la propiedad binarySecurityToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinarySecurityToken() {
        return binarySecurityToken;
    }

    /**
     * Define el valor de la propiedad binarySecurityToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinarySecurityToken(String value) {
        this.binarySecurityToken = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "password",
        "newPassword",
        "organization",
        "domain"
    })
    public static class UsernameToken {

        @XmlElement(name = "Username")
        protected String username;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "NewPassword")
        protected List<String> newPassword;
        @XmlElement(name = "Organization", namespace = "")
        protected String organization;
        @XmlElement(name = "Domain", namespace = "")
        protected String domain;

        /**
         * Obtiene el valor de la propiedad username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define el valor de la propiedad username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Obtiene el valor de la propiedad password.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Define el valor de la propiedad password.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the newPassword property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newPassword property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewPassword().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNewPassword() {
            if (newPassword == null) {
                newPassword = new ArrayList<String>();
            }
            return this.newPassword;
        }

        /**
         * Obtiene el valor de la propiedad organization.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Define el valor de la propiedad organization.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganization(String value) {
            this.organization = value;
        }

        /**
         * Obtiene el valor de la propiedad domain.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Define el valor de la propiedad domain.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }

    }

}
