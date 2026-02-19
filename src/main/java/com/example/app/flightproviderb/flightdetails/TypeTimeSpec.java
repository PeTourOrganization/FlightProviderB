
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies times as either specific times, or a time range
 * 
 * <p>Java class for typeTimeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTimeSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TimeRange" type="{http://www.travelport.com/schema/common_v54_0}typeTimeRange" minOccurs="0"/>
 *         <element name="SpecificTime" type="{http://www.travelport.com/schema/common_v54_0}typeSpecificTime" minOccurs="0"/>
 *       </choice>
 *       <attribute name="PreferredTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTimeSpec", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "timeRange",
    "specificTime"
})
@XmlSeeAlso({
    TypeFlexibleTimeSpec.class
})
public class TypeTimeSpec {

    @XmlElement(name = "TimeRange")
    protected TypeTimeRange timeRange;
    @XmlElement(name = "SpecificTime")
    protected TypeSpecificTime specificTime;
    /**
     * Specifies a time that would be preferred within the time range specified.
     * 
     */
    @XmlAttribute(name = "PreferredTime")
    protected String preferredTime;

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTimeRange }
     *     
     */
    public TypeTimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTimeRange }
     *     
     */
    public void setTimeRange(TypeTimeRange value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the specificTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecificTime }
     *     
     */
    public TypeSpecificTime getSpecificTime() {
        return specificTime;
    }

    /**
     * Sets the value of the specificTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecificTime }
     *     
     */
    public void setSpecificTime(TypeSpecificTime value) {
        this.specificTime = value;
    }

    /**
     * Specifies a time that would be preferred within the time range specified.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTime() {
        return preferredTime;
    }

    /**
     * Sets the value of the preferredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPreferredTime()
     */
    public void setPreferredTime(String value) {
        this.preferredTime = value;
    }

}
