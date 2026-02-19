
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="Address" type="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Email" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "address",
    "email",
    "phoneNumber"
})
@XmlRootElement(name = "AgencyInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AgencyInformation {

    @XmlElement(name = "Address", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeStructuredAddress address;
    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     */
    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Email> email;
    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PhoneNumber> phoneNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public TypeStructuredAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public void setAddress(TypeStructuredAddress value) {
        this.address = value;
    }

    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     * Gets the value of the email property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * </p>
     * 
     * 
     * @return
     *     The value of the email property.
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<>();
        }
        return this.email;
    }

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

}
