
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
 *       <attribute name="DefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="StartPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="EndPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PriceRange")
public class PriceRange {

    /**
     * Indicates if the currency code of StartPrice / EndPrice is the default currency code
     * 
     */
    @XmlAttribute(name = "DefaultCurrency")
    protected Boolean defaultCurrency;
    /**
     * Price range start value
     * 
     */
    @XmlAttribute(name = "StartPrice")
    protected String startPrice;
    /**
     * Price range end value
     * 
     */
    @XmlAttribute(name = "EndPrice")
    protected String endPrice;

    /**
     * Indicates if the currency code of StartPrice / EndPrice is the default currency code
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Sets the value of the defaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDefaultCurrency()
     */
    public void setDefaultCurrency(Boolean value) {
        this.defaultCurrency = value;
    }

    /**
     * Price range start value
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStartPrice()
     */
    public void setStartPrice(String value) {
        this.startPrice = value;
    }

    /**
     * Price range end value
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPrice() {
        return endPrice;
    }

    /**
     * Sets the value of the endPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEndPrice()
     */
    public void setEndPrice(String value) {
        this.endPrice = value;
    }

}
