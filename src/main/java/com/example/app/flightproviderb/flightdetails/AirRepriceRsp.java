
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRule" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingSolution",
    "fareRule"
})
@XmlRootElement(name = "AirRepriceRsp")
public class AirRepriceRsp
    extends BaseRsp
{

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution", required = true)
    protected AirPricingSolution airPricingSolution;
    /**
     * Fare Rule Container
     * 
     */
    @XmlElement(name = "FareRule")
    protected List<FareRule> fareRule;

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     * @see #getAirPricingSolution()
     */
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
    }

    /**
     * Fare Rule Container
     * 
     * Gets the value of the fareRule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRule }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRule property.
     */
    public List<FareRule> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<>();
        }
        return this.fareRule;
    }

}
