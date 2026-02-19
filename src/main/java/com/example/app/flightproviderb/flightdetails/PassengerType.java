
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typePassengerType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareGuaranteeInfo" minOccurs="0"/>
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
    "fareGuaranteeInfo"
})
@XmlRootElement(name = "PassengerType")
public class PassengerType
    extends TypePassengerType
{

    /**
     * The information related to fare guarantee details.
     * 
     */
    @XmlElement(name = "FareGuaranteeInfo")
    protected FareGuaranteeInfo fareGuaranteeInfo;

    /**
     * The information related to fare guarantee details.
     * 
     * @return
     *     possible object is
     *     {@link FareGuaranteeInfo }
     *     
     */
    public FareGuaranteeInfo getFareGuaranteeInfo() {
        return fareGuaranteeInfo;
    }

    /**
     * Sets the value of the fareGuaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareGuaranteeInfo }
     *     
     * @see #getFareGuaranteeInfo()
     */
    public void setFareGuaranteeInfo(FareGuaranteeInfo value) {
        this.fareGuaranteeInfo = value;
    }

}
