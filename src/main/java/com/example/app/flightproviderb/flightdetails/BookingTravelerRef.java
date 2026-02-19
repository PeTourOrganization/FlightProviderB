
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyCardRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}DriversLicenseRef" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}DiscountCardRef" maxOccurs="9" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PaymentRef" maxOccurs="3" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCardRef",
    "driversLicenseRef",
    "discountCardRef",
    "paymentRef"
})
@XmlRootElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
public class BookingTravelerRef {

    @XmlElement(name = "LoyaltyCardRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<LoyaltyCardRef> loyaltyCardRef;
    @XmlElement(name = "DriversLicenseRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected DriversLicenseRef driversLicenseRef;
    @XmlElement(name = "DiscountCardRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<DiscountCardRef> discountCardRef;
    @XmlElement(name = "PaymentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PaymentRef> paymentRef;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the loyaltyCardRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCardRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLoyaltyCardRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCardRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the loyaltyCardRef property.
     */
    public List<LoyaltyCardRef> getLoyaltyCardRef() {
        if (loyaltyCardRef == null) {
            loyaltyCardRef = new ArrayList<>();
        }
        return this.loyaltyCardRef;
    }

    /**
     * Gets the value of the driversLicenseRef property.
     * 
     * @return
     *     possible object is
     *     {@link DriversLicenseRef }
     *     
     */
    public DriversLicenseRef getDriversLicenseRef() {
        return driversLicenseRef;
    }

    /**
     * Sets the value of the driversLicenseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversLicenseRef }
     *     
     */
    public void setDriversLicenseRef(DriversLicenseRef value) {
        this.driversLicenseRef = value;
    }

    /**
     * Gets the value of the discountCardRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCardRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiscountCardRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCardRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the discountCardRef property.
     */
    public List<DiscountCardRef> getDiscountCardRef() {
        if (discountCardRef == null) {
            discountCardRef = new ArrayList<>();
        }
        return this.discountCardRef;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentRef property.
     */
    public List<PaymentRef> getPaymentRef() {
        if (paymentRef == null) {
            paymentRef = new ArrayList<>();
        }
        return this.paymentRef;
    }

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

}
