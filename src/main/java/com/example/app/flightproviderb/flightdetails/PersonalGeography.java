
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
 *         <choice>
 *           <element name="CountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" minOccurs="0"/>
 *           <element name="StateProvinceCode" type="{http://www.travelport.com/schema/common_v54_0}typeState" minOccurs="0"/>
 *           <element name="CityCode" type="{http://www.travelport.com/schema/common_v54_0}typeCity" minOccurs="0"/>
 *         </choice>
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
    "countryCode",
    "stateProvinceCode",
    "cityCode"
})
@XmlRootElement(name = "PersonalGeography", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PersonalGeography {

    /**
     * Passenger country code.
     * 
     */
    @XmlElement(name = "CountryCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String countryCode;
    /**
     * Passenger state/province code.
     * 
     */
    @XmlElement(name = "StateProvinceCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String stateProvinceCode;
    /**
     * Passenger city code.
     * 
     */
    @XmlElement(name = "CityCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String cityCode;

    /**
     * Passenger country code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryCode()
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Passenger state/province code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Sets the value of the stateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStateProvinceCode()
     */
    public void setStateProvinceCode(String value) {
        this.stateProvinceCode = value;
    }

    /**
     * Passenger city code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCityCode()
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

}
