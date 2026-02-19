
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
 *         <element name="DisfavoredProviders" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}Provider" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PreferredProviders" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}Provider" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DisfavoredCarriers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}Carrier" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PermittedCarriers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ProhibitedCarriers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PreferredCarriers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ProhibitedValidatingCarriers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PermittedCabins" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PreferredCabins" minOccurs="0"/>
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightType" minOccurs="0"/>
 *         <element name="MaxLayoverDuration" type="{http://www.travelport.com/schema/air_v54_0}MaxLayoverDurationType" minOccurs="0"/>
 *         <element name="NativeSearchModifier" type="{http://www.travelport.com/schema/air_v54_0}typeNativeSearchModifier" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="DistanceType" type="{http://www.travelport.com/schema/common_v54_0}typeDistance" default="MI" />
 *       <attribute name="IncludeFlightDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="AllowChangeOfAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MaxSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="SearchWeekends" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="IncludeExtraSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *       <attribute name="ExcludeOpenJawAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ExcludeGroundTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MaxJourneyTime" type="{http://www.travelport.com/schema/air_v54_0}typeMaxJourneyTime" />
 *       <attribute name="JetServiceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "disfavoredProviders",
    "preferredProviders",
    "disfavoredCarriers",
    "permittedCarriers",
    "prohibitedCarriers",
    "preferredCarriers",
    "prohibitedValidatingCarriers",
    "permittedCabins",
    "preferredCabins",
    "preferredAlliances",
    "disfavoredAlliances",
    "permittedBookingCodes",
    "preferredBookingCodes",
    "prohibitedBookingCodes",
    "flightType",
    "maxLayoverDuration",
    "nativeSearchModifier"
})
@XmlRootElement(name = "AirSearchModifiers")
public class AirSearchModifiers {

