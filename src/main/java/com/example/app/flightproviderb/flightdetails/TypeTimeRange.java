
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specify a range of times.
 * 
 * <p>Java class for typeTimeRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTimeRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="EarliestTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="LatestTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTimeRange", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    SearchEvent.class
})
public class TypeTimeRange {

    @XmlAttribute(name = "EarliestTime", required = true)
    protected String earliestTime;
    @XmlAttribute(name = "LatestTime", required = true)
    protected String latestTime;

    /**
     * Gets the value of the earliestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestTime() {
        return earliestTime;
    }

    /**
     * Sets the value of the earliestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTime(String value) {
        this.earliestTime = value;
    }

    /**
     * Gets the value of the latestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTime() {
        return latestTime;
    }

    /**
     * Sets the value of the latestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTime(String value) {
        this.latestTime = value;
    }

}
