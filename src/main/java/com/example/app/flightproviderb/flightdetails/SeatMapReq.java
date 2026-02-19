
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgencySellInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SearchTraveler" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}HostReservation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}MerchandisingPricingModifiers" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ReturnSeatPricing" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ReturnBrandingInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencySellInfo",
    "airSegment",
    "hostToken",
    "searchTraveler",
    "hostReservation",
    "merchandisingPricingModifiers"
})
@XmlRootElement(name = "SeatMapReq")
public class SeatMapReq
    extends BaseReq
{

    /**
     * Provider: ACH-Required if the user requesting the seat map is not the same agent authenticated in the request.
     * 
     */
    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AgencySellInfo agencySellInfo;
    /**
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     */
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    /**
     * Provider: ACH-Required if the carrier has multiple adapters.
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    /**
     * Provider: 1G,1V,ACH,MCH.
     * 
     */
    @XmlElement(name = "SearchTraveler")
    protected List<SearchTraveler> searchTraveler;
    /**
     * Provider: ACH,MCH-Required when seat price is requested.
     * 
     */
    @XmlElement(name = "HostReservation")
    protected HostReservation hostReservation;
    /**
     * Used to provide additional pricing options. Provider:ACH.
     * 
     */
    @XmlElement(name = "MerchandisingPricingModifiers")
    protected MerchandisingPricingModifiers merchandisingPricingModifiers;
    /**
     * Provider: 1G,1V,1P,ACH-When set to true the price of the seat will be returned if it exists.
     * 
     */
    @XmlAttribute(name = "ReturnSeatPricing", required = true)
    protected boolean returnSeatPricing;
    /**
     * A value of true will return the BrandingInfo block in the response if applicable. A value of false will not return the BrandingInfo block in the response. Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "ReturnBrandingInfo")
    protected Boolean returnBrandingInfo;

    /**
     * Provider: ACH-Required if the user requesting the seat map is not the same agent authenticated in the request.
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     * @see #getAgencySellInfo()
     */
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     * Gets the value of the airSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegment property.
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<>();
        }
        return this.airSegment;
    }

    /**
     * Provider: ACH-Required if the carrier has multiple adapters.
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
     * Provider: 1G,1V,ACH,MCH.
     * 
     * Gets the value of the searchTraveler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchTraveler property.
     */
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<>();
        }
        return this.searchTraveler;
    }

    /**
     * Provider: ACH,MCH-Required when seat price is requested.
     * 
     * @return
     *     possible object is
     *     {@link HostReservation }
     *     
     */
    public HostReservation getHostReservation() {
        return hostReservation;
    }

    /**
     * Sets the value of the hostReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostReservation }
     *     
     * @see #getHostReservation()
     */
    public void setHostReservation(HostReservation value) {
        this.hostReservation = value;
    }

    /**
     * Used to provide additional pricing options. Provider:ACH.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    public MerchandisingPricingModifiers getMerchandisingPricingModifiers() {
        return merchandisingPricingModifiers;
    }

    /**
     * Sets the value of the merchandisingPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingPricingModifiers }
     *     
     * @see #getMerchandisingPricingModifiers()
     */
    public void setMerchandisingPricingModifiers(MerchandisingPricingModifiers value) {
        this.merchandisingPricingModifiers = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH-When set to true the price of the seat will be returned if it exists.
     * 
     */
    public boolean isReturnSeatPricing() {
        return returnSeatPricing;
    }

    /**
     * Sets the value of the returnSeatPricing property.
     * 
     */
    public void setReturnSeatPricing(boolean value) {
        this.returnSeatPricing = value;
    }

    /**
     * A value of true will return the BrandingInfo block in the response if applicable. A value of false will not return the BrandingInfo block in the response. Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnBrandingInfo() {
        if (returnBrandingInfo == null) {
            return false;
        } else {
            return returnBrandingInfo;
        }
    }

    /**
     * Sets the value of the returnBrandingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnBrandingInfo()
     */
    public void setReturnBrandingInfo(Boolean value) {
        this.returnBrandingInfo = value;
    }

}
