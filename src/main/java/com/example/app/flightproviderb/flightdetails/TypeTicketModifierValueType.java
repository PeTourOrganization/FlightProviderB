
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ticketing Modifier used to add value
 *                 discount information.
 * 
 * <p>Java class for typeTicketModifierValueType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTicketModifierValueType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *       <attribute name="NetFareValue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTicketModifierValueType", propOrder = {
    "value"
})
public class TypeTicketModifierValueType {

    @XmlElement(name = "Value", required = true)
    protected String value;
    /**
     * Treat the value as net fare discount
     *                     information
     * 
     */
    @XmlAttribute(name = "NetFareValue")
    protected Boolean netFareValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Treat the value as net fare discount
     *                     information
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetFareValue() {
        return netFareValue;
    }

    /**
     * Sets the value of the netFareValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNetFareValue()
     */
    public void setNetFareValue(Boolean value) {
        this.netFareValue = value;
    }

}
