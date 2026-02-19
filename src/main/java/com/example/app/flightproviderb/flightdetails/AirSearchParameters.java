
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
 *       <attribute name="NoAdvancePurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonPenaltyFares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="UnRestrictedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AirSearchParameters", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AirSearchParameters {

    @XmlAttribute(name = "NoAdvancePurchase")
    protected Boolean noAdvancePurchase;
    @XmlAttribute(name = "RefundableFares")
    protected Boolean refundableFares;
    @XmlAttribute(name = "NonPenaltyFares")
    protected Boolean nonPenaltyFares;
    @XmlAttribute(name = "UnRestrictedFares")
    protected Boolean unRestrictedFares;

    /**
     * Gets the value of the noAdvancePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAdvancePurchase() {
        return noAdvancePurchase;
    }

    /**
     * Sets the value of the noAdvancePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAdvancePurchase(Boolean value) {
        this.noAdvancePurchase = value;
    }

    /**
     * Gets the value of the refundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundableFares() {
        return refundableFares;
    }

    /**
     * Sets the value of the refundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundableFares(Boolean value) {
        this.refundableFares = value;
    }

    /**
     * Gets the value of the nonPenaltyFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonPenaltyFares() {
        return nonPenaltyFares;
    }

    /**
     * Sets the value of the nonPenaltyFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonPenaltyFares(Boolean value) {
        this.nonPenaltyFares = value;
    }

    /**
     * Gets the value of the unRestrictedFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnRestrictedFares() {
        return unRestrictedFares;
    }

    /**
     * Sets the value of the unRestrictedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnRestrictedFares(Boolean value) {
        this.unRestrictedFares = value;
    }

}
