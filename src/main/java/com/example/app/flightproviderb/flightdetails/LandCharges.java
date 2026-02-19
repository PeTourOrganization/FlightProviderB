
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Tax" maxOccurs="3" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Base" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Total" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Miscellaneous" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="PrePaid" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Deposit" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tax"
})
@XmlRootElement(name = "LandCharges")
public class LandCharges {

    /**
     * Taxes for Land Charges
     * 
     */
    @XmlElement(name = "Tax")
    protected List<Tax> tax;
    @XmlAttribute(name = "Base")
    protected String base;
    @XmlAttribute(name = "Total")
    protected String total;
    @XmlAttribute(name = "Miscellaneous")
    protected String miscellaneous;
    @XmlAttribute(name = "PrePaid")
    protected String prePaid;
    @XmlAttribute(name = "Deposit")
    protected String deposit;

    /**
     * Taxes for Land Charges
     * 
     * Gets the value of the tax property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * </p>
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneous(String value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the prePaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePaid() {
        return prePaid;
    }

    /**
     * Sets the value of the prePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePaid(String value) {
        this.prePaid = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposit(String value) {
        this.deposit = value;
    }

}
