
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element name="Discount" maxOccurs="5" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}DiscountCard" maxOccurs="9"/>
 *                 </sequence>
 *                 <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="PassengerTypeCode" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="SupplierPassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "discount"
})
@XmlRootElement(name = "RailFareComponent", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailFareComponent {

    /**
     * Discount information specific to the fare component
     * 
     */
    @XmlElement(name = "Discount", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailFareComponent.Discount> discount;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * FareComponent amount
     * 
     */
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    /**
     * The three character passenger code
     * 
     */
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    /**
     * Supplier passenger type code
     * 
     */
    @XmlAttribute(name = "SupplierPassengerType")
    protected String supplierPassengerType;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;

    /**
     * Discount information specific to the fare component
     * 
     * Gets the value of the discount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareComponent.Discount }
     * </p>
     * 
     * 
     * @return
     *     The value of the discount property.
     */
    public List<RailFareComponent.Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<>();
        }
        return this.discount;
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

    /**
     * FareComponent amount
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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * The three character passenger code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassengerTypeCode()
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Supplier passenger type code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPassengerType() {
        return supplierPassengerType;
    }

    /**
     * Sets the value of the supplierPassengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSupplierPassengerType()
     */
    public void setSupplierPassengerType(String value) {
        this.supplierPassengerType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }


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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}DiscountCard" maxOccurs="9"/>
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
        "discountCard"
    })
    public static class Discount {

        /**
         * Rail Discount Card Information
         * 
         */
        @XmlElement(name = "DiscountCard", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<DiscountCard> discountCard;
        @XmlAttribute(name = "Key")
        protected String key;

        /**
         * Rail Discount Card Information
         * 
         * Gets the value of the discountCard property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discountCard property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDiscountCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiscountCard }
         * </p>
         * 
         * 
         * @return
         *     The value of the discountCard property.
         */
        public List<DiscountCard> getDiscountCard() {
            if (discountCard == null) {
                discountCard = new ArrayList<>();
            }
            return this.discountCard;
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

}
