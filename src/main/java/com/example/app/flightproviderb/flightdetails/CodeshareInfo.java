
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="OperatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="OperatingFlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "CodeshareInfo")
public class CodeshareInfo {

    @XmlValue
    protected String value;
    /**
     * The actual carrier that is operating the
     *                                 flight.
     * 
     */
    @XmlAttribute(name = "OperatingCarrier")
    protected String operatingCarrier;
    /**
     * The actual flight number of the carrier that
     *                                 is operating the flight.
     * 
     */
    @XmlAttribute(name = "OperatingFlightNumber")
    protected String operatingFlightNumber;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The actual carrier that is operating the
     *                                 flight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingCarrier()
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

    /**
     * The actual flight number of the carrier that
     *                                 is operating the flight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingFlightNumber()
     */
    public void setOperatingFlightNumber(String value) {
        this.operatingFlightNumber = value;
    }

}
