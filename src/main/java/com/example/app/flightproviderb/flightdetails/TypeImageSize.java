
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * C - Colossal
 * 
 * <p>Java class for typeImageSize</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeImageSize">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="T"/>
 *     <enumeration value="I"/>
 *     <enumeration value="S"/>
 *     <enumeration value="M"/>
 *     <enumeration value="L"/>
 *     <enumeration value="E"/>
 *     <enumeration value="G"/>
 *     <enumeration value="F"/>
 *     <enumeration value="B"/>
 *     <enumeration value="J"/>
 *     <enumeration value="O"/>
 *     <enumeration value="H"/>
 *     <enumeration value="C"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeImageSize", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeImageSize {

    T,
    I,
    S,
    M,
    L,
    E,
    G,
    F,
    B,
    J,
    O,
    H,
    C;

    public String value() {
        return name();
    }

    public static TypeImageSize fromValue(String v) {
        return valueOf(v);
    }

}
