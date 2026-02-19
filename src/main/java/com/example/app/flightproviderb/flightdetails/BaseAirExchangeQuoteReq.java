
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
 * <p>Java class for BaseAirExchangeQuoteReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseAirExchangeQuoteReq">
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RepricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OriginalItineraryDetails" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PCC" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v54_0}typeFareRuleType" default="none" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirExchangeQuoteReq", propOrder = {
    "ticketNumber",
    "providerReservationInfo",
    "airPricingSolution",
    "airExchangeModifiers",
    "hostToken",
    "optionalServices",
    "formOfPayment",
    "repricingModifiers",
    "originalItineraryDetails",
    "pcc"
})
@XmlSeeAlso({
    AirExchangeQuoteReq.class
})
public class BaseAirExchangeQuoteReq
    extends BaseCoreReq
{

    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    /**
     * Provider: 1G/1V/1P/ACH - Represents a valid Provider Reservation/PNR whose itinerary is to be exchanged
     * 
     */
    @XmlElement(name = "ProviderReservationInfo")
    protected BaseAirExchangeQuoteReq.ProviderReservationInfo providerReservationInfo;
    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * Provider: ACH-This would allow a user to see the fees if they are changing from one Form Of Payment to other .
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
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
     * Specify pseudo City
     * 
     */
    @XmlElement(name = "PCC")
    protected PCC pcc;
    /**
     * Provider: ACH.
     * 
     */
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;

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
     * Provider: 1G/1V/1P/ACH - Represents a valid Provider Reservation/PNR whose itinerary is to be exchanged
     * 
     * @return
     *     possible object is
     *     {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     *     
     */
    public BaseAirExchangeQuoteReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     *     
     * @see #getProviderReservationInfo()
     */
    public void setProviderReservationInfo(BaseAirExchangeQuoteReq.ProviderReservationInfo value) {
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
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public AirExchangeModifiers getAirExchangeModifiers() {
        return airExchangeModifiers;
    }

    /**
     * Sets the value of the airExchangeModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeModifiers }
     *     
     * @see #getAirExchangeModifiers()
     */
    public void setAirExchangeModifiers(AirExchangeModifiers value) {
        this.airExchangeModifiers = value;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the hostToken property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostToken property.
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<>();
        }
        return this.hostToken;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     * @see #getOptionalServices()
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Provider: ACH-This would allow a user to see the fees if they are changing from one Form Of Payment to other .
     * 
     * Gets the value of the formOfPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the formOfPayment property.
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<>();
        }
        return this.formOfPayment;
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
     * Specify pseudo City
     * 
     * @return
     *     possible object is
     *     {@link PCC }
     *     
     */
    public PCC getPCC() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCC }
     *     
     * @see #getPCC()
     */
    public void setPCC(PCC value) {
        this.pcc = value;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRuleType }
     *     
     */
    public TypeFareRuleType getFareRuleType() {
        if (fareRuleType == null) {
            return TypeFareRuleType.NONE;
        } else {
            return fareRuleType;
        }
    }

    /**
     * Sets the value of the fareRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRuleType }
     *     
     * @see #getFareRuleType()
     */
    public void setFareRuleType(TypeFareRuleType value) {
        this.fareRuleType = value;
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
