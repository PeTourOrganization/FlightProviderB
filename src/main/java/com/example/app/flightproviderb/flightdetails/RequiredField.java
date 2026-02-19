
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
 *       <attribute name="Name" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="CardType"/>
 *             <enumeration value="Number"/>
 *             <enumeration value="CustomerReference"/>
 *             <enumeration value="IssueNumber"/>
 *             <enumeration value="StartDate"/>
 *             <enumeration value="NameOnCard"/>
 *             <enumeration value="ExpirationDate"/>
 *             <enumeration value="CVV"/>
 *             <enumeration value="AddressLine1"/>
 *             <enumeration value="AddressLine2"/>
 *             <enumeration value="City"/>
 *             <enumeration value="State"/>
 *             <enumeration value="PostalCode"/>
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
@XmlType(name = "")
@XmlRootElement(name = "RequiredField", namespace = "http://www.travelport.com/schema/common_v54_0")
public class RequiredField {

    /**
     * The name of the required field
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * The name of the required field
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
