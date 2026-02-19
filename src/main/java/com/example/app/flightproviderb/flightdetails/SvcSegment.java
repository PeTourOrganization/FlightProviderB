
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="RFIC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RFISC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SvcDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Fee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="EMDNumber" type="{http://www.travelport.com/schema/air_v54_0}typeEMDNumber" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SvcSegment")
public class SvcSegment {

    /**
     * The Key of SVC Segment.
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The platting carrier
     * 
     */
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "NumberOfItems")
    protected BigInteger numberOfItems;
    /**
     * Origin location - Airport code. 1P only.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * Destination location - Airport code. 1P only.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * Start date of the segment. Generally it is the
     * 						next date after the last air segment. 1P only
     * 
     */
    @XmlAttribute(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * To identify the appropriate travel sequence for
     * 						Air/Car/Hotel/Passive segments/reservations based on travel dates.
     * 						This ordering is applicable across the UR not provider or traveler
     * 						specific
     * 
     */
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    /**
     *  1P - Reason for issuance
     * 
     */
    @XmlAttribute(name = "RFIC")
    protected String rfic;
    /**
     *  1P - Resaon for issuance sub-code
     * 
     */
    @XmlAttribute(name = "RFISC")
    protected String rfisc;
    /**
     *  1P - SVC fee description
     * 
     */
    @XmlAttribute(name = "SvcDescription")
    protected String svcDescription;
    /**
     * The fee to be collected using SVC segment
     * 
     */
    @XmlAttribute(name = "Fee")
    protected String fee;
    /**
     * Generated EMD number, if EMD is issued on the SVC
     * 
     */
    @XmlAttribute(name = "EMDNumber")
    protected String emdNumber;

    /**
     * The Key of SVC Segment.
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
     * The platting carrier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
    }

    /**
     * Origin location - Airport code. 1P only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Destination location - Airport code. 1P only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Start date of the segment. Generally it is the
     * 						next date after the last air segment. 1P only
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * To identify the appropriate travel sequence for
     * 						Air/Car/Hotel/Passive segments/reservations based on travel dates.
     * 						This ordering is applicable across the UR not provider or traveler
     * 						specific
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTravelOrder()
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
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
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     *  1P - Reason for issuance
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIC()
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     *  1P - Resaon for issuance sub-code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFISC()
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     *  1P - SVC fee description
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDescription() {
        return svcDescription;
    }

    /**
     * Sets the value of the svcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSvcDescription()
     */
    public void setSvcDescription(String value) {
        this.svcDescription = value;
    }

    /**
     * The fee to be collected using SVC segment
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFee()
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Generated EMD number, if EMD is issued on the SVC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDNumber() {
        return emdNumber;
    }

    /**
     * Sets the value of the emdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEMDNumber()
     */
    public void setEMDNumber(String value) {
        this.emdNumber = value;
    }

}
