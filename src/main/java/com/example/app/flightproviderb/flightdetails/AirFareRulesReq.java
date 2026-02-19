
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <choice>
 *           <element name="AirReservationSelector">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://www.travelport.com/schema/air_v54_0}FareInfoRef" maxOccurs="999" minOccurs="0"/>
 *                   </sequence>
 *                   <attribute name="AirReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleLookup" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleKey" maxOccurs="999"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}AirFareDisplayRuleKey"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirFareRulesModifier" minOccurs="0"/>
 *         <element name="FareRulesFilterCategory" maxOccurs="16" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="35"/>
 *                 </sequence>
 *                 <attribute name="FareInfoRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="TicketDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v54_0}typeFareRuleType" default="long" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationSelector",
    "fareRuleLookup",
    "fareRuleKey",
    "airFareDisplayRuleKey",
    "airFareRulesModifier",
    "fareRulesFilterCategory"
})
@XmlRootElement(name = "AirFareRulesReq")
public class AirFareRulesReq
    extends BaseReq
{

    /**
     * Provider: 1G,1V,1P,ACH-Parameters to use for a fare rule lookup associated with an Air Reservation Locator Code
     * 
     */
    @XmlElement(name = "AirReservationSelector")
    protected AirFareRulesReq.AirReservationSelector airReservationSelector;
    /**
     * Used to look up fare rules based on the origin, destination, and carrier of the air segment, the fare basis code and the provider code.  Providers: 1P.
     * 
     */
    @XmlElement(name = "FareRuleLookup")
    protected FareRuleLookup fareRuleLookup;
    /**
     * Used to look up fare rules based on a fare rule key. Providers: 1G, 1V, 1P, ACH.
     * 
     */
    @XmlElement(name = "FareRuleKey")
    protected List<FareRuleKey> fareRuleKey;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "AirFareRulesModifier")
    protected AirFareRulesModifier airFareRulesModifier;
    /**
     * Structured Fare Rules Filter if requested will return rules for requested categories in the response. Applicable for providers 1G, 1V.
     * 
     */
    @XmlElement(name = "FareRulesFilterCategory")
    protected List<AirFareRulesReq.FareRulesFilterCategory> fareRulesFilterCategory;
    /**
     * YYYY-MM-DD Using a date in the past is a request for an historical fare
     * 
     */
    @XmlAttribute(name = "TicketDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketDate;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;

    /**
     * Provider: 1G,1V,1P,ACH-Parameters to use for a fare rule lookup associated with an Air Reservation Locator Code
     * 
     * @return
     *     possible object is
     *     {@link AirFareRulesReq.AirReservationSelector }
     *     
     */
    public AirFareRulesReq.AirReservationSelector getAirReservationSelector() {
        return airReservationSelector;
    }

    /**
     * Sets the value of the airReservationSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareRulesReq.AirReservationSelector }
     *     
     * @see #getAirReservationSelector()
     */
    public void setAirReservationSelector(AirFareRulesReq.AirReservationSelector value) {
        this.airReservationSelector = value;
    }

    /**
     * Used to look up fare rules based on the origin, destination, and carrier of the air segment, the fare basis code and the provider code.  Providers: 1P.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleLookup }
     *     
     */
    public FareRuleLookup getFareRuleLookup() {
        return fareRuleLookup;
    }

    /**
     * Sets the value of the fareRuleLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleLookup }
     *     
     * @see #getFareRuleLookup()
     */
    public void setFareRuleLookup(FareRuleLookup value) {
        this.fareRuleLookup = value;
    }

    /**
     * Used to look up fare rules based on a fare rule key. Providers: 1G, 1V, 1P, ACH.
     * 
     * Gets the value of the fareRuleKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRuleKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleKey }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRuleKey property.
     */
    public List<FareRuleKey> getFareRuleKey() {
        if (fareRuleKey == null) {
            fareRuleKey = new ArrayList<>();
        }
        return this.fareRuleKey;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     * @see #getAirFareDisplayRuleKey()
     */
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link AirFareRulesModifier }
     *     
     */
    public AirFareRulesModifier getAirFareRulesModifier() {
        return airFareRulesModifier;
    }

    /**
     * Sets the value of the airFareRulesModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareRulesModifier }
     *     
     * @see #getAirFareRulesModifier()
     */
    public void setAirFareRulesModifier(AirFareRulesModifier value) {
        this.airFareRulesModifier = value;
    }

    /**
     * Structured Fare Rules Filter if requested will return rules for requested categories in the response. Applicable for providers 1G, 1V.
     * 
     * Gets the value of the fareRulesFilterCategory property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRulesFilterCategory property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRulesFilterCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirFareRulesReq.FareRulesFilterCategory }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRulesFilterCategory property.
     */
    public List<AirFareRulesReq.FareRulesFilterCategory> getFareRulesFilterCategory() {
        if (fareRulesFilterCategory == null) {
            fareRulesFilterCategory = new ArrayList<>();
        }
        return this.fareRulesFilterCategory;
    }

    /**
     * YYYY-MM-DD Using a date in the past is a request for an historical fare
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketDate() {
        return ticketDate;
    }

    /**
     * Sets the value of the ticketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTicketDate()
     */
    public void setTicketDate(XMLGregorianCalendar value) {
        this.ticketDate = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRuleType }
     *     
     */
    public TypeFareRuleType getFareRuleType() {
        if (fareRuleType == null) {
            return TypeFareRuleType.LONG;
        } else {
            return fareRuleType;
        }
    }

    /**
     * Sets the value of the fareRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRuleType }
     *     
     * @see #getFareRuleType()
     */
    public void setFareRuleType(TypeFareRuleType value) {
        this.fareRuleType = value;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareInfoRef" maxOccurs="999" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="AirReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareInfoRef"
    })
    public static class AirReservationSelector {

        /**
         * Reference to a complete FareInfo from a
         *                 shared list
         * 
         */
        @XmlElement(name = "FareInfoRef")
        protected List<FareInfoRef> fareInfoRef;
        /**
         * The Air Reservation locator code which is an unique identifier for the reservation
         * 
         */
        @XmlAttribute(name = "AirReservationLocatorCode", required = true)
        protected String airReservationLocatorCode;

        /**
         * Reference to a complete FareInfo from a
         *                 shared list
         * 
         * Gets the value of the fareInfoRef property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfoRef property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFareInfoRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfoRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the fareInfoRef property.
         */
        public List<FareInfoRef> getFareInfoRef() {
            if (fareInfoRef == null) {
                fareInfoRef = new ArrayList<>();
            }
            return this.fareInfoRef;
        }

        /**
         * The Air Reservation locator code which is an unique identifier for the reservation
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirReservationLocatorCode() {
            return airReservationLocatorCode;
        }

        /**
         * Sets the value of the airReservationLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAirReservationLocatorCode()
         */
        public void setAirReservationLocatorCode(String value) {
            this.airReservationLocatorCode = value;
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
     *         <element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="35"/>
     *       </sequence>
     *       <attribute name="FareInfoRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "categoryCode"
    })
    public static class FareRulesFilterCategory {

        /**
         * Structured Fare Rules can be requested for "ADV", "MIN", "MAX",  "STP", and "CHG".
         * 
         */
        @XmlElement(name = "CategoryCode", required = true)
        protected List<Object> categoryCode;
        /**
         * Key reference for multiple fare rule
         * 
         */
        @XmlAttribute(name = "FareInfoRef")
        protected String fareInfoRef;

        /**
         * Structured Fare Rules can be requested for "ADV", "MIN", "MAX",  "STP", and "CHG".
         * 
         * Gets the value of the categoryCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCategoryCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * </p>
         * 
         * 
         * @return
         *     The value of the categoryCode property.
         */
        public List<Object> getCategoryCode() {
            if (categoryCode == null) {
                categoryCode = new ArrayList<>();
            }
            return this.categoryCode;
        }

        /**
         * Key reference for multiple fare rule
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareInfoRef() {
            return fareInfoRef;
        }

        /**
         * Sets the value of the fareInfoRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFareInfoRef()
         */
        public void setFareInfoRef(String value) {
            this.fareInfoRef = value;
        }

    }

}
