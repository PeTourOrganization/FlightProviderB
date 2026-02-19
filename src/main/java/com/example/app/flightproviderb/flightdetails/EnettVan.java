
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.Duration;
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
 *       <attribute name="MinPercentage" type="{http://www.travelport.com/schema/common_v54_0}typeIntegerPercentage" />
 *       <attribute name="MaxPercentage" type="{http://www.travelport.com/schema/common_v54_0}typeIntegerPercentage" />
 *       <attribute name="ExpiryDays" type="{http://www.travelport.com/schema/common_v54_0}typeDurationYearInDays" />
 *       <attribute name="MultiUse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EnettVan", namespace = "http://www.travelport.com/schema/common_v54_0")
public class EnettVan {

    /**
     * The minimum percentage that will be applied on the Total price and sent to enett,which will denote the minimum authorized amount approved by eNett.uApi will default this to zero for multi-use Van's.
     * 
     */
    @XmlAttribute(name = "MinPercentage")
    protected Integer minPercentage;
    /**
     * The maximum percentage that will be applied on the Total price and sent to enett, which will denote the maximum authorized amount as approved by eNett. This value will be ignored and not used for Multi-Use VAN’s.
     * 
     */
    @XmlAttribute(name = "MaxPercentage")
    protected Integer maxPercentage;
    /**
     * The number of days from the VAN generation date that the VAN will be active for, after which the VAN cannot be used.
     * 
     */
    @XmlAttribute(name = "ExpiryDays")
    protected Duration expiryDays;
    /**
     * Acceptable values are true or false. If set to true it will denote that the VAN being requested is multi-use else it will indicate a single -use VAN.A Single use VAN can only be debited once while the multiple use VAN's can be debited multiple times subjected to the maximum value it has been authorized for. The default value will be TRUE to indicate a multi-use VAN is being issued.
     * 
     */
    @XmlAttribute(name = "MultiUse")
    protected Boolean multiUse;

    /**
     * The minimum percentage that will be applied on the Total price and sent to enett,which will denote the minimum authorized amount approved by eNett.uApi will default this to zero for multi-use Van's.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinPercentage() {
        return minPercentage;
    }

    /**
     * Sets the value of the minPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMinPercentage()
     */
    public void setMinPercentage(Integer value) {
        this.minPercentage = value;
    }

    /**
     * The maximum percentage that will be applied on the Total price and sent to enett, which will denote the maximum authorized amount as approved by eNett. This value will be ignored and not used for Multi-Use VAN’s.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPercentage() {
        return maxPercentage;
    }

    /**
     * Sets the value of the maxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxPercentage()
     */
    public void setMaxPercentage(Integer value) {
        this.maxPercentage = value;
    }

    /**
     * The number of days from the VAN generation date that the VAN will be active for, after which the VAN cannot be used.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpiryDays() {
        return expiryDays;
    }

    /**
     * Sets the value of the expiryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getExpiryDays()
     */
    public void setExpiryDays(Duration value) {
        this.expiryDays = value;
    }

    /**
     * Acceptable values are true or false. If set to true it will denote that the VAN being requested is multi-use else it will indicate a single -use VAN.A Single use VAN can only be debited once while the multiple use VAN's can be debited multiple times subjected to the maximum value it has been authorized for. The default value will be TRUE to indicate a multi-use VAN is being issued.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiUse() {
        if (multiUse == null) {
            return true;
        } else {
            return multiUse;
        }
    }

    /**
     * Sets the value of the multiUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMultiUse()
     */
    public void setMultiUse(Boolean value) {
        this.multiUse = value;
    }

}
