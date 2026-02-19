
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeCarrierCode" />
 *       <attribute name="SecondaryCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IncludeAddlBookingCodeInfo")
public class IncludeAddlBookingCodeInfo {

    /**
     * The type defines that the booking code info is
     *                         for primary or secondary carrier.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypeCarrierCode type;
    /**
     * The secondary carrier code is required when
     *                         type is secondary .
     * 
     */
    @XmlAttribute(name = "SecondaryCarrier")
    protected String secondaryCarrier;

    /**
     * The type defines that the booking code info is
     *                         for primary or secondary carrier.
     * 
     * @return
     *     possible object is
     *     {@link TypeCarrierCode }
     *     
     */
    public TypeCarrierCode getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCarrierCode }
     *     
     * @see #getType()
     */
    public void setType(TypeCarrierCode value) {
        this.type = value;
    }

    /**
     * The secondary carrier code is required when
     *                         type is secondary .
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCarrier() {
        return secondaryCarrier;
    }

    /**
     * Sets the value of the secondaryCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSecondaryCarrier()
     */
    public void setSecondaryCarrier(String value) {
        this.secondaryCarrier = value;
    }

}
