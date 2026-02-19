
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typePassengerType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AirSeatAssignment" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSeatAssignment"
})
@XmlRootElement(name = "SearchTraveler")
public class SearchTraveler
    extends TypePassengerType
{

    /**
     * Identifies the seat assignment for a passenger.
     * 
     */
    @XmlElement(name = "AirSeatAssignment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AirSeatAssignment> airSeatAssignment;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Identifies the seat assignment for a passenger.
     * 
     * Gets the value of the airSeatAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSeatAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSeatAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSeatAssignment property.
     */
    public List<AirSeatAssignment> getAirSeatAssignment() {
        if (airSeatAssignment == null) {
            airSeatAssignment = new ArrayList<>();
        }
        return this.airSeatAssignment;
    }

    /**
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

}
