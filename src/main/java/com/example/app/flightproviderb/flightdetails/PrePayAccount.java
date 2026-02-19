
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CreditSummary" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PrePayPriceInfo" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProgramTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditSummary",
    "prePayPriceInfo"
})
@XmlRootElement(name = "PrePayAccount")
public class PrePayAccount {

    /**
     * Credit summary associated with the account
     * 
     */
    @XmlElement(name = "CreditSummary")
    protected CreditSummary creditSummary;
    /**
     * Pricing detail for the Pre Pay Account
     * 
     */
    @XmlElement(name = "PrePayPriceInfo")
    protected PrePayPriceInfo prePayPriceInfo;
    /**
     * Pre pay program title
     * 
     */
    @XmlAttribute(name = "ProgramTitle")
    protected String programTitle;
    @XmlAttribute(name = "CertificateNumber")
    protected String certificateNumber;
    /**
     * Pre pay program name
     * 
     */
    @XmlAttribute(name = "ProgramName")
    protected String programName;
    /**
     * Effective date for the pre pay account
     * 
     */
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    /**
     * Expiry date for the pre pay account
     * 
     */
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Credit summary associated with the account
     * 
     * @return
     *     possible object is
     *     {@link CreditSummary }
     *     
     */
    public CreditSummary getCreditSummary() {
        return creditSummary;
    }

    /**
     * Sets the value of the creditSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSummary }
     *     
     * @see #getCreditSummary()
     */
    public void setCreditSummary(CreditSummary value) {
        this.creditSummary = value;
    }

    /**
     * Pricing detail for the Pre Pay Account
     * 
     * @return
     *     possible object is
     *     {@link PrePayPriceInfo }
     *     
     */
    public PrePayPriceInfo getPrePayPriceInfo() {
        return prePayPriceInfo;
    }

    /**
     * Sets the value of the prePayPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayPriceInfo }
     *     
     * @see #getPrePayPriceInfo()
     */
    public void setPrePayPriceInfo(PrePayPriceInfo value) {
        this.prePayPriceInfo = value;
    }

    /**
     * Pre pay program title
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramTitle() {
        return programTitle;
    }

    /**
     * Sets the value of the programTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramTitle()
     */
    public void setProgramTitle(String value) {
        this.programTitle = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Pre pay program name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramName()
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Effective date for the pre pay account
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEffectiveDate()
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Expiry date for the pre pay account
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExpireDate()
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

}
