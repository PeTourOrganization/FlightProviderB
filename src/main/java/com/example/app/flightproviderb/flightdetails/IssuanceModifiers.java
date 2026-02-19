
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
 *       <sequence>
 *         <choice minOccurs="0">
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPaymentRef" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" minOccurs="0"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CustomerReceiptInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDEndorsement" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDCommission" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPaymentRef",
    "formOfPayment",
    "customerReceiptInfo",
    "emdEndorsement",
    "emdCommission"
})
@XmlRootElement(name = "IssuanceModifiers")
public class IssuanceModifiers {

    /**
     * Reference to FormOfPayment present in the UR to be used for EMD issuance.
     * 
     */
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPaymentRef formOfPaymentRef;
    /**
     * FormOfPayment information to be used for EMD issuance.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPayment formOfPayment;
    /**
     * Information about customer receipt via email.
     * 
     */
    @XmlElement(name = "CustomerReceiptInfo")
    protected CustomerReceiptInfo customerReceiptInfo;
    /**
     * Endorsement details to be used during EMD issuance.
     * 
     */
    @XmlElement(name = "EMDEndorsement")
    protected String emdEndorsement;
    /**
     * Commission information to be used for EMD issuance.
     * 
     */
    @XmlElement(name = "EMDCommission")
    protected EMDCommission emdCommission;
    /**
     * Plating carrier code for which this EMD is issued.
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;

    /**
     * Reference to FormOfPayment present in the UR to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentRef }
     *     
     */
    public FormOfPaymentRef getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentRef }
     *     
     * @see #getFormOfPaymentRef()
     */
    public void setFormOfPaymentRef(FormOfPaymentRef value) {
        this.formOfPaymentRef = value;
    }

    /**
     * FormOfPayment information to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     * @see #getFormOfPayment()
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Information about customer receipt via email.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReceiptInfo }
     *     
     */
    public CustomerReceiptInfo getCustomerReceiptInfo() {
        return customerReceiptInfo;
    }

    /**
     * Sets the value of the customerReceiptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReceiptInfo }
     *     
     * @see #getCustomerReceiptInfo()
     */
    public void setCustomerReceiptInfo(CustomerReceiptInfo value) {
        this.customerReceiptInfo = value;
    }

    /**
     * Endorsement details to be used during EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDEndorsement() {
        return emdEndorsement;
    }

    /**
     * Sets the value of the emdEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEMDEndorsement()
     */
    public void setEMDEndorsement(String value) {
        this.emdEndorsement = value;
    }

    /**
     * Commission information to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link EMDCommission }
     *     
     */
    public EMDCommission getEMDCommission() {
        return emdCommission;
    }

    /**
     * Sets the value of the emdCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDCommission }
     *     
     * @see #getEMDCommission()
     */
    public void setEMDCommission(EMDCommission value) {
        this.emdCommission = value;
    }

    /**
     * Plating carrier code for which this EMD is issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

}
