
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
 *     <extension base="{http://www.travelport.com/schema/rail_v54_0}typeRailPricingSolution">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailExchangeInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railExchangeInfo"
})
@XmlRootElement(name = "RailExchangeSolution", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailExchangeSolution
    extends TypeRailPricingSolution
{

    /**
     * Exchange information for the rail booking.
     * 
     */
    @XmlElement(name = "RailExchangeInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailExchangeInfo railExchangeInfo;

    /**
     * Exchange information for the rail booking.
     * 
     * @return
     *     possible object is
     *     {@link RailExchangeInfo }
     *     
     */
    public RailExchangeInfo getRailExchangeInfo() {
        return railExchangeInfo;
    }

    /**
     * Sets the value of the railExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailExchangeInfo }
     *     
     * @see #getRailExchangeInfo()
     */
    public void setRailExchangeInfo(RailExchangeInfo value) {
        this.railExchangeInfo = value;
    }

}
