
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
 *         <element name="FlightOrigin" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}Airport"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FlightDestination" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}Airport"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="StartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FlightNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightOrigin",
    "flightDestination"
})
@XmlRootElement(name = "SpecificTimeTable")
public class SpecificTimeTable {

    @XmlElement(name = "FlightOrigin")
    protected SpecificTimeTable.FlightOrigin flightOrigin;
    @XmlElement(name = "FlightDestination")
    protected SpecificTimeTable.FlightDestination flightDestination;
    @XmlAttribute(name = "StartDate", required = true)
    protected String startDate;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    @XmlAttribute(name = "FlightNumber", required = true)
    protected String flightNumber;

    /**
     * Gets the value of the flightOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTimeTable.FlightOrigin }
     *     
     */
    public SpecificTimeTable.FlightOrigin getFlightOrigin() {
        return flightOrigin;
    }

    /**
     * Sets the value of the flightOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTimeTable.FlightOrigin }
     *     
     */
    public void setFlightOrigin(SpecificTimeTable.FlightOrigin value) {
        this.flightOrigin = value;
    }

    /**
     * Gets the value of the flightDestination property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTimeTable.FlightDestination }
     *     
     */
    public SpecificTimeTable.FlightDestination getFlightDestination() {
        return flightDestination;
    }

    /**
     * Sets the value of the flightDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTimeTable.FlightDestination }
     *     
     */
    public void setFlightDestination(SpecificTimeTable.FlightDestination value) {
        this.flightDestination = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the carrier property.
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
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}Airport"/>
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
        "airport"
    })
    public static class FlightDestination {

        /**
         * Airport identifier
         * 
         */
        @XmlElement(name = "Airport", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected Airport airport;

        /**
         * Airport identifier
         * 
         * @return
         *     possible object is
         *     {@link Airport }
         *     
         */
        public Airport getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link Airport }
         *     
         * @see #getAirport()
         */
        public void setAirport(Airport value) {
            this.airport = value;
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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}Airport"/>
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
        "airport"
    })
    public static class FlightOrigin {

        /**
         * Airport identifier
         * 
         */
        @XmlElement(name = "Airport", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected Airport airport;

        /**
         * Airport identifier
         * 
         * @return
         *     possible object is
         *     {@link Airport }
         *     
         */
        public Airport getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link Airport }
         *     
         * @see #getAirport()
         */
        public void setAirport(Airport value) {
            this.airport = value;
        }

    }

}
