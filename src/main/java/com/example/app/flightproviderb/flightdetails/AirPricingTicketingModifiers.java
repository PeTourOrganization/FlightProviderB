
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketingModifiers"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingInfoRef",
    "ticketingModifiers"
})
@XmlRootElement(name = "AirPricingTicketingModifiers")
public class AirPricingTicketingModifiers {

    /**
     * Reference to a AirPricing from a shared
     *                 list
     * 
     */
    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirPricingInfoRef> airPricingInfoRef;
    /**
     * A container to identify individual ticketing
     *             modifiers.
     * 
     */
    @XmlElement(name = "TicketingModifiers", required = true)
    protected TicketingModifiers ticketingModifiers;

    /**
     * Reference to a AirPricing from a shared
     *                 list
     * 
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingInfoRef property.
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * A container to identify individual ticketing
     *             modifiers.
     * 
     * @return
     *     possible object is
     *     {@link TicketingModifiers }
     *     
     */
    public TicketingModifiers getTicketingModifiers() {
        return ticketingModifiers;
    }

    /**
     * Sets the value of the ticketingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingModifiers }
     *     
     * @see #getTicketingModifiers()
     */
    public void setTicketingModifiers(TicketingModifiers value) {
        this.ticketingModifiers = value;
    }

}
