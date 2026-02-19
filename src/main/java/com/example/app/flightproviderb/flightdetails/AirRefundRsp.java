
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ETR" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TCR" maxOccurs="999" minOccurs="0"/>
 *         <element name="RefundFailureInfo" type="{http://www.travelport.com/schema/air_v54_0}typeTicketFailureInfo" maxOccurs="999" minOccurs="0"/>
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
    "etr",
    "tcr",
    "refundFailureInfo"
})
@XmlRootElement(name = "AirRefundRsp")
public class AirRefundRsp
    extends BaseRsp
{

    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "TCR")
    protected List<TCR> tcr;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "RefundFailureInfo")
    protected List<TypeTicketFailureInfo> refundFailureInfo;

    /**
     * Provider: ACH.
     * 
     * Gets the value of the etr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getETR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETR }
     * </p>
     * 
     * 
     * @return
     *     The value of the etr property.
     */
    public List<ETR> getETR() {
        if (etr == null) {
            etr = new ArrayList<>();
        }
        return this.etr;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the tcr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCR }
     * </p>
     * 
     * 
     * @return
     *     The value of the tcr property.
     */
    public List<TCR> getTCR() {
        if (tcr == null) {
            tcr = new ArrayList<>();
        }
        return this.tcr;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the refundFailureInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundFailureInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefundFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketFailureInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the refundFailureInfo property.
     */
    public List<TypeTicketFailureInfo> getRefundFailureInfo() {
        if (refundFailureInfo == null) {
            refundFailureInfo = new ArrayList<>();
        }
        return this.refundFailureInfo;
    }

}
