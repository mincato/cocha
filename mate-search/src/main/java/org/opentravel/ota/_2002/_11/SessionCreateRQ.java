package org.opentravel.ota._2002._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="POS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Source"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="returnContextID" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pos" })
@XmlRootElement(name = "SessionCreateRQ")
public class SessionCreateRQ {

    @XmlElement(name = "POS", required = true)
    protected SessionCreateRQ.POS pos;
    @XmlAttribute(name = "returnContextID")
    protected Boolean returnContextID;

    /**
     * Obtiene el valor de la propiedad pos.
     * 
     * @return possible object is {@link SessionCreateRQ.POS }
     * 
     */
    public SessionCreateRQ.POS getPOS() {
        return pos;
    }

    /**
     * Define el valor de la propiedad pos.
     * 
     * @param value
     *            allowed object is {@link SessionCreateRQ.POS }
     * 
     */
    public void setPOS(SessionCreateRQ.POS value) {
        this.pos = value;
    }

    /**
     * Obtiene el valor de la propiedad returnContextID.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isReturnContextID() {
        return returnContextID;
    }

    /**
     * Define el valor de la propiedad returnContextID.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setReturnContextID(Boolean value) {
        this.returnContextID = value;
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
     *         &lt;element name="Source"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = { "source" })
    public static class POS {

        @XmlElement(name = "Source", required = true)
        protected SessionCreateRQ.POS.Source source;

        /**
         * Obtiene el valor de la propiedad source.
         * 
         * @return possible object is {@link SessionCreateRQ.POS.Source }
         * 
         */
        public SessionCreateRQ.POS.Source getSource() {
            return source;
        }

        /**
         * Define el valor de la propiedad source.
         * 
         * @param value
         *            allowed object is {@link SessionCreateRQ.POS.Source }
         * 
         */
        public void setSource(SessionCreateRQ.POS.Source value) {
            this.source = value;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         * 
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Source {

            @XmlAttribute(name = "PseudoCityCode", required = true)
            protected String pseudoCityCode;

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

    }

}
