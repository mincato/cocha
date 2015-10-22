package com.sabre.webservices.sabrexml._2011._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="ChangeAAA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AccountingCity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OfficeStationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PseudoCityCode" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="3"/&gt;
 *                       &lt;maxLength value="4"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChangeDuty" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;pattern value="[^A-Za-z]"/&gt;
 *                       &lt;length value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChangePartition" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NewPassword" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Password" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PIN" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Code" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="3"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverSign" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Area" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DutyCode" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Organization" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Password" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Username"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0.3" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "changeAAA", "changeDuty", "changePartition", "overSign" })
@XmlRootElement(name = "ContextChangeRQ")
public class ContextChangeRQ {

    @XmlElement(name = "ChangeAAA")
    protected ContextChangeRQ.ChangeAAA changeAAA;
    @XmlElement(name = "ChangeDuty")
    protected ContextChangeRQ.ChangeDuty changeDuty;
    @XmlElement(name = "ChangePartition")
    protected ContextChangeRQ.ChangePartition changePartition;
    @XmlElement(name = "OverSign")
    protected ContextChangeRQ.OverSign overSign;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad changeAAA.
     * 
     * @return possible object is {@link ContextChangeRQ.ChangeAAA }
     * 
     */
    public ContextChangeRQ.ChangeAAA getChangeAAA() {
        return changeAAA;
    }

    /**
     * Define el valor de la propiedad changeAAA.
     * 
     * @param value
     *            allowed object is {@link ContextChangeRQ.ChangeAAA }
     * 
     */
    public void setChangeAAA(ContextChangeRQ.ChangeAAA value) {
        this.changeAAA = value;
    }

    /**
     * Obtiene el valor de la propiedad changeDuty.
     * 
     * @return possible object is {@link ContextChangeRQ.ChangeDuty }
     * 
     */
    public ContextChangeRQ.ChangeDuty getChangeDuty() {
        return changeDuty;
    }

    /**
     * Define el valor de la propiedad changeDuty.
     * 
     * @param value
     *            allowed object is {@link ContextChangeRQ.ChangeDuty }
     * 
     */
    public void setChangeDuty(ContextChangeRQ.ChangeDuty value) {
        this.changeDuty = value;
    }

    /**
     * Obtiene el valor de la propiedad changePartition.
     * 
     * @return possible object is {@link ContextChangeRQ.ChangePartition }
     * 
     */
    public ContextChangeRQ.ChangePartition getChangePartition() {
        return changePartition;
    }

    /**
     * Define el valor de la propiedad changePartition.
     * 
     * @param value
     *            allowed object is {@link ContextChangeRQ.ChangePartition }
     * 
     */
    public void setChangePartition(ContextChangeRQ.ChangePartition value) {
        this.changePartition = value;
    }

    /**
     * Obtiene el valor de la propiedad overSign.
     * 
     * @return possible object is {@link ContextChangeRQ.OverSign }
     * 
     */
    public ContextChangeRQ.OverSign getOverSign() {
        return overSign;
    }

    /**
     * Define el valor de la propiedad overSign.
     * 
     * @param value
     *            allowed object is {@link ContextChangeRQ.OverSign }
     * 
     */
    public void setOverSign(ContextChangeRQ.OverSign value) {
        this.overSign = value;
    }

