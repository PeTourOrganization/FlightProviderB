
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AirExchangeInfo"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Penalty" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TCRNumber" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTCRNumber" />
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
    "airPricingInfoRef",
    "feeInfo",
    "taxInfo",
    "penalty"
})
@XmlRootElement(name = "TCRExchangeBundle")
public class TCRExchangeBundle {

    /**
     * Provides results of a exchange quote
     * 
     */
    @XmlElement(name = "AirExchangeInfo", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected AirExchangeInfo airExchangeInfo;
    /**
     * Reference to a AirPricing from a shared
     *                 list
     * 
     */
    @XmlElement(name = "AirPricingInfoRef", required = true)
    protected List<AirPricingInfoRef> airPricingInfoRef;
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
     * Only used within an AirExchangeQuoteRsp
     * 
     */
    @XmlElement(name = "Penalty", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Penalty> penalty;
    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     */
    @XmlAttribute(name = "TCRNumber", required = true)
    protected String tcrNumber;

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
     * Reference to a AirPricing from a shared
     *                 list
     * 
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingInfoRef property.
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<>();
        }
        return this.airPricingInfoRef;
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

}
