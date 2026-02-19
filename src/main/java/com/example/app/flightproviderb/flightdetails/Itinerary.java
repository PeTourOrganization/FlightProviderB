
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Type" type="{http://www.travelport.com/schema/air_v54_0}typeItinerary" />
 *       <attribute name="Option" type="{http://www.travelport.com/schema/air_v54_0}typeItineraryOption" />
 *       <attribute name="SeparateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Itinerary")
public class Itinerary {

    /**
     * Specifies the type of itinenary option
     *                         for ticket like Invoice type or Pocket itinenary.
     * 
     */
    @XmlAttribute(name = "Type")
    protected TypeItinerary type;
    /**
     * Specifies the itinerary option like
     *                         NoFare,NoAmount.
     * 
     */
    @XmlAttribute(name = "Option")
    protected TypeItineraryOption option;
    /**
     * Set to true if one itinerary to be printed per
     *                         passenger.
     * 
     */
    @XmlAttribute(name = "SeparateIndicator")
    protected Boolean separateIndicator;

    /**
     * Specifies the type of itinenary option
     *                         for ticket like Invoice type or Pocket itinenary.
     * 
     * @return
     *     possible object is
     *     {@link TypeItinerary }
     *     
     */
    public TypeItinerary getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItinerary }
     *     
     * @see #getType()
     */
    public void setType(TypeItinerary value) {
        this.type = value;
    }

    /**
     * Specifies the itinerary option like
     *                         NoFare,NoAmount.
     * 
     * @return
     *     possible object is
     *     {@link TypeItineraryOption }
     *     
     */
    public TypeItineraryOption getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItineraryOption }
     *     
     * @see #getOption()
     */
    public void setOption(TypeItineraryOption value) {
        this.option = value;
    }

    /**
     * Set to true if one itinerary to be printed per
     *                         passenger.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeparateIndicator() {
        return separateIndicator;
    }

    /**
     * Sets the value of the separateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSeparateIndicator()
     */
    public void setSeparateIndicator(Boolean value) {
        this.separateIndicator = value;
    }

}
