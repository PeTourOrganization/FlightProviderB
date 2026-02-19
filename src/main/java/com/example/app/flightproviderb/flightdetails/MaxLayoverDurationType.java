
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * User can specify its attribute's value in Minutes. Maximum size of each attribute is 4.
 * 
 * <p>Java class for MaxLayoverDurationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MaxLayoverDurationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Domestic" type="{http://www.travelport.com/schema/air_v54_0}MaxLayoverDurationRangeType" />
 *       <attribute name="Gateway" type="{http://www.travelport.com/schema/air_v54_0}MaxLayoverDurationRangeType" />
 *       <attribute name="International" type="{http://www.travelport.com/schema/air_v54_0}MaxLayoverDurationRangeType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxLayoverDurationType")
public class MaxLayoverDurationType {

    /**
     * It will be applied for all Domestic-to-Domestic connections.
     * 
     */
    @XmlAttribute(name = "Domestic")
    protected Integer domestic;
    /**
     * It will be applied for all Domestic to International and International to Domestic connections.
     * 
     */
    @XmlAttribute(name = "Gateway")
    protected Integer gateway;
    /**
     * It will be applied for all International-to-International connections.
     * 
     */
    @XmlAttribute(name = "International")
    protected Integer international;

    /**
     * It will be applied for all Domestic-to-Domestic connections.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDomestic() {
        return domestic;
    }

    /**
     * Sets the value of the domestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDomestic()
     */
    public void setDomestic(Integer value) {
        this.domestic = value;
    }

    /**
     * It will be applied for all Domestic to International and International to Domestic connections.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getGateway()
     */
    public void setGateway(Integer value) {
        this.gateway = value;
    }

    /**
     * It will be applied for all International-to-International connections.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInternational() {
        return international;
    }

    /**
     * Sets the value of the international property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getInternational()
     */
    public void setInternational(Integer value) {
        this.international = value;
    }

}
