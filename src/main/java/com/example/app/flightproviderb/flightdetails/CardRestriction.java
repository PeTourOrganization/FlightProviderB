
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}RequiredField" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="Code" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCardMerchantType" />
 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requiredField"
})
@XmlRootElement(name = "CardRestriction", namespace = "http://www.travelport.com/schema/common_v54_0")
public class CardRestriction {

    @XmlElement(name = "RequiredField", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<RequiredField> requiredField;
    /**
     *  2 letter Credit/Debit Card merchant type
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    /**
     * Card merchant description
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the requiredField property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredField property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequiredField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredField }
     * </p>
     * 
     * 
     * @return
     *     The value of the requiredField property.
     */
    public List<RequiredField> getRequiredField() {
        if (requiredField == null) {
            requiredField = new ArrayList<>();
        }
        return this.requiredField;
    }

    /**
     *  2 letter Credit/Debit Card merchant type
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
     * Card merchant description
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

}
