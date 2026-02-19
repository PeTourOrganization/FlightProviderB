
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The available types for an MCO
 * 
 * <p>Java class for typeMCOType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeMCOType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AgencyServiceFee"/>
 *     <enumeration value="ExchangeResidual"/>
 *     <enumeration value="AirlineServiceFee"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeMCOType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeMCOType {

    @XmlEnumValue("AgencyServiceFee")
    AGENCY_SERVICE_FEE("AgencyServiceFee"),
    @XmlEnumValue("ExchangeResidual")
    EXCHANGE_RESIDUAL("ExchangeResidual"),
    @XmlEnumValue("AirlineServiceFee")
    AIRLINE_SERVICE_FEE("AirlineServiceFee");
    private final String value;

    TypeMCOType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TypeMCOType fromValue(String v) {
        for (TypeMCOType c: TypeMCOType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
