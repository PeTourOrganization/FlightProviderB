
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentData" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundleTotal" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundleList" maxOccurs="999" minOccurs="0"/>
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
    "airSegmentData",
    "airExchangeBundleTotal",
    "airExchangeBundleList"
})
@XmlRootElement(name = "AirExchangeMultiQuoteOption")
public class AirExchangeMultiQuoteOption {

    /**
     * The shared object list of AirsegmentData
     * 
     */
    @XmlElement(name = "AirSegmentData")
    protected List<AirSegmentData> airSegmentData;
    /**
     * Total exchange and penalty information for one ticket number
     * 
     */
    @XmlElement(name = "AirExchangeBundleTotal")
    protected AirExchangeBundleTotal airExchangeBundleTotal;
    /**
     * The shared object list of AirsegmentData
     * 
     */
    @XmlElement(name = "AirExchangeBundleList")
    protected List<AirExchangeBundleList> airExchangeBundleList;

    /**
     * The shared object list of AirsegmentData
     * 
     * Gets the value of the airSegmentData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentData }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentData property.
     */
    public List<AirSegmentData> getAirSegmentData() {
        if (airSegmentData == null) {
            airSegmentData = new ArrayList<>();
        }
        return this.airSegmentData;
    }

    /**
     * Total exchange and penalty information for one ticket number
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeBundleTotal }
     *     
     */
    public AirExchangeBundleTotal getAirExchangeBundleTotal() {
        return airExchangeBundleTotal;
    }

    /**
     * Sets the value of the airExchangeBundleTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeBundleTotal }
     *     
     * @see #getAirExchangeBundleTotal()
     */
    public void setAirExchangeBundleTotal(AirExchangeBundleTotal value) {
        this.airExchangeBundleTotal = value;
    }

    /**
     * The shared object list of AirsegmentData
     * 
     * Gets the value of the airExchangeBundleList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airExchangeBundleList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirExchangeBundleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeBundleList }
     * </p>
     * 
     * 
     * @return
     *     The value of the airExchangeBundleList property.
     */
    public List<AirExchangeBundleList> getAirExchangeBundleList() {
        if (airExchangeBundleList == null) {
            airExchangeBundleList = new ArrayList<>();
        }
        return this.airExchangeBundleList;
    }

}
