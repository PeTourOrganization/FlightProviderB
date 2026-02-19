
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Queue action: remove, requeue, move, add, unlock
 * 
 * <p>Java class for typeQueueModifyAction</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeQueueModifyAction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Remove"/>
 *     <enumeration value="Requeue"/>
 *     <enumeration value="Move"/>
 *     <enumeration value="Add"/>
 *     <enumeration value="Unlock"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeQueueModifyAction", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeQueueModifyAction {

    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Requeue")
    REQUEUE("Requeue"),
    @XmlEnumValue("Move")
    MOVE("Move"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Unlock")
    UNLOCK("Unlock");
    private final String value;

    TypeQueueModifyAction(String v) {
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
    public static TypeQueueModifyAction fromValue(String v) {
        for (TypeQueueModifyAction c: TypeQueueModifyAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
