
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PermittedCabins" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PreferredCabins" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PermittedCarriers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ProhibitedCarriers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PreferredCarriers" minOccurs="0"/>
 *         <element name="PermittedConnectionPoints" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ProhibitedConnectionPoints" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PreferredConnectionPoints" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="99"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PermittedBookingCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PreferredBookingCodes" minOccurs="0"/>
 *         <element name="PreferredAlliances" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}Alliance" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ProhibitedBookingCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DisfavoredAlliances" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}Alliance" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightType" minOccurs="0"/>
 *         <element name="AnchorFlightData" type="{http://www.travelport.com/schema/air_v54_0}typeAnchorFlightData" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="ReturnFirstAvailableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AllowDirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitMultiAirportConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PreferNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="OrderBy">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="JourneyTime"/>
 *             <enumeration value="DepartureTime"/>
 *             <enumeration value="ArrivalTime"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MaxJourneyTime" type="{http://www.travelport.com/schema/air_v54_0}typeMaxJourneyTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedCabins",
    "preferredCabins",
    "permittedCarriers",
    "prohibitedCarriers",
    "preferredCarriers",
    "permittedConnectionPoints",
    "prohibitedConnectionPoints",
    "preferredConnectionPoints",
    "permittedBookingCodes",
    "preferredBookingCodes",
    "preferredAlliances",
    "prohibitedBookingCodes",
    "disfavoredAlliances",
    "flightType",
    "anchorFlightData"
})
@XmlRootElement(name = "AirLegModifiers")
public class AirLegModifiers {

