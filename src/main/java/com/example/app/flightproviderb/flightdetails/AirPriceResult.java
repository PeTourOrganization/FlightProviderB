
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRule" maxOccurs="999" minOccurs="0"/>
 *         <element name="AirPriceError" type="{http://www.travelport.com/schema/common_v54_0}typeResultMessage" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AmenitiesList" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CommandKey">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="10"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingSolution",
    "fareRule",
    "airPriceError",
    "amenitiesList"
})
@XmlRootElement(name = "AirPriceResult")
public class AirPriceResult {

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    /**
     * Fare Rule Container
     * 
     */
    @XmlElement(name = "FareRule")
    protected List<FareRule> fareRule;
    @XmlElement(name = "AirPriceError")
    protected TypeResultMessage airPriceError;
    /**
     * List of Amenities for the itinerary.
     * 
     */
    @XmlElement(name = "AmenitiesList")
    protected List<AmenitiesList> amenitiesList;
    /**
     * The command identifier used when this is in
     *                         response to an AirPricingCommand. Not used in any request
     *                         processing.
     * 
     */
    @XmlAttribute(name = "CommandKey")
    protected String commandKey;

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     * Gets the value of the airPricingSolution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingSolution property.
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<>();
        }
        return this.airPricingSolution;
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

    /**
     * Gets the value of the airPriceError property.
     * 
     * @return
     *     possible object is
     *     {@link TypeResultMessage }
     *     
     */
    public TypeResultMessage getAirPriceError() {
        return airPriceError;
    }

    /**
     * Sets the value of the airPriceError property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeResultMessage }
     *     
     */
    public void setAirPriceError(TypeResultMessage value) {
        this.airPriceError = value;
    }

    /**
     * List of Amenities for the itinerary.
     * 
     * Gets the value of the amenitiesList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenitiesList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAmenitiesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenitiesList }
     * </p>
     * 
     * 
     * @return
     *     The value of the amenitiesList property.
     */
    public List<AmenitiesList> getAmenitiesList() {
        if (amenitiesList == null) {
            amenitiesList = new ArrayList<>();
        }
        return this.amenitiesList;
    }

    /**
     * The command identifier used when this is in
     *                         response to an AirPricingCommand. Not used in any request
     *                         processing.
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

}
