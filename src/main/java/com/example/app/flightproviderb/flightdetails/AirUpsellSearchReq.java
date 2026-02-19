
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}AirBaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirItinerary"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPriceResult" maxOccurs="16"/>
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
    "airItinerary",
    "airPriceResult"
})
@XmlRootElement(name = "AirUpsellSearchReq")
public class AirUpsellSearchReq
    extends AirBaseReq
{

    /**
     * Provider: 1G,1V,1P,ACH-AirItinerary of the pricing request.
     * 
     */
    @XmlElement(name = "AirItinerary", required = true)
    protected AirItinerary airItinerary;
    /**
     * Provider: 1G,1V,1P,ACH-Result of AirPrice request. Upsell uses this to search for new offer.
     * 
     */
    @XmlElement(name = "AirPriceResult", required = true)
    protected List<AirPriceResult> airPriceResult;

    /**
     * Provider: 1G,1V,1P,ACH-AirItinerary of the pricing request.
     * 
     * @return
     *     possible object is
     *     {@link AirItinerary }
     *     
     */
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItinerary }
     *     
     * @see #getAirItinerary()
     */
    public void setAirItinerary(AirItinerary value) {
        this.airItinerary = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH-Result of AirPrice request. Upsell uses this to search for new offer.
     * 
     * Gets the value of the airPriceResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPriceResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPriceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPriceResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPriceResult property.
     */
    public List<AirPriceResult> getAirPriceResult() {
        if (airPriceResult == null) {
            airPriceResult = new ArrayList<>();
        }
        return this.airPriceResult;
    }

}
