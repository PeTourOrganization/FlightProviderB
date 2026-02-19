
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
 *       <attribute name="TourCode" type="{http://www.travelport.com/schema/air_v54_0}typeTourCode" />
 *       <attribute name="TicketDesignator" type="{http://www.travelport.com/schema/air_v54_0}typeTicketDesignator" />
 *       <attribute name="Endorsement">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="100"/>
 *             <minLength value="0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "WaiverCode")
public class WaiverCode {

    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "TicketDesignator")
    protected String ticketDesignator;
    /**
     * Endorsement. Size can be up to 100
     *                         characters
     * 
     */
    @XmlAttribute(name = "Endorsement")
    protected String endorsement;

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
    }

    /**
     * Endorsement. Size can be up to 100
     *                         characters
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEndorsement()
     */
    public void setEndorsement(String value) {
        this.endorsement = value;
    }

}
