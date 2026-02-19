
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Other unknown image sizes
 * 
 * <p>Java class for typeOtherImageSize</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeOtherImageSize">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="X"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeOtherImageSize", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeOtherImageSize {

    X;

    public String value() {
        return name();
    }

    public static TypeOtherImageSize fromValue(String v) {
        return valueOf(v);
    }

}
