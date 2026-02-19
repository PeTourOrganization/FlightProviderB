
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SpecificSeatAssignment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundleTotal" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundle" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPaymentRef" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SSRInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AddSvc" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ReturnReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "ticketNumber",
    "specificSeatAssignment",
    "airPricingSolution",
    "airExchangeModifiers",
    "airExchangeBundleTotal",
    "airExchangeBundle",
    "hostToken",
    "optionalServices",
    "formOfPayment",
    "formOfPaymentRef",
    "ssrInfo",
    "addSvc"
})
@XmlRootElement(name = "AirExchangeReq")
public class AirExchangeReq
    extends BaseReq
{

    /**
     * Identifies the PNR locator code. Providers ACH/1G/1V/1P
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode", required = true)
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    /**
     * Identifies the standard seat. Providers ACH/1G/1V/1P
     * 
     */
    @XmlElement(name = "SpecificSeatAssignment")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    /**
     * Providers ACH/1G/1V/1P.
     * 
     */
    @XmlElement(name = "AirPricingSolution", required = true)
    protected List<AirPricingSolution> airPricingSolution;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    /**
     * Provider: 1G/1V/1P/1S/1A.
     * 
     */
    @XmlElement(name = "AirExchangeBundleTotal")
    protected AirExchangeBundleTotal airExchangeBundleTotal;
    /**
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P.
     * 
     */
    @XmlElement(name = "AirExchangeBundle")
    protected List<AirExchangeBundle> airExchangeBundle;
    /**
     * Encrypted data from the host. Required to send the HostToken from the AirExchangeQuoteRsp in the AirExchangeReq. Providers ACH/1G/1V/1P
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
     * Form of Payment for any additional collection charges for the Exchange. For ACH, most carriers will only allow refund amounts to the original form of payment. Providers ACH/1G/1V/1P
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPayment formOfPayment;
    /**
     * Provider: ACH-Universal Record reference to Form of Payment for any Additional Collection charges or Refund due for the itinerary exchange
     * 
     */
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPaymentRef formOfPaymentRef;
    /**
     * Providers ACH, 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "SSRInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SSRInfo> ssrInfo;
    /**
     *  1P - Add SVC segments to collect additional fee
     * 
     */
    @XmlElement(name = "AddSvc", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AddSvc addSvc;
    /**
     * Provider: ACH.
     * 
     */
    @XmlAttribute(name = "ReturnReservation")
    protected Boolean returnReservation;

    /**
     * Identifies the PNR locator code. Providers ACH/1G/1V/1P
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
     * Identifies the standard seat. Providers ACH/1G/1V/1P
     * 
     * Gets the value of the specificSeatAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificSeatAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpecificSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificSeatAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the specificSeatAssignment property.
     */
    public List<SpecificSeatAssignment> getSpecificSeatAssignment() {
        if (specificSeatAssignment == null) {
            specificSeatAssignment = new ArrayList<>();
        }
        return this.specificSeatAssignment;
    }

    /**
     * Providers ACH/1G/1V/1P.
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
     * Provider: 1G/1V/1P/1S/1A.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeBundleTotal }
     *     
     */
    public AirExchangeBundleTotal getAirExchangeBundleTotal() {
        return airExchangeBundleTotal;
    }

    /**
     * Sets the value of the airExchangeBundleTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeBundleTotal }
     *     
     * @see #getAirExchangeBundleTotal()
     */
    public void setAirExchangeBundleTotal(AirExchangeBundleTotal value) {
        this.airExchangeBundleTotal = value;
    }

    /**
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P.
     * 
     * Gets the value of the airExchangeBundle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airExchangeBundle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirExchangeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeBundle }
     * </p>
     * 
     * 
     * @return
     *     The value of the airExchangeBundle property.
     */
    public List<AirExchangeBundle> getAirExchangeBundle() {
        if (airExchangeBundle == null) {
            airExchangeBundle = new ArrayList<>();
        }
        return this.airExchangeBundle;
    }

    /**
     * Encrypted data from the host. Required to send the HostToken from the AirExchangeQuoteRsp in the AirExchangeReq. Providers ACH/1G/1V/1P
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
     * Form of Payment for any additional collection charges for the Exchange. For ACH, most carriers will only allow refund amounts to the original form of payment. Providers ACH/1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     * @see #getFormOfPayment()
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Provider: ACH-Universal Record reference to Form of Payment for any Additional Collection charges or Refund due for the itinerary exchange
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentRef }
     *     
     */
    public FormOfPaymentRef getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentRef }
     *     
     * @see #getFormOfPaymentRef()
     */
    public void setFormOfPaymentRef(FormOfPaymentRef value) {
        this.formOfPaymentRef = value;
    }

    /**
     * Providers ACH, 1G, 1V, 1P.
     * 
     * Gets the value of the ssrInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssrInfo property.
     */
    public List<SSRInfo> getSSRInfo() {
        if (ssrInfo == null) {
            ssrInfo = new ArrayList<>();
        }
        return this.ssrInfo;
    }

    /**
     *  1P - Add SVC segments to collect additional fee
     * 
     * @return
     *     possible object is
     *     {@link AddSvc }
     *     
     */
    public AddSvc getAddSvc() {
        return addSvc;
    }

    /**
     * Sets the value of the addSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddSvc }
     *     
     * @see #getAddSvc()
     */
    public void setAddSvc(AddSvc value) {
        this.addSvc = value;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnReservation() {
        if (returnReservation == null) {
            return false;
        } else {
            return returnReservation;
        }
    }

    /**
     * Sets the value of the returnReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnReservation()
     */
    public void setReturnReservation(Boolean value) {
        this.returnReservation = value;
    }

}
