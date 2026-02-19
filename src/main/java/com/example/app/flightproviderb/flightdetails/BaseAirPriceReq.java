
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseAirPriceReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseAirPriceReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseCoreReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirItinerary"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SearchPassenger" maxOccurs="18"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingCommand" maxOccurs="16"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PCC" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SSR" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CheckOBFees" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v54_0}typeFareRuleType" default="none" />
 *       <attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="TicketDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="CheckFlightDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ReturnMM" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="NSCC">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SplitPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MostRestrictivePenalties" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="FareRuleValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="PricingPreference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TaxDescriptionDispReq" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ReturnTaxDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirPriceReq", propOrder = {
    "airItinerary",
    "airPricingModifiers",
    "searchPassenger",
    "airPricingCommand",
    "airReservationLocatorCode",
    "optionalServices",
    "formOfPayment",
    "pcc",
    "ssr"
})
@XmlSeeAlso({
    AirPriceReq.class
})
public class BaseAirPriceReq
    extends BaseCoreReq
{

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AirItinerary", required = true)
    protected AirItinerary airItinerary;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    /**
     * Provider: 1G,1V,1P,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 					passenger
     * 
     */
    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<SearchPassenger> searchPassenger;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AirPricingCommand", required = true)
    protected List<AirPricingCommand> airPricingCommand;
    /**
     * Provider: ACH,1P
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode")
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
    /**
     * Specify pseudo City
     * 
     */
    @XmlElement(name = "PCC")
    protected PCC pcc;
    /**
     * Special Service Request for GST tax details. Provider: ACH
     * 
     */
    @XmlElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SSR> ssr;
    /**
     * A flag to return fees for ticketing and for various forms of payment. The default is “TicketingOnly” and will return only ticketing fees.  The value “All” will return ticketing fees and the applicable form of payment fees for the form of payment information specified in the request.  “FOPOnly” will return the applicable form of payment fees for the form of payment information specified in the request. Form of payment fees are never included in the total unless specific card details are in the request.Provider notes:ACH - CheckOBFees is valid only for LowFareSearch.  The valid values are “All”, “TicketingOnly” and “None” and the default value is “None”. 1P -The valid values are “All”, “None” and “TicketingOnly”.1G – All four values are supported.1V/RCH – CheckOBFees are not supported.”
     * 
     */
    @XmlAttribute(name = "CheckOBFees")
    protected String checkOBFees;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;
    /**
     * Specifies the supplier/ vendor for vendor specific price requests
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * YYYY-MM-DD Using a date in the past is a request for an historical fare
     * 
     */
    @XmlAttribute(name = "TicketDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketDate;
    /**
     * To Include FlightDetails in Response set to “true” the Default value is “false”.
     * 
     */
    @XmlAttribute(name = "CheckFlightDetails")
    protected Boolean checkFlightDetails;
    /**
     * If this attribute is set to “true”, Fare Control Manager processing will be invoked.
     * 
     */
    @XmlAttribute(name = "ReturnMM")
    protected Boolean returnMM;
    /**
     *  1 to 3 numeric that defines a Search Control Console filter.This attribute is used to override that filter.
     * 
     */
    @XmlAttribute(name = "NSCC")
    protected String nscc;
    /**
     * Indicates whether the AirSegments should be priced together or separately. Set ‘true’ for split pricing. Set ‘false’ for pricing together.SplitPricing is not supported with post book re-pricing.
     * 
     */
    @XmlAttribute(name = "SplitPricing")
    protected Boolean splitPricing;
    /**
     * Boolean flag used to request the MostRestrictivePenalties in the response
     * 
     */
    @XmlAttribute(name = "MostRestrictivePenalties")
    protected Boolean mostRestrictivePenalties;
    /**
     * A boolean flag used to request host to return the lowest fare which matches the specified fare basis code and passes rule validation
     * 
     */
    @XmlAttribute(name = "FareRuleValidation")
    protected Boolean fareRuleValidation;
    /**
     * An attribute to return the Lowest Price/Ignore availability for a booked itinerary with the valid preferences "PriceIgnoreAvailability" and "PriceWithAvailability"
     * 
     */
    @XmlAttribute(name = "PricingPreference")
    protected String pricingPreference;
    /**
     * An attribute to return tax description
     * 
     */
    @XmlAttribute(name = "TaxDescriptionDispReq")
    protected String taxDescriptionDispReq;
    /**
     * An attribute to return tax details
     * 
     */
    @XmlAttribute(name = "ReturnTaxDetails")
    protected Boolean returnTaxDetails;

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirItinerary }
     *     
     */
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItinerary }
     *     
     * @see #getAirItinerary()
     */
    public void setAirItinerary(AirItinerary value) {
        this.airItinerary = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
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
     * Provider: 1G,1V,1P,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 					passenger
     * 
     * Gets the value of the searchPassenger property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchPassenger property.
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<>();
        }
        return this.searchPassenger;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * Gets the value of the airPricingCommand property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingCommand property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingCommand }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingCommand property.
     */
    public List<AirPricingCommand> getAirPricingCommand() {
        if (airPricingCommand == null) {
            airPricingCommand = new ArrayList<>();
        }
        return this.airPricingCommand;
    }

    /**
     * Provider: ACH,1P
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
     * Provider: 1G,1V,1P,ACH.
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
     * Special Service Request for GST tax details. Provider: ACH
     * 
     * Gets the value of the ssr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssr property.
     */
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<>();
        }
        return this.ssr;
    }

    /**
     * A flag to return fees for ticketing and for various forms of payment. The default is “TicketingOnly” and will return only ticketing fees.  The value “All” will return ticketing fees and the applicable form of payment fees for the form of payment information specified in the request.  “FOPOnly” will return the applicable form of payment fees for the form of payment information specified in the request. Form of payment fees are never included in the total unless specific card details are in the request.Provider notes:ACH - CheckOBFees is valid only for LowFareSearch.  The valid values are “All”, “TicketingOnly” and “None” and the default value is “None”. 1P -The valid values are “All”, “None” and “TicketingOnly”.1G – All four values are supported.1V/RCH – CheckOBFees are not supported.”
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOBFees() {
        return checkOBFees;
    }

    /**
     * Sets the value of the checkOBFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCheckOBFees()
     */
    public void setCheckOBFees(String value) {
        this.checkOBFees = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
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
     * Specifies the supplier/ vendor for vendor specific price requests
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

    /**
     * YYYY-MM-DD Using a date in the past is a request for an historical fare
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketDate() {
        return ticketDate;
    }

    /**
     * Sets the value of the ticketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTicketDate()
     */
    public void setTicketDate(XMLGregorianCalendar value) {
        this.ticketDate = value;
    }

    /**
     * To Include FlightDetails in Response set to “true” the Default value is “false”.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCheckFlightDetails() {
        if (checkFlightDetails == null) {
            return false;
        } else {
            return checkFlightDetails;
        }
    }

    /**
     * Sets the value of the checkFlightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCheckFlightDetails()
     */
    public void setCheckFlightDetails(Boolean value) {
        this.checkFlightDetails = value;
    }

    /**
     * If this attribute is set to “true”, Fare Control Manager processing will be invoked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnMM() {
        if (returnMM == null) {
            return false;
        } else {
            return returnMM;
        }
    }

    /**
     * Sets the value of the returnMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnMM()
     */
    public void setReturnMM(Boolean value) {
        this.returnMM = value;
    }

    /**
     *  1 to 3 numeric that defines a Search Control Console filter.This attribute is used to override that filter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNSCC()
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

    /**
     * Indicates whether the AirSegments should be priced together or separately. Set ‘true’ for split pricing. Set ‘false’ for pricing together.SplitPricing is not supported with post book re-pricing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSplitPricing() {
        if (splitPricing == null) {
            return false;
        } else {
            return splitPricing;
        }
    }

    /**
     * Sets the value of the splitPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSplitPricing()
     */
    public void setSplitPricing(Boolean value) {
        this.splitPricing = value;
    }

    /**
     * Boolean flag used to request the MostRestrictivePenalties in the response
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMostRestrictivePenalties() {
        if (mostRestrictivePenalties == null) {
            return false;
        } else {
            return mostRestrictivePenalties;
        }
    }

    /**
     * Sets the value of the mostRestrictivePenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMostRestrictivePenalties()
     */
    public void setMostRestrictivePenalties(Boolean value) {
        this.mostRestrictivePenalties = value;
    }

    /**
     * A boolean flag used to request host to return the lowest fare which matches the specified fare basis code and passes rule validation
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFareRuleValidation() {
        if (fareRuleValidation == null) {
            return false;
        } else {
            return fareRuleValidation;
        }
    }

    /**
     * Sets the value of the fareRuleValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFareRuleValidation()
     */
    public void setFareRuleValidation(Boolean value) {
        this.fareRuleValidation = value;
    }

    /**
     * An attribute to return the Lowest Price/Ignore availability for a booked itinerary with the valid preferences "PriceIgnoreAvailability" and "PriceWithAvailability"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingPreference() {
        return pricingPreference;
    }

    /**
     * Sets the value of the pricingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPricingPreference()
     */
    public void setPricingPreference(String value) {
        this.pricingPreference = value;
    }

    /**
     * An attribute to return tax description
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDescriptionDispReq() {
        return taxDescriptionDispReq;
    }

    /**
     * Sets the value of the taxDescriptionDispReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxDescriptionDispReq()
     */
    public void setTaxDescriptionDispReq(String value) {
        this.taxDescriptionDispReq = value;
    }

    /**
     * An attribute to return tax details
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnTaxDetails() {
        return returnTaxDetails;
    }

    /**
     * Sets the value of the returnTaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnTaxDetails()
     */
    public void setReturnTaxDetails(Boolean value) {
        this.returnTaxDetails = value;
    }

}
