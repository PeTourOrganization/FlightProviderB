
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A container for EMD elements related to an
 *                     OptionalService
 * 
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="FulfillmentType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="1"/>
 *             <maxInclusive value="5"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FulfillmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AssociatedItem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AvailabilityChargeIndicator">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="X"/>
 *             <enumeration value="E"/>
 *             <enumeration value="F"/>
 *             <enumeration value="G"/>
 *             <enumeration value="H"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="RefundReissueIndicator">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Refundable"/>
 *             <enumeration value="NonRefundable"/>
 *             <enumeration value="Reuse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Commissionable">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MileageIndicator">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Location">
 *         <simpleType>
 *           <restriction base="{http://www.travelport.com/schema/common_v54_0}typeIATACode">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Date">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Booking">
 *         <simpleType>
 *           <restriction base="{http://www.travelport.com/schema/air_v54_0}typeBooking">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="DisplayCategory">
 *         <simpleType>
 *           <restriction base="{http://www.travelport.com/schema/air_v54_0}typeDisplayCategory">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Reusable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EMD")
public class EMD {

    /**
     * A one digit code specifying how the service must be fulfilled.
     *                         See FulfillmentTypeDescription for the description of this value.
     * 
     */
    @XmlAttribute(name = "FulfillmentType")
    protected Integer fulfillmentType;
    /**
     * EMD description.
     * 
     */
    @XmlAttribute(name = "FulfillmentTypeDescription")
    protected String fulfillmentTypeDescription;
    /**
     * The type of Optional Service.  The choices are Flight, Ticket, Merchandising, Rule Buster, Allowance, Chargeable Baggage, Carry On Baggage Allowance, Prepaid Baggage.  Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "AssociatedItem")
    protected String associatedItem;
    /**
     * A one-letter code specifying whether the service
     *                         is available or if there is a charge associated with it.
     *                         X = Service not available
     *                         F = No charge for service (free) and an EMD is not issued to
     *                         reflect free service
     *                         E = No charge for service (free) and an EMD is issued to reflect
     *                         the free service.
     *                         G = No charge for service (free), booking is not required and an
     *                         EMD is not issued to reflect free service
     *                         H = No charge for service (free), booking is not required, and an
     *                         EMD is issued to reflect the free service.
     *                         Blank = No application. Charges apply according to the data in the
     *                         Service Fee fields.
     * 
     */
    @XmlAttribute(name = "AvailabilityChargeIndicator")
    protected String availabilityChargeIndicator;
    /**
     * An attribute specifying whether the service is
     *                         refundable or reissuable.
     * 
     */
    @XmlAttribute(name = "RefundReissueIndicator")
    protected String refundReissueIndicator;
    /**
     * True/False value to whether or not the
     *                         service is comissionable.
     * 
     */
    @XmlAttribute(name = "Commissionable")
    protected Boolean commissionable;
    /**
     * True/False value to whether or not the
     *                         service has miles.
     * 
     */
    @XmlAttribute(name = "MileageIndicator")
    protected Boolean mileageIndicator;
    /**
     *  3 letter location code where the service will be availed.
     * 
     */
    @XmlAttribute(name = "Location")
    protected String location;
    /**
     * The date at which the service will be used.
     * 
     */
    @XmlAttribute(name = "Date")
    protected XMLGregorianCalendar date;
    /**
     * Holds the booking description for the service, e.g., SSR.
     * 
     */
    @XmlAttribute(name = "Booking")
    protected TypeBooking booking;
    /**
     * Describes when the service should be displayed.
     * 
     */
    @XmlAttribute(name = "DisplayCategory")
    protected TypeDisplayCategory displayCategory;
    /**
     * Identifies if the service can be re-used towards a future purchase.
     * 
     */
    @XmlAttribute(name = "Reusable")
    protected Boolean reusable;

    /**
     * A one digit code specifying how the service must be fulfilled.
     *                         See FulfillmentTypeDescription for the description of this value.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFulfillmentType()
     */
    public void setFulfillmentType(Integer value) {
        this.fulfillmentType = value;
    }

    /**
     * EMD description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentTypeDescription() {
        return fulfillmentTypeDescription;
    }

    /**
     * Sets the value of the fulfillmentTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFulfillmentTypeDescription()
     */
    public void setFulfillmentTypeDescription(String value) {
        this.fulfillmentTypeDescription = value;
    }

    /**
     * The type of Optional Service.  The choices are Flight, Ticket, Merchandising, Rule Buster, Allowance, Chargeable Baggage, Carry On Baggage Allowance, Prepaid Baggage.  Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedItem() {
        return associatedItem;
    }

    /**
     * Sets the value of the associatedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssociatedItem()
     */
    public void setAssociatedItem(String value) {
        this.associatedItem = value;
    }

    /**
     * A one-letter code specifying whether the service
     *                         is available or if there is a charge associated with it.
     *                         X = Service not available
     *                         F = No charge for service (free) and an EMD is not issued to
     *                         reflect free service
     *                         E = No charge for service (free) and an EMD is issued to reflect
     *                         the free service.
     *                         G = No charge for service (free), booking is not required and an
     *                         EMD is not issued to reflect free service
     *                         H = No charge for service (free), booking is not required, and an
     *                         EMD is issued to reflect the free service.
     *                         Blank = No application. Charges apply according to the data in the
     *                         Service Fee fields.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityChargeIndicator() {
        return availabilityChargeIndicator;
    }

    /**
     * Sets the value of the availabilityChargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvailabilityChargeIndicator()
     */
    public void setAvailabilityChargeIndicator(String value) {
        this.availabilityChargeIndicator = value;
    }

    /**
     * An attribute specifying whether the service is
     *                         refundable or reissuable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReissueIndicator() {
        return refundReissueIndicator;
    }

    /**
     * Sets the value of the refundReissueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundReissueIndicator()
     */
    public void setRefundReissueIndicator(String value) {
        this.refundReissueIndicator = value;
    }

    /**
     * True/False value to whether or not the
     *                         service is comissionable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommissionable() {
        return commissionable;
    }

    /**
     * Sets the value of the commissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCommissionable()
     */
    public void setCommissionable(Boolean value) {
        this.commissionable = value;
    }

    /**
     * True/False value to whether or not the
     *                         service has miles.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMileageIndicator() {
        return mileageIndicator;
    }

    /**
     * Sets the value of the mileageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMileageIndicator()
     */
    public void setMileageIndicator(Boolean value) {
        this.mileageIndicator = value;
    }

    /**
     *  3 letter location code where the service will be availed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocation()
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * The date at which the service will be used.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Holds the booking description for the service, e.g., SSR.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooking }
     *     
     */
    public TypeBooking getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooking }
     *     
     * @see #getBooking()
     */
    public void setBooking(TypeBooking value) {
        this.booking = value;
    }

    /**
     * Describes when the service should be displayed.
     * 
     * @return
     *     possible object is
     *     {@link TypeDisplayCategory }
     *     
     */
    public TypeDisplayCategory getDisplayCategory() {
        return displayCategory;
    }

    /**
     * Sets the value of the displayCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDisplayCategory }
     *     
     * @see #getDisplayCategory()
     */
    public void setDisplayCategory(TypeDisplayCategory value) {
        this.displayCategory = value;
    }

    /**
     * Identifies if the service can be re-used towards a future purchase.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReusable() {
        return reusable;
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReusable()
     */
    public void setReusable(Boolean value) {
        this.reusable = value;
    }

}
