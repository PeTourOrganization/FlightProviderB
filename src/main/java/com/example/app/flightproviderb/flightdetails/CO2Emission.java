
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
 *       <attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CO2Emission")
public class CO2Emission {

    /**
     * The segment reference
     * 
     */
    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    /**
     * The CO2 emission value for the air segment
     * 
     */
    @XmlAttribute(name = "Value")
    protected Float value;

    /**
     * The segment reference
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirSegmentRef()
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
    }

    /**
     * The CO2 emission value for the air segment
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getValue()
     */
    public void setValue(Float value) {
        this.value = value;
    }

}
