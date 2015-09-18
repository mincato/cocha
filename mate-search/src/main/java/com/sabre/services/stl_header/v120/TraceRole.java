package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para TraceRole.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="TraceRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="consumer"/&gt;
 *     &lt;enumeration value="provider"/&gt;
 *     &lt;enumeration value="gateway"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TraceRole")
@XmlEnum
public enum TraceRole {

    /**
     * the system that initiated the service request and will be the ultimate
     * consumer of the service results.
     * 
     */
    @XmlEnumValue("consumer")
    CONSUMER("consumer"),

    /**
     * System that performs the service operation defined in the service
     * interface. For RQ/RS exchange patterns, the provider reads the request
     * message, applies business logic and returns a response.
     * 
     */
    @XmlEnumValue("provider")
    PROVIDER("provider"), @XmlEnumValue("gateway")
    GATEWAY("gateway");

    private final String value;

    TraceRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceRole fromValue(String v) {
        for (TraceRole c : TraceRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
