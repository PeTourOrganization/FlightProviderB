
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information pertaining to the payment of a Vehicle Rental.
 * 
 * <p>Java class for typeVoucherInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeVoucherInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="VoucherType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeVoucherType" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Number" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to16" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeVoucherInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TypeVoucherInformation {

    /**
     * Specifies if the Voucher is for Full Credit or a Group/Day or a Monetary Amount or RegularVoucher.
     * 
     */
    @XmlAttribute(name = "VoucherType", required = true)
    protected TypeVoucherType voucherType;
    /**
     * Amount associated with the Voucher.
     * 
     */
    @XmlAttribute(name = "Amount")
    protected String amount;
    /**
     * Confirmation from the vendor for the voucher
     * 
     */
    @XmlAttribute(name = "ConfirmationNumber")
    protected String confirmationNumber;
    /**
     * Associated account name for the voucher
     * 
     */
    @XmlAttribute(name = "AccountName")
    protected String accountName;
    /**
     * To advise car associates of the voucher number and store in the car segment. It is required when VoucherType selected as   "RegularVoucher" for 1P only.
     * 
     */
    @XmlAttribute(name = "Number")
    protected String number;

    /**
     * Specifies if the Voucher is for Full Credit or a Group/Day or a Monetary Amount or RegularVoucher.
     * 
     * @return
     *     possible object is
     *     {@link TypeVoucherType }
     *     
     */
    public TypeVoucherType getVoucherType() {
        return voucherType;
    }

    /**
     * Sets the value of the voucherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVoucherType }
     *     
     * @see #getVoucherType()
     */
    public void setVoucherType(TypeVoucherType value) {
        this.voucherType = value;
    }

    /**
     * Amount associated with the Voucher.
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
     * @see #getAmount()
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Confirmation from the vendor for the voucher
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfirmationNumber()
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Associated account name for the voucher
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountName()
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * To advise car associates of the voucher number and store in the car segment. It is required when VoucherType selected as   "RegularVoucher" for 1P only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
