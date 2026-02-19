
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerName" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}NameRemark" minOccurs="0"/>
 *         <element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <choice>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}TravelInfo" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}Email" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" minOccurs="0"/>
 *           <element name="Address" type="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress" minOccurs="0"/>
 *           <element name="EmergencyInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}DeliveryInfo" minOccurs="0"/>
 *           <element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}CustomizedNameData" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}AppliedProfile" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="Gender" type="{http://www.travelport.com/schema/common_v54_0}typeGender" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerName",
    "nameRemark",
    "dob",
    "travelInfo",
    "email",
    "phoneNumber",
    "address",
    "emergencyInfo",
    "deliveryInfo",
    "age",
    "customizedNameData",
    "appliedProfile"
})
@XmlRootElement(name = "BookingTravelerInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class BookingTravelerInfo {

    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "BookingTravelerName", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected BookingTravelerName bookingTravelerName;
    /**
     * Text that support Name Remarks.
     * 
     */
    @XmlElement(name = "NameRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected NameRemark nameRemark;
    /**
     * Traveler Date of Birth
     * 
     */
    @XmlElement(name = "DOB", namespace = "http://www.travelport.com/schema/common_v54_0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    /**
     * Traveler information details like Travel Purpose and Trip Name
     * 
     */
    @XmlElement(name = "TravelInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TravelInfo travelInfo;
    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     */
    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Email email;
    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PhoneNumber phoneNumber;
    @XmlElement(name = "Address", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeStructuredAddress address;
    @XmlElement(name = "EmergencyInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String emergencyInfo;
    /**
     * Container to encapsulate all delivery related information
     * 
     */
    @XmlElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected DeliveryInfo deliveryInfo;
    @XmlElement(name = "Age", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected BigInteger age;
    /**
     * Customized Name Data is used to print customized name on the different documents.
     * 
     */
    @XmlElement(name = "CustomizedNameData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CustomizedNameData customizedNameData;
    /**
     * A simple container to specify the profiles that were applied to a reservation.
     * 
     */
    @XmlElement(name = "AppliedProfile", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AppliedProfile appliedProfile;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    @XmlAttribute(name = "Gender")
    protected String gender;

    /**
     * Complete name fields
     * 
     * @return
     *     possible object is
     *     {@link BookingTravelerName }
     *     
     */
    public BookingTravelerName getBookingTravelerName() {
        return bookingTravelerName;
    }

    /**
     * Sets the value of the bookingTravelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTravelerName }
     *     
     * @see #getBookingTravelerName()
     */
    public void setBookingTravelerName(BookingTravelerName value) {
        this.bookingTravelerName = value;
    }

    /**
     * Text that support Name Remarks.
     * 
     * @return
     *     possible object is
     *     {@link NameRemark }
     *     
     */
    public NameRemark getNameRemark() {
        return nameRemark;
    }

    /**
     * Sets the value of the nameRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameRemark }
     *     
     * @see #getNameRemark()
     */
    public void setNameRemark(NameRemark value) {
        this.nameRemark = value;
    }

    /**
     * Traveler Date of Birth
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDOB()
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Traveler information details like Travel Purpose and Trip Name
     * 
     * @return
     *     possible object is
     *     {@link TravelInfo }
     *     
     */
    public TravelInfo getTravelInfo() {
        return travelInfo;
    }

    /**
     * Sets the value of the travelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelInfo }
     *     
     * @see #getTravelInfo()
     */
    public void setTravelInfo(TravelInfo value) {
        this.travelInfo = value;
    }

    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     * @see #getEmail()
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     * @see #getPhoneNumber()
     */
    public void setPhoneNumber(PhoneNumber value) {
        this.phoneNumber = value;
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
     * Gets the value of the emergencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyInfo() {
        return emergencyInfo;
    }

    /**
     * Sets the value of the emergencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyInfo(String value) {
        this.emergencyInfo = value;
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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Customized Name Data is used to print customized name on the different documents.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedNameData }
     *     
     */
    public CustomizedNameData getCustomizedNameData() {
        return customizedNameData;
    }

    /**
     * Sets the value of the customizedNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedNameData }
     *     
     * @see #getCustomizedNameData()
     */
    public void setCustomizedNameData(CustomizedNameData value) {
        this.customizedNameData = value;
    }

    /**
     * A simple container to specify the profiles that were applied to a reservation.
     * 
     * @return
     *     possible object is
     *     {@link AppliedProfile }
     *     
     */
    public AppliedProfile getAppliedProfile() {
        return appliedProfile;
    }

    /**
     * Sets the value of the appliedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedProfile }
     *     
     * @see #getAppliedProfile()
     */
    public void setAppliedProfile(AppliedProfile value) {
        this.appliedProfile = value;
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
     * Gets the value of the travelerType property.
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
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
