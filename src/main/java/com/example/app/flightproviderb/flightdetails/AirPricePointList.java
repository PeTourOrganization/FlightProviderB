
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricePoint" maxOccurs="999" minOccurs="0"/>
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
    "airPricePoint"
})
@XmlRootElement(name = "AirPricePointList")
public class AirPricePointList {

    /**
     * The container which holds the Non Solutioned result. Different options for each search leg requested will be returned and one option for each search leg can be selected.
     * 
     */
    @XmlElement(name = "AirPricePoint")
    protected List<AirPricePoint> airPricePoint;

    /**
     * The container which holds the Non Solutioned result. Different options for each search leg requested will be returned and one option for each search leg can be selected.
     * 
     * Gets the value of the airPricePoint property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricePoint property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricePoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricePoint property.
     */
    public List<AirPricePoint> getAirPricePoint() {
        if (airPricePoint == null) {
            airPricePoint = new ArrayList<>();
        }
        return this.airPricePoint;
    }

}
