
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeCreditCardType">
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrAppliedProfilePaymentInfo"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CreditCard", namespace = "http://www.travelport.com/schema/common_v54_0")
public class CreditCard
    extends TypeCreditCardType
{

    /**
     * The unique ID of the profile that contains the payment details to use.
     * 
     */
    @XmlAttribute(name = "ProfileID")
    protected String profileID;
    /**
     * The Key assigned to the payment details value from the specified profile.
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * The unique ID of the profile that contains the payment details to use.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileID()
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * The Key assigned to the payment details value from the specified profile.
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

}
