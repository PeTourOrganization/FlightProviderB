
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
 *         <element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *         <element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SupplierLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "confirmationNumber",
    "commission"
})
@XmlRootElement(name = "PassiveInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PassiveInfo {

    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    @XmlElement(name = "ConfirmationNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> confirmationNumber;
    /**
     * Identifies the agency commission
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Commission commission;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "SupplierLocatorCode")
    protected String supplierLocatorCode;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketNumber property.
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<>();
        }
        return this.ticketNumber;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfirmationNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the confirmationNumber property.
     */
    public List<String> getConfirmationNumber() {
        if (confirmationNumber == null) {
            confirmationNumber = new ArrayList<>();
        }
        return this.confirmationNumber;
    }

    /**
     * Identifies the agency commission
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     * @see #getCommission()
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the supplierLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierLocatorCode() {
        return supplierLocatorCode;
    }

    /**
     * Sets the value of the supplierLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierLocatorCode(String value) {
        this.supplierLocatorCode = value;
    }

}
