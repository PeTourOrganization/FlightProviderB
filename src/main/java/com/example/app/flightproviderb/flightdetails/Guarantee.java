
package com.example.app.flightproviderb.flightdetails;

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
 *       <choice>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CreditCard" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}OtherGuaranteeInfo" minOccurs="0"/>
 *       </choice>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ReuseFOP" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ExternalReference" type="{http://www.travelport.com/schema/common_v54_0}typeExternalReference" />
 *       <attribute name="Reusable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="HotelRateDetailRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "otherGuaranteeInfo"
})
@XmlRootElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Guarantee {

    /**
     * Container for all credit card information.
     * 
     */
    @XmlElement(name = "CreditCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CreditCard creditCard;
    @XmlElement(name = "OtherGuaranteeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected OtherGuaranteeInfo otherGuaranteeInfo;
    /**
     * Guarantee, Deposit for 1G/1V/1P and PrePayment for 1P only
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Key for update/delete of the element
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Key of the FOP Key to be reused as this Form of Payment.Only Credit and Debit Card will be supported for FOP Reuse.
     * 
     */
    @XmlAttribute(name = "ReuseFOP")
    protected String reuseFOP;
    @XmlAttribute(name = "ExternalReference")
    protected String externalReference;
    /**
     * Indicates whether the form of payment can be reused or not. Currently applicable for Credit and Debit form of payment
     * 
     */
    @XmlAttribute(name = "Reusable")
    protected Boolean reusable;
    /**
     * Reference for the Hotel Rate Detail. Used for Hotel Booking only. The value is arbitrary.
     * 
     */
    @XmlAttribute(name = "HotelRateDetailRef")
    protected String hotelRateDetailRef;
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
     * Container for all credit card information.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     * @see #getCreditCard()
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the otherGuaranteeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherGuaranteeInfo }
     *     
     */
    public OtherGuaranteeInfo getOtherGuaranteeInfo() {
        return otherGuaranteeInfo;
    }

    /**
     * Sets the value of the otherGuaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherGuaranteeInfo }
     *     
     */
    public void setOtherGuaranteeInfo(OtherGuaranteeInfo value) {
        this.otherGuaranteeInfo = value;
    }

    /**
     * Guarantee, Deposit for 1G/1V/1P and PrePayment for 1P only
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
     * Key for update/delete of the element
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
     * Key of the FOP Key to be reused as this Form of Payment.Only Credit and Debit Card will be supported for FOP Reuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseFOP() {
        return reuseFOP;
    }

    /**
     * Sets the value of the reuseFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReuseFOP()
     */
    public void setReuseFOP(String value) {
        this.reuseFOP = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Indicates whether the form of payment can be reused or not. Currently applicable for Credit and Debit form of payment
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReusable() {
        if (reusable == null) {
            return false;
        } else {
            return reusable;
        }
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReusable()
     */
    public void setReusable(Boolean value) {
        this.reusable = value;
    }

    /**
     * Reference for the Hotel Rate Detail. Used for Hotel Booking only. The value is arbitrary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelRateDetailRef() {
        return hotelRateDetailRef;
    }

    /**
     * Sets the value of the hotelRateDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHotelRateDetailRef()
     */
    public void setHotelRateDetailRef(String value) {
        this.hotelRateDetailRef = value;
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
