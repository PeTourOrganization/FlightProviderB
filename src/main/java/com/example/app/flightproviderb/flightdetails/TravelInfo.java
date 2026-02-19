
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
 *       <attribute name="TripName">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="50"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TravelPurpose">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="50"/>
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
@XmlType(name = "")
@XmlRootElement(name = "TravelInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TravelInfo {

    /**
     * Trip Name
     * 
     */
    @XmlAttribute(name = "TripName")
    protected String tripName;
    /**
     * Purpose of the trip
     * 
     */
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;

    /**
     * Trip Name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripName() {
        return tripName;
    }

    /**
     * Sets the value of the tripName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTripName()
     */
    public void setTripName(String value) {
        this.tripName = value;
    }

    /**
     * Purpose of the trip
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * Sets the value of the travelPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelPurpose()
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }

}
