
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseCoreReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}OverridePCC" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RetrieveProviderReservationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "overridePCC"
})
@XmlSeeAlso({
    BaseCreateReservationReq.class,
    AirExchangeEligibilityReq.class,
    AirMerchandisingDetailsReq.class,
    EMDIssuanceReq.class,
    EMDRetrieveReq.class,
    AirPrePayReq.class,
    FlightInformationReq.class,
    AirMerchandisingOfferAvailabilityReq.class,
    AirRetrieveDocumentReq.class,
    AirVoidDocumentReq.class,
    BaseSearchReq.class,
    SeatMapReq.class,
    FlightDetailsReq.class,
    AirFareRulesReq.class,
    AirFareDisplayReq.class,
    AirRefundReq.class,
    AirRefundQuoteReq.class,
    AirExchangeTicketingReq.class,
    AirExchangeReq.class,
    AirBaseReq.class
})
public class BaseReq
    extends BaseCoreReq
{

    /**
     * Used to emulate to another PCC or SID.  Providers: 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "OverridePCC")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "RetrieveProviderReservationDetails")
    protected Boolean retrieveProviderReservationDetails;

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
     * Gets the value of the retrieveProviderReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetrieveProviderReservationDetails() {
        if (retrieveProviderReservationDetails == null) {
            return false;
        } else {
            return retrieveProviderReservationDetails;
        }
    }

    /**
     * Sets the value of the retrieveProviderReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveProviderReservationDetails(Boolean value) {
        this.retrieveProviderReservationDetails = value;
    }

}
