
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentList" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BrandList" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeMulitQuoteList" maxOccurs="999" minOccurs="0"/>
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
    "airSegmentList",
    "brandList",
    "airExchangeMulitQuoteList"
})
@XmlRootElement(name = "AirExchangeMultiQuoteRsp")
public class AirExchangeMultiQuoteRsp
    extends BaseRsp
{

    /**
     * The shared object list of AirSegments
     * 
     */
    @XmlElement(name = "AirSegmentList")
    protected List<AirSegmentList> airSegmentList;
    @XmlElement(name = "BrandList")
    protected List<BrandList> brandList;
    /**
     * The shared object list of AirExchangeMultiQuotes
     * 
     */
    @XmlElement(name = "AirExchangeMulitQuoteList")
    protected List<AirExchangeMulitQuoteList> airExchangeMulitQuoteList;

    /**
     * The shared object list of AirSegments
     * 
     * Gets the value of the airSegmentList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentList }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentList property.
     */
    public List<AirSegmentList> getAirSegmentList() {
        if (airSegmentList == null) {
            airSegmentList = new ArrayList<>();
        }
        return this.airSegmentList;
    }

    /**
     * Gets the value of the brandList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBrandList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandList }
     * </p>
     * 
     * 
     * @return
     *     The value of the brandList property.
     */
    public List<BrandList> getBrandList() {
        if (brandList == null) {
            brandList = new ArrayList<>();
        }
        return this.brandList;
    }

    /**
     * The shared object list of AirExchangeMultiQuotes
     * 
     * Gets the value of the airExchangeMulitQuoteList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airExchangeMulitQuoteList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirExchangeMulitQuoteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeMulitQuoteList }
     * </p>
     * 
     * 
     * @return
     *     The value of the airExchangeMulitQuoteList property.
     */
    public List<AirExchangeMulitQuoteList> getAirExchangeMulitQuoteList() {
        if (airExchangeMulitQuoteList == null) {
            airExchangeMulitQuoteList = new ArrayList<>();
        }
        return this.airExchangeMulitQuoteList;
    }

}
