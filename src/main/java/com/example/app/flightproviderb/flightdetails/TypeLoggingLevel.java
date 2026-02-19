
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of various Logging levels
 * 
 * <p>Java class for typeLoggingLevel</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeLoggingLevel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRACE"/>
 *     <enumeration value="DEBUG"/>
 *     <enumeration value="INFO"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="ERROR"/>
 *     <enumeration value="FATAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeLoggingLevel", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeLoggingLevel {

    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    FATAL;

    public String value() {
        return name();
    }

    public static TypeLoggingLevel fromValue(String v) {
        return valueOf(v);
    }

}
