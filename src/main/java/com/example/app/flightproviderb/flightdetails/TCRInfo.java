
package com.example.app.flightproviderb.flightdetails;

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
 *       <attribute name="Status" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTCRStatus" />
 *       <attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="TCRNumber" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTCRNumber" />
 *       <attribute name="ProviderReservationInfoRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TCRInfo")
public class TCRInfo {

    @XmlAttribute(name = "Status", required = true)
    protected TypeTCRStatus status;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     */
    @XmlAttribute(name = "TCRNumber", required = true)
    protected String tcrNumber;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef", required = true)
    protected String providerReservationInfoRef;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTCRStatus }
     *     
     */
    public TypeTCRStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTCRStatus }
     *     
     */
    public void setStatus(TypeTCRStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
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
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRNumber() {
        return tcrNumber;
    }

    /**
     * Sets the value of the tcrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTCRNumber()
     */
    public void setTCRNumber(String value) {
        this.tcrNumber = value;
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
