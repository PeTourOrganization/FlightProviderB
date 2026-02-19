
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirItineraryDetails"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" minOccurs="0"/>
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
    "airItineraryDetails",
    "accountCode"
})
@XmlRootElement(name = "MerchandisingAvailabilityDetails")
public class MerchandisingAvailabilityDetails {

    /**
     * Itinerary details containing brand details
     * 
     */
    @XmlElement(name = "AirItineraryDetails", required = true)
    protected AirItineraryDetails airItineraryDetails;
    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AccountCode accountCode;

    /**
     * Itinerary details containing brand details
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryDetails }
     *     
     */
    public AirItineraryDetails getAirItineraryDetails() {
        return airItineraryDetails;
    }

    /**
     * Sets the value of the airItineraryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryDetails }
     *     
     * @see #getAirItineraryDetails()
     */
    public void setAirItineraryDetails(AirItineraryDetails value) {
        this.airItineraryDetails = value;
    }

    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     * @return
     *     possible object is
     *     {@link AccountCode }
     *     
     */
    public AccountCode getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCode }
     *     
     * @see #getAccountCode()
     */
    public void setAccountCode(AccountCode value) {
        this.accountCode = value;
    }

}
