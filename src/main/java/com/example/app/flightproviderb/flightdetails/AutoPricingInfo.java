
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentRef" maxOccurs="100" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef" maxOccurs="100" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentPricingModifiers" maxOccurs="100" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PricingType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="25"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegmentRef",
    "bookingTravelerRef",
    "airPricingModifiers",
    "airSegmentPricingModifiers"
})
@XmlRootElement(name = "AutoPricingInfo")
public class AutoPricingInfo {

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     */
    @XmlElement(name = "AirSegmentRef")
    protected List<AirSegmentRef> airSegmentRef;
    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    /**
     * Controls and switches for a Air Search
     *                 request that contains Pricing Information
     * 
     */
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     */
    @XmlElement(name = "AirSegmentPricingModifiers")
    protected List<AirSegmentPricingModifiers> airSegmentPricingModifiers;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * Indicates the Pricing Type used.
     *                         The possible values are TicketRecord, StoredFare, PricingInstruction.
     * 
     */
    @XmlAttribute(name = "PricingType")
    protected String pricingType;
    /**
     * The Plating Carrier for this journey
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     */
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     */
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     * Gets the value of the airSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentRef property.
     */
    public List<AirSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<>();
        }
        return this.airSegmentRef;
    }

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
     * Controls and switches for a Air Search
     *                 request that contains Pricing Information
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers }
     *     
     */
    public AirPricingModifiers getAirPricingModifiers() {
        return airPricingModifiers;
    }

    /**
     * Sets the value of the airPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers }
     *     
     * @see #getAirPricingModifiers()
     */
    public void setAirPricingModifiers(AirPricingModifiers value) {
        this.airPricingModifiers = value;
    }

    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     * Gets the value of the airSegmentPricingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentPricingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentPricingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentPricingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentPricingModifiers property.
     */
    public List<AirSegmentPricingModifiers> getAirSegmentPricingModifiers() {
        if (airSegmentPricingModifiers == null) {
            airSegmentPricingModifiers = new ArrayList<>();
        }
        return this.airSegmentPricingModifiers;
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

    /**
     * Indicates the Pricing Type used.
     *                         The possible values are TicketRecord, StoredFare, PricingInstruction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPricingType()
     */
    public void setPricingType(String value) {
        this.pricingType = value;
    }

    /**
     * The Plating Carrier for this journey
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     * @see #getElStat()
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeyOverride()
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
