
package org.ebxml.namespaces.messageheader;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para messageStatus.type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="messageStatus.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="UnAuthorized"/&gt;
 *     &lt;enumeration value="NotRecognized"/&gt;
 *     &lt;enumeration value="Received"/&gt;
 *     &lt;enumeration value="Processed"/&gt;
 *     &lt;enumeration value="Forwarded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "messageStatus.type")
@XmlEnum
public enum MessageStatusType {

    @XmlEnumValue("UnAuthorized")
    UN_AUTHORIZED("UnAuthorized"),
    @XmlEnumValue("NotRecognized")
    NOT_RECOGNIZED("NotRecognized"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Forwarded")
    FORWARDED("Forwarded");
    private final String value;

    MessageStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageStatusType fromValue(String v) {
        for (MessageStatusType c: MessageStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
