
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="Air" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.travelport.com/schema/common_v54_0}typeTransactionsAllowed">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrFlexShopping"/>
 *                 <attribute name="OneWayShop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="FlexExplore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="RapidRepriceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="ReturnUpsellFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Hotel" type="{http://www.travelport.com/schema/common_v54_0}typeTransactionsAllowed" minOccurs="0"/>
 *         <element name="Rail" type="{http://www.travelport.com/schema/common_v54_0}typeTransactionsAllowed" minOccurs="0"/>
 *         <element name="Vehicle" type="{http://www.travelport.com/schema/common_v54_0}typeTransactionsAllowed" minOccurs="0"/>
 *         <element name="Passive" type="{http://www.travelport.com/schema/common_v54_0}typeBookingTransactionsAllowed" minOccurs="0"/>
 *         <element name="BackgroundPassive" type="{http://www.travelport.com/schema/common_v54_0}typeBookingTransactionsAllowed" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "air",
    "hotel",
    "rail",
    "vehicle",
    "passive",
    "backgroundPassive"
})
@XmlRootElement(name = "TransactionType", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TransactionType {

    @XmlElement(name = "Air", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TransactionType.Air air;
    @XmlElement(name = "Hotel", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeTransactionsAllowed hotel;
    @XmlElement(name = "Rail", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeTransactionsAllowed rail;
    @XmlElement(name = "Vehicle", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeTransactionsAllowed vehicle;
    /**
     * For true passive segments such as ground, cruise etc
     * 
     */
    @XmlElement(name = "Passive", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeBookingTransactionsAllowed passive;
    /**
     * For behind the scenes or background passives Only
     * 
     */
    @XmlElement(name = "BackgroundPassive", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeBookingTransactionsAllowed backgroundPassive;

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType.Air }
     *     
     */
    public TransactionType.Air getAir() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType.Air }
     *     
     */
    public void setAir(TransactionType.Air value) {
        this.air = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public TypeTransactionsAllowed getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public void setHotel(TypeTransactionsAllowed value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the rail property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public TypeTransactionsAllowed getRail() {
        return rail;
    }

    /**
     * Sets the value of the rail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public void setRail(TypeTransactionsAllowed value) {
        this.rail = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public TypeTransactionsAllowed getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public void setVehicle(TypeTransactionsAllowed value) {
        this.vehicle = value;
    }

    /**
     * For true passive segments such as ground, cruise etc
     * 
     * @return
     *     possible object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    public TypeBookingTransactionsAllowed getPassive() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     * @see #getPassive()
     */
    public void setPassive(TypeBookingTransactionsAllowed value) {
        this.passive = value;
    }

    /**
     * For behind the scenes or background passives Only
     * 
     * @return
     *     possible object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    public TypeBookingTransactionsAllowed getBackgroundPassive() {
        return backgroundPassive;
    }

    /**
     * Sets the value of the backgroundPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     * @see #getBackgroundPassive()
     */
    public void setBackgroundPassive(TypeBookingTransactionsAllowed value) {
        this.backgroundPassive = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeTransactionsAllowed">
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrFlexShopping"/>
     *       <attribute name="OneWayShop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="FlexExplore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="RapidRepriceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="ReturnUpsellFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Air
        extends TypeTransactionsAllowed
    {

        /**
         * Allows or prohibits one way shopping functionality for the associated provisioning provider configuration
         * 
         */
        @XmlAttribute(name = "OneWayShop")
        protected Boolean oneWayShop;
        /**
         * Allows or prohibits flex explore functionality for the associated provisioning provider configuration
         * 
         */
        @XmlAttribute(name = "FlexExplore")
        protected Boolean flexExplore;
        /**
         * Allows or prohibits rapid reprice functionality for the associated provisioning provider configuration. Providers: 1G/1V
         * 
         */
        @XmlAttribute(name = "RapidRepriceEnabled")
        protected Boolean rapidRepriceEnabled;
        /**
         * When set to “true”, Upsell information will be returned in the shop response.  Provider: 1G, 1V, 1P, ACH
         * 
         */
        @XmlAttribute(name = "ReturnUpsellFare")
        protected Boolean returnUpsellFare;
        /**
         * Indicate the Tier Level
         * 
         */
        @XmlAttribute(name = "Tier")
        protected Integer tier;
        /**
         * Allow or prohibit Flexible Days (within a date range) shopping option
         * 
         */
        @XmlAttribute(name = "DaysEnabled")
        protected Boolean daysEnabled;
        /**
         * Allow or prohibit Flexible Weekends shopping option
         * 
         */
        @XmlAttribute(name = "WeekendsEnabled")
        protected Boolean weekendsEnabled;
        /**
         * Allow or prohibit Flexible Airport (choice of Origin and Destination airports) shopping option
         * 
         */
        @XmlAttribute(name = "AirportsEnabled")
        protected Boolean airportsEnabled;
        /**
         * Allow or prohibit Flexible Origin and Destination (choice of airports within a radius) shopping option
         * 
         */
        @XmlAttribute(name = "ODEnabled")
        protected Boolean odEnabled;

        /**
         * Allows or prohibits one way shopping functionality for the associated provisioning provider configuration
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOneWayShop() {
            return oneWayShop;
        }

        /**
         * Sets the value of the oneWayShop property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isOneWayShop()
         */
        public void setOneWayShop(Boolean value) {
            this.oneWayShop = value;
        }

        /**
         * Allows or prohibits flex explore functionality for the associated provisioning provider configuration
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFlexExplore() {
            return flexExplore;
        }

        /**
         * Sets the value of the flexExplore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isFlexExplore()
         */
        public void setFlexExplore(Boolean value) {
            this.flexExplore = value;
        }

        /**
         * Allows or prohibits rapid reprice functionality for the associated provisioning provider configuration. Providers: 1G/1V
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRapidRepriceEnabled() {
            return rapidRepriceEnabled;
        }

        /**
         * Sets the value of the rapidRepriceEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isRapidRepriceEnabled()
         */
        public void setRapidRepriceEnabled(Boolean value) {
            this.rapidRepriceEnabled = value;
        }

        /**
         * When set to “true”, Upsell information will be returned in the shop response.  Provider: 1G, 1V, 1P, ACH
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnUpsellFare() {
            return returnUpsellFare;
        }

        /**
         * Sets the value of the returnUpsellFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isReturnUpsellFare()
         */
        public void setReturnUpsellFare(Boolean value) {
            this.returnUpsellFare = value;
        }

        /**
         * Indicate the Tier Level
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTier() {
            return tier;
        }

        /**
         * Sets the value of the tier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getTier()
         */
        public void setTier(Integer value) {
            this.tier = value;
        }

        /**
         * Allow or prohibit Flexible Days (within a date range) shopping option
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDaysEnabled() {
            return daysEnabled;
        }

        /**
         * Sets the value of the daysEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDaysEnabled()
         */
        public void setDaysEnabled(Boolean value) {
            this.daysEnabled = value;
        }

        /**
         * Allow or prohibit Flexible Weekends shopping option
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeekendsEnabled() {
            return weekendsEnabled;
        }

        /**
         * Sets the value of the weekendsEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isWeekendsEnabled()
         */
        public void setWeekendsEnabled(Boolean value) {
            this.weekendsEnabled = value;
        }

        /**
         * Allow or prohibit Flexible Airport (choice of Origin and Destination airports) shopping option
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAirportsEnabled() {
            return airportsEnabled;
        }

        /**
         * Sets the value of the airportsEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isAirportsEnabled()
         */
        public void setAirportsEnabled(Boolean value) {
            this.airportsEnabled = value;
        }

        /**
         * Allow or prohibit Flexible Origin and Destination (choice of airports within a radius) shopping option
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isODEnabled() {
            return odEnabled;
        }

        /**
         * Sets the value of the odEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isODEnabled()
         */
        public void setODEnabled(Boolean value) {
            this.odEnabled = value;
        }

    }

}
