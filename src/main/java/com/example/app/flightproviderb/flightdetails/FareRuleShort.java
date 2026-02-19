
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleNameValue" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="TableNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareRuleNameValue"
})
@XmlRootElement(name = "FareRuleShort")
public class FareRuleShort {

    /**
     * Fare Rule Name Value Pair, used in Short Rules
     * 
     */
    @XmlElement(name = "FareRuleNameValue", required = true)
    protected List<FareRuleNameValue> fareRuleNameValue;
    @XmlAttribute(name = "Category", required = true)
    protected BigInteger category;
    @XmlAttribute(name = "TableNumber")
    protected String tableNumber;

    /**
     * Fare Rule Name Value Pair, used in Short Rules
     * 
     * Gets the value of the fareRuleNameValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleNameValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRuleNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleNameValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRuleNameValue property.
     */
    public List<FareRuleNameValue> getFareRuleNameValue() {
        if (fareRuleNameValue == null) {
            fareRuleNameValue = new ArrayList<>();
        }
        return this.fareRuleNameValue;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategory(BigInteger value) {
        this.category = value;
    }

    /**
     * Gets the value of the tableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableNumber() {
        return tableNumber;
    }

    /**
     * Sets the value of the tableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableNumber(String value) {
        this.tableNumber = value;
    }

}
