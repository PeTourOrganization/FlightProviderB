
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Values to specify the state of the element. "A" refers to "Add" , "M" refers to "Modified"
 *             and "C" refers to error conditions when value provided in "Key" attribute is not retained in response
 * 
 * <p>Java class for typeElementStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeElementStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="M"/>
 *     <enumeration value="C"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeElementStatus", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeElementStatus {

    A,
    M,
    C;

    public String value() {
        return name();
    }

    public static TypeElementStatus fromValue(String v) {
        return valueOf(v);
    }

}
