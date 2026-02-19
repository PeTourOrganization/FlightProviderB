
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
 *       <attribute name="RailCoachNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AvailableRailSeats" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RailSeatMapAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailCoachDetails")
public class RailCoachDetails {

    /**
     * Rail coach number for the returned coach details.
     * 
     */
    @XmlAttribute(name = "RailCoachNumber")
    protected String railCoachNumber;
    /**
     * Number of available seats present in this rail coach.
     * 
     */
    @XmlAttribute(name = "AvailableRailSeats")
    protected String availableRailSeats;
    /**
     * Indicates if seats are available in this rail coach which can be mapped.
     * 
     */
    @XmlAttribute(name = "RailSeatMapAvailability")
    protected Boolean railSeatMapAvailability;

    /**
     * Rail coach number for the returned coach details.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCoachNumber() {
        return railCoachNumber;
    }

    /**
     * Sets the value of the railCoachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailCoachNumber()
     */
    public void setRailCoachNumber(String value) {
        this.railCoachNumber = value;
    }

    /**
     * Number of available seats present in this rail coach.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableRailSeats() {
        return availableRailSeats;
    }

    /**
     * Sets the value of the availableRailSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvailableRailSeats()
     */
    public void setAvailableRailSeats(String value) {
        this.availableRailSeats = value;
    }

    /**
     * Indicates if seats are available in this rail coach which can be mapped.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRailSeatMapAvailability() {
        return railSeatMapAvailability;
    }

    /**
     * Sets the value of the railSeatMapAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRailSeatMapAvailability()
     */
    public void setRailSeatMapAvailability(Boolean value) {
        this.railSeatMapAvailability = value;
    }

}
