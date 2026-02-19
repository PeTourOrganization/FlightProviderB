
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ATA/IATA Standard coupon status.
 * 
 * <p>Java class for typeCouponStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeCouponStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="1"/>
 *     <enumeration value="A"/>
 *     <enumeration value="C"/>
 *     <enumeration value="F"/>
 *     <enumeration value="L"/>
 *     <enumeration value="O"/>
 *     <enumeration value="P"/>
 *     <enumeration value="R"/>
 *     <enumeration value="E"/>
 *     <enumeration value="V"/>
 *     <enumeration value="Z"/>
 *     <enumeration value="U"/>
 *     <enumeration value="S"/>
 *     <enumeration value="I"/>
 *     <enumeration value="D"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeCouponStatus")
@XmlEnum
public enum TypeCouponStatus {


    /**
     * Code="A" Status="Airport Controlled".
     * 
     */
    A,

    /**
     * Code="C" Status="Checked In"
     * 
     */
    C,

    /**
     * Code="F" Status="Flown/Used"
     * 
     */
    F,

    /**
     * Code="L" Status="Boarded/Lifted"
     * 
     */
    L,

    /**
     * Code="O" Status="Open"
     * 
     */
    O,

    /**
     * Code="P" Status="Printed"
     * 
     */
    P,

    /**
     * Code="R" Status="Refunded"
     * 
     */
    R,

    /**
     * Code="E" Status="Exchanged"
     * 
     */
    E,

    /**
     * Code="V" Status="Void"
     * 
     */
    V,

    /**
     * Code="Z" Status="Archived/Carrier
     *                         Modified"
     * 
     */
    Z,

    /**
     * Code="U" Status="Unavailable"
     * 
     */
    U,

    /**
     * Code="S" Status="Suspended"
     * 
     */
    S,

    /**
     * Code="I" Status="Irregular Ops"
     * 
     */
    I,

    /**
     * Code="D" "Deleted/Removed"
     * 
     */
    D;

    public String value() {
        return name();
    }

    public static TypeCouponStatus fromValue(String v) {
        return valueOf(v);
    }

}
