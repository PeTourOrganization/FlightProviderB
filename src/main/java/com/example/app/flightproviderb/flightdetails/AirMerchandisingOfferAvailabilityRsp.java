
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSolution"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EmbargoList" minOccurs="0"/>
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
    "airSolution",
    "remark",
    "optionalServices",
    "embargoList"
})
@XmlRootElement(name = "AirMerchandisingOfferAvailabilityRsp")
public class AirMerchandisingOfferAvailabilityRsp
    extends BaseRsp
{

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AirSolution", required = true)
    protected AirSolution airSolution;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Remark remark;
    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * List of embargoes. Provider: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "EmbargoList")
    protected EmbargoList embargoList;

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSolution }
     *     
     */
    public AirSolution getAirSolution() {
        return airSolution;
    }

    /**
     * Sets the value of the airSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolution }
     *     
     * @see #getAirSolution()
     */
    public void setAirSolution(AirSolution value) {
        this.airSolution = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link Remark }
     *     
     */
    public Remark getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remark }
     *     
     * @see #getRemark()
     */
    public void setRemark(Remark value) {
        this.remark = value;
    }

    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     * @see #getOptionalServices()
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * List of embargoes. Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link EmbargoList }
     *     
     */
    public EmbargoList getEmbargoList() {
        return embargoList;
    }

    /**
     * Sets the value of the embargoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbargoList }
     *     
     * @see #getEmbargoList()
     */
    public void setEmbargoList(EmbargoList value) {
        this.embargoList = value;
    }

}
