
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}AirBaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode"/>
 *         <element name="AirPricingInfoRef" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef" maxOccurs="9" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TicketingModifiersRef" type="{http://www.travelport.com/schema/air_v54_0}typeTicketingModifiersRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}WaiverCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" maxOccurs="18" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DetailedBillingInformation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FaxDetailsInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirTicketingModifiers" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentTicketingModifiers" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ReturnInfoOnFail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ValidateSpanishResidency" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "airPricingInfoRef",
    "ticketingModifiersRef",
    "waiverCode",
    "commission",
    "detailedBillingInformation",
    "faxDetailsInformation",
    "airTicketingModifiers",
    "airSegmentTicketingModifiers"
})
@XmlRootElement(name = "AirTicketingReq")
public class AirTicketingReq
    extends AirBaseReq
{

    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode", required = true)
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * Provider: 1G,1V,1P-Indicates air pricing infos to be ticketed.
     * 
     */
    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirTicketingReq.AirPricingInfoRef> airPricingInfoRef;
    /**
     * Provider: 1P-Reference to a shared list of Ticketing Modifiers. This is supported for Worldspan providers only. When AirPricingInfoRef is used along with TicketingModifiersRef means that particular TicketingModifiers will to be applied while ticketing the Stored fare corresponding to the AirPricingInfo. Absence of AirPricingInfoRef means that particular TicketingModifiers will be applied to all Stored fares which are requested to be ticketed.
     * 
     */
    @XmlElement(name = "TicketingModifiersRef")
    protected List<TypeTicketingModifiersRef> ticketingModifiersRef;
    /**
     * Waiver code to override fare validations
     * 
     */
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    /**
     * Identifies the agency commission
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Commission> commission;
    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "DetailedBillingInformation")
    protected List<DetailedBillingInformation> detailedBillingInformation;
    /**
     * Provider: 1V.
     * 
     */
    @XmlElement(name = "FaxDetailsInformation")
    protected FaxDetailsInformation faxDetailsInformation;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirTicketingModifiers")
    protected List<AirTicketingModifiers> airTicketingModifiers;
    /**
     * Provider: 1P.
     * 
     */
    @XmlElement(name = "AirSegmentTicketingModifiers")
    protected List<AirSegmentTicketingModifiers> airSegmentTicketingModifiers;
    @XmlAttribute(name = "ReturnInfoOnFail")
    protected Boolean returnInfoOnFail;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * Provider: 1G - If set as true, Spanish Residency will be validated for
     *                                 Provisioned Customers.
     * 
     */
    @XmlAttribute(name = "ValidateSpanishResidency")
    protected Boolean validateSpanishResidency;

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     * @see #getAirReservationLocatorCode()
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Provider: 1G,1V,1P-Indicates air pricing infos to be ticketed.
     * 
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingReq.AirPricingInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingInfoRef property.
     */
    public List<AirTicketingReq.AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Provider: 1P-Reference to a shared list of Ticketing Modifiers. This is supported for Worldspan providers only. When AirPricingInfoRef is used along with TicketingModifiersRef means that particular TicketingModifiers will to be applied while ticketing the Stored fare corresponding to the AirPricingInfo. Absence of AirPricingInfoRef means that particular TicketingModifiers will be applied to all Stored fares which are requested to be ticketed.
     * 
     * Gets the value of the ticketingModifiersRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiersRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketingModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketingModifiersRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketingModifiersRef property.
     */
    public List<TypeTicketingModifiersRef> getTicketingModifiersRef() {
        if (ticketingModifiersRef == null) {
            ticketingModifiersRef = new ArrayList<>();
        }
        return this.ticketingModifiersRef;
    }

    /**
     * Waiver code to override fare validations
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     * @see #getWaiverCode()
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * Identifies the agency commission
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * Provider: 1G,1V.
     * 
     * Gets the value of the detailedBillingInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedBillingInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDetailedBillingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedBillingInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the detailedBillingInformation property.
     */
    public List<DetailedBillingInformation> getDetailedBillingInformation() {
        if (detailedBillingInformation == null) {
            detailedBillingInformation = new ArrayList<>();
        }
        return this.detailedBillingInformation;
    }

    /**
     * Provider: 1V.
     * 
     * @return
     *     possible object is
     *     {@link FaxDetailsInformation }
     *     
     */
    public FaxDetailsInformation getFaxDetailsInformation() {
        return faxDetailsInformation;
    }

    /**
     * Sets the value of the faxDetailsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxDetailsInformation }
     *     
     * @see #getFaxDetailsInformation()
     */
    public void setFaxDetailsInformation(FaxDetailsInformation value) {
        this.faxDetailsInformation = value;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the airTicketingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTicketingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the airTicketingModifiers property.
     */
    public List<AirTicketingModifiers> getAirTicketingModifiers() {
        if (airTicketingModifiers == null) {
            airTicketingModifiers = new ArrayList<>();
        }
        return this.airTicketingModifiers;
    }

    /**
     * Provider: 1P.
     * 
     * Gets the value of the airSegmentTicketingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentTicketingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentTicketingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentTicketingModifiers property.
     */
    public List<AirSegmentTicketingModifiers> getAirSegmentTicketingModifiers() {
        if (airSegmentTicketingModifiers == null) {
            airSegmentTicketingModifiers = new ArrayList<>();
        }
        return this.airSegmentTicketingModifiers;
    }

    /**
     * Gets the value of the returnInfoOnFail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnInfoOnFail() {
        if (returnInfoOnFail == null) {
            return true;
        } else {
            return returnInfoOnFail;
        }
    }

    /**
     * Sets the value of the returnInfoOnFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnInfoOnFail(Boolean value) {
        this.returnInfoOnFail = value;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBulkTicket()
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * Provider: 1G - If set as true, Spanish Residency will be validated for
     *                                 Provisioned Customers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValidateSpanishResidency() {
        if (validateSpanishResidency == null) {
            return false;
        } else {
            return validateSpanishResidency;
        }
    }

    /**
     * Sets the value of the validateSpanishResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isValidateSpanishResidency()
     */
    public void setValidateSpanishResidency(Boolean value) {
        this.validateSpanishResidency = value;
    }


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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef" maxOccurs="9" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingTravelerRef"
    })
    public static class AirPricingInfoRef {

        /**
         * Reference Element for Booking Traveler and Loyalty cards
         * 
         */
        @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected List<BookingTravelerRef> bookingTravelerRef;
        @XmlAttribute(name = "Key", required = true)
        protected String key;

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

    }

}
