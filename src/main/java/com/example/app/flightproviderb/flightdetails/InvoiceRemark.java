
package com.example.app.flightproviderb.flightdetails;

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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeAssociatedRemark">
 *       <choice>
 *         <element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
 *         <element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
 *         <element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
 *         <element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
 *       </choice>
 *     </extension>
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
@XmlRootElement(name = "InvoiceRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
public class InvoiceRemark
    extends TypeAssociatedRemark
{

    /**
     * Reference to AirSegment from an Air Reservation.
     * 
     */
    @XmlElement(name = "AirSegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeSegmentRef airSegmentRef;
    /**
     * Specify the locator code of Hotel reservation.
     * 
     */
    @XmlElement(name = "HotelReservationRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeNonAirReservationRef2 hotelReservationRef;
    /**
     * Specify the locator code of Vehicle reservation.
     * 
     */
    @XmlElement(name = "VehicleReservationRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeNonAirReservationRef2 vehicleReservationRef;
    /**
     * Reference to PassiveSegment from a Passive Reservation.
     * 
     */
    @XmlElement(name = "PassiveSegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeSegmentRef passiveSegmentRef;

    /**
     * Reference to AirSegment from an Air Reservation.
     * 
     * @return
     *     possible object is
     *     {@link TypeSegmentRef }
     *     
     */
    public TypeSegmentRef getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSegmentRef }
     *     
     * @see #getAirSegmentRef()
     */
    public void setAirSegmentRef(TypeSegmentRef value) {
        this.airSegmentRef = value;
    }

    /**
     * Specify the locator code of Hotel reservation.
     * 
     * @return
     *     possible object is
     *     {@link TypeNonAirReservationRef2 }
     *     
     */
    public TypeNonAirReservationRef2 getHotelReservationRef() {
        return hotelReservationRef;
    }

    /**
     * Sets the value of the hotelReservationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNonAirReservationRef2 }
     *     
     * @see #getHotelReservationRef()
     */
    public void setHotelReservationRef(TypeNonAirReservationRef2 value) {
        this.hotelReservationRef = value;
    }

    /**
     * Specify the locator code of Vehicle reservation.
     * 
     * @return
     *     possible object is
     *     {@link TypeNonAirReservationRef2 }
     *     
     */
    public TypeNonAirReservationRef2 getVehicleReservationRef() {
        return vehicleReservationRef;
    }

    /**
     * Sets the value of the vehicleReservationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNonAirReservationRef2 }
     *     
     * @see #getVehicleReservationRef()
     */
    public void setVehicleReservationRef(TypeNonAirReservationRef2 value) {
        this.vehicleReservationRef = value;
    }

    /**
     * Reference to PassiveSegment from a Passive Reservation.
     * 
     * @return
     *     possible object is
     *     {@link TypeSegmentRef }
     *     
     */
    public TypeSegmentRef getPassiveSegmentRef() {
        return passiveSegmentRef;
    }

    /**
     * Sets the value of the passiveSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSegmentRef }
     *     
     * @see #getPassiveSegmentRef()
     */
    public void setPassiveSegmentRef(TypeSegmentRef value) {
        this.passiveSegmentRef = value;
    }

}
