
package net.readify.knockknock;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriangleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriangleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Equilateral"/>
 *     &lt;enumeration value="Isosceles"/>
 *     &lt;enumeration value="Scalene"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriangleType")
@XmlEnum
public enum TriangleType {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Equilateral")
    EQUILATERAL("Equilateral"),
    @XmlEnumValue("Isosceles")
    ISOSCELES("Isosceles"),
    @XmlEnumValue("Scalene")
    SCALENE("Scalene");
    private final String value;

    TriangleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriangleType fromValue(String v) {
        for (TriangleType c: TriangleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
