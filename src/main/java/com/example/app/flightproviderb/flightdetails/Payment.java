
package com.example.app.flightproviderb.flightdetails;

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
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="AirlineFee"/>
 *             <enumeration value="DeliveryFee"/>
 *             <enumeration value="Itinerary"/>
 *             <enumeration value="Passenger"/>
 *             <enumeration value="ServiceFee"/>
 *             <enumeration value="OptionalService"/>
 *             <enumeration value="TicketFee"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FormOfPaymentRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="AmountType" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to32" />
 *       <attribute name="ApproximateAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Payment {

    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Identifies the type of payment. This can be for an itinerary, a traveler, or a service fee for example.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * The credit card that is will be used to make this payment.
     * 
     */
    @XmlAttribute(name = "FormOfPaymentRef", required = true)
    protected String formOfPaymentRef;
    /**
     * If the type represents a per traveler payment, then this will reference the traveler this payment refers to.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    /**
     * This field displays type of payment amount when it is non-monetary. Presently available/supported value is "Flight Pass Credits".
     * 
     */
    @XmlAttribute(name = "AmountType")
    protected String amountType;
    /**
     * It stores the converted payment amount in agency's default currency
     * 
     */
    @XmlAttribute(name = "ApproximateAmount")
    protected String approximateAmount;
    /**
     * Status to indicate the business association of the payment element.
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;
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
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Identifies the type of payment. This can be for an itinerary, a traveler, or a service fee for example.
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
     * The credit card that is will be used to make this payment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFormOfPaymentRef()
     */
    public void setFormOfPaymentRef(String value) {
        this.formOfPaymentRef = value;
    }

    /**
     * If the type represents a per traveler payment, then this will reference the traveler this payment refers to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * This field displays type of payment amount when it is non-monetary. Presently available/supported value is "Flight Pass Credits".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAmountType()
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * It stores the converted payment amount in agency's default currency
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateAmount() {
        return approximateAmount;
    }

    /**
     * Sets the value of the approximateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateAmount()
     */
    public void setApproximateAmount(String value) {
        this.approximateAmount = value;
    }

    /**
     * Status to indicate the business association of the payment element.
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
