
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}OverridePCC" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketAgency" minOccurs="0"/>
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
    "overridePCC",
    "pointOfSale",
    "ticketAgency"
})
@XmlRootElement(name = "PCC")
public class PCC {

    /**
     * Used to emulate to another PCC or SID.  Providers: 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "OverridePCC", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected OverridePCC overridePCC;
    /**
     * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
     * 
     */
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PointOfSale> pointOfSale;
    /**
     * This modifier will override the pseudo of the ticketing agency found in the AAT (TKAG). Used for all plating carrier validation.
     * 
     */
    @XmlElement(name = "TicketAgency")
    protected TicketAgency ticketAgency;

    /**
     * Used to emulate to another PCC or SID.  Providers: 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     * @see #getOverridePCC()
     */
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
    }

    /**
     * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
     * 
     * Gets the value of the pointOfSale property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * </p>
     * 
     * 
     * @return
     *     The value of the pointOfSale property.
     */
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<>();
        }
        return this.pointOfSale;
    }

    /**
     * This modifier will override the pseudo of the ticketing agency found in the AAT (TKAG). Used for all plating carrier validation.
     * 
     * @return
     *     possible object is
     *     {@link TicketAgency }
     *     
     */
    public TicketAgency getTicketAgency() {
        return ticketAgency;
    }

    /**
     * Sets the value of the ticketAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAgency }
     *     
     * @see #getTicketAgency()
     */
    public void setTicketAgency(TicketAgency value) {
        this.ticketAgency = value;
    }

}
