
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDSummaryInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDInfo" maxOccurs="999" minOccurs="0"/>
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
    "emdSummaryInfo",
    "emdInfo"
})
@XmlRootElement(name = "EMDIssuanceRsp")
public class EMDIssuanceRsp
    extends BaseRsp
{

    /**
     * List of EMDSummaryInfo elements to show minimal information in issuance response. Appears for ShowDetails=false in the request.This is the default behaviour.
     * 
     */
    @XmlElement(name = "EMDSummaryInfo")
    protected List<EMDSummaryInfo> emdSummaryInfo;
    /**
     * List of EMDInfo elements to show detailoed information in issuance response. Appears for ShowDetails=true in the request.
     * 
     */
    @XmlElement(name = "EMDInfo")
    protected List<EMDInfo> emdInfo;

    /**
     * List of EMDSummaryInfo elements to show minimal information in issuance response. Appears for ShowDetails=false in the request.This is the default behaviour.
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

    /**
     * List of EMDInfo elements to show detailoed information in issuance response. Appears for ShowDetails=true in the request.
     * 
     * Gets the value of the emdInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEMDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the emdInfo property.
     */
    public List<EMDInfo> getEMDInfo() {
        if (emdInfo == null) {
            emdInfo = new ArrayList<>();
        }
        return this.emdInfo;
    }

}
