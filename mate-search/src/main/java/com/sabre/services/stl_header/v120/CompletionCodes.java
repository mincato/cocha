package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para CompletionCodes.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="CompletionCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Incomplete"/&gt;
 *     &lt;enumeration value="NotProcessed"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompletionCodes")
@XmlEnum
public enum CompletionCodes {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"), @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"), @XmlEnumValue("NotProcessed")
    NOT_PROCESSED("NotProcessed"), @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");

    private final String value;

    CompletionCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompletionCodes fromValue(String v) {
        for (CompletionCodes c : CompletionCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
