
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SeatAttributes" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CabinClass" minOccurs="0"/>
 *         <element name="SSRRef" type="{http://www.travelport.com/schema/common_v54_0}typeKeyBasedReference" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="StopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="EMDSummaryRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="EMDCouponRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seatAttributes",
    "cabinClass",
    "ssrRef"
})
@XmlRootElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ServiceData {

    /**
     * Identifies the seat attribute of the service.
     * 
     */
    @XmlElement(name = "SeatAttributes", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected SeatAttributes seatAttributes;
    /**
     * Requests cabin class (First, Business and Economy, etc.) as supported by the provider or supplier.
     * 
     */
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CabinClass cabinClass;
    /**
     * References to the related SSRs. At present, only reference to ASVC SSR is supported. Supported providers are 1G/1V/1P
     * 
     */
    @XmlElement(name = "SSRRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeKeyBasedReference> ssrRef;
    /**
     * Data that specifies the details of the merchandising offering (e.g. seat number for seat service)
     * 
     */
    @XmlAttribute(name = "Data")
    protected String data;
    /**
     * Reference to a segment if the merchandising offering only pertains to that segment. If no segment reference is present this means this offering is for the whole itinerary.
     * 
     */
    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    /**
     * Reference to a passenger if the merchandising offering only pertains to that passenger. If no passenger reference is present this means this offering is for all passengers.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    /**
     * Indicates that there is a significant
     *                         delay between flights (usually 12 hours or more)
     * 
     */
    @XmlAttribute(name = "StopOver")
    protected Boolean stopOver;
    /**
     * Passenger Type Code.
     * 
     */
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    /**
     * Reference to the corresponding EMD issued. Supported providers are 1G/1V/1P
     * 
     */
    @XmlAttribute(name = "EMDSummaryRef")
    protected String emdSummaryRef;
    /**
     * Reference to the corresponding EMD coupon issued. Supported providers are 1G/1V/1P
     * 
     */
    @XmlAttribute(name = "EMDCouponRef")
    protected String emdCouponRef;

    /**
     * Identifies the seat attribute of the service.
     * 
     * @return
     *     possible object is
     *     {@link SeatAttributes }
     *     
     */
    public SeatAttributes getSeatAttributes() {
        return seatAttributes;
    }

    /**
     * Sets the value of the seatAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAttributes }
     *     
     * @see #getSeatAttributes()
     */
    public void setSeatAttributes(SeatAttributes value) {
        this.seatAttributes = value;
    }

    /**
     * Requests cabin class (First, Business and Economy, etc.) as supported by the provider or supplier.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * References to the related SSRs. At present, only reference to ASVC SSR is supported. Supported providers are 1G/1V/1P
     * 
     * Gets the value of the ssrRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSRRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKeyBasedReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssrRef property.
     */
    public List<TypeKeyBasedReference> getSSRRef() {
        if (ssrRef == null) {
            ssrRef = new ArrayList<>();
        }
        return this.ssrRef;
    }

    /**
     * Data that specifies the details of the merchandising offering (e.g. seat number for seat service)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getData()
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Reference to a segment if the merchandising offering only pertains to that segment. If no segment reference is present this means this offering is for the whole itinerary.
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
     * @see #getAirSegmentRef()
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
    }

    /**
     * Reference to a passenger if the merchandising offering only pertains to that passenger. If no passenger reference is present this means this offering is for all passengers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Indicates that there is a significant
     *                         delay between flights (usually 12 hours or more)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStopOver() {
        if (stopOver == null) {
            return false;
        } else {
            return stopOver;
        }
    }

    /**
     * Sets the value of the stopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isStopOver()
     */
    public void setStopOver(Boolean value) {
        this.stopOver = value;
    }

    /**
     * Passenger Type Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerType() {
        return travelerType;
    }

    /**
     * Sets the value of the travelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelerType()
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Reference to the corresponding EMD issued. Supported providers are 1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDSummaryRef() {
        return emdSummaryRef;
    }

    /**
     * Sets the value of the emdSummaryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEMDSummaryRef()
     */
    public void setEMDSummaryRef(String value) {
        this.emdSummaryRef = value;
    }

    /**
     * Reference to the corresponding EMD coupon issued. Supported providers are 1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDCouponRef() {
        return emdCouponRef;
    }

    /**
     * Sets the value of the emdCouponRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEMDCouponRef()
     */
    public void setEMDCouponRef(String value) {
        this.emdCouponRef = value;
    }

}
