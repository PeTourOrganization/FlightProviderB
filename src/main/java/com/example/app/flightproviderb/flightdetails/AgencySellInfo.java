
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
 *       <attribute name="IataCode" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *       <attribute name="Country" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *       <attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="CityCode" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AgencySellInfo {

    /**
     * The IATA code that pertains to this Agency and Branch.
     * 
     */
    @XmlAttribute(name = "IataCode")
    protected String iataCode;
    /**
     * The country code of the requesting agency.
     * 
     */
    @XmlAttribute(name = "Country")
    protected String country;
    /**
     * The currency code in which the reservation will be ticketed.
     * 
     */
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    /**
     * The IATA assigned airline/GDS code.
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * The PCC in the host system.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * IATA code of "home" city or airport.
     * 
     */
    @XmlAttribute(name = "CityCode")
    protected String cityCode;

    /**
     * The IATA code that pertains to this Agency and Branch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataCode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIataCode()
     */
    public void setIataCode(String value) {
        this.iataCode = value;
    }

    /**
     * The country code of the requesting agency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountry()
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * The currency code in which the reservation will be ticketed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrencyCode()
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * The IATA assigned airline/GDS code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderCode()
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * The PCC in the host system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPseudoCityCode()
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * IATA code of "home" city or airport.
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
