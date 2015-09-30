
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticLevels.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticLevels"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mock"/&gt;
 *     &lt;enumeration value="Simulate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticLevels")
@XmlEnum
public enum DiagnosticLevels {


    /**
     * Return a sample message without invoking service logic.
     * 
     */
    @XmlEnumValue("Mock")
    MOCK("Mock"),

    /**
     * Compute response without making changes to service data, state or status.
     * 
     */
    @XmlEnumValue("Simulate")
    SIMULATE("Simulate");
    private final String value;

    DiagnosticLevels(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticLevels fromValue(String v) {
        for (DiagnosticLevels c: DiagnosticLevels.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
