
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
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailJourney" maxOccurs="999" minOccurs="0"/>
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
    "railJourney"
})
@XmlRootElement(name = "RailJourneyList", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailJourneyList {

    /**
     * Captures all journey-related data
     * 
     */
    @XmlElement(name = "RailJourney", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailJourney> railJourney;

    /**
     * Captures all journey-related data
     * 
     * Gets the value of the railJourney property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railJourney property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailJourney }
     * </p>
     * 
     * 
     * @return
     *     The value of the railJourney property.
     */
    public List<RailJourney> getRailJourney() {
        if (railJourney == null) {
            railJourney = new ArrayList<>();
        }
        return this.railJourney;
    }

}
