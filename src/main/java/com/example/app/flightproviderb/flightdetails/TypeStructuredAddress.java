
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A fully structured address
 * 
 * <p>Java class for typeStructuredAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeStructuredAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddressName" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="128"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Street" maxOccurs="5" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="City" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="2"/>
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}State" minOccurs="0"/>
 *         <element name="PostalCode" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="15"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Country" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationInfoRef" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeStructuredAddress", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "addressName",
    "street",
    "city",
    "state",
    "postalCode",
    "country",
    "providerReservationInfoRef"
})
@XmlSeeAlso({
    com.example.app.flightproviderb.flightdetails.DeliveryInfo.ShippingAddress.class
})
public class TypeStructuredAddress {

    @XmlElement(name = "AddressName")
    protected String addressName;
    /**
     * The Address street and number, e.g. 105 Main St.
     * 
     */
    @XmlElement(name = "Street")
    protected List<String> street;
    /**
     * The city name for the requested address, e.g. Atlanta.
     * 
     */
    @XmlElement(name = "City")
    protected String city;
    /**
     * The State or Province of address requested, e.g. CA, Ontario.
     * 
     */
    @XmlElement(name = "State")
    protected State state;
    /**
     * The 5-15 alphanumeric postal Code for the requested address, e.g. 90210.
     * 
     */
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    /**
     * The Full country name or two letter ISO country code e.g. US, France. A two letter country code is required for a Postal Code Searches.
     * 
     */
    @XmlElement(name = "Country")
    protected String country;
    /**
     * Tagging provider reservation info with Address.
     * 
     */
    @XmlElement(name = "ProviderReservationInfoRef")
    protected List<ProviderReservationInfoRef> providerReservationInfoRef;
    /**
     * Key for update/delete of the element
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     */
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     */
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * The Address street and number, e.g. 105 Main St.
     * 
     * Gets the value of the street property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the street property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStreet().add(newItem);
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
     *     The value of the street property.
     */
    public List<String> getStreet() {
        if (street == null) {
            street = new ArrayList<>();
        }
        return this.street;
    }

    /**
     * The city name for the requested address, e.g. Atlanta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCity()
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * The State or Province of address requested, e.g. CA, Ontario.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     * @see #getState()
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * The 5-15 alphanumeric postal Code for the requested address, e.g. 90210.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPostalCode()
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * The Full country name or two letter ISO country code e.g. US, France. A two letter country code is required for a Postal Code Searches.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountry()
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Tagging provider reservation info with Address.
     * 
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerReservationInfoRef property.
     */
    public List<ProviderReservationInfoRef> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * Key for update/delete of the element
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
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     * @see #getElStat()
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeyOverride()
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
