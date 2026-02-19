
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerInformation" maxOccurs="9"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="InvoiceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="ProviderReservationInfoRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerInformation"
})
@XmlRootElement(name = "InvoiceData", namespace = "http://www.travelport.com/schema/common_v54_0")
public class InvoiceData {

    /**
     * Booking Traveler information tied to invoice
     * 
     */
    @XmlElement(name = "BookingTravelerInformation", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<BookingTravelerInformation> bookingTravelerInformation;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Invoice number
     * 
     */
    @XmlAttribute(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    /**
     * Invoice issue date
     * 
     */
    @XmlAttribute(name = "IssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef", required = true)
    protected String providerReservationInfoRef;

    /**
     * Booking Traveler information tied to invoice
     * 
     * Gets the value of the bookingTravelerInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTravelerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerInformation property.
     */
    public List<BookingTravelerInformation> getBookingTravelerInformation() {
        if (bookingTravelerInformation == null) {
            bookingTravelerInformation = new ArrayList<>();
        }
        return this.bookingTravelerInformation;
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
     * Invoice number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInvoiceNumber()
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Invoice issue date
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getIssueDate()
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Provider reservation reference key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderReservationInfoRef()
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

}
