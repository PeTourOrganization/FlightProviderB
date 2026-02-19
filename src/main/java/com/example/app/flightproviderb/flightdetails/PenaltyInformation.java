
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareComponent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="PriceableUnit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="BoardPoint" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="OffPoint" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="MinimumChangeFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="MaximumChangeFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="FiledCurrency" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *       <attribute name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ChangeFeeApplicationCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "PenaltyInformation")
public class PenaltyInformation {

    @XmlValue
    protected String value;
    /**
     * Fare-owning carrier
     * 
     */
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    /**
     * Unique identifier that provides the association to the fare amount and fare rules.
     * 
     */
    @XmlAttribute(name = "FareBasis")
    protected String fareBasis;
    /**
     * A portion of a journey or itinerary between two consecutive fare break points.
     * 
     */
    @XmlAttribute(name = "FareComponent")
    protected BigInteger fareComponent;
    /**
     * Identifies FareComponents that are priced together
     * 
     */
    @XmlAttribute(name = "PriceableUnit")
    protected BigInteger priceableUnit;
    /**
     * Origin for the FareComponent
     * 
     */
    @XmlAttribute(name = "BoardPoint")
    protected String boardPoint;
    /**
     * Destination for the FareComponent
     * 
     */
    @XmlAttribute(name = "OffPoint")
    protected String offPoint;
    /**
     * Estimated minimum change fee associated with the fare component.  Can be overridden by ChangeFeeApplicationCodes for other fare components.
     * 
     */
    @XmlAttribute(name = "MinimumChangeFee")
    protected String minimumChangeFee;
    /**
     * Estimated maximum change fee associated with the fare component.  Can be overridden by ChangeFeeApplicationCodes for other fare components.
     * 
     */
    @XmlAttribute(name = "MaximumChangeFee")
    protected String maximumChangeFee;
    /**
     * Currency of the filed change fee
     * 
     */
    @XmlAttribute(name = "FiledCurrency")
    protected String filedCurrency;
    /**
     * Conversion rate from filed change fee currency to reissue location currency
     * 
     */
    @XmlAttribute(name = "ConversionRate")
    protected BigDecimal conversionRate;
    /**
     * Answers whether the FareComponent is refundable
     * 
     */
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    /**
     * Unique code associated with the PenaltyInformation text which defines how fees will be applied/calculated. E.g. J2 translates to "From among all fare components, changed and unchanged...."
     * 
     */
    @XmlAttribute(name = "ChangeFeeApplicationCode")
    protected String changeFeeApplicationCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Fare-owning carrier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Unique identifier that provides the association to the fare amount and fare rules.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasis()
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * A portion of a journey or itinerary between two consecutive fare break points.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFareComponent() {
        return fareComponent;
    }

    /**
     * Sets the value of the fareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getFareComponent()
     */
    public void setFareComponent(BigInteger value) {
        this.fareComponent = value;
    }

    /**
     * Identifies FareComponents that are priced together
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceableUnit() {
        return priceableUnit;
    }

    /**
     * Sets the value of the priceableUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getPriceableUnit()
     */
    public void setPriceableUnit(BigInteger value) {
        this.priceableUnit = value;
    }

    /**
     * Origin for the FareComponent
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBoardPoint()
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Destination for the FareComponent
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOffPoint()
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Estimated minimum change fee associated with the fare component.  Can be overridden by ChangeFeeApplicationCodes for other fare components.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumChangeFee() {
        return minimumChangeFee;
    }

    /**
     * Sets the value of the minimumChangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMinimumChangeFee()
     */
    public void setMinimumChangeFee(String value) {
        this.minimumChangeFee = value;
    }

    /**
     * Estimated maximum change fee associated with the fare component.  Can be overridden by ChangeFeeApplicationCodes for other fare components.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumChangeFee() {
        return maximumChangeFee;
    }

    /**
     * Sets the value of the maximumChangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaximumChangeFee()
     */
    public void setMaximumChangeFee(String value) {
        this.maximumChangeFee = value;
    }

    /**
     * Currency of the filed change fee
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledCurrency() {
        return filedCurrency;
    }

    /**
     * Sets the value of the filedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFiledCurrency()
     */
    public void setFiledCurrency(String value) {
        this.filedCurrency = value;
    }

    /**
     * Conversion rate from filed change fee currency to reissue location currency
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getConversionRate()
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Answers whether the FareComponent is refundable
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRefundable()
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Unique code associated with the PenaltyInformation text which defines how fees will be applied/calculated. E.g. J2 translates to "From among all fare components, changed and unchanged...."
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFeeApplicationCode() {
        return changeFeeApplicationCode;
    }

    /**
     * Sets the value of the changeFeeApplicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChangeFeeApplicationCode()
     */
    public void setChangeFeeApplicationCode(String value) {
        this.changeFeeApplicationCode = value;
    }

}
