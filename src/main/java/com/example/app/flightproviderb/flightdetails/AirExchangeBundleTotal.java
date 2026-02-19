
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AirExchangeInfo"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Penalty" maxOccurs="999" minOccurs="0"/>
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
    "airExchangeInfo",
    "penalty"
})
@XmlRootElement(name = "AirExchangeBundleTotal")
public class AirExchangeBundleTotal {

    /**
     * Provides results of a exchange quote
     * 
     */
    @XmlElement(name = "AirExchangeInfo", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected AirExchangeInfo airExchangeInfo;
    /**
     * Only used within an AirExchangeQuoteRsp
     * 
     */
    @XmlElement(name = "Penalty", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Penalty> penalty;

    /**
     * Provides results of a exchange quote
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeInfo }
     *     
     */
    public AirExchangeInfo getAirExchangeInfo() {
        return airExchangeInfo;
    }

    /**
     * Sets the value of the airExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeInfo }
     *     
     * @see #getAirExchangeInfo()
     */
    public void setAirExchangeInfo(AirExchangeInfo value) {
        this.airExchangeInfo = value;
    }

    /**
     * Only used within an AirExchangeQuoteRsp
     * 
     * Gets the value of the penalty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Penalty }
     * </p>
     * 
     * 
     * @return
     *     The value of the penalty property.
     */
    public List<Penalty> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<>();
        }
        return this.penalty;
    }

}
