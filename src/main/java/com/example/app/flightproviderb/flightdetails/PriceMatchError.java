
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
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
 *         <element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *       <attribute name="VendorCode" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="HotelChain" type="{http://www.travelport.com/schema/common_v54_0}typeHotelChainCode" />
 *       <attribute name="HotelCode" type="{http://www.travelport.com/schema/common_v54_0}typeHotelCode" />
 *       <attribute name="ReqBase" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="RspBase" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="BaseDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="ReqTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="RspTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="TotalDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMessage"
})
@XmlRootElement(name = "PriceMatchError", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PriceMatchError {

    @XmlElement(name = "ErrorMessage", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected String errorMessage;
    /**
     * The code of the vendor (e.g.  HZ, etc.)
     * 
     */
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    /**
     *  2 Letter Hotel Chain Code
     * 
     */
    @XmlAttribute(name = "HotelChain")
    protected String hotelChain;
    /**
     * Unique hotel identifier for the channel.
     * 
     */
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    /**
     * BaseRate in the request.
     * 
     */
    @XmlAttribute(name = "ReqBase")
    protected BigDecimal reqBase;
    /**
     * BaseRate retruned from the supplier.
     * 
     */
    @XmlAttribute(name = "RspBase")
    protected BigDecimal rspBase;
    /**
     * BaseRate Difference.
     * 
     */
    @XmlAttribute(name = "BaseDiff")
    protected BigDecimal baseDiff;
    /**
     * Estimated Total Amount in the request.
     * 
     */
    @XmlAttribute(name = "ReqTotal")
    protected BigDecimal reqTotal;
    /**
     * Estimated Total Amount returned from the supplier.
     * 
     */
    @XmlAttribute(name = "RspTotal")
    protected BigDecimal rspTotal;
    /**
     * Estimated Total Amount difference.
     * 
     */
    @XmlAttribute(name = "TotalDiff")
    protected BigDecimal totalDiff;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * The code of the vendor (e.g.  HZ, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVendorCode()
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     *  2 Letter Hotel Chain Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelChain() {
        return hotelChain;
    }

    /**
     * Sets the value of the hotelChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHotelChain()
     */
    public void setHotelChain(String value) {
        this.hotelChain = value;
    }

    /**
     * Unique hotel identifier for the channel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHotelCode()
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * BaseRate in the request.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqBase() {
        return reqBase;
    }

    /**
     * Sets the value of the reqBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getReqBase()
     */
    public void setReqBase(BigDecimal value) {
        this.reqBase = value;
    }

    /**
     * BaseRate retruned from the supplier.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRspBase() {
        return rspBase;
    }

    /**
     * Sets the value of the rspBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRspBase()
     */
    public void setRspBase(BigDecimal value) {
        this.rspBase = value;
    }

    /**
     * BaseRate Difference.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseDiff() {
        return baseDiff;
    }

    /**
     * Sets the value of the baseDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBaseDiff()
     */
    public void setBaseDiff(BigDecimal value) {
        this.baseDiff = value;
    }

    /**
     * Estimated Total Amount in the request.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqTotal() {
        return reqTotal;
    }

    /**
     * Sets the value of the reqTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getReqTotal()
     */
    public void setReqTotal(BigDecimal value) {
        this.reqTotal = value;
    }

    /**
     * Estimated Total Amount returned from the supplier.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRspTotal() {
        return rspTotal;
    }

    /**
     * Sets the value of the rspTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRspTotal()
     */
    public void setRspTotal(BigDecimal value) {
        this.rspTotal = value;
    }

    /**
     * Estimated Total Amount difference.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiff() {
        return totalDiff;
    }

    /**
     * Sets the value of the totalDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalDiff()
     */
    public void setTotalDiff(BigDecimal value) {
        this.totalDiff = value;
    }

}
