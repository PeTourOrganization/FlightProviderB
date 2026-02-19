
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DocumentModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TourCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketEndorsement" maxOccurs="3" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CreditCardAuth" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="TicketedFareOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="SuppressTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="NoComparisonSFQ" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentModifiers",
    "airPricingInfoRef",
    "tourCode",
    "ticketEndorsement",
    "commission",
    "formOfPayment",
    "creditCardAuth",
    "payment"
})
@XmlRootElement(name = "AirTicketingModifiers")
public class AirTicketingModifiers {

    @XmlElement(name = "DocumentModifiers")
    protected DocumentModifiers documentModifiers;
    /**
     * Reference to a AirPricing from a shared
     *                 list
     * 
     */
    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirPricingInfoRef> airPricingInfoRef;
    /**
     * Allows an agency to modify the tour code information during ticket issuance. Providers supported: Worldspan.
     * 
     */
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    /**
     * Allows an agency to add user defined
     *                                        ticketing endorsements in the ticket. Providers supported: Worldspan.
     * 
     */
    @XmlElement(name = "TicketEndorsement")
    protected List<TicketEndorsement> ticketEndorsement;
    /**
     * Allows an agency to add the commission
     *                                        to a new or different commission rate which will be applied at
     *                                        time of ticketing. The commission Modifier allows the user
     *                                        specify how the commission change is to applied. Providers supported: Worldspan.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Commission commission;
    /**
     * FormOfPayment information to be used as ticketing modifier at the time of ticketing. Providers supported: Galileo, Apollo, Worldspan.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
    /**
     * CreditCardAuth information to be used as ticketing modifier at the time of ticketing. Providers supported: Galileo, Apollo, Worldspan.
     * 
     */
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<CreditCardAuth> creditCardAuth;
    /**
     * Provide Payment for FOP. Providers supported: Galileo, Apollo, Worldspan.
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Payment> payment;
    /**
     * The Plating Carrier used for this ticket
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * It is a modifier to allow re-issuance of tickets for stored fares which are already ticketed. Providers supported are 1P
     * 
     */
    @XmlAttribute(name = "TicketedFareOverride")
    protected Boolean ticketedFareOverride;
    /**
     * Allow to suppress Taxand Fee in ticketing response.Providers supported: Worldspan.
     * 
     */
    @XmlAttribute(name = "SuppressTaxAndFee")
    protected Boolean suppressTaxAndFee;
    /**
     *  1P - Set to "true" to include the no comparison overide #NC to override the existing SFQ and issue the ticket. Only valid for AirTicketingReq, not valid  for AirExchangeTicketingReq.
     * 
     */
    @XmlAttribute(name = "NoComparisonSFQ")
    protected Boolean noComparisonSFQ;

    /**
     * Gets the value of the documentModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentModifiers }
     *     
     */
    public DocumentModifiers getDocumentModifiers() {
        return documentModifiers;
    }

    /**
     * Sets the value of the documentModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentModifiers }
     *     
     */
    public void setDocumentModifiers(DocumentModifiers value) {
        this.documentModifiers = value;
    }

    /**
     * Reference to a AirPricing from a shared
     *                 list
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
     * {@link AirPricingInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingInfoRef property.
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Allows an agency to modify the tour code information during ticket issuance. Providers supported: Worldspan.
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     * @see #getTourCode()
     */
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Allows an agency to add user defined
     *                                        ticketing endorsements in the ticket. Providers supported: Worldspan.
     * 
     * Gets the value of the ticketEndorsement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketEndorsement property.
     */
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Allows an agency to add the commission
     *                                        to a new or different commission rate which will be applied at
     *                                        time of ticketing. The commission Modifier allows the user
     *                                        specify how the commission change is to applied. Providers supported: Worldspan.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     * @see #getCommission()
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * FormOfPayment information to be used as ticketing modifier at the time of ticketing. Providers supported: Galileo, Apollo, Worldspan.
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
     * CreditCardAuth information to be used as ticketing modifier at the time of ticketing. Providers supported: Galileo, Apollo, Worldspan.
     * 
     * Gets the value of the creditCardAuth property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardAuth property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreditCardAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardAuth }
     * </p>
     * 
     * 
     * @return
     *     The value of the creditCardAuth property.
     */
    public List<CreditCardAuth> getCreditCardAuth() {
        if (creditCardAuth == null) {
            creditCardAuth = new ArrayList<>();
        }
        return this.creditCardAuth;
    }

    /**
     * Provide Payment for FOP. Providers supported: Galileo, Apollo, Worldspan.
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
     * The Plating Carrier used for this ticket
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
     * It is a modifier to allow re-issuance of tickets for stored fares which are already ticketed. Providers supported are 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTicketedFareOverride() {
        if (ticketedFareOverride == null) {
            return false;
        } else {
            return ticketedFareOverride;
        }
    }

    /**
     * Sets the value of the ticketedFareOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTicketedFareOverride()
     */
    public void setTicketedFareOverride(Boolean value) {
        this.ticketedFareOverride = value;
    }

    /**
     * Allow to suppress Taxand Fee in ticketing response.Providers supported: Worldspan.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSuppressTaxAndFee() {
        if (suppressTaxAndFee == null) {
            return false;
        } else {
            return suppressTaxAndFee;
        }
    }

    /**
     * Sets the value of the suppressTaxAndFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSuppressTaxAndFee()
     */
    public void setSuppressTaxAndFee(Boolean value) {
        this.suppressTaxAndFee = value;
    }

    /**
     *  1P - Set to "true" to include the no comparison overide #NC to override the existing SFQ and issue the ticket. Only valid for AirTicketingReq, not valid  for AirExchangeTicketingReq.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoComparisonSFQ() {
        if (noComparisonSFQ == null) {
            return false;
        } else {
            return noComparisonSFQ;
        }
    }

    /**
     * Sets the value of the noComparisonSFQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoComparisonSFQ()
     */
    public void setNoComparisonSFQ(Boolean value) {
        this.noComparisonSFQ = value;
    }

}
