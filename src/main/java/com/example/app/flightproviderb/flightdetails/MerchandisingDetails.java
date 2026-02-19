
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirItineraryDetails" maxOccurs="99"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" maxOccurs="10" minOccurs="0"/>
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
@XmlRootElement(name = "MerchandisingDetails")
public class MerchandisingDetails {

    /**
     * Itinerary details containing brand details
     * 
     */
    @XmlElement(name = "AirItineraryDetails", required = true)
    protected List<AirItineraryDetails> airItineraryDetails;
    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AccountCode> accountCode;

    /**
     * Itinerary details containing brand details
     * 
     * Gets the value of the airItineraryDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItineraryDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItineraryDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the airItineraryDetails property.
     */
    public List<AirItineraryDetails> getAirItineraryDetails() {
        if (airItineraryDetails == null) {
            airItineraryDetails = new ArrayList<>();
        }
        return this.airItineraryDetails;
    }

    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     * Gets the value of the accountCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountCode property.
     */
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<>();
        }
        return this.accountCode;
    }

}
