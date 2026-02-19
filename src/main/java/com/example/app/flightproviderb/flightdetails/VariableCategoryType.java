
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableCategoryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VariableCategoryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CategoryDetails" type="{http://www.travelport.com/schema/air_v54_0}ValueDetails" maxOccurs="99" minOccurs="0"/>
 *         <element name="VariableCategoryDetail" type="{http://www.travelport.com/schema/air_v54_0}CategoryDetailsType" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableCategoryType", propOrder = {
    "categoryDetails",
    "variableCategoryDetail"
})
public class VariableCategoryType {

    /**
     * To indicate details of which category is displayed
     * 
     */
    @XmlElement(name = "CategoryDetails")
    protected List<ValueDetails> categoryDetails;
    /**
     * If the specified category of Structured Fare
     * 						Rules is of variable lenght
     * 
     */
    @XmlElement(name = "VariableCategoryDetail")
    protected List<CategoryDetailsType> variableCategoryDetail;
    @XmlAttribute(name = "Value", required = true)
    protected String value;

    /**
     * To indicate details of which category is displayed
     * 
     * Gets the value of the categoryDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategoryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the categoryDetails property.
     */
    public List<ValueDetails> getCategoryDetails() {
        if (categoryDetails == null) {
            categoryDetails = new ArrayList<>();
        }
        return this.categoryDetails;
    }

    /**
     * If the specified category of Structured Fare
     * 						Rules is of variable lenght
     * 
     * Gets the value of the variableCategoryDetail property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableCategoryDetail property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVariableCategoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryDetailsType }
     * </p>
     * 
     * 
     * @return
     *     The value of the variableCategoryDetail property.
     */
    public List<CategoryDetailsType> getVariableCategoryDetail() {
        if (variableCategoryDetail == null) {
            variableCategoryDetail = new ArrayList<>();
        }
        return this.variableCategoryDetail;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
