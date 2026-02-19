
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CardRestriction" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AddressRestriction"/>
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
    "cardRestriction",
    "addressRestriction"
})
@XmlRootElement(name = "PaymentRestriction", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PaymentRestriction {

    @XmlElement(name = "CardRestriction", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<CardRestriction> cardRestriction;
    @XmlElement(name = "AddressRestriction", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected AddressRestriction addressRestriction;

    /**
     * Gets the value of the cardRestriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRestriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCardRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardRestriction }
     * </p>
     * 
     * 
     * @return
     *     The value of the cardRestriction property.
     */
    public List<CardRestriction> getCardRestriction() {
        if (cardRestriction == null) {
            cardRestriction = new ArrayList<>();
        }
        return this.cardRestriction;
    }

    /**
     * Gets the value of the addressRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRestriction }
     *     
     */
    public AddressRestriction getAddressRestriction() {
        return addressRestriction;
    }

    /**
     * Sets the value of the addressRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRestriction }
     *     
     */
    public void setAddressRestriction(AddressRestriction value) {
        this.addressRestriction = value;
    }

}
