
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenFeeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PenFeeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="DepRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DepNonRef" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TkNonRef" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AirVFee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="FailConfirmSpace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ItinChg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ReplaceTk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Applicable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ApplicableTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Amt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenFeeType")
public class PenFeeType {

    /**
     * Deposit required. True if require. False if not required.
     * 
     */
    @XmlAttribute(name = "DepRequired")
    protected Boolean depRequired;
    /**
     * Deposit non-refundable.  True is  non-refundanbe.  False is refundable.
     * 
     */
    @XmlAttribute(name = "DepNonRef")
    protected Boolean depNonRef;
    /**
     * Ticket non-refundable. True if non-refundanbe. False if refundable.
     * 
     */
    @XmlAttribute(name = "TkNonRef")
    protected Boolean tkNonRef;
    /**
     * Carrier fee. True if carrier fee is assessed should passenger for complete all conditions for travel at fare. False if it does not exist.
     * 
     */
    @XmlAttribute(name = "AirVFee")
    protected Boolean airVFee;
    /**
     * Cancellation. True if subject to penalty. False if no penalty.
     * 
     */
    @XmlAttribute(name = "Cancellation")
    protected Boolean cancellation;
    /**
     * Failure to confirm space. True if subject to penalty if seats are not confirmed. False if subject to penalty if seats are confirmed.
     * 
     */
    @XmlAttribute(name = "FailConfirmSpace")
    protected Boolean failConfirmSpace;
    /**
     * Subject to penalty if Itinerary is changed requiring reissue of ticket. True if subject to penalty. False if no penalty if reissue required.
     * 
     */
    @XmlAttribute(name = "ItinChg")
    protected Boolean itinChg;
    /**
     * Replace ticket. True if subject to penalty, if replacement of lost ticket / exchange order. False if no penalty, if replacement of lost ticket or exchange order.
     * 
     */
    @XmlAttribute(name = "ReplaceTk")
    protected Boolean replaceTk;
    /**
     * Applicable. True if amount specified is applicable. Flase if amount specified is not applicable.
     * 
     */
    @XmlAttribute(name = "Applicable")
    protected Boolean applicable;
    /**
     * Applicable to penalty or deposit. True if amount specified applies to penalty. False if amount specified applies to deposit.
     * 
     */
    @XmlAttribute(name = "ApplicableTo")
    protected Boolean applicableTo;
    /**
     * Amount of penalty.  If XXX.XX then it is an amount.  If it is XX then is is a percenatge.  Eg 100.00 or 000100.
     * 
     */
    @XmlAttribute(name = "Amt")
    protected BigDecimal amt;
    /**
     * Type of penalty.  If it is D then dollar.  If it is P then percentage.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Currency code of penalty (e.g. USD).
     * 
     */
    @XmlAttribute(name = "Currency")
    protected String currency;

    /**
     * Deposit required. True if require. False if not required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepRequired() {
        return depRequired;
    }

    /**
     * Sets the value of the depRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDepRequired()
     */
    public void setDepRequired(Boolean value) {
        this.depRequired = value;
    }

    /**
     * Deposit non-refundable.  True is  non-refundanbe.  False is refundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepNonRef() {
        return depNonRef;
    }

    /**
     * Sets the value of the depNonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDepNonRef()
     */
    public void setDepNonRef(Boolean value) {
        this.depNonRef = value;
    }

    /**
     * Ticket non-refundable. True if non-refundanbe. False if refundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTkNonRef() {
        return tkNonRef;
    }

    /**
     * Sets the value of the tkNonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTkNonRef()
     */
    public void setTkNonRef(Boolean value) {
        this.tkNonRef = value;
    }

    /**
     * Carrier fee. True if carrier fee is assessed should passenger for complete all conditions for travel at fare. False if it does not exist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirVFee() {
        return airVFee;
    }

    /**
     * Sets the value of the airVFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAirVFee()
     */
    public void setAirVFee(Boolean value) {
        this.airVFee = value;
    }

    /**
     * Cancellation. True if subject to penalty. False if no penalty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCancellation()
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    /**
     * Failure to confirm space. True if subject to penalty if seats are not confirmed. False if subject to penalty if seats are confirmed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailConfirmSpace() {
        return failConfirmSpace;
    }

    /**
     * Sets the value of the failConfirmSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFailConfirmSpace()
     */
    public void setFailConfirmSpace(Boolean value) {
        this.failConfirmSpace = value;
    }

    /**
     * Subject to penalty if Itinerary is changed requiring reissue of ticket. True if subject to penalty. False if no penalty if reissue required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItinChg() {
        return itinChg;
    }

    /**
     * Sets the value of the itinChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isItinChg()
     */
    public void setItinChg(Boolean value) {
        this.itinChg = value;
    }

    /**
     * Replace ticket. True if subject to penalty, if replacement of lost ticket / exchange order. False if no penalty, if replacement of lost ticket or exchange order.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceTk() {
        return replaceTk;
    }

    /**
     * Sets the value of the replaceTk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReplaceTk()
     */
    public void setReplaceTk(Boolean value) {
        this.replaceTk = value;
    }

    /**
     * Applicable. True if amount specified is applicable. Flase if amount specified is not applicable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isApplicable()
     */
    public void setApplicable(Boolean value) {
        this.applicable = value;
    }

    /**
     * Applicable to penalty or deposit. True if amount specified applies to penalty. False if amount specified applies to deposit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicableTo() {
        return applicableTo;
    }

    /**
     * Sets the value of the applicableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isApplicableTo()
     */
    public void setApplicableTo(Boolean value) {
        this.applicableTo = value;
    }

    /**
     * Amount of penalty.  If XXX.XX then it is an amount.  If it is XX then is is a percenatge.  Eg 100.00 or 000100.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAmt()
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Type of penalty.  If it is D then dollar.  If it is P then percentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Currency code of penalty (e.g. USD).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrency()
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
