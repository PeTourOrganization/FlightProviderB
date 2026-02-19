
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}VoidResultInfo" maxOccurs="999"/>
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
    "voidResultInfo"
})
@XmlRootElement(name = "AirVoidDocumentRsp")
public class AirVoidDocumentRsp
    extends BaseRsp
{

    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "VoidResultInfo", required = true)
    protected List<VoidResultInfo> voidResultInfo;

    /**
     * Provider: 1G,1V.
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
     * Provider: 1G,1V.
     * 
     * Gets the value of the voidResultInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voidResultInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVoidResultInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoidResultInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the voidResultInfo property.
     */
    public List<VoidResultInfo> getVoidResultInfo() {
        if (voidResultInfo == null) {
            voidResultInfo = new ArrayList<>();
        }
        return this.voidResultInfo;
    }

}
