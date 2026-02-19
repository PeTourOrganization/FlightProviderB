
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundleTotal" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundle" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRule" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "airPricingSolution",
    "airExchangeBundleTotal",
    "airExchangeBundle",
    "hostToken",
    "optionalServices",
    "fareRule"
})
@XmlRootElement(name = "AirExchangeQuoteRsp")
public class AirExchangeQuoteRsp
    extends BaseRsp
{

    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    /**
     * Provider: 1G/1V/1P/1S/1A.
     * 
     */
    @XmlElement(name = "AirPricingSolution", required = true)
    protected List<AirPricingSolution> airPricingSolution;
    /**
     * Total exchange and penalty information for one ticket number
     * 
     */
    @XmlElement(name = "AirExchangeBundleTotal")
    protected AirExchangeBundleTotal airExchangeBundleTotal;
    /**
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P
     * 
     */
    @XmlElement(name = "AirExchangeBundle")
    protected List<AirExchangeBundle> airExchangeBundle;
    /**
     * Encrypted data from the host. Required to send the HostToken from the AirExchangeQuoteRsp in the AirExchangeReq. Providers ACH/1G/1V/1P.
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
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "FareRule")
    protected List<FareRule> fareRule;

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
     * Provider: 1G/1V/1P/1S/1A.
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
     * Total exchange and penalty information for one ticket number
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
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P
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
     * Encrypted data from the host. Required to send the HostToken from the AirExchangeQuoteRsp in the AirExchangeReq. Providers ACH/1G/1V/1P.
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
     * Provider: ACH.
     * 
     * Gets the value of the fareRule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRule }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRule property.
     */
    public List<FareRule> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<>();
        }
        return this.fareRule;
    }

}
