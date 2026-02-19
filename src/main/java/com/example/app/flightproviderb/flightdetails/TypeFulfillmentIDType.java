
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * IdentificationType to define how the customer will identify himself when collecting the ticket
 * 
 * <p>Java class for typeFulfillmentIDType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFulfillmentIDType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Bahn Card"/>
 *     <enumeration value="Credit Card"/>
 *     <enumeration value="Euro Cheque Card"/>
 *     <enumeration value="Collection Reference"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFulfillmentIDType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeFulfillmentIDType {

    @XmlEnumValue("Bahn Card")
    BAHN_CARD("Bahn Card"),
    @XmlEnumValue("Credit Card")
    CREDIT_CARD("Credit Card"),
    @XmlEnumValue("Euro Cheque Card")
    EURO_CHEQUE_CARD("Euro Cheque Card"),
    @XmlEnumValue("Collection Reference")
    COLLECTION_REFERENCE("Collection Reference");
    private final String value;

    TypeFulfillmentIDType(String v) {
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
    public static TypeFulfillmentIDType fromValue(String v) {
        for (TypeFulfillmentIDType c: TypeFulfillmentIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