    @XmlElement(name = "DisfavoredProviders")
    protected AirSearchModifiers.DisfavoredProviders disfavoredProviders;
    @XmlElement(name = "PreferredProviders")
    protected AirSearchModifiers.PreferredProviders preferredProviders;
    @XmlElement(name = "DisfavoredCarriers")
    protected AirSearchModifiers.DisfavoredCarriers disfavoredCarriers;
    @XmlElement(name = "PermittedCarriers")
    protected PermittedCarriers permittedCarriers;
    @XmlElement(name = "ProhibitedCarriers")
    protected ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PreferredCarriers")
    protected PreferredCarriers preferredCarriers;
    @XmlElement(name = "ProhibitedValidatingCarriers")
    protected ProhibitedValidatingCarriers prohibitedValidatingCarriers;
    @XmlElement(name = "PermittedCabins")
    protected PermittedCabins permittedCabins;
    @XmlElement(name = "PreferredCabins")
    protected PreferredCabins preferredCabins;
    @XmlElement(name = "PreferredAlliances")
    protected AirSearchModifiers.PreferredAlliances preferredAlliances;
    @XmlElement(name = "DisfavoredAlliances")
    protected AirSearchModifiers.DisfavoredAlliances disfavoredAlliances;
    /**
     * This is the container to specify all permitted booking codes
     * 
     */
    @XmlElement(name = "PermittedBookingCodes")
    protected AirSearchModifiers.PermittedBookingCodes permittedBookingCodes;
    /**
     * This is the container to specify all preferred booking codes
     * 
     */
    @XmlElement(name = "PreferredBookingCodes")
    protected PreferredBookingCodes preferredBookingCodes;
    /**
     * This is the container to specify all prohibited booking codes
     * 
     */
    @XmlElement(name = "ProhibitedBookingCodes")
    protected AirSearchModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    /**
     * Modifier to request flight type options example non-stop only, non-stop and direct only, 
     *                 include single online connection etc.
     * 
     */
    @XmlElement(name = "FlightType")
    protected FlightType flightType;
    /**
     * This is the maximum duration the layover may have for each trip in the request. Supported providers 1P.
     * 
     */
    @XmlElement(name = "MaxLayoverDuration")
    protected MaxLayoverDurationType maxLayoverDuration;
    /**
     * Container for Native command modifiers. Providers supported : 1P
     * 
     */
    @XmlElement(name = "NativeSearchModifier")
    protected TypeNativeSearchModifier nativeSearchModifier;
    @XmlAttribute(name = "DistanceType")
    protected TypeDistance distanceType;
    @XmlAttribute(name = "IncludeFlightDetails")
    protected Boolean includeFlightDetails;
    @XmlAttribute(name = "AllowChangeOfAirport")
    protected Boolean allowChangeOfAirport;
    /**
     * If true, excludes connections if arrival time of first flight and departure time of second flight 
     *                    is on 2 different calendar days. When used in conjunction with MaxConnectionTime, it would exclude all connections if the 
     *                    connecting flights wait time exceeds the time specified in MaxConnectionTime.
     * 
     */
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    protected Boolean prohibitOvernightLayovers;
    /**
     * The maximum number of solutions to return.
     *                         Decreasing this number
     * 
     */
    @XmlAttribute(name = "MaxSolutions")
    protected BigInteger maxSolutions;
    /**
     * The maximum anount of time (in minutes) that a
     *                         solution can contain for connections between flights.
     * 
     */
    @XmlAttribute(name = "MaxConnectionTime")
    protected BigInteger maxConnectionTime;
    /**
     * A value of true indicates that search should be
     *                         expanded to include weekend combinations, if applicable.
     * 
     */
    @XmlAttribute(name = "SearchWeekends")
    protected Boolean searchWeekends;
    /**
     * If true, indicates that search should be made
     *                         for returning more solutions, if available. For example, for
     *                         certain providers, premium members may have the facility to get
     *                         more solutions. This attribute may have to be combined with other
     *                         applicable modifiers (like SearchWeekends) to return more results.
     * 
     */
    @XmlAttribute(name = "IncludeExtraSolutions")
    protected Boolean includeExtraSolutions;
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
     * Indicates whether to sort by Journey Time, Deparature Time or Arrival Time. Applicable to air availability only.
     * 
     */
    @XmlAttribute(name = "OrderBy")
    protected String orderBy;
    /**
     * This option ensures that travel into/out of each location will be into/out of the same airport of that location. Values are true or false. Default value is 'false'. If value is true then open jaws are exclude. If false the open jaws are included. The supported providers: 1P
     * 
     */
    @XmlAttribute(name = "ExcludeOpenJawAirport")
    protected Boolean excludeOpenJawAirport;
    /**
     * Indicates whether to allow the user to exclude ground transportation or not. Default value is 'false'. If value is true then ground transportations are excluded. If false then ground transportations are included. The supported providers: 1P
     * 
     */
    @XmlAttribute(name = "ExcludeGroundTransportation")
    protected Boolean excludeGroundTransportation;
    /**
     * Maximum Journey Time for all legs (in hours) 0-99. For LFS Supported Providers are 1G,1V,1P. For AirAvail Supported Providers are 1G,1V.
     * 
     */
    @XmlAttribute(name = "MaxJourneyTime")
    protected Integer maxJourneyTime;
    /**
     * Restricts results to Jet service flights only.
     * 
     */
    @XmlAttribute(name = "JetServiceOnly")
    protected Boolean jetServiceOnly;

    /**
     * Gets the value of the disfavoredProviders property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredProviders }
     *     
     */
    public AirSearchModifiers.DisfavoredProviders getDisfavoredProviders() {
        return disfavoredProviders;
    }

    /**
     * Sets the value of the disfavoredProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredProviders }
     *     
     */
    public void setDisfavoredProviders(AirSearchModifiers.DisfavoredProviders value) {
        this.disfavoredProviders = value;
    }

    /**
     * Gets the value of the preferredProviders property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredProviders }
     *     
     */
    public AirSearchModifiers.PreferredProviders getPreferredProviders() {
        return preferredProviders;
    }

    /**
     * Sets the value of the preferredProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredProviders }
     *     
     */
    public void setPreferredProviders(AirSearchModifiers.PreferredProviders value) {
        this.preferredProviders = value;
    }

    /**
     * Gets the value of the disfavoredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredCarriers }
     *     
     */
    public AirSearchModifiers.DisfavoredCarriers getDisfavoredCarriers() {
        return disfavoredCarriers;
    }