    /**
     * Obtiene el valor de la propiedad returnHostCommand.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Define el valor de la propiedad returnHostCommand.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStamp.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVersion() {
        if (version == null) {
            return "2.0.3";
        } else {
            return version;
        }
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="AccountingCity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OfficeStationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PseudoCityCode" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="3"/&gt;
     *             &lt;maxLength value="4"/&gt;
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
    @XmlType(name = "")
    public static class ChangeAAA {

        @XmlAttribute(name = "AccountingCity")
        protected String accountingCity;
        @XmlAttribute(name = "AccountingCode")
        protected String accountingCode;
        @XmlAttribute(name = "OfficeStationCode")
        protected String officeStationCode;
        @XmlAttribute(name = "PseudoCityCode", required = true)
        protected String pseudoCityCode;

        /**
         * Obtiene el valor de la propiedad accountingCity.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getAccountingCity() {
            return accountingCity;
        }

        /**
         * Define el valor de la propiedad accountingCity.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setAccountingCity(String value) {
            this.accountingCity = value;
        }

        /**
         * Obtiene el valor de la propiedad accountingCode.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getAccountingCode() {
            return accountingCode;
        }

        /**
         * Define el valor de la propiedad accountingCode.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setAccountingCode(String value) {
            this.accountingCode = value;
        }

        /**
         * Obtiene el valor de la propiedad officeStationCode.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getOfficeStationCode() {
            return officeStationCode;
        }

        /**
         * Define el valor de la propiedad officeStationCode.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setOfficeStationCode(String value) {
            this.officeStationCode = value;
        }

        /**
         * Obtiene el valor de la propiedad pseudoCityCode.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * Define el valor de la propiedad pseudoCityCode.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Code" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;pattern value="[^A-Za-z]"/&gt;
     *             &lt;length value="1"/&gt;
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
    @XmlType(name = "")
    public static class ChangeDuty {

        @XmlAttribute(name = "Code", required = true)
        protected String code;

        /**
         * Obtiene el valor de la propiedad code.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCode() {
            return code;
        }

        /**
         * Define el valor de la propiedad code.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCode(String value) {
            this.code = value;
        }

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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NewPassword" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Password" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PIN" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Code" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="3"/&gt;
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
    @XmlType(name = "", propOrder = { "newPassword", "password", "pin" })
    public static class ChangePartition {

        @XmlElement(name = "NewPassword")
        protected String newPassword;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "PIN")
        protected String pin;
        @XmlAttribute(name = "Code", required = true)
        protected String code;

        /**
         * Obtiene el valor de la propiedad newPassword.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getNewPassword() {
            return newPassword;
        }

        /**
         * Define el valor de la propiedad newPassword.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setNewPassword(String value) {
            this.newPassword = value;
        }

        /**
         * Obtiene el valor de la propiedad password.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPassword() {
            return password;
        }

        /**
         * Define el valor de la propiedad password.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Obtiene el valor de la propiedad pin.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Define el valor de la propiedad pin.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPIN(String value) {
            this.pin = value;
        }

        /**
         * Obtiene el valor de la propiedad code.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCode() {
            return code;
        }

        /**
         * Define el valor de la propiedad code.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCode(String value) {
            this.code = value;
        }

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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Area" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DutyCode" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Organization" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Password" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Username"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "area", "dutyCode", "organization", "password", "username" })
    public static class OverSign {

        @XmlElement(name = "Area")
        protected String area;
        @XmlElement(name = "DutyCode")
        protected String dutyCode;
        @XmlElement(name = "Organization")
        protected String organization;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "Username", required = true)
        protected String username;

        /**
         * Obtiene el valor de la propiedad area.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getArea() {
            return area;
        }

        /**
         * Define el valor de la propiedad area.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setArea(String value) {
            this.area = value;
        }

        /**
         * Obtiene el valor de la propiedad dutyCode.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getDutyCode() {
            return dutyCode;
        }

        /**
         * Define el valor de la propiedad dutyCode.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setDutyCode(String value) {
            this.dutyCode = value;
        }

        /**
         * Obtiene el valor de la propiedad organization.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Define el valor de la propiedad organization.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setOrganization(String value) {
            this.organization = value;
        }

        /**
         * Obtiene el valor de la propiedad password.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPassword() {
            return password;
        }

        /**
         * Define el valor de la propiedad password.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Obtiene el valor de la propiedad username.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define el valor de la propiedad username.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setUsername(String value) {
            this.username = value;
        }

    }

}
