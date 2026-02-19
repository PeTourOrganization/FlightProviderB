
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="CategoryCode" type="{http://www.travelport.com/schema/air_v54_0}typeFareRuleCategoryCode" maxOccurs="10"/>
 *       </sequence>
 *       <attribute name="FareInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "categoryCode"
})
@XmlRootElement(name = "AirFareRuleCategory")
public class AirFareRuleCategory {

    /**
     * The Category Code for Air Fare Rule.
     * 
     */
    @XmlElement(name = "CategoryCode", required = true)
    @XmlSchemaType(name = "string")
    protected List<TypeFareRuleCategoryCode> categoryCode;
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;

    /**
     * The Category Code for Air Fare Rule.
     * 
     * Gets the value of the categoryCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategoryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFareRuleCategoryCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the categoryCode property.
     */
    public List<TypeFareRuleCategoryCode> getCategoryCode() {
        if (categoryCode == null) {
            categoryCode = new ArrayList<>();
        }
        return this.categoryCode;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

}
