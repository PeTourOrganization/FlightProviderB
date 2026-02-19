
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AirSegmentRef" type="{http://www.travelport.com/schema/air_v54_0}typeSegmentRef" maxOccurs="999" minOccurs="0"/>
 *         <element name="HotelReservationRef" type="{http://www.travelport.com/schema/air_v54_0}typeNonAirReservationRef" maxOccurs="999" minOccurs="0"/>
 *         <element name="VehicleReservationRef" type="{http://www.travelport.com/schema/air_v54_0}typeNonAirReservationRef" maxOccurs="999" minOccurs="0"/>
 *         <element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/air_v54_0}typeSegmentRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="AllConfirmedAir" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AllWaitlistedAir" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AllHotel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AllVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AllPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegmentRef",
    "hotelReservationRef",
    "vehicleReservationRef",
    "passiveSegmentRef"
})
@XmlRootElement(name = "SegmentSelect")
public class SegmentSelect {

    /**
     * Reference to AirSegment from an Air Reservation.
     * 
     */
    @XmlElement(name = "AirSegmentRef")
    protected List<TypeSegmentRef2> airSegmentRef;
    /**
     * Specify the locator code of Hotel reservation if it needs to be considered as Auxiliary segment
     * 
     */
    @XmlElement(name = "HotelReservationRef")
    protected List<TypeNonAirReservationRef> hotelReservationRef;
    /**
     * Specify the locator code of Vehicle reservation if it needs to be considered as Auxiliary segment
     * 
     */
    @XmlElement(name = "VehicleReservationRef")
    protected List<TypeNonAirReservationRef> vehicleReservationRef;
    /**
     * Reference to PassiveSegment from a Passive Reservation.Specify the passive segment if it needs to be considered as Auxiliary segment
     * 
     */
    @XmlElement(name = "PassiveSegmentRef")
    protected List<TypeSegmentRef2> passiveSegmentRef;
    /**
     * Set to true to consider all Confirmed segments including active and passive and set to false to discard confirmed segments
     * 
     */
    @XmlAttribute(name = "AllConfirmedAir")
    protected Boolean allConfirmedAir;
    /**
     * Set to true to consider all Waitlisted segments and false to discard all waitlisted segments
     * 
     */
    @XmlAttribute(name = "AllWaitlistedAir")
    protected Boolean allWaitlistedAir;
    /**
     * Set to true to consider all Hotel reservations as Auxiliary segment and false to discard all Hotel reservations
     * 
     */
    @XmlAttribute(name = "AllHotel")
    protected Boolean allHotel;
    /**
     * Set to true to consider all Vehicle reservations as Auxiliary segment and false to discard all Vehicle reservations
     * 
     */
    @XmlAttribute(name = "AllVehicle")
    protected Boolean allVehicle;
    /**
     * Set to true to consider all Passive segments as Auxiliary segment and false to discard passive segments
     * 
     */
    @XmlAttribute(name = "AllPassive")
    protected Boolean allPassive;

    /**
     * Reference to AirSegment from an Air Reservation.
     * 
     * Gets the value of the airSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentRef2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentRef property.
     */
    public List<TypeSegmentRef2> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<>();
        }
        return this.airSegmentRef;
    }

    /**
     * Specify the locator code of Hotel reservation if it needs to be considered as Auxiliary segment
     * 
     * Gets the value of the hotelReservationRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHotelReservationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeNonAirReservationRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the hotelReservationRef property.
     */
    public List<TypeNonAirReservationRef> getHotelReservationRef() {
        if (hotelReservationRef == null) {
            hotelReservationRef = new ArrayList<>();
        }
        return this.hotelReservationRef;
    }

    /**
     * Specify the locator code of Vehicle reservation if it needs to be considered as Auxiliary segment
     * 
     * Gets the value of the vehicleReservationRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleReservationRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVehicleReservationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeNonAirReservationRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the vehicleReservationRef property.
     */
    public List<TypeNonAirReservationRef> getVehicleReservationRef() {
        if (vehicleReservationRef == null) {
            vehicleReservationRef = new ArrayList<>();
        }
        return this.vehicleReservationRef;
    }

    /**
     * Reference to PassiveSegment from a Passive Reservation.Specify the passive segment if it needs to be considered as Auxiliary segment
     * 
     * Gets the value of the passiveSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passiveSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassiveSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentRef2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the passiveSegmentRef property.
     */
    public List<TypeSegmentRef2> getPassiveSegmentRef() {
        if (passiveSegmentRef == null) {
            passiveSegmentRef = new ArrayList<>();
        }
        return this.passiveSegmentRef;
    }

    /**
     * Set to true to consider all Confirmed segments including active and passive and set to false to discard confirmed segments
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllConfirmedAir() {
        return allConfirmedAir;
    }

    /**
     * Sets the value of the allConfirmedAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllConfirmedAir()
     */
    public void setAllConfirmedAir(Boolean value) {
        this.allConfirmedAir = value;
    }

    /**
     * Set to true to consider all Waitlisted segments and false to discard all waitlisted segments
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllWaitlistedAir() {
        return allWaitlistedAir;
    }

    /**
     * Sets the value of the allWaitlistedAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllWaitlistedAir()
     */
    public void setAllWaitlistedAir(Boolean value) {
        this.allWaitlistedAir = value;
    }

    /**
     * Set to true to consider all Hotel reservations as Auxiliary segment and false to discard all Hotel reservations
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllHotel() {
        return allHotel;
    }

    /**
     * Sets the value of the allHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllHotel()
     */
    public void setAllHotel(Boolean value) {
        this.allHotel = value;
    }

    /**
     * Set to true to consider all Vehicle reservations as Auxiliary segment and false to discard all Vehicle reservations
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllVehicle() {
        return allVehicle;
    }

    /**
     * Sets the value of the allVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllVehicle()
     */
    public void setAllVehicle(Boolean value) {
        this.allVehicle = value;
    }

    /**
     * Set to true to consider all Passive segments as Auxiliary segment and false to discard passive segments
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPassive() {
        return allPassive;
    }

    /**
     * Sets the value of the allPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllPassive()
     */
    public void setAllPassive(Boolean value) {
        this.allPassive = value;
    }

}
