
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
 *       <sequence>
 *       </sequence>
 *       <attribute name="BookingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BookingCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareInfoRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CouponRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AirItinerarySolutionRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="HostTokenRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TaxInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AmenitiesRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="IncidentalStops" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingInfo")
public class BookingInfo {

    @XmlAttribute(name = "BookingCode", required = true)
    protected String bookingCode;
    /**
     * Seat availability of the BookingCode
     * 
     */
    @XmlAttribute(name = "BookingCount")
    protected String bookingCount;
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    @XmlAttribute(name = "FareInfoRef", required = true)
    protected String fareInfoRef;
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    /**
     * The coupon to which that booking is relative
     *                         (if applicable)
     * 
     */
    @XmlAttribute(name = "CouponRef")
    protected String couponRef;
    /**
     * Reference to an Air Itinerary Solution
     * 
     */
    @XmlAttribute(name = "AirItinerarySolutionRef")
    protected String airItinerarySolutionRef;
    /**
     * HostToken Reference for this segment and fare combination.
     * 
     */
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;
    /**
     * TaxInfo Reference for booking info and tax info combination.
     * 
     */
    @XmlAttribute(name = "TaxInfoRef")
    protected String taxInfoRef;
    /**
     * Attribute to reference the Key of an Amenities Object
     * 
     */
    @XmlAttribute(name = "AmenitiesRef")
    protected String amenitiesRef;
    /**
     * Attribute to indicate if Flight contains incidental stops.
     * 
     */
    @XmlAttribute(name = "IncidentalStops")
    protected Boolean incidentalStops;

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Seat availability of the BookingCode
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCount() {
        return bookingCount;
    }

    /**
     * Sets the value of the bookingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingCount()
     */
    public void setBookingCount(String value) {
        this.bookingCount = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
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
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * The coupon to which that booking is relative
     *                         (if applicable)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponRef() {
        return couponRef;
    }

    /**
     * Sets the value of the couponRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCouponRef()
     */
    public void setCouponRef(String value) {
        this.couponRef = value;
    }

    /**
     * Reference to an Air Itinerary Solution
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirItinerarySolutionRef() {
        return airItinerarySolutionRef;
    }

    /**
     * Sets the value of the airItinerarySolutionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirItinerarySolutionRef()
     */
    public void setAirItinerarySolutionRef(String value) {
        this.airItinerarySolutionRef = value;
    }

    /**
     * HostToken Reference for this segment and fare combination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTokenRef() {
        return hostTokenRef;
    }

    /**
     * Sets the value of the hostTokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHostTokenRef()
     */
    public void setHostTokenRef(String value) {
        this.hostTokenRef = value;
    }

    /**
     * TaxInfo Reference for booking info and tax info combination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInfoRef() {
        return taxInfoRef;
    }

    /**
     * Sets the value of the taxInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxInfoRef()
     */
    public void setTaxInfoRef(String value) {
        this.taxInfoRef = value;
    }

    /**
     * Attribute to reference the Key of an Amenities Object
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenitiesRef() {
        return amenitiesRef;
    }

    /**
     * Sets the value of the amenitiesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAmenitiesRef()
     */
    public void setAmenitiesRef(String value) {
        this.amenitiesRef = value;
    }

    /**
     * Attribute to indicate if Flight contains incidental stops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncidentalStops() {
        if (incidentalStops == null) {
            return false;
        } else {
            return incidentalStops;
        }
    }

    /**
     * Sets the value of the incidentalStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncidentalStops()
     */
    public void setIncidentalStops(Boolean value) {
        this.incidentalStops = value;
    }

}
