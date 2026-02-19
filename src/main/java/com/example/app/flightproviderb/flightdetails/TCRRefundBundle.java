
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirRefundInfo"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}WaiverCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TCRNumber" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTCRNumber" />
 *       <attribute name="RefundType" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Auto"/>
 *             <enumeration value="Manual"/>
 *             <enumeration value="Ignored"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute ref="{http://www.travelport.com/schema/air_v54_0}RefundAccessCode"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airRefundInfo",
    "waiverCode",
    "airSegment",
    "feeInfo",
    "taxInfo",
    "hostToken"
})
@XmlRootElement(name = "TCRRefundBundle")
public class TCRRefundBundle {

    /**
     * Provides results of a refund quote
     * 
     */
    @XmlElement(name = "AirRefundInfo", required = true)
    protected AirRefundInfo airRefundInfo;
    /**
     * Waiver code to override fare validations
     * 
     */
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    /**
     * An Air marketable travel segment.
     * 
     */
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    /**
     * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
     * 
     */
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    /**
     * Itinerary level taxes
     * 
     */
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    /**
     * one or more hosts
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     */
    @XmlAttribute(name = "TCRNumber", required = true)
    protected String tcrNumber;
    /**
     * Specifies whether this bundle was auto
     *                         or manually generated
     * 
     */
    @XmlAttribute(name = "RefundType", required = true)
    protected String refundType;
    /**
     * For some vendors a code/password is required to avail any amount retained during refund.User can define their own password too This attribute will be used to show/accept this code.
     * 
     */
    @XmlAttribute(name = "RefundAccessCode", namespace = "http://www.travelport.com/schema/air_v54_0")
    protected String refundAccessCode;

    /**
     * Provides results of a refund quote
     * 
     * @return
     *     possible object is
     *     {@link AirRefundInfo }
     *     
     */
    public AirRefundInfo getAirRefundInfo() {
        return airRefundInfo;
    }

    /**
     * Sets the value of the airRefundInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundInfo }
     *     
     * @see #getAirRefundInfo()
     */
    public void setAirRefundInfo(AirRefundInfo value) {
        this.airRefundInfo = value;
    }

    /**
     * Waiver code to override fare validations
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     * @see #getWaiverCode()
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * An Air marketable travel segment.
     * 
     * Gets the value of the airSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegment property.
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<>();
        }
        return this.airSegment;
    }

    /**
     * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
     * 
     * Gets the value of the feeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFeeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the feeInfo property.
     */
    public List<TypeFeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<>();
        }
        return this.feeInfo;
    }

    /**
     * Itinerary level taxes
     * 
     * Gets the value of the taxInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxInfo property.
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<>();
        }
        return this.taxInfo;
    }

    /**
     * one or more hosts
     * 
     * Gets the value of the hostToken property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostToken property.
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<>();
        }
        return this.hostToken;
    }

    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRNumber() {
        return tcrNumber;
    }

    /**
     * Sets the value of the tcrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTCRNumber()
     */
    public void setTCRNumber(String value) {
        this.tcrNumber = value;
    }

    /**
     * Specifies whether this bundle was auto
     *                         or manually generated
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundType()
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

    /**
     * For some vendors a code/password is required to avail any amount retained during refund.User can define their own password too This attribute will be used to show/accept this code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAccessCode() {
        return refundAccessCode;
    }

    /**
     * Sets the value of the refundAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundAccessCode()
     */
    public void setRefundAccessCode(String value) {
        this.refundAccessCode = value;
    }

}
