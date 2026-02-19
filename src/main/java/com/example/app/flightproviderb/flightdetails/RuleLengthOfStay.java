
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="MinimumStay" type="{http://www.travelport.com/schema/air_v54_0}typeRestrictionLengthOfStay" minOccurs="0"/>
 *         <element name="MaximumStay" type="{http://www.travelport.com/schema/air_v54_0}typeRestrictionLengthOfStay" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "minimumStay",
    "maximumStay"
})
@XmlRootElement(name = "RuleLengthOfStay")
public class RuleLengthOfStay {

    @XmlElement(name = "MinimumStay")
    protected TypeRestrictionLengthOfStay minimumStay;
    @XmlElement(name = "MaximumStay")
    protected TypeRestrictionLengthOfStay maximumStay;

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRestrictionLengthOfStay }
     *     
     */
    public TypeRestrictionLengthOfStay getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRestrictionLengthOfStay }
     *     
     */
    public void setMinimumStay(TypeRestrictionLengthOfStay value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRestrictionLengthOfStay }
     *     
     */
    public TypeRestrictionLengthOfStay getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRestrictionLengthOfStay }
     *     
     */
    public void setMaximumStay(TypeRestrictionLengthOfStay value) {
        this.maximumStay = value;
    }

}
