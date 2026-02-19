
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExchangeEligibilityInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangeEligibilityInfo"
})
@XmlRootElement(name = "AirExchangeEligibilityRsp")
public class AirExchangeEligibilityRsp
    extends BaseRsp
{

    @XmlElement(name = "ExchangeEligibilityInfo", required = true)
    protected ExchangeEligibilityInfo exchangeEligibilityInfo;

    /**
     * Gets the value of the exchangeEligibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeEligibilityInfo }
     *     
     */
    public ExchangeEligibilityInfo getExchangeEligibilityInfo() {
        return exchangeEligibilityInfo;
    }

    /**
     * Sets the value of the exchangeEligibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeEligibilityInfo }
     *     
     */
    public void setExchangeEligibilityInfo(ExchangeEligibilityInfo value) {
        this.exchangeEligibilityInfo = value;
    }

}
