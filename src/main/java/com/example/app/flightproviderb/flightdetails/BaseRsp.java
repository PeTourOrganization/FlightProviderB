
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The base type for all responses.
 * 
 * <p>Java class for BaseRsp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseRsp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ResponseMessage" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="CommandHistory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SponsoredFltTrnxId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRsp", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "responseMessage"
})
@XmlSeeAlso({
    AirExchangeMultiQuoteRsp.class,
    AirExchangeEligibilityRsp.class,
    AirMerchandisingDetailsRsp.class,
    EMDIssuanceRsp.class,
    EMDRetrieveRsp.class,
    AirPrePayRsp.class,
    FlightInformationRsp.class,
    AirMerchandisingOfferAvailabilityRsp.class,
    AirRetrieveDocumentRsp.class,
    AirVoidDocumentRsp.class,
    BaseSearchRsp.class,
    SeatMapRsp.class,
    FlightDetailsRsp.class,
    AirFareRulesRsp.class,
    AirFareDisplayRsp.class,
    AirRefundRsp.class,
    AirRefundQuoteRsp.class,
    AirExchangeTicketingRsp.class,
    AirExchangeRsp.class,
    AirExchangeQuoteRsp.class,
    AirTicketingRsp.class,
    AirRepriceRsp.class,
    BaseAirPriceRsp.class
})
public class BaseRsp {

    /**
     * A simple textual fare note. Used within several other objects.
     * 
     */
    @XmlElement(name = "ResponseMessage")
    protected List<ResponseMessage> responseMessage;
    /**
     * Unique identifier for this atomic transaction traced by the user. Use is optional.
     * 
     */
    @XmlAttribute(name = "TraceId")
    protected String traceId;
    /**
     * System generated unique identifier for this atomic transaction.
     * 
     */
    @XmlAttribute(name = "TransactionId")
    protected String transactionId;
    /**
     * The time (in ms) the system spent processing this request, not including transmission times.
     * 
     */
    @XmlAttribute(name = "ResponseTime")
    protected BigInteger responseTime;
    /**
     * HTTP link to download command history and debugging information of the request that generated this response. Must be enabled on the system.
     * 
     */
    @XmlAttribute(name = "CommandHistory")
    protected String commandHistory;
    /**
     * Identifier for Sponsored Flight transaction information.
     * 
     */
    @XmlAttribute(name = "SponsoredFltTrnxId")
    protected String sponsoredFltTrnxId;

    /**
     * A simple textual fare note. Used within several other objects.
     * 
     * Gets the value of the responseMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResponseMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the responseMessage property.
     */
    public List<ResponseMessage> getResponseMessage() {
        if (responseMessage == null) {
            responseMessage = new ArrayList<>();
        }
        return this.responseMessage;
    }

    /**
     * Unique identifier for this atomic transaction traced by the user. Use is optional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTraceId()
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * System generated unique identifier for this atomic transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransactionId()
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * The time (in ms) the system spent processing this request, not including transmission times.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getResponseTime()
     */
    public void setResponseTime(BigInteger value) {
        this.responseTime = value;
    }

    /**
     * HTTP link to download command history and debugging information of the request that generated this response. Must be enabled on the system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandHistory() {
        return commandHistory;
    }

    /**
     * Sets the value of the commandHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommandHistory()
     */
    public void setCommandHistory(String value) {
        this.commandHistory = value;
    }

    /**
     * Identifier for Sponsored Flight transaction information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsoredFltTrnxId() {
        return sponsoredFltTrnxId;
    }

    /**
     * Sets the value of the sponsoredFltTrnxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSponsoredFltTrnxId()
     */
    public void setSponsoredFltTrnxId(String value) {
        this.sponsoredFltTrnxId = value;
    }

}
