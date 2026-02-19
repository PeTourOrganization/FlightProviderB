
package com.example.app.flightproviderb.flightdetails;

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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}AirSearchRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BrandList" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CurrencyType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "brandList"
})
@XmlRootElement(name = "LowFareSearchRsp")
public class LowFareSearchRsp
    extends AirSearchRsp
{

    @XmlElement(name = "BrandList")
    protected BrandList brandList;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlAttribute(name = "CurrencyType", required = true)
    protected String currencyType;

    /**
     * Gets the value of the brandList property.
     * 
     * @return
     *     possible object is
     *     {@link BrandList }
     *     
     */
    public BrandList getBrandList() {
        return brandList;
    }

    /**
     * Sets the value of the brandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandList }
     *     
     */
    public void setBrandList(BrandList value) {
        this.brandList = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrencyType()
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

}
