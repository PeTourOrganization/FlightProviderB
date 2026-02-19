
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTransactionsAllowed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTransactionsAllowed">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeBookingTransactionsAllowed">
 *       <attribute name="ShoppingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PricingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTransactionsAllowed", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    com.example.app.flightproviderb.flightdetails.TransactionType.Air.class
})
public class TypeTransactionsAllowed
    extends TypeBookingTransactionsAllowed
{

    /**
     * Allow or prohibit shopping transaction for the given product type on this Provider/Supplier. Inheritable.
     * 
     */
    @XmlAttribute(name = "ShoppingEnabled")
    protected Boolean shoppingEnabled;
    /**
     * Allow or prohibit pricing transaction for the given product type on this Provider/Supplier. Inheritable.
     * 
     */
    @XmlAttribute(name = "PricingEnabled")
    protected Boolean pricingEnabled;

    /**
     * Allow or prohibit shopping transaction for the given product type on this Provider/Supplier. Inheritable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShoppingEnabled() {
        return shoppingEnabled;
    }

    /**
     * Sets the value of the shoppingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShoppingEnabled()
     */
    public void setShoppingEnabled(Boolean value) {
        this.shoppingEnabled = value;
    }

    /**
     * Allow or prohibit pricing transaction for the given product type on this Provider/Supplier. Inheritable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingEnabled() {
        return pricingEnabled;
    }

    /**
     * Sets the value of the pricingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPricingEnabled()
     */
    public void setPricingEnabled(Boolean value) {
        this.pricingEnabled = value;
    }

}
