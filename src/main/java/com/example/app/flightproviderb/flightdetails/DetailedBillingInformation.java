
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPaymentRef" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfoRef" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BillingDetailItem" maxOccurs="999"/>
 *       </sequence>
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
    "airPricingInfoRef",
    "billingDetailItem"
})
@XmlRootElement(name = "DetailedBillingInformation")
public class DetailedBillingInformation {

    /**
     * A reference to a Form of Payment in the existing UR
     * 
     */
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPaymentRef formOfPaymentRef;
    /**
     * Returns related air pricing infos.
     * 
     */
    @XmlElement(name = "AirPricingInfoRef", required = true)
    protected List<AirPricingInfoRef> airPricingInfoRef;
    /**
     * The Billing Details Information
     * 
     */
    @XmlElement(name = "BillingDetailItem", required = true)
    protected List<BillingDetailItem> billingDetailItem;

    /**
     * A reference to a Form of Payment in the existing UR
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
     * Returns related air pricing infos.
     * 
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingInfoRef property.
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * The Billing Details Information
     * 
     * Gets the value of the billingDetailItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetailItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBillingDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetailItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the billingDetailItem property.
     */
    public List<BillingDetailItem> getBillingDetailItem() {
        if (billingDetailItem == null) {
            billingDetailItem = new ArrayList<>();
        }
        return this.billingDetailItem;
    }

}