    /**
     * Sets the value of the disfavoredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredCarriers }
     *     
     */
    public void setDisfavoredCarriers(AirSearchModifiers.DisfavoredCarriers value) {
        this.disfavoredCarriers = value;
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
     * Gets the value of the prohibitedValidatingCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitedValidatingCarriers }
     *     
     */
    public ProhibitedValidatingCarriers getProhibitedValidatingCarriers() {
        return prohibitedValidatingCarriers;
    }

    /**
     * Sets the value of the prohibitedValidatingCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitedValidatingCarriers }
     *     
     */
    public void setProhibitedValidatingCarriers(ProhibitedValidatingCarriers value) {
        this.prohibitedValidatingCarriers = value;
    }

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
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredAlliances }
     *     
     */
    public AirSearchModifiers.PreferredAlliances getPreferredAlliances() {
        return preferredAlliances;
    }

    /**
     * Sets the value of the preferredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredAlliances }
     *     
     */
    public void setPreferredAlliances(AirSearchModifiers.PreferredAlliances value) {
        this.preferredAlliances = value;
    }

    /**
     * Gets the value of the disfavoredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredAlliances }
     *     
     */
    public AirSearchModifiers.DisfavoredAlliances getDisfavoredAlliances() {
        return disfavoredAlliances;
    }

    /**
     * Sets the value of the disfavoredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredAlliances }
     *     
     */
    public void setDisfavoredAlliances(AirSearchModifiers.DisfavoredAlliances value) {
        this.disfavoredAlliances = value;
    }

    /**
     * This is the container to specify all permitted booking codes
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PermittedBookingCodes }
     *     
     */
    public AirSearchModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PermittedBookingCodes }
     *     
     * @see #getPermittedBookingCodes()
     */
    public void setPermittedBookingCodes(AirSearchModifiers.PermittedBookingCodes value) {
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
     * This is the container to specify all prohibited booking codes
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.ProhibitedBookingCodes }
     *     
     */
    public AirSearchModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.ProhibitedBookingCodes }
     *     
     * @see #getProhibitedBookingCodes()
     */
    public void setProhibitedBookingCodes(AirSearchModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
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
     * This is the maximum duration the layover may have for each trip in the request. Supported providers 1P.
     * 
     * @return
     *     possible object is
     *     {@link MaxLayoverDurationType }
     *     
     */
    public MaxLayoverDurationType getMaxLayoverDuration() {
        return maxLayoverDuration;
    }

    /**
     * Sets the value of the maxLayoverDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxLayoverDurationType }
     *     
     * @see #getMaxLayoverDuration()
     */
    public void setMaxLayoverDuration(MaxLayoverDurationType value) {
        this.maxLayoverDuration = value;
    }

    /**
     * Container for Native command modifiers. Providers supported : 1P
     * 
     * @return
     *     possible object is
     *     {@link TypeNativeSearchModifier }
     *     
     */
    public TypeNativeSearchModifier getNativeSearchModifier() {
        return nativeSearchModifier;
    }

    /**
     * Sets the value of the nativeSearchModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNativeSearchModifier }
     *     
     * @see #getNativeSearchModifier()
     */
    public void setNativeSearchModifier(TypeNativeSearchModifier value) {
        this.nativeSearchModifier = value;
    }

    /**
     * Gets the value of the distanceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getDistanceType() {
        if (distanceType == null) {
            return TypeDistance.MI;
        } else {
            return distanceType;
        }
    }

    /**
     * Sets the value of the distanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setDistanceType(TypeDistance value) {
        this.distanceType = value;
    }

    /**
     * Gets the value of the includeFlightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeFlightDetails() {
        if (includeFlightDetails == null) {
            return true;
        } else {
            return includeFlightDetails;
        }
    }

    /**
     * Sets the value of the includeFlightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFlightDetails(Boolean value) {
        this.includeFlightDetails = value;
    }

    /**
     * Gets the value of the allowChangeOfAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowChangeOfAirport() {
        if (allowChangeOfAirport == null) {
            return true;
        } else {
            return allowChangeOfAirport;
        }
    }

    /**
     * Sets the value of the allowChangeOfAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowChangeOfAirport(Boolean value) {
        this.allowChangeOfAirport = value;
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
     * The maximum number of solutions to return.
     *                         Decreasing this number
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSolutions() {
        return maxSolutions;
    }

    /**
     * Sets the value of the maxSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxSolutions()
     */
    public void setMaxSolutions(BigInteger value) {
        this.maxSolutions = value;
    }

    /**
     * The maximum anount of time (in minutes) that a
     *                         solution can contain for connections between flights.
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
     * @see #getMaxConnectionTime()
     */
    public void setMaxConnectionTime(BigInteger value) {
        this.maxConnectionTime = value;
    }

    /**
     * A value of true indicates that search should be
     *                         expanded to include weekend combinations, if applicable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchWeekends() {
        return searchWeekends;
    }

    /**
     * Sets the value of the searchWeekends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSearchWeekends()
     */
    public void setSearchWeekends(Boolean value) {
        this.searchWeekends = value;
    }

    /**
     * If true, indicates that search should be made
     *                         for returning more solutions, if available. For example, for
     *                         certain providers, premium members may have the facility to get
     *                         more solutions. This attribute may have to be combined with other
     *                         applicable modifiers (like SearchWeekends) to return more results.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExtraSolutions() {
        return includeExtraSolutions;
    }

    /**
     * Sets the value of the includeExtraSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeExtraSolutions()
     */
    public void setIncludeExtraSolutions(Boolean value) {
        this.includeExtraSolutions = value;
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
     * Indicates whether to sort by Journey Time, Deparature Time or Arrival Time. Applicable to air availability only.
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
     * This option ensures that travel into/out of each location will be into/out of the same airport of that location. Values are true or false. Default value is 'false'. If value is true then open jaws are exclude. If false the open jaws are included. The supported providers: 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeOpenJawAirport() {
        if (excludeOpenJawAirport == null) {
            return false;
        } else {
            return excludeOpenJawAirport;
        }
    }

    /**
     * Sets the value of the excludeOpenJawAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeOpenJawAirport()
     */
    public void setExcludeOpenJawAirport(Boolean value) {
        this.excludeOpenJawAirport = value;
    }

    /**
     * Indicates whether to allow the user to exclude ground transportation or not. Default value is 'false'. If value is true then ground transportations are excluded. If false then ground transportations are included. The supported providers: 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeGroundTransportation() {
        if (excludeGroundTransportation == null) {
            return false;
        } else {
            return excludeGroundTransportation;
        }
    }

    /**
     * Sets the value of the excludeGroundTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeGroundTransportation()
     */
    public void setExcludeGroundTransportation(Boolean value) {
        this.excludeGroundTransportation = value;
    }

    /**
     * Maximum Journey Time for all legs (in hours) 0-99. For LFS Supported Providers are 1G,1V,1P. For AirAvail Supported Providers are 1G,1V.
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
     * Restricts results to Jet service flights only.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJetServiceOnly() {
        return jetServiceOnly;
    }

    /**
     * Sets the value of the jetServiceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isJetServiceOnly()
     */
    public void setJetServiceOnly(Boolean value) {
        this.jetServiceOnly = value;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}Carrier" maxOccurs="999"/>
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
        "carrier"
    })
    public static class DisfavoredCarriers {

        /**
         * Carrier identifier
         * 
         */
        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<Carrier> carrier;

        /**
         * Carrier identifier
         * 
         * Gets the value of the carrier property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carrier }
         * </p>
         * 
         * 
         * @return
         *     The value of the carrier property.
         */
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<>();
            }
            return this.carrier;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}Provider" maxOccurs="999"/>
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
        "provider"
    })
    public static class DisfavoredProviders {

        /**
         * Provider identifier
         * 
         */
        @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<Provider> provider;

        /**
         * Provider identifier
         * 
         * Gets the value of the provider property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provider property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * </p>
         * 
         * 
         * @return
         *     The value of the provider property.
         */
        public List<Provider> getProvider() {
            if (provider == null) {
                provider = new ArrayList<>();
            }
            return this.provider;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}Provider" maxOccurs="999"/>
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
        "provider"
    })
    public static class PreferredProviders {

        /**
         * Provider identifier
         * 
         */
        @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<Provider> provider;

        /**
         * Provider identifier
         * 
         * Gets the value of the provider property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provider property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * </p>
         * 
         * 
         * @return
         *     The value of the provider property.
         */
        public List<Provider> getProvider() {
            if (provider == null) {
                provider = new ArrayList<>();
            }
            return this.provider;
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

}
