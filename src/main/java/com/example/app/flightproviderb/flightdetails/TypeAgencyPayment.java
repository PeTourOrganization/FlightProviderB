
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Agency Payment.
 * 
 * <p>Java class for typeAgencyPayment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeAgencyPayment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="AgencyBillingIdentifier" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AgencyBillingNumber">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AgencyBillingPassword">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TypeAgencyPayment {

    /**
     * Value of the billing id
     * 
     */
    @XmlAttribute(name = "AgencyBillingIdentifier", required = true)
    protected String agencyBillingIdentifier;
    /**
     * Value of billing number
     * 
     */
    @XmlAttribute(name = "AgencyBillingNumber")
    protected String agencyBillingNumber;
    /**
     * Value of billing password
     * 
     */
    @XmlAttribute(name = "AgencyBillingPassword")
    protected String agencyBillingPassword;

    /**
     * Value of the billing id
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingIdentifier() {
        return agencyBillingIdentifier;
    }

    /**
     * Sets the value of the agencyBillingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgencyBillingIdentifier()
     */
    public void setAgencyBillingIdentifier(String value) {
        this.agencyBillingIdentifier = value;
    }

    /**
     * Value of billing number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingNumber() {
        return agencyBillingNumber;
    }

    /**
     * Sets the value of the agencyBillingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgencyBillingNumber()
     */
    public void setAgencyBillingNumber(String value) {
        this.agencyBillingNumber = value;
    }

    /**
     * Value of billing password
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingPassword() {
        return agencyBillingPassword;
    }

    /**
     * Sets the value of the agencyBillingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgencyBillingPassword()
     */
    public void setAgencyBillingPassword(String value) {
        this.agencyBillingPassword = value;
    }

}
