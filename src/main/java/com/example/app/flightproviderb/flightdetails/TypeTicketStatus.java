
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Status for the ticket (Ticketed, Voided, etc)
 * 
 * <p>Java class for typeTicketStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeTicketStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="1"/>
 *     <enumeration value="U"/>
 *     <enumeration value="T"/>
 *     <enumeration value="V"/>
 *     <enumeration value="R"/>
 *     <enumeration value="X"/>
 *     <enumeration value="Z"/>
 *     <enumeration value="N"/>
 *     <enumeration value="S"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeTicketStatus", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeTicketStatus {


    /**
     * Code="U" Description="Unticketed"
     * 
     */
    U,

    /**
     * Code="T" Description="Ticketed"
     * 
     */
    T,

    /**
     * Code="V" Description="Voided"
     * 
     */
    V,

    /**
     * Code="R" Description="Refunded"
     * 
     */
    R,

    /**
     * Code="X" Description="eXchanged"
     * 
     */
    X,

    /**
     * Code="Z" Description="Unknown/Archived/Carrier Modified"
     * 
     */
    Z,

    /**
     * Code="N" Description="Unused"
     * 
     */
    N,

    /**
     * Code="S" Description="Used"
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static TypeTicketStatus fromValue(String v) {
        return valueOf(v);
    }

}
