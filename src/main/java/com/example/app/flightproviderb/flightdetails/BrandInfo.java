
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
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BrandID" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeBrandId" />
 *       <attribute name="AirPricingInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FareInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BrandInfo")
public class BrandInfo {

    /**
     * Brand Key
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The unique identifier of the brand
     * 
     */
    @XmlAttribute(name = "BrandID", required = true)
    protected String brandID;
    /**
     * A reference to a AirPricing. Providers: ACH, 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "AirPricingInfoRef")
    protected String airPricingInfoRef;
    /**
     * A reference to a FareInfo. Providers: ACH, 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;

    /**
     * Brand Key
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

    /**
     * The unique identifier of the brand
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandID()
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * A reference to a AirPricing. Providers: ACH, 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPricingInfoRef() {
        return airPricingInfoRef;
    }

    /**
     * Sets the value of the airPricingInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirPricingInfoRef()
     */
    public void setAirPricingInfoRef(String value) {
        this.airPricingInfoRef = value;
    }

    /**
     * A reference to a FareInfo. Providers: ACH, 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareInfoRef()
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

}
