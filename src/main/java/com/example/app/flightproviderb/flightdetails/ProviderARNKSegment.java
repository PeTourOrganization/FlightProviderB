
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element name="PreviousSegment" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
 *                   <element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   <element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   <element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NextSegment" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
 *                   <element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   <element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   <element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderSegmentOrder">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <maxInclusive value="999"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "previousSegment",
    "nextSegment"
})
@XmlRootElement(name = "ProviderARNKSegment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ProviderARNKSegment {

    @XmlElement(name = "PreviousSegment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected ProviderARNKSegment.PreviousSegment previousSegment;
    @XmlElement(name = "NextSegment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected ProviderARNKSegment.NextSegment nextSegment;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel/Rail segments/reservations in the provider reservation.
     * 
     */
    @XmlAttribute(name = "ProviderSegmentOrder")
    protected BigInteger providerSegmentOrder;

    /**
     * Gets the value of the previousSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderARNKSegment.PreviousSegment }
     *     
     */
    public ProviderARNKSegment.PreviousSegment getPreviousSegment() {
        return previousSegment;
    }

    /**
     * Sets the value of the previousSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderARNKSegment.PreviousSegment }
     *     
     */
    public void setPreviousSegment(ProviderARNKSegment.PreviousSegment value) {
        this.previousSegment = value;
    }

    /**
     * Gets the value of the nextSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderARNKSegment.NextSegment }
     *     
     */
    public ProviderARNKSegment.NextSegment getNextSegment() {
        return nextSegment;
    }

    /**
     * Sets the value of the nextSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderARNKSegment.NextSegment }
     *     
     */
    public void setNextSegment(ProviderARNKSegment.NextSegment value) {
        this.nextSegment = value;
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

    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel/Rail segments/reservations in the provider reservation.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderSegmentOrder() {
        return providerSegmentOrder;
    }

    /**
     * Sets the value of the providerSegmentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getProviderSegmentOrder()
     */
    public void setProviderSegmentOrder(BigInteger value) {
        this.providerSegmentOrder = value;
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
     *       <choice>
     *         <element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
     *         <element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
     *         <element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
     *         <element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
     *       </choice>
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
    public static class NextSegment {

        /**
         * Reference to AirSegment from an Air
         * 										Reservation.
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
         * Specify the locator code of Vehicle
         * 										reservation.
         * 
         */
        @XmlElement(name = "VehicleReservationRef", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected TypeNonAirReservationRef2 vehicleReservationRef;
        /**
         * Reference to PassiveSegment from a Passive
         * 										Reservation.
         * 
         */
        @XmlElement(name = "PassiveSegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected TypeSegmentRef passiveSegmentRef;

        /**
         * Reference to AirSegment from an Air
         * 										Reservation.
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
         * Specify the locator code of Vehicle
         * 										reservation.
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
         * Reference to PassiveSegment from a Passive
         * 										Reservation.
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
     *         <element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
     *         <element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v54_0}typeNonAirReservationRef" minOccurs="0"/>
     *         <element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" minOccurs="0"/>
     *       </choice>
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
    public static class PreviousSegment {

        /**
         * Reference to AirSegment from an Air
         * 										Reservation.
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
         * Specify the locator code of Vehicle
         * 										reservation.
         * 
         */
        @XmlElement(name = "VehicleReservationRef", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected TypeNonAirReservationRef2 vehicleReservationRef;
        /**
         * Reference to PassiveSegment from a Passive
         * 										Reservation.
         * 
         */
        @XmlElement(name = "PassiveSegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected TypeSegmentRef passiveSegmentRef;

        /**
         * Reference to AirSegment from an Air
         * 										Reservation.
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
         * Specify the locator code of Vehicle
         * 										reservation.
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
         * Reference to PassiveSegment from a Passive
         * 										Reservation.
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

}
