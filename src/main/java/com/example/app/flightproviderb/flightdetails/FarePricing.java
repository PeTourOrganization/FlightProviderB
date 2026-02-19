
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="PassengerType" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="TotalFareAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="PrivateFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AutoPriceable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TotalNetFareAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="BaseFare" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Taxes" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="MMid" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FarePricing")
public class FarePricing {

    @XmlAttribute(name = "PassengerType")
    protected String passengerType;
    @XmlAttribute(name = "TotalFareAmount")
    protected String totalFareAmount;
    /**
     * NegotiatedFare attribute from
     *                         earlier version of schema used to imply whether the fare is
     *                         private fare or not. So, this attribute is renamed to PrivateFare
     *                         as it best suited.
     * 
     */
    @XmlAttribute(name = "PrivateFare")
    protected Boolean privateFare;
    /**
     * Identifies the fare as a Negotiated
     *                         Fare.
     * 
     */
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    /**
     * Identifies the fare as Autopriceable or not. False value means the fare filing is incomplete and the fare should not be used.
     * 
     */
    @XmlAttribute(name = "AutoPriceable")
    protected Boolean autoPriceable;
    /**
     * Total Net fare amount.
     * 
     */
    @XmlAttribute(name = "TotalNetFareAmount")
    protected String totalNetFareAmount;
    /**
     * Base fare amount.
     * 
     */
    @XmlAttribute(name = "BaseFare")
    protected String baseFare;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    /**
     * Contains the Reference id which is generated when the request was ReturnMM=”true”.
     * 
     */
    @XmlAttribute(name = "MMid")
    protected String mMid;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the totalFareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareAmount() {
        return totalFareAmount;
    }

    /**
     * Sets the value of the totalFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareAmount(String value) {
        this.totalFareAmount = value;
    }

    /**
     * NegotiatedFare attribute from
     *                         earlier version of schema used to imply whether the fare is
     *                         private fare or not. So, this attribute is renamed to PrivateFare
     *                         as it best suited.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateFare() {
        return privateFare;
    }

    /**
     * Sets the value of the privateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrivateFare()
     */
    public void setPrivateFare(Boolean value) {
        this.privateFare = value;
    }

    /**
     * Identifies the fare as a Negotiated
     *                         Fare.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFare() {
        return negotiatedFare;
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNegotiatedFare()
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Identifies the fare as Autopriceable or not. False value means the fare filing is incomplete and the fare should not be used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPriceable() {
        return autoPriceable;
    }

    /**
     * Sets the value of the autoPriceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutoPriceable()
     */
    public void setAutoPriceable(Boolean value) {
        this.autoPriceable = value;
    }

    /**
     * Total Net fare amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNetFareAmount() {
        return totalNetFareAmount;
    }

    /**
     * Sets the value of the totalNetFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTotalNetFareAmount()
     */
    public void setTotalNetFareAmount(String value) {
        this.totalNetFareAmount = value;
    }

    /**
     * Base fare amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaseFare()
     */
    public void setBaseFare(String value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Contains the Reference id which is generated when the request was ReturnMM=”true”.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMid() {
        return mMid;
    }

    /**
     * Sets the value of the mMid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMMid()
     */
    public void setMMid(String value) {
        this.mMid = value;
    }

}
