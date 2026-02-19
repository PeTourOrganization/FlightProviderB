
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDInfo"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDSummaryInfo" maxOccurs="999"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emdInfo",
    "emdSummaryInfo"
})
@XmlRootElement(name = "EMDRetrieveRsp")
public class EMDRetrieveRsp
    extends BaseRsp
{

    /**
     * Provider: 1G/1V/1P.
     * 
     */
    @XmlElement(name = "EMDInfo")
    protected EMDInfo emdInfo;
    /**
     * Provider: 1G/1V/1P.
     * 
     */
    @XmlElement(name = "EMDSummaryInfo")
    protected List<EMDSummaryInfo> emdSummaryInfo;

    /**
     * Provider: 1G/1V/1P.
     * 
     * @return
     *     possible object is
     *     {@link EMDInfo }
     *     
     */
    public EMDInfo getEMDInfo() {
        return emdInfo;
    }

    /**
     * Sets the value of the emdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDInfo }
     *     
     * @see #getEMDInfo()
     */
    public void setEMDInfo(EMDInfo value) {
        this.emdInfo = value;
    }

    /**
     * Provider: 1G/1V/1P.
     * 
     * Gets the value of the emdSummaryInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdSummaryInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEMDSummaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDSummaryInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the emdSummaryInfo property.
     */
    public List<EMDSummaryInfo> getEMDSummaryInfo() {
        if (emdSummaryInfo == null) {
            emdSummaryInfo = new ArrayList<>();
        }
        return this.emdSummaryInfo;
    }

}
