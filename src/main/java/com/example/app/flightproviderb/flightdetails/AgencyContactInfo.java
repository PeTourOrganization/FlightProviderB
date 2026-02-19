
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phoneNumber"
})
@XmlRootElement(name = "AgencyContactInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AgencyContactInfo {

    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<PhoneNumber> phoneNumber;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     * Gets the value of the phoneNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * </p>
     * 
     * 
     * @return
     *     The value of the phoneNumber property.
     */
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

}
