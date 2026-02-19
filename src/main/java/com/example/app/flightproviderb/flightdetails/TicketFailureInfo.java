
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Name"/>
 *       </sequence>
 *       <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
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
    "name"
})
@XmlRootElement(name = "TicketFailureInfo")
public class TicketFailureInfo {

    /**
     * Returns related air pricing infos.
     * 
     */
    @XmlElement(name = "AirPricingInfoRef", required = true)
    protected List<AirPricingInfoRef> airPricingInfoRef;
    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected Name name;
    @XmlAttribute(name = "Code", required = true)
    protected BigInteger code;
    @XmlAttribute(name = "Message")
    protected String message;
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;

    /**
     * Returns related air pricing infos.
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
     * Complete name fields
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     * @see #getName()
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
