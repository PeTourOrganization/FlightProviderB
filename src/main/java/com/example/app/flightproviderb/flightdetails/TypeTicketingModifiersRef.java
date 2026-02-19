
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTicketingModifiersRef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTicketingModifiersRef">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999" minOccurs="0"/>
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
@XmlType(name = "typeTicketingModifiersRef", propOrder = {
    "airPricingInfoRef"
})
public class TypeTicketingModifiersRef {

    /**
     * Reference to a AirPricing from a shared
     *                 list
     * 
     */
    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirPricingInfoRef> airPricingInfoRef;
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * Reference to a AirPricing from a shared
     *                 list
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
