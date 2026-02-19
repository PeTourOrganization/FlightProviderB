
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PassengerReceiptOverride" minOccurs="0"/>
 *         <element name="OverrideOption" type="{http://www.travelport.com/schema/air_v54_0}typeOverrideOption" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SuppressItineraryRemarks" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GenerateItinNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengerReceiptOverride",
    "overrideOption"
})
@XmlRootElement(name = "DocumentOptions")
public class DocumentOptions {

    /**
     * It is required when a passenger receipt is
     *                 required immediately ,GDS overrides the default value
     * 
     */
    @XmlElement(name = "PassengerReceiptOverride")
    protected PassengerReceiptOverride passengerReceiptOverride;
    /**
     * Allows an agency to override print options for documents during document generation.
     * 
     */
    @XmlElement(name = "OverrideOption")
    protected List<String> overrideOption;
    /**
     * True when itinerary remarks are suppressed.
     * 
     */
    @XmlAttribute(name = "SuppressItineraryRemarks")
    protected Boolean suppressItineraryRemarks;
    /**
     * True when itinerary numbers are system
     *                         generated.
     * 
     */
    @XmlAttribute(name = "GenerateItinNumbers")
    protected Boolean generateItinNumbers;

    /**
     * It is required when a passenger receipt is
     *                 required immediately ,GDS overrides the default value
     * 
     * @return
     *     possible object is
     *     {@link PassengerReceiptOverride }
     *     
     */
    public PassengerReceiptOverride getPassengerReceiptOverride() {
        return passengerReceiptOverride;
    }

    /**
     * Sets the value of the passengerReceiptOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerReceiptOverride }
     *     
     * @see #getPassengerReceiptOverride()
     */
    public void setPassengerReceiptOverride(PassengerReceiptOverride value) {
        this.passengerReceiptOverride = value;
    }

    /**
     * Allows an agency to override print options for documents during document generation.
     * 
     * Gets the value of the overrideOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overrideOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOverrideOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the overrideOption property.
     */
    public List<String> getOverrideOption() {
        if (overrideOption == null) {
            overrideOption = new ArrayList<>();
        }
        return this.overrideOption;
    }

    /**
     * True when itinerary remarks are suppressed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressItineraryRemarks() {
        return suppressItineraryRemarks;
    }

    /**
     * Sets the value of the suppressItineraryRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSuppressItineraryRemarks()
     */
    public void setSuppressItineraryRemarks(Boolean value) {
        this.suppressItineraryRemarks = value;
    }

    /**
     * True when itinerary numbers are system
     *                         generated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateItinNumbers() {
        return generateItinNumbers;
    }

    /**
     * Sets the value of the generateItinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isGenerateItinNumbers()
     */
    public void setGenerateItinNumbers(Boolean value) {
        this.generateItinNumbers = value;
    }

}
