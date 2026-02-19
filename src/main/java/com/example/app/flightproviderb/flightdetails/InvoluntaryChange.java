
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketEndorsement"/>
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
    "ticketEndorsement"
})
@XmlRootElement(name = "InvoluntaryChange")
public class InvoluntaryChange {

    @XmlElement(name = "TicketEndorsement", required = true)
    protected TicketEndorsement ticketEndorsement;

    /**
     * Gets the value of the ticketEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link TicketEndorsement }
     *     
     */
    public TicketEndorsement getTicketEndorsement() {
        return ticketEndorsement;
    }

    /**
     * Sets the value of the ticketEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketEndorsement }
     *     
     */
    public void setTicketEndorsement(TicketEndorsement value) {
        this.ticketEndorsement = value;
    }

}
