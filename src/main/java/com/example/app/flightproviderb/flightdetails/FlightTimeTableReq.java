
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseSearchReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightTimeTableCriteria"/>
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
    "flightTimeTableCriteria"
})
@XmlRootElement(name = "FlightTimeTableReq")
public class FlightTimeTableReq
    extends BaseSearchReq
{

    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "FlightTimeTableCriteria", required = true)
    protected FlightTimeTableCriteria flightTimeTableCriteria;

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeTableCriteria }
     *     
     */
    public FlightTimeTableCriteria getFlightTimeTableCriteria() {
        return flightTimeTableCriteria;
    }

    /**
     * Sets the value of the flightTimeTableCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeTableCriteria }
     *     
     * @see #getFlightTimeTableCriteria()
     */
    public void setFlightTimeTableCriteria(FlightTimeTableCriteria value) {
        this.flightTimeTableCriteria = value;
    }

}
