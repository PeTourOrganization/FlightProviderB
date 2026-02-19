
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


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
 *         <element name="Name">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.travelport.com/schema/common_v54_0>typeNonBlanks">
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}DeliveryInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" maxOccurs="999" minOccurs="0"/>
 *         <element name="SSRRef" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Address" type="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress" minOccurs="0"/>
 *         <element name="BookingTravelerRef" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="GroupSize" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "deliveryInfo",
    "phoneNumber",
    "ssrRef",
    "address",
    "bookingTravelerRef"
})
@XmlRootElement(name = "Group", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Group {

    /**
     * Name of the group in group booking.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected Group.Name name;
    /**
     * Container to encapsulate all delivery related information
     * 
     */
    @XmlElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected DeliveryInfo deliveryInfo;
    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PhoneNumber> phoneNumber;
    /**
     * Reference Element for SSR.
     * 
     */
    @XmlElement(name = "SSRRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Group.SSRRef> ssrRef;
    @XmlElement(name = "Address", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeStructuredAddress address;
    /**
     * Reference Element for Booking Traveler.
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Group.BookingTravelerRef> bookingTravelerRef;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Defines the type of traveler used for booking
     *                     which could be a non-defining type (Companion, Web-fare, etc), or a
     *                     standard type (Adult, Child, etc).
     * 
     */
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    /**
     * Represents size of the group
     * 
     */
    @XmlAttribute(name = "GroupSize", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger groupSize;
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
     * Name of the group in group booking.
     * 
     * @return
     *     possible object is
     *     {@link Group.Name }
     *     
     */
    public Group.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group.Name }
     *     
     * @see #getName()
     */
    public void setName(Group.Name value) {
        this.name = value;
    }

    /**
     * Container to encapsulate all delivery related information
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInfo }
     *     
     */
    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInfo }
     *     
     * @see #getDeliveryInfo()
     */
    public void setDeliveryInfo(DeliveryInfo value) {
        this.deliveryInfo = value;
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

    /**
     * Reference Element for SSR.
     * 
     * Gets the value of the ssrRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSRRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group.SSRRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssrRef property.
     */
    public List<Group.SSRRef> getSSRRef() {
        if (ssrRef == null) {
            ssrRef = new ArrayList<>();
        }
        return this.ssrRef;
    }

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
     * Reference Element for Booking Traveler.
     * 
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group.BookingTravelerRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerRef property.
     */
    public List<Group.BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<>();
        }
        return this.bookingTravelerRef;
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

    /**
     * Defines the type of traveler used for booking
     *                     which could be a non-defining type (Companion, Web-fare, etc), or a
     *                     standard type (Adult, Child, etc).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerType() {
        return travelerType;
    }

    /**
     * Sets the value of the travelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelerType()
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Represents size of the group
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the value of the groupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getGroupSize()
     */
    public void setGroupSize(BigInteger value) {
        this.groupSize = value;
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingTravelerRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.travelport.com/schema/common_v54_0>typeNonBlanks">
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Name {

        /**
         * At least one character data in Next Result Reference
         * 
         */
        @XmlValue
        protected String value;

        /**
         * At least one character data in Next Result Reference
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
         * @see #getValue()
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SSRRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

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

}
