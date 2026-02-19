
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReservation">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef" maxOccurs="9"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailJourney" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailPricingInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailTicketInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareNoteList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SupplierLocator" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="BookingStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "railJourney",
    "railPricingInfo",
    "payment",
    "railTicketInfo",
    "railFareNoteList",
    "supplierLocator"
})
@XmlRootElement(name = "RailReservation", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailReservation
    extends BaseReservation
{

    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<BookingTravelerRef> bookingTravelerRef;
    /**
     * Captures all journey-related data
     * 
     */
    @XmlElement(name = "RailJourney", namespace = "http://www.travelport.com/schema/rail_v54_0", required = true)
    protected List<RailJourney> railJourney;
    /**
     * Per traveler type pricing breakdown.
     * 
     */
    @XmlElement(name = "RailPricingInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailPricingInfo> railPricingInfo;
    /**
     * Payment information - must be used in conjunction with credit card info
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Payment> payment;
    @XmlElement(name = "RailTicketInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailTicketInfo> railTicketInfo;
    /**
     * List of RailFareNote(s) that is referenced by key in RailFare.
     * 
     */
    @XmlElement(name = "RailFareNoteList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailFareNoteList railFareNoteList;
    /**
     * Locator code on the host carrier system
     * 
     */
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SupplierLocator> supplierLocator;
    /**
     * The Current Status of the rail booking.
     * 
     */
    @XmlAttribute(name = "BookingStatus", required = true)
    protected String bookingStatus;

    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerRef property.
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Captures all journey-related data
     * 
     * Gets the value of the railJourney property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railJourney property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailJourney }
     * </p>
     * 
     * 
     * @return
     *     The value of the railJourney property.
     */
    public List<RailJourney> getRailJourney() {
        if (railJourney == null) {
            railJourney = new ArrayList<>();
        }
        return this.railJourney;
    }

    /**
     * Per traveler type pricing breakdown.
     * 
     * Gets the value of the railPricingInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the railPricingInfo property.
     */
    public List<RailPricingInfo> getRailPricingInfo() {
        if (railPricingInfo == null) {
            railPricingInfo = new ArrayList<>();
        }
        return this.railPricingInfo;
    }

    /**
     * Payment information - must be used in conjunction with credit card info
     * 
     * Gets the value of the payment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * </p>
     * 
     * 
     * @return
     *     The value of the payment property.
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the railTicketInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railTicketInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailTicketInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the railTicketInfo property.
     */
    public List<RailTicketInfo> getRailTicketInfo() {
        if (railTicketInfo == null) {
            railTicketInfo = new ArrayList<>();
        }
        return this.railTicketInfo;
    }

    /**
     * List of RailFareNote(s) that is referenced by key in RailFare.
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     * @see #getRailFareNoteList()
     */
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * Locator code on the host carrier system
     * 
     * Gets the value of the supplierLocator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * </p>
     * 
     * 
     * @return
     *     The value of the supplierLocator property.
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<>();
        }
        return this.supplierLocator;
    }

    /**
     * The Current Status of the rail booking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingStatus()
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

}
