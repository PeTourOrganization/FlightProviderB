
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTraveler" maxOccurs="999" minOccurs="0"/>
 *         <element name="AirReservation" type="{http://www.travelport.com/schema/air_v54_0}typeAirReservationWithFOP" minOccurs="0"/>
 *         <element name="ExchangeFailureInfo" type="{http://www.travelport.com/schema/air_v54_0}typeTicketFailureInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "bookingTraveler",
    "airReservation",
    "exchangeFailureInfo"
})
@XmlRootElement(name = "AirExchangeRsp")
public class AirExchangeRsp
    extends BaseRsp
{

    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<BookingTraveler> bookingTraveler;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "AirReservation")
    protected TypeAirReservationWithFOP airReservation;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "ExchangeFailureInfo")
    protected List<TypeTicketFailureInfo> exchangeFailureInfo;

    /**
     * The identifying number for the actual ticket
     * 
     * Gets the value of the ticketNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketNumber().add(newItem);
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
     *     The value of the ticketNumber property.
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<>();
        }
        return this.ticketNumber;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the bookingTraveler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTraveler property.
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<>();
        }
        return this.bookingTraveler;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link TypeAirReservationWithFOP }
     *     
     */
    public TypeAirReservationWithFOP getAirReservation() {
        return airReservation;
    }

    /**
     * Sets the value of the airReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAirReservationWithFOP }
     *     
     * @see #getAirReservation()
     */
    public void setAirReservation(TypeAirReservationWithFOP value) {
        this.airReservation = value;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the exchangeFailureInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeFailureInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExchangeFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketFailureInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the exchangeFailureInfo property.
     */
    public List<TypeTicketFailureInfo> getExchangeFailureInfo() {
        if (exchangeFailureInfo == null) {
            exchangeFailureInfo = new ArrayList<>();
        }
        return this.exchangeFailureInfo;
    }

}
