
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  2 Letter distance unit code
 * 
 * <p>Java class for typeDistance</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeDistance">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="2"/>
 *     <enumeration value="MI"/>
 *     <enumeration value="KM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeDistance", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeDistance {

    MI,
    KM;

    public String value() {
        return name();
    }

    public static TypeDistance fromValue(String v) {
        return valueOf(v);
    }

}
