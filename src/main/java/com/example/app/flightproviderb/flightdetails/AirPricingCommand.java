
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentPricingModifiers" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CommandKey">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="10"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingModifiers",
    "airSegmentPricingModifiers"
})
@XmlRootElement(name = "AirPricingCommand")
public class AirPricingCommand {

    /**
     * Controls and switches for a Air Search
     *                 request that contains Pricing Information
     * 
     */
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     */
    @XmlElement(name = "AirSegmentPricingModifiers")
    protected List<AirSegmentPricingModifiers> airSegmentPricingModifiers;
    /**
     * An identifier to link the pricing responses to
     *                         the pricing commands. The value passed here will be returned in
     *                         the resulting AirPricingInfo(s) from this command.
     * 
     */
    @XmlAttribute(name = "CommandKey")
    protected String commandKey;
    /**
     * Specify the cabin type to price the entire
     *                         itinerary in. If segment level cabin selection is required, this
     *                         attribute should not be used.
     * 
     */
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;

    /**
     * Controls and switches for a Air Search
     *                 request that contains Pricing Information
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers }
     *     
     */
    public AirPricingModifiers getAirPricingModifiers() {
        return airPricingModifiers;
    }

    /**
     * Sets the value of the airPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers }
     *     
     * @see #getAirPricingModifiers()
     */
    public void setAirPricingModifiers(AirPricingModifiers value) {
        this.airPricingModifiers = value;
    }

    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     * Gets the value of the airSegmentPricingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentPricingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentPricingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentPricingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentPricingModifiers property.
     */
    public List<AirSegmentPricingModifiers> getAirSegmentPricingModifiers() {
        if (airSegmentPricingModifiers == null) {
            airSegmentPricingModifiers = new ArrayList<>();
        }
        return this.airSegmentPricingModifiers;
    }

    /**
     * An identifier to link the pricing responses to
     *                         the pricing commands. The value passed here will be returned in
     *                         the resulting AirPricingInfo(s) from this command.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandKey() {
        return commandKey;
    }

    /**
     * Sets the value of the commandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommandKey()
     */
    public void setCommandKey(String value) {
        this.commandKey = value;
    }

    /**
     * Specify the cabin type to price the entire
     *                         itinerary in. If segment level cabin selection is required, this
     *                         attribute should not be used.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

}
