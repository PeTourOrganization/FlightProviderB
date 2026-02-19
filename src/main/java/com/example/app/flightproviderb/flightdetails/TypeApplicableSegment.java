
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeApplicableSegment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeApplicableSegment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AirItineraryDetailsRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeApplicableSegment")
public class TypeApplicableSegment {

    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "AirItineraryDetailsRef")
    protected String airItineraryDetailsRef;
    /**
     * Classes of service and their counts.
     * 
     */
    @XmlAttribute(name = "BookingCounts")
    protected String bookingCounts;

    /**
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the airItineraryDetailsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirItineraryDetailsRef() {
        return airItineraryDetailsRef;
    }

    /**
     * Sets the value of the airItineraryDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirItineraryDetailsRef(String value) {
        this.airItineraryDetailsRef = value;
    }

    /**
     * Classes of service and their counts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCounts() {
        return bookingCounts;
    }

    /**
     * Sets the value of the bookingCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingCounts()
     */
    public void setBookingCounts(String value) {
        this.bookingCounts = value;
    }

}
