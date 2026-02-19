
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareTicketDesignator" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassengerDetailRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FareBasis" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeFareBasisCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareTicketDesignator"
})
@XmlRootElement(name = "FareDetails")
public class FareDetails {

    /**
     * Ticket Designator used to further qualify a
     *                 Fare
     * 
     */
    @XmlElement(name = "FareTicketDesignator")
    protected FareTicketDesignator fareTicketDesignator;
    /**
     * Fare key
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * PassengerRef key
     * 
     */
    @XmlAttribute(name = "PassengerDetailRef", required = true)
    protected String passengerDetailRef;
    /**
     * The fare basis code for this fare
     * 
     */
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;

    /**
     * Ticket Designator used to further qualify a
     *                 Fare
     * 
     * @return
     *     possible object is
     *     {@link FareTicketDesignator }
     *     
     */
    public FareTicketDesignator getFareTicketDesignator() {
        return fareTicketDesignator;
    }

    /**
     * Sets the value of the fareTicketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTicketDesignator }
     *     
     * @see #getFareTicketDesignator()
     */
    public void setFareTicketDesignator(FareTicketDesignator value) {
        this.fareTicketDesignator = value;
    }

    /**
     * Fare key
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * PassengerRef key
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerDetailRef() {
        return passengerDetailRef;
    }

    /**
     * Sets the value of the passengerDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassengerDetailRef()
     */
    public void setPassengerDetailRef(String value) {
        this.passengerDetailRef = value;
    }

    /**
     * The fare basis code for this fare
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasis()
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

}
