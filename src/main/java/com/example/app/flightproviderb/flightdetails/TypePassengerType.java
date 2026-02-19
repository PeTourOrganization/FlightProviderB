
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Passenger type code with optional age information
 * 
 * <p>Java class for typePassengerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typePassengerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Name" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}DiscountCard" maxOccurs="9" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PersonalGeography" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Code" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Gender" type="{http://www.travelport.com/schema/common_v54_0}typeGender" />
 *       <attribute name="PricePTCOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="BookingTravelerRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AccompaniedPassenger" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ResidencyType" type="{http://www.travelport.com/schema/common_v54_0}typeResidency" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePassengerType", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "name",
    "loyaltyCard",
    "discountCard",
    "personalGeography"
})
@XmlSeeAlso({
    SearchPassenger.class,
    SearchTraveler.class,
    PassengerType.class
})
public class TypePassengerType {

    /**
     * Optional passenger Name with associated LoyaltyCard may provide benefit when pricing itineraries using Low Cost Carriers. In general, most carriers do not consider passenger LoyalyCard information when initially pricing itineraries.
     * 
     */
    @XmlElement(name = "Name")
    protected Name name;
    /**
     * Provider loyalty card information
     * 
     */
    @XmlElement(name = "LoyaltyCard")
    protected List<LoyaltyCard> loyaltyCard;
    /**
     * Rail Discount Card Information
     * 
     */
    @XmlElement(name = "DiscountCard")
    protected List<DiscountCard> discountCard;
    /**
     * Passenger personal geography detail to be sent to Host for accessing location specific fares
     * 
     */
    @XmlElement(name = "PersonalGeography")
    protected PersonalGeography personalGeography;
    /**
     * The 3-char IATA passenger type code
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    /**
     * Passenger Date of Birth
     * 
     */
    @XmlAttribute(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    /**
     * The passenger gender type
     * 
     */
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "PricePTCOnly")
    protected Boolean pricePTCOnly;
    /**
     * This value should be set for Multiple Passengers in the request.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    /**
     * Container to identify accompanied passenger. Set true means this passenger is accompanied
     * 
     */
    @XmlAttribute(name = "AccompaniedPassenger")
    protected Boolean accompaniedPassenger;
    /**
     * The passenger residence type.
     * 
     */
    @XmlAttribute(name = "ResidencyType")
    protected TypeResidency residencyType;

    /**
     * Optional passenger Name with associated LoyaltyCard may provide benefit when pricing itineraries using Low Cost Carriers. In general, most carriers do not consider passenger LoyalyCard information when initially pricing itineraries.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     * @see #getName()
     */
    public void setName(Name value) {
        this.name = value;
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
     * Passenger personal geography detail to be sent to Host for accessing location specific fares
     * 
     * @return
     *     possible object is
     *     {@link PersonalGeography }
     *     
     */
    public PersonalGeography getPersonalGeography() {
        return personalGeography;
    }

    /**
     * Sets the value of the personalGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalGeography }
     *     
     * @see #getPersonalGeography()
     */
    public void setPersonalGeography(PersonalGeography value) {
        this.personalGeography = value;
    }

    /**
     * The 3-char IATA passenger type code
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
     * Passenger Date of Birth
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
     * The passenger gender type
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
     * Gets the value of the pricePTCOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricePTCOnly() {
        return pricePTCOnly;
    }

    /**
     * Sets the value of the pricePTCOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricePTCOnly(Boolean value) {
        this.pricePTCOnly = value;
    }

    /**
     * This value should be set for Multiple Passengers in the request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Container to identify accompanied passenger. Set true means this passenger is accompanied
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccompaniedPassenger() {
        if (accompaniedPassenger == null) {
            return false;
        } else {
            return accompaniedPassenger;
        }
    }

    /**
     * Sets the value of the accompaniedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAccompaniedPassenger()
     */
    public void setAccompaniedPassenger(Boolean value) {
        this.accompaniedPassenger = value;
    }

    /**
     * The passenger residence type.
     * 
     * @return
     *     possible object is
     *     {@link TypeResidency }
     *     
     */
    public TypeResidency getResidencyType() {
        return residencyType;
    }

    /**
     * Sets the value of the residencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeResidency }
     *     
     * @see #getResidencyType()
     */
    public void setResidencyType(TypeResidency value) {
        this.residencyType = value;
    }

}
