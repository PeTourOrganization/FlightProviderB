
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgencySellInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSolution" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}HostReservation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OfferAvailabilityModifiers" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}MerchandisingPricingModifiers" minOccurs="0"/>
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
    "agencySellInfo",
    "airSolution",
    "hostReservation",
    "offerAvailabilityModifiers",
    "merchandisingPricingModifiers"
})
@XmlRootElement(name = "AirMerchandisingOfferAvailabilityReq")
public class AirMerchandisingOfferAvailabilityReq
    extends BaseReq
{

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AgencySellInfo agencySellInfo;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AirSolution")
    protected AirSolution airSolution;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "HostReservation")
    protected List<HostReservation> hostReservation;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "OfferAvailabilityModifiers")
    protected List<OfferAvailabilityModifiers> offerAvailabilityModifiers;
    /**
     * Used to provide additional pricing modifiers. Provider:ACH.
     * 
     */
    @XmlElement(name = "MerchandisingPricingModifiers")
    protected MerchandisingPricingModifiers merchandisingPricingModifiers;

    /**
     * Provider: 1G,1V,1P,ACH.
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
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSolution }
     *     
     */
    public AirSolution getAirSolution() {
        return airSolution;
    }

    /**
     * Sets the value of the airSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolution }
     *     
     * @see #getAirSolution()
     */
    public void setAirSolution(AirSolution value) {
        this.airSolution = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * Gets the value of the hostReservation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostReservation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostReservation }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostReservation property.
     */
    public List<HostReservation> getHostReservation() {
        if (hostReservation == null) {
            hostReservation = new ArrayList<>();
        }
        return this.hostReservation;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * Gets the value of the offerAvailabilityModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerAvailabilityModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOfferAvailabilityModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferAvailabilityModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the offerAvailabilityModifiers property.
     */
    public List<OfferAvailabilityModifiers> getOfferAvailabilityModifiers() {
        if (offerAvailabilityModifiers == null) {
            offerAvailabilityModifiers = new ArrayList<>();
        }
        return this.offerAvailabilityModifiers;
    }

    /**
     * Used to provide additional pricing modifiers. Provider:ACH.
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

}
