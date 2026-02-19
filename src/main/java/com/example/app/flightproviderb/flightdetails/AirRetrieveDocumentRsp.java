
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ETR" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MCO" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TCR" maxOccurs="999" minOccurs="0"/>
 *         <element name="DocumentFailureInfo" type="{http://www.travelport.com/schema/air_v54_0}typeFailureInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceFeeInfo" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
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
    "mco",
    "tcr",
    "documentFailureInfo",
    "serviceFeeInfo"
})
@XmlRootElement(name = "AirRetrieveDocumentRsp")
public class AirRetrieveDocumentRsp
    extends BaseRsp
{

    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "MCO", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<MCO> mco;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "TCR")
    protected List<TCR> tcr;
    /**
     * Provider: 1G,1V,1P-Will be optionally returned if there are duplicate ticket numbers.
     * 
     */
    @XmlElement(name = "DocumentFailureInfo")
    protected List<TypeFailureInfo> documentFailureInfo;
    /**
     * Provider: 1G,1V
     * 
     */
    @XmlElement(name = "ServiceFeeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ServiceFeeInfo> serviceFeeInfo;
    /**
     * Provider: 1G,1V,1P-Represents a valid Universal Record locator code.
     * 
     */
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;

    /**
     * Provider: 1G,1V,1P.
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
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the mco property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mco property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMCO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCO }
     * </p>
     * 
     * 
     * @return
     *     The value of the mco property.
     */
    public List<MCO> getMCO() {
        if (mco == null) {
            mco = new ArrayList<>();
        }
        return this.mco;
    }

    /**
     * Provider: 1G,1V,1P.
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
     * Provider: 1G,1V,1P-Will be optionally returned if there are duplicate ticket numbers.
     * 
     * Gets the value of the documentFailureInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentFailureInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFailureInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentFailureInfo property.
     */
    public List<TypeFailureInfo> getDocumentFailureInfo() {
        if (documentFailureInfo == null) {
            documentFailureInfo = new ArrayList<>();
        }
        return this.documentFailureInfo;
    }

    /**
     * Provider: 1G,1V
     * 
     * Gets the value of the serviceFeeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceFeeInfo property.
     */
    public List<ServiceFeeInfo> getServiceFeeInfo() {
        if (serviceFeeInfo == null) {
            serviceFeeInfo = new ArrayList<>();
        }
        return this.serviceFeeInfo;
    }

    /**
     * Provider: 1G,1V,1P-Represents a valid Universal Record locator code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUniversalRecordLocatorCode()
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

}
