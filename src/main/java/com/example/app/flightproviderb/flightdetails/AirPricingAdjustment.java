
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Adjustment"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adjustment"
})
@XmlRootElement(name = "AirPricingAdjustment")
public class AirPricingAdjustment {

    /**
     * An indentifier which indentifies adjustment made
     *                 on original pricing. It can a flat amount or percentage of original
     *                 price. The value of Amount/Percent can be negetive. Negative value
     *                 implies a discount.
     * 
     */
    @XmlElement(name = "Adjustment", required = true)
    protected Adjustment adjustment;
    /**
     * Key of AirPricingInfo from booking.
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * An indentifier which indentifies adjustment made
     *                 on original pricing. It can a flat amount or percentage of original
     *                 price. The value of Amount/Percent can be negetive. Negative value
     *                 implies a discount.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment }
     *     
     */
    public Adjustment getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment }
     *     
     * @see #getAdjustment()
     */
    public void setAdjustment(Adjustment value) {
        this.adjustment = value;
    }

    /**
     * Key of AirPricingInfo from booking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

}
