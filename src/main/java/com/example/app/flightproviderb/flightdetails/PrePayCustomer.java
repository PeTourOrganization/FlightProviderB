
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PersonName" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Email" maxOccurs="999" minOccurs="0"/>
 *         <element name="Address" type="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RelatedTraveler" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/>
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
    "personName",
    "email",
    "address",
    "relatedTraveler",
    "loyaltyCard"
})
@XmlRootElement(name = "PrePayCustomer")
public class PrePayCustomer {

    /**
     * Customer name field
     * 
     */
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    /**
     * Customer email detail
     * 
     */
    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Email> email;
    /**
     * Customer address detail
     * 
     */
    @XmlElement(name = "Address")
    protected List<TypeStructuredAddress> address;
    /**
     * Travelers related to this pre pay id
     * 
     */
    @XmlElement(name = "RelatedTraveler")
    protected List<RelatedTraveler> relatedTraveler;
    /**
     * Customer loyalty card detail
     * 
     */
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<LoyaltyCard> loyaltyCard;

    /**
     * Customer name field
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     * @see #getPersonName()
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Customer email detail
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
     * Customer address detail
     * 
     * Gets the value of the address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeStructuredAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<TypeStructuredAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * Travelers related to this pre pay id
     * 
     * Gets the value of the relatedTraveler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTraveler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelatedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTraveler }
     * </p>
     * 
     * 
     * @return
     *     The value of the relatedTraveler property.
     */
    public List<RelatedTraveler> getRelatedTraveler() {
        if (relatedTraveler == null) {
            relatedTraveler = new ArrayList<>();
        }
        return this.relatedTraveler;
    }

    /**
     * Customer loyalty card detail
     * 
     * Gets the value of the loyaltyCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the loyaltyCard property.
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<>();
        }
        return this.loyaltyCard;
    }

}
