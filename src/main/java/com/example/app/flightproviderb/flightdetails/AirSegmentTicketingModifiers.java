
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
 *       <attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BrandTier" use="required" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to10" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AirSegmentTicketingModifiers")
public class AirSegmentTicketingModifiers {

    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    /**
     * Modifier to price by specific brand tier number.
     * 
     */
    @XmlAttribute(name = "BrandTier", required = true)
    protected String brandTier;

    /**
     * Gets the value of the airSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
    }

    /**
     * Modifier to price by specific brand tier number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandTier() {
        return brandTier;
    }

    /**
     * Sets the value of the brandTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandTier()
     */
    public void setBrandTier(String value) {
        this.brandTier = value;
    }

}
