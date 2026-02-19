
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
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeVarianceType" />
 *       <attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Indicator" type="{http://www.travelport.com/schema/air_v54_0}typeVarianceIndicator" />
 *       <attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Variance")
public class Variance {

    /**
     * Indicates type Variance, i.e. Actual,
     *                         Estimated, Canceled and Diversion.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypeVarianceType type;
    /**
     * Indicates time for Variance.
     * 
     */
    @XmlAttribute(name = "Time")
    protected String time;
    /**
     * Indicates VAriance Indicator, i.e.
     *                         Early, Late.
     * 
     */
    @XmlAttribute(name = "Indicator")
    protected TypeVarianceIndicator indicator;
    /**
     * Reason for Variance
     * 
     */
    @XmlAttribute(name = "Reason")
    protected String reason;

    /**
     * Indicates type Variance, i.e. Actual,
     *                         Estimated, Canceled and Diversion.
     * 
     * @return
     *     possible object is
     *     {@link TypeVarianceType }
     *     
     */
    public TypeVarianceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVarianceType }
     *     
     * @see #getType()
     */
    public void setType(TypeVarianceType value) {
        this.type = value;
    }

    /**
     * Indicates time for Variance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTime()
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Indicates VAriance Indicator, i.e.
     *                         Early, Late.
     * 
     * @return
     *     possible object is
     *     {@link TypeVarianceIndicator }
     *     
     */
    public TypeVarianceIndicator getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVarianceIndicator }
     *     
     * @see #getIndicator()
     */
    public void setIndicator(TypeVarianceIndicator value) {
        this.indicator = value;
    }

    /**
     * Reason for Variance
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReason()
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
