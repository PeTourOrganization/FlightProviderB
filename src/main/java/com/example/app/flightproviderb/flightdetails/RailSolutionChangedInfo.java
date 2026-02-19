
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
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailPricingSolution"/>
 *       </sequence>
 *       <attribute name="ReasonCode" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Price"/>
 *             <enumeration value="Schedule"/>
 *             <enumeration value="Both"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railPricingSolution"
})
@XmlRootElement(name = "RailSolutionChangedInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailSolutionChangedInfo {

    /**
     * Contains the fares and segments for a particular offer.
     * 
     */
    @XmlElement(name = "RailPricingSolution", namespace = "http://www.travelport.com/schema/rail_v54_0", required = true)
    protected RailPricingSolution railPricingSolution;
    @XmlAttribute(name = "ReasonCode", required = true)
    protected String reasonCode;

    /**
     * Contains the fares and segments for a particular offer.
     * 
     * @return
     *     possible object is
     *     {@link RailPricingSolution }
     *     
     */
    public RailPricingSolution getRailPricingSolution() {
        return railPricingSolution;
    }

    /**
     * Sets the value of the railPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailPricingSolution }
     *     
     * @see #getRailPricingSolution()
     */
    public void setRailPricingSolution(RailPricingSolution value) {
        this.railPricingSolution = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
