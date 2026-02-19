
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typePaymentCard">
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrAppliedProfilePaymentInfo"/>
 *       <attribute name="IssueNumber">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="8"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DebitCard", namespace = "http://www.travelport.com/schema/common_v54_0")
public class DebitCard
    extends TypePaymentCard
{

    /**
     * Verification number for Debit Cards
     * 
     */
    @XmlAttribute(name = "IssueNumber")
    protected String issueNumber;
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
     * Verification number for Debit Cards
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssueNumber()
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

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
