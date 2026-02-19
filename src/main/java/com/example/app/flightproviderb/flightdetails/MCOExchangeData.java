
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="TktNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ThruTktInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EndExchangeTktNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NumCoupons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TktOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TktTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TktThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TktFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrigTktNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrigCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrigTktDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IATACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tktNum",
    "thruTktInd",
    "endExchangeTktNum",
    "numCoupons",
    "tktOne",
    "tktTwo",
    "tktThree",
    "tktFour",
    "fop",
    "origTktNum",
    "origCity",
    "origTktDt",
    "iataCode"
})
@XmlRootElement(name = "MCOExchangeData", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCOExchangeData {

    @XmlElement(name = "TktNum", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String tktNum;
    @XmlElement(name = "ThruTktInd", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String thruTktInd;
    @XmlElement(name = "EndExchangeTktNum", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String endExchangeTktNum;
    @XmlElement(name = "NumCoupons", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String numCoupons;
    @XmlElement(name = "TktOne", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String tktOne;
    @XmlElement(name = "TktTwo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String tktTwo;
    @XmlElement(name = "TktThree", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String tktThree;
    @XmlElement(name = "TktFour", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String tktFour;
    @XmlElement(name = "FOP", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String fop;
    @XmlElement(name = "OrigTktNum", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String origTktNum;
    @XmlElement(name = "OrigCity", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String origCity;
    @XmlElement(name = "OrigTktDt", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String origTktDt;
    @XmlElement(name = "IATACode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String iataCode;

    /**
     * Gets the value of the tktNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktNum() {
        return tktNum;
    }

    /**
     * Sets the value of the tktNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktNum(String value) {
        this.tktNum = value;
    }

    /**
     * Gets the value of the thruTktInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThruTktInd() {
        return thruTktInd;
    }

    /**
     * Sets the value of the thruTktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThruTktInd(String value) {
        this.thruTktInd = value;
    }

    /**
     * Gets the value of the endExchangeTktNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndExchangeTktNum() {
        return endExchangeTktNum;
    }

    /**
     * Sets the value of the endExchangeTktNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndExchangeTktNum(String value) {
        this.endExchangeTktNum = value;
    }

    /**
     * Gets the value of the numCoupons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCoupons() {
        return numCoupons;
    }

    /**
     * Sets the value of the numCoupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCoupons(String value) {
        this.numCoupons = value;
    }

    /**
     * Gets the value of the tktOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktOne() {
        return tktOne;
    }

    /**
     * Sets the value of the tktOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktOne(String value) {
        this.tktOne = value;
    }

    /**
     * Gets the value of the tktTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktTwo() {
        return tktTwo;
    }

    /**
     * Sets the value of the tktTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktTwo(String value) {
        this.tktTwo = value;
    }

    /**
     * Gets the value of the tktThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktThree() {
        return tktThree;
    }

    /**
     * Sets the value of the tktThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktThree(String value) {
        this.tktThree = value;
    }

    /**
     * Gets the value of the tktFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktFour() {
        return tktFour;
    }

    /**
     * Sets the value of the tktFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktFour(String value) {
        this.tktFour = value;
    }

    /**
     * Gets the value of the fop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOP() {
        return fop;
    }

    /**
     * Sets the value of the fop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOP(String value) {
        this.fop = value;
    }

    /**
     * Gets the value of the origTktNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTktNum() {
        return origTktNum;
    }

    /**
     * Sets the value of the origTktNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTktNum(String value) {
        this.origTktNum = value;
    }

    /**
     * Gets the value of the origCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCity() {
        return origCity;
    }

    /**
     * Sets the value of the origCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCity(String value) {
        this.origCity = value;
    }

    /**
     * Gets the value of the origTktDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTktDt() {
        return origTktDt;
    }

    /**
     * Sets the value of the origTktDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTktDt(String value) {
        this.origTktDt = value;
    }

    /**
     * Gets the value of the iataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATACode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATACode(String value) {
        this.iataCode = value;
    }

}
