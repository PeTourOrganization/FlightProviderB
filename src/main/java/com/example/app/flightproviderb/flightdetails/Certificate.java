
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *       <attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="DiscountAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Certificate", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Certificate {

    /**
     * The Certificate number
     * 
     */
    @XmlAttribute(name = "Number", required = true)
    protected String number;
    /**
     * The monetary value of the certificate.
     * 
     */
    @XmlAttribute(name = "Amount")
    protected String amount;
    /**
     * The monetary discount amount of this certificate.
     * 
     */
    @XmlAttribute(name = "DiscountAmount")
    protected String discountAmount;
    /**
     * The percentage discount value of this certificate.
     * 
     */
    @XmlAttribute(name = "DiscountPercentage")
    protected BigInteger discountPercentage;
    /**
     * The date that this certificate becomes valid.
     * 
     */
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidBefore;
    /**
     * The date that this certificate expires.
     * 
     */
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidAfter;

    /**
     * The Certificate number
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

    /**
     * The monetary value of the certificate.
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
     * The monetary discount amount of this certificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDiscountAmount()
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * The percentage discount value of this certificate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getDiscountPercentage()
     */
    public void setDiscountPercentage(BigInteger value) {
        this.discountPercentage = value;
    }

    /**
     * The date that this certificate becomes valid.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidBefore()
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * The date that this certificate expires.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidAfter()
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

}
