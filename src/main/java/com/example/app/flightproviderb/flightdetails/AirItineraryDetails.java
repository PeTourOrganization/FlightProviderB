
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentDetails" maxOccurs="16"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PassengerDetails" maxOccurs="15"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegmentDetails",
    "passengerDetails"
})
@XmlRootElement(name = "AirItineraryDetails")
public class AirItineraryDetails {

    /**
     * An Air marketable travel segment.
     * 
     */
    @XmlElement(name = "AirSegmentDetails", required = true)
    protected List<AirSegmentDetails> airSegmentDetails;
    /**
     * Details of passenger
     * 
     */
    @XmlElement(name = "PassengerDetails", required = true)
    protected List<PassengerDetails> passengerDetails;
    /**
     * Air itinerary details key
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * An Air marketable travel segment.
     * 
     * Gets the value of the airSegmentDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentDetails property.
     */
    public List<AirSegmentDetails> getAirSegmentDetails() {
        if (airSegmentDetails == null) {
            airSegmentDetails = new ArrayList<>();
        }
        return this.airSegmentDetails;
    }

    /**
     * Details of passenger
     * 
     * Gets the value of the passengerDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerDetails property.
     */
    public List<PassengerDetails> getPassengerDetails() {
        if (passengerDetails == null) {
            passengerDetails = new ArrayList<>();
        }
        return this.passengerDetails;
    }

    /**
     * Air itinerary details key
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

}
