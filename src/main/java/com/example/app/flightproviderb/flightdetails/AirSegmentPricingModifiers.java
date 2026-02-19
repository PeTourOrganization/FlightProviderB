
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
 *         <element name="PermittedBookingCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProhibitAdvancePurchaseFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitNonRefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitPenaltyFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareBreak" type="{http://www.travelport.com/schema/air_v54_0}typeFareBreak" />
 *       <attribute name="ConnectionIndicator" type="{http://www.travelport.com/schema/air_v54_0}typeConnectionIndicator" />
 *       <attribute name="BrandTier" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to10" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedBookingCodes"
})
@XmlRootElement(name = "AirSegmentPricingModifiers")
public class AirSegmentPricingModifiers {

    @XmlElement(name = "PermittedBookingCodes")
    protected AirSegmentPricingModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    @XmlAttribute(name = "ProhibitAdvancePurchaseFares")
    protected Boolean prohibitAdvancePurchaseFares;
    @XmlAttribute(name = "ProhibitNonRefundableFares")
    protected Boolean prohibitNonRefundableFares;
    @XmlAttribute(name = "ProhibitPenaltyFares")
    protected Boolean prohibitPenaltyFares;
    /**
     * The fare basis code to be used for pricing.
     * 
     */
    @XmlAttribute(name = "FareBasisCode")
    protected String fareBasisCode;
    /**
     * Fare break point modifier to instruct Fares
     *                         where it should or should not break the fare.
     * 
     */
    @XmlAttribute(name = "FareBreak")
    protected TypeFareBreak fareBreak;
    /**
     * ConnectionIndicator attribute will be used to map connection indicators 
     *                         AvailabilityAndPricing, TurnAround and Stopover. This attribute is for Wordspan/1P only.
     * 
     */
    @XmlAttribute(name = "ConnectionIndicator")
    protected TypeConnectionIndicator connectionIndicator;
    /**
     * Modifier to price by specific brand tier number.
     * 
     */
    @XmlAttribute(name = "BrandTier")
    protected String brandTier;

    /**
     * Gets the value of the permittedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentPricingModifiers.PermittedBookingCodes }
     *     
     */
    public AirSegmentPricingModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentPricingModifiers.PermittedBookingCodes }
     *     
     */
    public void setPermittedBookingCodes(AirSegmentPricingModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the airSegmentRef property.
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
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
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
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitAdvancePurchaseFares() {
        if (prohibitAdvancePurchaseFares == null) {
            return false;
        } else {
            return prohibitAdvancePurchaseFares;
        }
    }

    /**
     * Sets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitAdvancePurchaseFares(Boolean value) {
        this.prohibitAdvancePurchaseFares = value;
    }

    /**
     * Gets the value of the prohibitNonRefundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonRefundableFares() {
        if (prohibitNonRefundableFares == null) {
            return false;
        } else {
            return prohibitNonRefundableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonRefundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonRefundableFares(Boolean value) {
        this.prohibitNonRefundableFares = value;
    }

    /**
     * Gets the value of the prohibitPenaltyFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitPenaltyFares() {
        if (prohibitPenaltyFares == null) {
            return false;
        } else {
            return prohibitPenaltyFares;
        }
    }

    /**
     * Sets the value of the prohibitPenaltyFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitPenaltyFares(Boolean value) {
        this.prohibitPenaltyFares = value;
    }

    /**
     * The fare basis code to be used for pricing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisCode()
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Fare break point modifier to instruct Fares
     *                         where it should or should not break the fare.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareBreak }
     *     
     */
    public TypeFareBreak getFareBreak() {
        return fareBreak;
    }

    /**
     * Sets the value of the fareBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareBreak }
     *     
     * @see #getFareBreak()
     */
    public void setFareBreak(TypeFareBreak value) {
        this.fareBreak = value;
    }

    /**
     * ConnectionIndicator attribute will be used to map connection indicators 
     *                         AvailabilityAndPricing, TurnAround and Stopover. This attribute is for Wordspan/1P only.
     * 
     * @return
     *     possible object is
     *     {@link TypeConnectionIndicator }
     *     
     */
    public TypeConnectionIndicator getConnectionIndicator() {
        return connectionIndicator;
    }

    /**
     * Sets the value of the connectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeConnectionIndicator }
     *     
     * @see #getConnectionIndicator()
     */
    public void setConnectionIndicator(TypeConnectionIndicator value) {
        this.connectionIndicator = value;
    }

    /**
     * Modifier to price by specific brand tier number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandTier() {
        return brandTier;
    }

    /**
     * Sets the value of the brandTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandTier()
     */
    public void setBrandTier(String value) {
        this.brandTier = value;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingCode"
    })
    public static class PermittedBookingCodes {

        /**
         * The Booking Code (Class of Service) for a
         *                 segment
         * 
         */
        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * The Booking Code (Class of Service) for a
         *                 segment
         * 
         * Gets the value of the bookingCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * </p>
         * 
         * 
         * @return
         *     The value of the bookingCode property.
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<>();
            }
            return this.bookingCode;
        }

    }

}
