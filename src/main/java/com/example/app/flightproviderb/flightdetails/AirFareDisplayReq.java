
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareType" maxOccurs="5" minOccurs="0"/>
 *         <element name="PassengerType" type="{http://www.travelport.com/schema/common_v54_0}typePassengerType" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}IncludeAddlBookingCodeInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareBasis" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Carrier" maxOccurs="10" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ContractCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirFareDisplayModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirFareDisplayRuleKey" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="IncludeMileRouteInformation" type="{http://www.travelport.com/schema/air_v54_0}typeMileOrRouteBasedFare" />
 *       <attribute name="UnSaleableFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ChannelId">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="2"/>
 *             <maxLength value="4"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NSCC">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ReturnMM" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareType",
    "passengerType",
    "bookingCode",
    "includeAddlBookingCodeInfo",
    "fareBasis",
    "carrier",
    "accountCode",
    "contractCode",
    "airFareDisplayModifiers",
    "pointOfSale",
    "airFareDisplayRuleKey"
})
@XmlRootElement(name = "AirFareDisplayReq")
public class AirFareDisplayReq
    extends BaseReq
{

    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "FareType")
    protected List<FareType> fareType;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "PassengerType")
    protected List<TypePassengerType> passengerType;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "BookingCode")
    protected List<BookingCode> bookingCode;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "IncludeAddlBookingCodeInfo")
    protected IncludeAddlBookingCodeInfo includeAddlBookingCodeInfo;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "FareBasis")
    protected FareBasis fareBasis;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Carrier> carrier;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AccountCode> accountCode;
    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "ContractCode")
    protected ContractCode contractCode;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirFareDisplayModifiers")
    protected AirFareDisplayModifiers airFareDisplayModifiers;
    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PointOfSale> pointOfSale;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * Provider: 1G,1V,1P-Used to request Mile/Route Information in follow on (Mile, Route, Both)
     * 
     */
    @XmlAttribute(name = "IncludeMileRouteInformation")
    protected TypeMileOrRouteBasedFare includeMileRouteInformation;
    /**
     * Provider: 1G,1V,1P-Used to request unsaleable fares only also known as place of sale fares.
     * 
     */
    @XmlAttribute(name = "UnSaleableFaresOnly")
    protected Boolean unSaleableFaresOnly;
    /**
     * A Channel ID is 4 alpha-numeric characters used to activate the Search Control Console filter for a specific group of travelers being served by the agency credential.
     * 
     */
    @XmlAttribute(name = "ChannelId")
    protected String channelId;
    /**
     *  1 to 3 numeric that define a Search Control Console filter.This attribute is used to override that filter.
     * 
     */
    @XmlAttribute(name = "NSCC")
    protected String nscc;
    /**
     * If this attribute is set to true, Fare Control Manager processing will be invoked.
     * 
     */
    @XmlAttribute(name = "ReturnMM")
    protected Boolean returnMM;

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the fareType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareType property.
     */
    public List<FareType> getFareType() {
        if (fareType == null) {
            fareType = new ArrayList<>();
        }
        return this.fareType;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the passengerType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePassengerType }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerType property.
     */
    public List<TypePassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<>();
        }
        return this.passengerType;
    }

    /**
     * Provider: 1G,1V,1P.
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

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link IncludeAddlBookingCodeInfo }
     *     
     */
    public IncludeAddlBookingCodeInfo getIncludeAddlBookingCodeInfo() {
        return includeAddlBookingCodeInfo;
    }

    /**
     * Sets the value of the includeAddlBookingCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeAddlBookingCodeInfo }
     *     
     * @see #getIncludeAddlBookingCodeInfo()
     */
    public void setIncludeAddlBookingCodeInfo(IncludeAddlBookingCodeInfo value) {
        this.includeAddlBookingCodeInfo = value;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link FareBasis }
     *     
     */
    public FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasis }
     *     
     * @see #getFareBasis()
     */
    public void setFareBasis(FareBasis value) {
        this.fareBasis = value;
    }

    /**
     * Provider: 1G,1V,1P.
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

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the accountCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountCode property.
     */
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<>();
        }
        return this.accountCode;
    }

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link ContractCode }
     *     
     */
    public ContractCode getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCode }
     *     
     * @see #getContractCode()
     */
    public void setContractCode(ContractCode value) {
        this.contractCode = value;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayModifiers }
     *     
     */
    public AirFareDisplayModifiers getAirFareDisplayModifiers() {
        return airFareDisplayModifiers;
    }

    /**
     * Sets the value of the airFareDisplayModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayModifiers }
     *     
     * @see #getAirFareDisplayModifiers()
     */
    public void setAirFareDisplayModifiers(AirFareDisplayModifiers value) {
        this.airFareDisplayModifiers = value;
    }

    /**
     * Provider: 1G,1V.
     * 
     * Gets the value of the pointOfSale property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * </p>
     * 
     * 
     * @return
     *     The value of the pointOfSale property.
     */
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<>();
        }
        return this.pointOfSale;
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
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderCode()
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Provider: 1G,1V,1P-Used to request Mile/Route Information in follow on (Mile, Route, Both)
     * 
     * @return
     *     possible object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public TypeMileOrRouteBasedFare getIncludeMileRouteInformation() {
        return includeMileRouteInformation;
    }

    /**
     * Sets the value of the includeMileRouteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     * @see #getIncludeMileRouteInformation()
     */
    public void setIncludeMileRouteInformation(TypeMileOrRouteBasedFare value) {
        this.includeMileRouteInformation = value;
    }

    /**
     * Provider: 1G,1V,1P-Used to request unsaleable fares only also known as place of sale fares.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnSaleableFaresOnly() {
        return unSaleableFaresOnly;
    }

    /**
     * Sets the value of the unSaleableFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUnSaleableFaresOnly()
     */
    public void setUnSaleableFaresOnly(Boolean value) {
        this.unSaleableFaresOnly = value;
    }

    /**
     * A Channel ID is 4 alpha-numeric characters used to activate the Search Control Console filter for a specific group of travelers being served by the agency credential.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChannelId()
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     *  1 to 3 numeric that define a Search Control Console filter.This attribute is used to override that filter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNSCC()
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

    /**
     * If this attribute is set to true, Fare Control Manager processing will be invoked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnMM() {
        if (returnMM == null) {
            return false;
        } else {
            return returnMM;
        }
    }

    /**
     * Sets the value of the returnMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnMM()
     */
    public void setReturnMM(Boolean value) {
        this.returnMM = value;
    }

}
