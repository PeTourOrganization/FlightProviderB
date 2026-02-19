
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LoyaltyCardDetails" maxOccurs="9" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Code" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCardDetails"
})
@XmlRootElement(name = "PassengerDetails")
public class PassengerDetails {

    /**
     * Passenger Loyalty card details
     * 
     */
    @XmlElement(name = "LoyaltyCardDetails")
    protected List<LoyaltyCardDetails> loyaltyCardDetails;
    /**
     * Passenger key
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * Passenger code
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    /**
     * Passenger age
     * 
     */
    @XmlAttribute(name = "Age")
    protected BigInteger age;

    /**
     * Passenger Loyalty card details
     * 
     * Gets the value of the loyaltyCardDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCardDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLoyaltyCardDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCardDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the loyaltyCardDetails property.
     */
    public List<LoyaltyCardDetails> getLoyaltyCardDetails() {
        if (loyaltyCardDetails == null) {
            loyaltyCardDetails = new ArrayList<>();
        }
        return this.loyaltyCardDetails;
    }

    /**
     * Passenger key
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
     * Passenger code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Passenger age
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
     * @see #getAge()
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}
