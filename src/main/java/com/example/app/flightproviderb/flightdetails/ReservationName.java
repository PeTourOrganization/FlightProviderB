
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
 *       <choice>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}NameOverride"/>
 *       </choice>
 *       <attribute name="HotelRateDetailRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "nameOverride"
})
@XmlRootElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ReservationName {

    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected BookingTravelerRef bookingTravelerRef;
    /**
     * To be used if the reservation name is other than booking travelers in the PNR
     * 
     */
    @XmlElement(name = "NameOverride", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected NameOverride nameOverride;
    /**
     * Reference for the Hotel Rate Detail. Used for Hotel Booking only. The value is arbitrary.
     * 
     */
    @XmlAttribute(name = "HotelRateDetailRef")
    protected String hotelRateDetailRef;

    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     * @return
     *     possible object is
     *     {@link BookingTravelerRef }
     *     
     */
    public BookingTravelerRef getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTravelerRef }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(BookingTravelerRef value) {
        this.bookingTravelerRef = value;
    }

    /**
     * To be used if the reservation name is other than booking travelers in the PNR
     * 
     * @return
     *     possible object is
     *     {@link NameOverride }
     *     
     */
    public NameOverride getNameOverride() {
        return nameOverride;
    }

    /**
     * Sets the value of the nameOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameOverride }
     *     
     * @see #getNameOverride()
     */
    public void setNameOverride(NameOverride value) {
        this.nameOverride = value;
    }

    /**
     * Reference for the Hotel Rate Detail. Used for Hotel Booking only. The value is arbitrary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelRateDetailRef() {
        return hotelRateDetailRef;
    }

    /**
     * Sets the value of the hotelRateDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHotelRateDetailRef()
     */
    public void setHotelRateDetailRef(String value) {
        this.hotelRateDetailRef = value;
    }

}
