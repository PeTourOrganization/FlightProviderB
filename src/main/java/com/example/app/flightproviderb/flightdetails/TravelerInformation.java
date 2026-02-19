
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="EmergencyContact" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 <attribute name="Relationship" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="HomeAirport" type="{http://www.travelport.com/schema/common_v54_0}typeAirport" />
 *       <attribute name="VisaExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emergencyContact"
})
@XmlRootElement(name = "TravelerInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TravelerInformation {

    @XmlElement(name = "EmergencyContact", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TravelerInformation.EmergencyContact emergencyContact;
    @XmlAttribute(name = "HomeAirport")
    protected String homeAirport;
    @XmlAttribute(name = "VisaExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar visaExpirationDate;
    /**
     * A reference to a passenger.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInformation.EmergencyContact }
     *     
     */
    public TravelerInformation.EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInformation.EmergencyContact }
     *     
     */
    public void setEmergencyContact(TravelerInformation.EmergencyContact value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the homeAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAirport() {
        return homeAirport;
    }

    /**
     * Sets the value of the homeAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAirport(String value) {
        this.homeAirport = value;
    }

    /**
     * Gets the value of the visaExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisaExpirationDate() {
        return visaExpirationDate;
    }

    /**
     * Sets the value of the visaExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisaExpirationDate(XMLGregorianCalendar value) {
        this.visaExpirationDate = value;
    }

    /**
     * A reference to a passenger.
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       <attribute name="Relationship" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    public static class EmergencyContact {

        /**
         * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
         * 
         */
        @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected PhoneNumber phoneNumber;
        /**
         * Name of Emergency Contact Person
         * 
         */
        @XmlAttribute(name = "Name")
        @XmlSchemaType(name = "anySimpleType")
        protected String name;
        /**
         * Relationship between Traveler and
         * 									Emergency Contact Person
         * 
         */
        @XmlAttribute(name = "Relationship")
        @XmlSchemaType(name = "anySimpleType")
        protected String relationship;

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
         * Name of Emergency Contact Person
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

        /**
         * Relationship between Traveler and
         * 									Emergency Contact Person
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelationship() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRelationship()
         */
        public void setRelationship(String value) {
            this.relationship = value;
        }

    }

}
