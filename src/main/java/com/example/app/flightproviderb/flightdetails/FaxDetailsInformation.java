
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FaxDetails"/>
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
    "airPricingInfoRef",
    "faxDetails"
})
@XmlRootElement(name = "FaxDetailsInformation")
public class FaxDetailsInformation {

    /**
     * Returns related air pricing infos.
     * 
     */
    @XmlElement(name = "AirPricingInfoRef", required = true)
    protected List<AirPricingInfoRef> airPricingInfoRef;
    /**
     * The Fax Details Information
     * 
     */
    @XmlElement(name = "FaxDetails", required = true)
    protected FaxDetails faxDetails;

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
     * The Fax Details Information
     * 
     * @return
     *     possible object is
     *     {@link FaxDetails }
     *     
     */
    public FaxDetails getFaxDetails() {
        return faxDetails;
    }

    /**
     * Sets the value of the faxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxDetails }
     *     
     * @see #getFaxDetails()
     */
    public void setFaxDetails(FaxDetails value) {
        this.faxDetails = value;
    }

}
