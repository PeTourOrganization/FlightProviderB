
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         <group ref="{http://www.travelport.com/schema/common_v54_0}BaseBookingTravelerInfoA"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SSR" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}NameRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AirSeatAssignment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}RailSeatAssignment" maxOccurs="999" minOccurs="0"/>
 *         <group ref="{http://www.travelport.com/schema/common_v54_0}BaseBookingTravelerInfoB"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrBookingTravelerGrp"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "deliveryInfo",
    "phoneNumber",
    "email",
    "loyaltyCard",
    "discountCard",
    "ssr",
    "nameRemark",
    "airSeatAssignment",
    "railSeatAssignment",
    "emergencyInfo",
    "address",
    "driversLicense",
    "appliedProfile",
    "customizedNameData",
    "travelComplianceData",
    "travelInfo"
})
@XmlRootElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v54_0")
public class BookingTraveler {

    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "BookingTravelerName", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected BookingTravelerName bookingTravelerName;
    /**
     * Container to encapsulate all delivery related information
     * 
     */
    @XmlElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<DeliveryInfo> deliveryInfo;
    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PhoneNumber> phoneNumber;
    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     */
    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Email> email;
    /**
     * Provider loyalty card information
     * 
     */
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<LoyaltyCard> loyaltyCard;
    /**
     * Rail Discount Card Information
     * 
     */
    @XmlElement(name = "DiscountCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<DiscountCard> discountCard;
    /**
     * Special serivces like wheel chair, or pet carrier.
     * 
     */
    @XmlElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SSR> ssr;
    /**
     * Text that support Name Remarks.
     * 
     */
    @XmlElement(name = "NameRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<NameRemark> nameRemark;
    /**
     * Identifies the seat assignment for a passenger.
     * 
     */
    @XmlElement(name = "AirSeatAssignment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AirSeatAssignment> airSeatAssignment;
    /**
     * Identifies the seat assignment for a passenger on RailSegment.
     * 
     */
    @XmlElement(name = "RailSeatAssignment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<RailSeatAssignment> railSeatAssignment;
    @XmlElement(name = "EmergencyInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String emergencyInfo;
    @XmlElement(name = "Address", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeStructuredAddress> address;
    /**
     * Details of drivers license
     * 
     */
    @XmlElement(name = "DriversLicense", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<DriversLicense> driversLicense;
    /**
     * A simple container to specify the profiles that were applied to a reservation.
     * 
     */
    @XmlElement(name = "AppliedProfile", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AppliedProfile> appliedProfile;
    /**
     * Customized Name Data is used to print customized name on the different documents.
     * 
     */
    @XmlElement(name = "CustomizedNameData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<CustomizedNameData> customizedNameData;
    /**
     * Travel Compliance and Preferred Supplier information of the booking traveler specific to a segment. Not applicable to Saved Trip.
     * 
     */
    @XmlElement(name = "TravelComplianceData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TravelComplianceData> travelComplianceData;
    /**
     * Traveler information details like Travel Purpose and Trip Name
     * 
     */
    @XmlElement(name = "TravelInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TravelInfo travelInfo;
    /**
     * Host Name Number
     * 
     */
    @XmlAttribute(name = "NameNumber")
    protected String nameNumber;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Defines the type of traveler used for booking which could be a non-defining type (Companion, Web-fare, etc), or a standard type (Adult, Child, etc).
     * 
     */
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    /**
     * BookingTraveler age
     * 
     */
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    /**
     * When set to True indicates that the Booking Traveler is a VIP based on agency/customer criteria
     * 
     */
    @XmlAttribute(name = "VIP")
    protected Boolean vip;
    /**
     * Traveler Date of Birth
     * 
     */
    @XmlAttribute(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    /**
     * The BookingTraveler gender type
     * 
     */
    @XmlAttribute(name = "Gender")
    protected String gender;
    /**
     * Specify ISO country code for nationality of the Booking Traveler
     * 
     */
    @XmlAttribute(name = "Nationality")
    protected String nationality;
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
     * Container to encapsulate all delivery related information
     * 
     * Gets the value of the deliveryInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeliveryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the deliveryInfo property.
     */
    public List<DeliveryInfo> getDeliveryInfo() {
        if (deliveryInfo == null) {
            deliveryInfo = new ArrayList<>();
        }
        return this.deliveryInfo;
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
     * Provider loyalty card information
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

    /**
     * Rail Discount Card Information
     * 
     * Gets the value of the discountCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiscountCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the discountCard property.
     */
    public List<DiscountCard> getDiscountCard() {
        if (discountCard == null) {
            discountCard = new ArrayList<>();
        }
        return this.discountCard;
    }

    /**
     * Special serivces like wheel chair, or pet carrier.
     * 
     * Gets the value of the ssr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssr property.
     */
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<>();
        }
        return this.ssr;
    }

    /**
     * Text that support Name Remarks.
     * 
     * Gets the value of the nameRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNameRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the nameRemark property.
     */
    public List<NameRemark> getNameRemark() {
        if (nameRemark == null) {
            nameRemark = new ArrayList<>();
        }
        return this.nameRemark;
    }

    /**
     * Identifies the seat assignment for a passenger.
     * 
     * Gets the value of the airSeatAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSeatAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSeatAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSeatAssignment property.
     */
    public List<AirSeatAssignment> getAirSeatAssignment() {
        if (airSeatAssignment == null) {
            airSeatAssignment = new ArrayList<>();
        }
        return this.airSeatAssignment;
    }

    /**
     * Identifies the seat assignment for a passenger on RailSegment.
     * 
     * Gets the value of the railSeatAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSeatAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSeatAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the railSeatAssignment property.
     */
    public List<RailSeatAssignment> getRailSeatAssignment() {
        if (railSeatAssignment == null) {
            railSeatAssignment = new ArrayList<>();
        }
        return this.railSeatAssignment;
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
     * Details of drivers license
     * 
     * Gets the value of the driversLicense property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driversLicense property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDriversLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriversLicense }
     * </p>
     * 
     * 
     * @return
     *     The value of the driversLicense property.
     */
    public List<DriversLicense> getDriversLicense() {
        if (driversLicense == null) {
            driversLicense = new ArrayList<>();
        }
        return this.driversLicense;
    }

    /**
     * A simple container to specify the profiles that were applied to a reservation.
     * 
     * Gets the value of the appliedProfile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedProfile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAppliedProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the appliedProfile property.
     */
    public List<AppliedProfile> getAppliedProfile() {
        if (appliedProfile == null) {
            appliedProfile = new ArrayList<>();
        }
        return this.appliedProfile;
    }

    /**
     * Customized Name Data is used to print customized name on the different documents.
     * 
     * Gets the value of the customizedNameData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizedNameData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCustomizedNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizedNameData }
     * </p>
     * 
     * 
     * @return
     *     The value of the customizedNameData property.
     */
    public List<CustomizedNameData> getCustomizedNameData() {
        if (customizedNameData == null) {
            customizedNameData = new ArrayList<>();
        }
        return this.customizedNameData;
    }

    /**
     * Travel Compliance and Preferred Supplier information of the booking traveler specific to a segment. Not applicable to Saved Trip.
     * 
     * Gets the value of the travelComplianceData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelComplianceData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTravelComplianceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData }
     * </p>
     * 
     * 
     * @return
     *     The value of the travelComplianceData property.
     */
    public List<TravelComplianceData> getTravelComplianceData() {
        if (travelComplianceData == null) {
            travelComplianceData = new ArrayList<>();
        }
        return this.travelComplianceData;
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
     * Host Name Number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNumber() {
        return nameNumber;
    }

    /**
     * Sets the value of the nameNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNameNumber()
     */
    public void setNameNumber(String value) {
        this.nameNumber = value;
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
     * Defines the type of traveler used for booking which could be a non-defining type (Companion, Web-fare, etc), or a standard type (Adult, Child, etc).
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
     * BookingTraveler age
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
     * @see #getAge()
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * When set to True indicates that the Booking Traveler is a VIP based on agency/customer criteria
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVIP() {
        if (vip == null) {
            return false;
        } else {
            return vip;
        }
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isVIP()
     */
    public void setVIP(Boolean value) {
        this.vip = value;
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
     * The BookingTraveler gender type
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
     * @see #getGender()
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Specify ISO country code for nationality of the Booking Traveler
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNationality()
     */
    public void setNationality(String value) {
        this.nationality = value;
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
