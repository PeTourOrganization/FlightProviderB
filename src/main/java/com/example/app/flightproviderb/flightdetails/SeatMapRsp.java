
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CabinClass" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SearchTraveler" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Rows" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PaymentRestriction" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SeatInformation" maxOccurs="999" minOccurs="0"/>
 *         <element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="GroupSeatPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostToken",
    "cabinClass",
    "airSegment",
    "searchTraveler",
    "optionalServices",
    "remark",
    "rows",
    "paymentRestriction",
    "seatInformation",
    "copyright"
})
@XmlRootElement(name = "SeatMapRsp")
public class SeatMapRsp
    extends BaseRsp
{

    /**
     * Provider: ACH,MCH.
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    /**
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     */
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CabinClass cabinClass;
    /**
     * Provider: ACH,MCH.
     * 
     */
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    /**
     * Provider: ACH,MCH.
     * 
     */
    @XmlElement(name = "SearchTraveler")
    protected List<SearchTraveler> searchTraveler;
    /**
     * A wrapper for all the information regarding each of the Optional Services.
     *                                     Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Remark remark;
    /**
     * A wrapper for all the information regarding each of the rows. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Rows")
    protected List<Rows> rows;
    /**
     * Provider: MCH-Information regarding valid payment types, if restrictions apply(supplier specific)
     * 
     */
    @XmlElement(name = "PaymentRestriction", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PaymentRestriction> paymentRestriction;
    /**
     * Additional information about seats. Providers: 1G, 1V, 1P,ACH
     * 
     */
    @XmlElement(name = "SeatInformation")
    protected List<SeatInformation> seatInformation;
    /**
     * Copyright text applicable for some seat content. Providers: 1G, 1V, 1P,ACH
     * 
     */
    @XmlElement(name = "Copyright")
    protected String copyright;
    /**
     * Provider: 1G,1V-Seat price for the all passengers traveling together only when supplier provides group flat fee.
     * 
     */
    @XmlAttribute(name = "GroupSeatPrice")
    protected String groupSeatPrice;

    /**
     * Provider: ACH,MCH.
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
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Provider: ACH,MCH.
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
     * Provider: ACH,MCH.
     * 
     * Gets the value of the searchTraveler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchTraveler property.
     */
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<>();
        }
        return this.searchTraveler;
    }

    /**
     * A wrapper for all the information regarding each of the Optional Services.
     *                                     Provider: 1G,1V,1P,ACH.
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
     * Provider: 1G,1V,1P,ACH,MCH.
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
     * A wrapper for all the information regarding each of the rows. Providers: ACH, 1G, 1V, 1P
     * 
     * Gets the value of the rows property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rows property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rows }
     * </p>
     * 
     * 
     * @return
     *     The value of the rows property.
     */
    public List<Rows> getRows() {
        if (rows == null) {
            rows = new ArrayList<>();
        }
        return this.rows;
    }

    /**
     * Provider: MCH-Information regarding valid payment types, if restrictions apply(supplier specific)
     * 
     * Gets the value of the paymentRestriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRestriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRestriction }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentRestriction property.
     */
    public List<PaymentRestriction> getPaymentRestriction() {
        if (paymentRestriction == null) {
            paymentRestriction = new ArrayList<>();
        }
        return this.paymentRestriction;
    }

    /**
     * Additional information about seats. Providers: 1G, 1V, 1P,ACH
     * 
     * Gets the value of the seatInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the seatInformation property.
     */
    public List<SeatInformation> getSeatInformation() {
        if (seatInformation == null) {
            seatInformation = new ArrayList<>();
        }
        return this.seatInformation;
    }

    /**
     * Copyright text applicable for some seat content. Providers: 1G, 1V, 1P,ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCopyright()
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Provider: 1G,1V-Seat price for the all passengers traveling together only when supplier provides group flat fee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSeatPrice() {
        return groupSeatPrice;
    }

    /**
     * Sets the value of the groupSeatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGroupSeatPrice()
     */
    public void setGroupSeatPrice(String value) {
        this.groupSeatPrice = value;
    }

}
