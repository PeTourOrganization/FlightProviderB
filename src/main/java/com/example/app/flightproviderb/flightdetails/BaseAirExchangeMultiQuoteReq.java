
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseAirExchangeMultiQuoteReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseAirExchangeMultiQuoteReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseCoreReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber" maxOccurs="999" minOccurs="0"/>
 *         <element name="ProviderReservationInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution" maxOccurs="2" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RepricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OriginalItineraryDetails" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}OverridePCC" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirExchangeMultiQuoteReq", propOrder = {
    "ticketNumber",
    "providerReservationInfo",
    "airPricingSolution",
    "repricingModifiers",
    "originalItineraryDetails",
    "overridePCC"
})
@XmlSeeAlso({
    AirExchangeMultiQuoteReq.class
})
public class BaseAirExchangeMultiQuoteReq
    extends BaseCoreReq
{

    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    /**
     * Provider: 1P - Represents a valid Provider Reservation/PNR whose itinerary is to be exchanged
     * 
     */
    @XmlElement(name = "ProviderReservationInfo")
    protected BaseAirExchangeMultiQuoteReq.ProviderReservationInfo providerReservationInfo;
    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    /**
     * Used for rapid reprice to provide additional options for the reprice. Providers: 1G/1V/1P/1S/1A
     * 
     */
    @XmlElement(name = "RepricingModifiers")
    protected RepricingModifiers repricingModifiers;
    /**
     * Used for rapid reprice to provide additional information about the original itinerary. Providers: 1G/1V/1P/1S/1A
     * 
     */
    @XmlElement(name = "OriginalItineraryDetails")
    protected OriginalItineraryDetails originalItineraryDetails;
    /**
     * Used to emulate to another PCC or SID.  Providers: 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "OverridePCC", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected OverridePCC overridePCC;

    /**
     * The identifying number for the actual ticket
     * 
     * Gets the value of the ticketNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketNumber property.
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<>();
        }
        return this.ticketNumber;
    }

    /**
     * Provider: 1P - Represents a valid Provider Reservation/PNR whose itinerary is to be exchanged
     * 
     * @return
     *     possible object is
     *     {@link BaseAirExchangeMultiQuoteReq.ProviderReservationInfo }
     *     
     */
    public BaseAirExchangeMultiQuoteReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAirExchangeMultiQuoteReq.ProviderReservationInfo }
     *     
     * @see #getProviderReservationInfo()
     */
    public void setProviderReservationInfo(BaseAirExchangeMultiQuoteReq.ProviderReservationInfo value) {
        this.providerReservationInfo = value;
    }

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     * Gets the value of the airPricingSolution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingSolution property.
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<>();
        }
        return this.airPricingSolution;
    }

    /**
     * Used for rapid reprice to provide additional options for the reprice. Providers: 1G/1V/1P/1S/1A
     * 
     * @return
     *     possible object is
     *     {@link RepricingModifiers }
     *     
     */
    public RepricingModifiers getRepricingModifiers() {
        return repricingModifiers;
    }

    /**
     * Sets the value of the repricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricingModifiers }
     *     
     * @see #getRepricingModifiers()
     */
    public void setRepricingModifiers(RepricingModifiers value) {
        this.repricingModifiers = value;
    }

    /**
     * Used for rapid reprice to provide additional information about the original itinerary. Providers: 1G/1V/1P/1S/1A
     * 
     * @return
     *     possible object is
     *     {@link OriginalItineraryDetails }
     *     
     */
    public OriginalItineraryDetails getOriginalItineraryDetails() {
        return originalItineraryDetails;
    }

    /**
     * Sets the value of the originalItineraryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalItineraryDetails }
     *     
     * @see #getOriginalItineraryDetails()
     */
    public void setOriginalItineraryDetails(OriginalItineraryDetails value) {
        this.originalItineraryDetails = value;
    }

    /**
     * Used to emulate to another PCC or SID.  Providers: 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     * @see #getOverridePCC()
     */
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
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
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProviderReservationInfo {

        @XmlAttribute(name = "ProviderCode", required = true)
        protected String providerCode;
        @XmlAttribute(name = "ProviderLocatorCode", required = true)
        protected String providerLocatorCode;
        /**
         * Represents Carrier Code for ACH PNR Retrieve.
         * 
         */
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;

        /**
         * Gets the value of the providerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderCode() {
            return providerCode;
        }

        /**
         * Sets the value of the providerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderCode(String value) {
            this.providerCode = value;
        }

        /**
         * Gets the value of the providerLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderLocatorCode() {
            return providerLocatorCode;
        }

        /**
         * Sets the value of the providerLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderLocatorCode(String value) {
            this.providerLocatorCode = value;
        }

        /**
         * Represents Carrier Code for ACH PNR Retrieve.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * Sets the value of the supplierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSupplierCode()
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

    }

}
