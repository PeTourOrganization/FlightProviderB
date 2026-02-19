
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageAllowanceInfo" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CarryOnAllowanceInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EmbargoInfo" maxOccurs="999" minOccurs="0"/>
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
    "baggageAllowanceInfo",
    "carryOnAllowanceInfo",
    "embargoInfo"
})
@XmlRootElement(name = "BaggageAllowances")
public class BaggageAllowances {

    /**
     * Information related to Baggage allowance like URL,Height,Weight etc.
     * 
     */
    @XmlElement(name = "BaggageAllowanceInfo", required = true)
    protected List<BaggageAllowanceInfo> baggageAllowanceInfo;
    /**
     * Information related to Carry-On allowance like URL, pricing etc
     * 
     */
    @XmlElement(name = "CarryOnAllowanceInfo")
    protected List<CarryOnAllowanceInfo> carryOnAllowanceInfo;
    /**
     * Information related to Embargo
     * 
     */
    @XmlElement(name = "EmbargoInfo")
    protected List<BaseBaggageAllowanceInfo> embargoInfo;

    /**
     * Information related to Baggage allowance like URL,Height,Weight etc.
     * 
     * Gets the value of the baggageAllowanceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowanceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageAllowanceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowanceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the baggageAllowanceInfo property.
     */
    public List<BaggageAllowanceInfo> getBaggageAllowanceInfo() {
        if (baggageAllowanceInfo == null) {
            baggageAllowanceInfo = new ArrayList<>();
        }
        return this.baggageAllowanceInfo;
    }

    /**
     * Information related to Carry-On allowance like URL, pricing etc
     * 
     * Gets the value of the carryOnAllowanceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnAllowanceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCarryOnAllowanceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarryOnAllowanceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the carryOnAllowanceInfo property.
     */
    public List<CarryOnAllowanceInfo> getCarryOnAllowanceInfo() {
        if (carryOnAllowanceInfo == null) {
            carryOnAllowanceInfo = new ArrayList<>();
        }
        return this.carryOnAllowanceInfo;
    }

    /**
     * Information related to Embargo
     * 
     * Gets the value of the embargoInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embargoInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEmbargoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseBaggageAllowanceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the embargoInfo property.
     */
    public List<BaseBaggageAllowanceInfo> getEmbargoInfo() {
        if (embargoInfo == null) {
            embargoInfo = new ArrayList<>();
        }
        return this.embargoInfo;
    }

}
