
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Option" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="LegRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "option"
})
@XmlRootElement(name = "FlightOption")
public class FlightOption {

    /**
     * List of BookingInfo available for the search air leg.
     * 
     */
    @XmlElement(name = "Option", required = true)
    protected List<Option> option;
    /**
     * Identifies the Leg Reference for this Flight Option.
     * 
     */
    @XmlAttribute(name = "LegRef")
    protected String legRef;
    /**
     * The IATA location code for this origination of this entity.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * The IATA location code for this destination of this entity.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;

    /**
     * List of BookingInfo available for the search air leg.
     * 
     * Gets the value of the option property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option }
     * </p>
     * 
     * 
     * @return
     *     The value of the option property.
     */
    public List<Option> getOption() {
        if (option == null) {
            option = new ArrayList<>();
        }
        return this.option;
    }

    /**
     * Identifies the Leg Reference for this Flight Option.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegRef() {
        return legRef;
    }

    /**
     * Sets the value of the legRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLegRef()
     */
    public void setLegRef(String value) {
        this.legRef = value;
    }

    /**
     * The IATA location code for this origination of this entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * The IATA location code for this destination of this entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}
