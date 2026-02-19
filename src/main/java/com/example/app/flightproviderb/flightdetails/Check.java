
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="MICRNumber">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="29"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Check", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Check {

    /**
     * Magnetic Ink Character Reader Number of check.
     * 
     */
    @XmlAttribute(name = "MICRNumber")
    protected String micrNumber;
    /**
     * The bank routing number of the check.
     * 
     */
    @XmlAttribute(name = "RoutingNumber")
    protected String routingNumber;
    /**
     * The account number of the check
     * 
     */
    @XmlAttribute(name = "AccountNumber")
    protected String accountNumber;
    /**
     * The sequential check number of the check.
     * 
     */
    @XmlAttribute(name = "CheckNumber")
    protected String checkNumber;

    /**
     * Magnetic Ink Character Reader Number of check.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICRNumber() {
        return micrNumber;
    }

    /**
     * Sets the value of the micrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMICRNumber()
     */
    public void setMICRNumber(String value) {
        this.micrNumber = value;
    }

    /**
     * The bank routing number of the check.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRoutingNumber()
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * The account number of the check
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountNumber()
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * The sequential check number of the check.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCheckNumber()
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

}
