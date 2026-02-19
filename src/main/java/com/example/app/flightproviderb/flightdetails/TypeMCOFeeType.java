
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The available Airline service fee types for an MCO
 * 
 * <p>Java class for typeMCOFeeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeMCOFeeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CURRENTLY"/>
 *     <enumeration value="UNDEFINED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeMCOFeeType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeMCOFeeType {

    CURRENTLY,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static TypeMCOFeeType fromValue(String v) {
        return valueOf(v);
    }

}