    @XmlElement(name = "PermittedCabins")
    protected PermittedCabins permittedCabins;
    @XmlElement(name = "PreferredCabins")
    protected PreferredCabins preferredCabins;
    @XmlElement(name = "PermittedCarriers")
    protected PermittedCarriers permittedCarriers;
    @XmlElement(name = "ProhibitedCarriers")
    protected ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PreferredCarriers")
    protected PreferredCarriers preferredCarriers;
    /**
     * This is the container to specify all permitted connection points. Applicable for 1G/1V/1P.
     * 
     */
    @XmlElement(name = "PermittedConnectionPoints")
    protected AirLegModifiers.PermittedConnectionPoints permittedConnectionPoints;
    /**
     * This is the container to specify all prohibited connection points. Applicable for 1G/1V/1P.
     * 
     */
    @XmlElement(name = "ProhibitedConnectionPoints")
    protected AirLegModifiers.ProhibitedConnectionPoints prohibitedConnectionPoints;
    /**
     * This is the container to specify all preferred connection points. Applicable for 1G/1V only.
     * 
     */
    @XmlElement(name = "PreferredConnectionPoints")
    protected AirLegModifiers.PreferredConnectionPoints preferredConnectionPoints;
    /**
     * This is the container to specify all permitted booking codes
     * 
     */
    @XmlElement(name = "PermittedBookingCodes")
    protected AirLegModifiers.PermittedBookingCodes permittedBookingCodes;
    /**
     * This is the container to specify all preferred booking codes
     * 
     */
    @XmlElement(name = "PreferredBookingCodes")
    protected PreferredBookingCodes preferredBookingCodes;
    @XmlElement(name = "PreferredAlliances")
    protected AirLegModifiers.PreferredAlliances preferredAlliances;
    /**
     * This is the container to specify all prohibited booking codes
     * 
     */
    @XmlElement(name = "ProhibitedBookingCodes")
    protected AirLegModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "DisfavoredAlliances")
    protected AirLegModifiers.DisfavoredAlliances disfavoredAlliances;
    /**
     * Modifier to request flight type options example non-stop only, non-stop and direct only, 
     *                 include single online connection etc.
     * 
     */
    @XmlElement(name = "FlightType")
    protected FlightType flightType;
    @XmlElement(name = "AnchorFlightData")
    protected TypeAnchorFlightData anchorFlightData;
    /**
     * If true, excludes connections if arrival time of first flight and departure time of second flight 
     *                    is on 2 different calendar days. When used in conjunction with MaxConnectionTime, it would exclude all connections if the 
     *                    connecting flights wait time exceeds the time specified in MaxConnectionTime.
     * 
     */
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    protected Boolean prohibitOvernightLayovers;
    @XmlAttribute(name = "MaxConnectionTime")
    protected BigInteger maxConnectionTime;
    /**
     * If it is true then it will search for first
     *                         available for the booking code designated or any booking code in
     *                         same cabin.
     * 
     */
    @XmlAttribute(name = "ReturnFirstAvailableOnly")
    protected Boolean returnFirstAvailableOnly;
    /**
     * If it is true request will be sent directly to the carrier.
     * 
     */
    @XmlAttribute(name = "AllowDirectAccess")
    protected Boolean allowDirectAccess;
    /**
     * Indicates whether to restrict multi-airport connections
     * 
     */
    @XmlAttribute(name = "ProhibitMultiAirportConnection")
    protected Boolean prohibitMultiAirportConnection;
    /**
     * When non-stops are preferred, the distribution of search results should skew heavily toward non-stop flights while still returning 
     *                   some one stop flights for comparison and price competitiveness. The search request will ‘boost' the preference towards non-stops. If true then Non Stop 
     *                   flights will be preferred.
     * 
     */
    @XmlAttribute(name = "PreferNonStop")
    protected Boolean preferNonStop;
    /**
     * Indicates whether to sort by Journey Time, Deparature Time or Arrival Time
     * 
     */
    @XmlAttribute(name = "OrderBy")
    protected String orderBy;
    /**
     * Maximum Journey Time for this leg (in hours) 0-99. Supported Providers 1G,1V.
     * 
     */
    @XmlAttribute(name = "MaxJourneyTime")
    protected Integer maxJourneyTime;

    /**
     * Gets the value of the permittedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedCabins }
     *     
     */
    public PermittedCabins getPermittedCabins() {
        return permittedCabins;
    }

    /**
     * Sets the value of the permittedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedCabins }
     *     
     */
    public void setPermittedCabins(PermittedCabins value) {
        this.permittedCabins = value;
    }

    /**
     * Gets the value of the preferredCabins property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCabins }
     *     
     */
    public PreferredCabins getPreferredCabins() {
        return preferredCabins;
    }

    /**
     * Sets the value of the preferredCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCabins }
     *     
     */
    public void setPreferredCabins(PreferredCabins value) {
        this.preferredCabins = value;
    }

    /**
     * Gets the value of the permittedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedCarriers }
     *     
     */
    public PermittedCarriers getPermittedCarriers() {
        return permittedCarriers;
    }

    /**
     * Sets the value of the permittedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedCarriers }
     *     
     */
    public void setPermittedCarriers(PermittedCarriers value) {
        this.permittedCarriers = value;
    }

    /**
     * Gets the value of the prohibitedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitedCarriers }
     *     
     */
    public ProhibitedCarriers getProhibitedCarriers() {
        return prohibitedCarriers;
    }

    /**
     * Sets the value of the prohibitedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitedCarriers }
     *     
     */
    public void setProhibitedCarriers(ProhibitedCarriers value) {
        this.prohibitedCarriers = value;
    }

    /**
     * Gets the value of the preferredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCarriers }
     *     
     */
    public PreferredCarriers getPreferredCarriers() {
        return preferredCarriers;
    }

    /**
     * Sets the value of the preferredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCarriers }
     *     
     */
    public void setPreferredCarriers(PreferredCarriers value) {
        this.preferredCarriers = value;
    }

    /**
     * This is the container to specify all permitted connection points. Applicable for 1G/1V/1P.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     */
    public AirLegModifiers.PermittedConnectionPoints getPermittedConnectionPoints() {
        return permittedConnectionPoints;
    }

    /**
     * Sets the value of the permittedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     * @see #getPermittedConnectionPoints()
     */
    public void setPermittedConnectionPoints(AirLegModifiers.PermittedConnectionPoints value) {
        this.permittedConnectionPoints = value;
    }

    /**
     * This is the container to specify all prohibited connection points. Applicable for 1G/1V/1P.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public AirLegModifiers.ProhibitedConnectionPoints getProhibitedConnectionPoints() {
        return prohibitedConnectionPoints;
    }

    /**
     * Sets the value of the prohibitedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedConnectionPoints }
     *     
     * @see #getProhibitedConnectionPoints()
     */
    public void setProhibitedConnectionPoints(AirLegModifiers.ProhibitedConnectionPoints value) {
        this.prohibitedConnectionPoints = value;
    }

    /**
     * This is the container to specify all preferred connection points. Applicable for 1G/1V only.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredConnectionPoints }
     *     
     */
    public AirLegModifiers.PreferredConnectionPoints getPreferredConnectionPoints() {
        return preferredConnectionPoints;
    }

    /**
     * Sets the value of the preferredConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredConnectionPoints }
     *     
     * @see #getPreferredConnectionPoints()
     */
    public void setPreferredConnectionPoints(AirLegModifiers.PreferredConnectionPoints value) {
        this.preferredConnectionPoints = value;
    }

    /**
     * This is the container to specify all permitted booking codes
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedBookingCodes }
     *     
     */
    public AirLegModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedBookingCodes }
     *     
     * @see #getPermittedBookingCodes()
     */
    public void setPermittedBookingCodes(AirLegModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * This is the container to specify all preferred booking codes
     * 
     * @return
     *     possible object is
     *     {@link PreferredBookingCodes }
     *     
     */
    public PreferredBookingCodes getPreferredBookingCodes() {
        return preferredBookingCodes;
    }

    /**
     * Sets the value of the preferredBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredBookingCodes }
     *     
     * @see #getPreferredBookingCodes()
     */
    public void setPreferredBookingCodes(PreferredBookingCodes value) {
        this.preferredBookingCodes = value;
    }

    /**
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    public AirLegModifiers.PreferredAlliances getPreferredAlliances() {
        return preferredAlliances;
    }

    /**
     * Sets the value of the preferredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    public void setPreferredAlliances(AirLegModifiers.PreferredAlliances value) {
        this.preferredAlliances = value;
    }

    /**
     * This is the container to specify all prohibited booking codes
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedBookingCodes }
     *     
     */
    public AirLegModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedBookingCodes }
     *     
     * @see #getProhibitedBookingCodes()
     */
    public void setProhibitedBookingCodes(AirLegModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
    }

    /**
     * Gets the value of the disfavoredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.DisfavoredAlliances }
     *     
     */
    public AirLegModifiers.DisfavoredAlliances getDisfavoredAlliances() {
        return disfavoredAlliances;
    }

    /**
     * Sets the value of the disfavoredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.DisfavoredAlliances }
     *     
     */
    public void setDisfavoredAlliances(AirLegModifiers.DisfavoredAlliances value) {
        this.disfavoredAlliances = value;
    }

    /**
     * Modifier to request flight type options example non-stop only, non-stop and direct only, 
     *                 include single online connection etc.
     * 
     * @return
     *     possible object is
     *     {@link FlightType }
     *     
     */
    public FlightType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType }
     *     
     * @see #getFlightType()
     */
    public void setFlightType(FlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the anchorFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAnchorFlightData }
     *     
     */
    public TypeAnchorFlightData getAnchorFlightData() {
        return anchorFlightData;
    }

    /**
     * Sets the value of the anchorFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAnchorFlightData }
     *     
     */
    public void setAnchorFlightData(TypeAnchorFlightData value) {
        this.anchorFlightData = value;
    }

    /**
     * If true, excludes connections if arrival time of first flight and departure time of second flight 
     *                    is on 2 different calendar days. When used in conjunction with MaxConnectionTime, it would exclude all connections if the 
     *                    connecting flights wait time exceeds the time specified in MaxConnectionTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitOvernightLayovers() {
        if (prohibitOvernightLayovers == null) {
            return false;
        } else {
            return prohibitOvernightLayovers;
        }
    }

    /**
     * Sets the value of the prohibitOvernightLayovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProhibitOvernightLayovers()
     */
    public void setProhibitOvernightLayovers(Boolean value) {
        this.prohibitOvernightLayovers = value;
    }

    /**
     * Gets the value of the maxConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnectionTime() {
        return maxConnectionTime;
    }

    /**
     * Sets the value of the maxConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnectionTime(BigInteger value) {
        this.maxConnectionTime = value;
    }

    /**
     * If it is true then it will search for first
     *                         available for the booking code designated or any booking code in
     *                         same cabin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnFirstAvailableOnly() {
        return returnFirstAvailableOnly;
    }

    /**
     * Sets the value of the returnFirstAvailableOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnFirstAvailableOnly()
     */
    public void setReturnFirstAvailableOnly(Boolean value) {
        this.returnFirstAvailableOnly = value;
    }

    /**
     * If it is true request will be sent directly to the carrier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowDirectAccess() {
        if (allowDirectAccess == null) {
            return false;
        } else {
            return allowDirectAccess;
        }
    }

    /**
     * Sets the value of the allowDirectAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllowDirectAccess()
     */
    public void setAllowDirectAccess(Boolean value) {
        this.allowDirectAccess = value;
    }

    /**
     * Indicates whether to restrict multi-airport connections
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProhibitMultiAirportConnection() {
        return prohibitMultiAirportConnection;
    }

    /**
     * Sets the value of the prohibitMultiAirportConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProhibitMultiAirportConnection()
     */
    public void setProhibitMultiAirportConnection(Boolean value) {
        this.prohibitMultiAirportConnection = value;
    }

    /**
     * When non-stops are preferred, the distribution of search results should skew heavily toward non-stop flights while still returning 
     *                   some one stop flights for comparison and price competitiveness. The search request will ‘boost' the preference towards non-stops. If true then Non Stop 
     *                   flights will be preferred.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferNonStop() {
        if (preferNonStop == null) {
            return false;
        } else {
            return preferNonStop;
        }
    }

    /**
     * Sets the value of the preferNonStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPreferNonStop()
     */
    public void setPreferNonStop(Boolean value) {
        this.preferNonStop = value;
    }

    /**
     * Indicates whether to sort by Journey Time, Deparature Time or Arrival Time
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderBy()
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Maximum Journey Time for this leg (in hours) 0-99. Supported Providers 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxJourneyTime() {
        return maxJourneyTime;
    }

    /**
     * Sets the value of the maxJourneyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxJourneyTime()
     */
    public void setMaxJourneyTime(Integer value) {
        this.maxJourneyTime = value;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}Alliance" maxOccurs="999"/>
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
        "alliance"
    })
    public static class DisfavoredAlliances {

        /**
         * Alliance Code
         * 
         */
        @XmlElement(name = "Alliance", required = true)
        protected List<Alliance> alliance;

        /**
         * Alliance Code
         * 
         * Gets the value of the alliance property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * </p>
         * 
         * 
         * @return
         *     The value of the alliance property.
         */
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<>();
            }
            return this.alliance;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999"/>
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
        "bookingCode"
    })
    public static class PermittedBookingCodes {

        /**
         * The Booking Code (Class of Service) for a
         *                 segment
         * 
         */
        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * The Booking Code (Class of Service) for a
         *                 segment
         * 
         * Gets the value of the bookingCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * </p>
         * 
         * 
         * @return
         *     The value of the bookingCode property.
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<>();
            }
            return this.bookingCode;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
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
        "connectionPoint"
    })
    public static class PermittedConnectionPoints {

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         */
        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         * Gets the value of the connectionPoint property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * </p>
         * 
         * 
         * @return
         *     The value of the connectionPoint property.
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<>();
            }
            return this.connectionPoint;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}Alliance" maxOccurs="999"/>
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
        "alliance"
    })
    public static class PreferredAlliances {

        /**
         * Alliance Code
         * 
         */
        @XmlElement(name = "Alliance", required = true)
        protected List<Alliance> alliance;

        /**
         * Alliance Code
         * 
         * Gets the value of the alliance property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * </p>
         * 
         * 
         * @return
         *     The value of the alliance property.
         */
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<>();
            }
            return this.alliance;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="99"/>
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
        "connectionPoint"
    })
    public static class PreferredConnectionPoints {

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         */
        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         * Gets the value of the connectionPoint property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * </p>
         * 
         * 
         * @return
         *     The value of the connectionPoint property.
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<>();
            }
            return this.connectionPoint;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999"/>
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
        "bookingCode"
    })
    public static class ProhibitedBookingCodes {

        /**
         * The Booking Code (Class of Service) for a
         *                 segment
         * 
         */
        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * The Booking Code (Class of Service) for a
         *                 segment
         * 
         * Gets the value of the bookingCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * </p>
         * 
         * 
         * @return
         *     The value of the bookingCode property.
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<>();
            }
            return this.bookingCode;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
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
        "connectionPoint"
    })
    public static class ProhibitedConnectionPoints {

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         */
        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         * Gets the value of the connectionPoint property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * </p>
         * 
         * 
         * @return
         *     The value of the connectionPoint property.
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<>();
            }
            return this.connectionPoint;
        }

    }

}
