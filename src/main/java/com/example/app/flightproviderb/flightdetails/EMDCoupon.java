
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SvcDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RFIC" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="RFISC">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="RFIDescription">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="86"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="PresentTo">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="71"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PresentAt">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="71"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MarketingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EMDCoupon")
public class EMDCoupon {

    /**
     * Number of the EMD coupon
     * 
     */
    @XmlAttribute(name = "Number", required = true)
    protected BigInteger number;
    /**
     * Status of the coupon. Possible values Open, Void, Refunded, Exchanged, Irregular Operations,Airport Control, Checked In, Flown/Used, Boarded/Lifted, Suspended, Unknown
     * 
     */
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    /**
     * Description of the service related to the EMD Coupon
     * 
     */
    @XmlAttribute(name = "SvcDescription")
    protected String svcDescription;
    /**
     * Indicates if the EMD coupon has been considered used as soon as issued.
     * 
     */
    @XmlAttribute(name = "ConsumedAtIssuanceInd")
    protected Boolean consumedAtIssuanceInd;
    /**
     * Reason For Issuance Code for the EMD coupon
     * 
     */
    @XmlAttribute(name = "RFIC", required = true)
    protected String rfic;
    /**
     * Reason For Issueance Sub code for the EMD coupon
     * 
     */
    @XmlAttribute(name = "RFISC")
    protected String rfisc;
    /**
     * Reason for Issueance Description for the EMD coupon
     * 
     */
    @XmlAttribute(name = "RFIDescription")
    protected String rfiDescription;
    /**
     * Departure Airport Code for the flight with which the Coupon is associated
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * Destination Airport Code for the flight with which the Coupon is associated
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * Flight Number of the flight with which the coupon is associated.
     * 
     */
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    /**
     * Service provider to present the coupon to
     * 
     */
    @XmlAttribute(name = "PresentTo")
    protected String presentTo;
    /**
     * Location of service provider where this coupon should be presented at
     * 
     */
    @XmlAttribute(name = "PresentAt")
    protected String presentAt;
    /**
     * Indicates whether the coupon is non-refundable
     * 
     */
    @XmlAttribute(name = "NonRefundableInd")
    protected Boolean nonRefundableInd;
    /**
     * Marketing carrier associated with the coupon
     * 
     */
    @XmlAttribute(name = "MarketingCarrier")
    protected String marketingCarrier;
    /**
     * System generated Key
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     */
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     */
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Number of the EMD coupon
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumber()
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Status of the coupon. Possible values Open, Void, Refunded, Exchanged, Irregular Operations,Airport Control, Checked In, Flown/Used, Boarded/Lifted, Suspended, Unknown
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Description of the service related to the EMD Coupon
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDescription() {
        return svcDescription;
    }

    /**
     * Sets the value of the svcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSvcDescription()
     */
    public void setSvcDescription(String value) {
        this.svcDescription = value;
    }

    /**
     * Indicates if the EMD coupon has been considered used as soon as issued.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsumedAtIssuanceInd() {
        return consumedAtIssuanceInd;
    }

    /**
     * Sets the value of the consumedAtIssuanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isConsumedAtIssuanceInd()
     */
    public void setConsumedAtIssuanceInd(Boolean value) {
        this.consumedAtIssuanceInd = value;
    }

    /**
     * Reason For Issuance Code for the EMD coupon
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIC()
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Reason For Issueance Sub code for the EMD coupon
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFISC()
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Reason for Issueance Description for the EMD coupon
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIDescription() {
        return rfiDescription;
    }

    /**
     * Sets the value of the rfiDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIDescription()
     */
    public void setRFIDescription(String value) {
        this.rfiDescription = value;
    }

    /**
     * Departure Airport Code for the flight with which the Coupon is associated
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Destination Airport Code for the flight with which the Coupon is associated
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Flight Number of the flight with which the coupon is associated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightNumber()
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Service provider to present the coupon to
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentTo() {
        return presentTo;
    }

    /**
     * Sets the value of the presentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPresentTo()
     */
    public void setPresentTo(String value) {
        this.presentTo = value;
    }

    /**
     * Location of service provider where this coupon should be presented at
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentAt() {
        return presentAt;
    }

    /**
     * Sets the value of the presentAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPresentAt()
     */
    public void setPresentAt(String value) {
        this.presentAt = value;
    }

    /**
     * Indicates whether the coupon is non-refundable
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundableInd() {
        return nonRefundableInd;
    }

    /**
     * Sets the value of the nonRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNonRefundableInd()
     */
    public void setNonRefundableInd(Boolean value) {
        this.nonRefundableInd = value;
    }

    /**
     * Marketing carrier associated with the coupon
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMarketingCarrier()
     */
    public void setMarketingCarrier(String value) {
        this.marketingCarrier = value;
    }

    /**
     * System generated Key
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     * @see #getElStat()
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeyOverride()
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
