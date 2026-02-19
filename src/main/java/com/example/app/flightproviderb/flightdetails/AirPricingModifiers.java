
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
 *         <element name="ProhibitedRuleCategories" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleCategory" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AccountCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PermittedCabins" minOccurs="0"/>
 *         <element name="ContractCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}ContractCode" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExemptTaxes" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PenaltyFareInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}DiscountCard" maxOccurs="9" minOccurs="0"/>
 *         <element name="PromoCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}PromoCode" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ManualFareAdjustment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BrandModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}MultiGDSSearchIndicator" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PreferredCabins" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProhibitMinStayFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitMaxStayFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="CurrencyType" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *       <attribute name="ProhibitAdvancePurchaseFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitNonRefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitRestrictedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="FaresIndicator" type="{http://www.travelport.com/schema/air_v54_0}typeFaresIndicator" />
 *       <attribute name="FiledCurrency" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="OverrideCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v54_0}typeEticketability" />
 *       <attribute name="AccountCodeFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProhibitNonExchangeableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ForceSegmentSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="InventoryRequestType" type="{http://www.travelport.com/schema/air_v54_0}typeInventoryRequest" />
 *       <attribute name="OneWayShop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitUnbundledFareTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ReturnServices" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ChannelId">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="2"/>
 *             <maxLength value="4"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ReturnFareAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="SellCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ReturnFailedSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="SellCity" type="{http://www.travelport.com/schema/common_v54_0}typeCity" />
 *       <attribute name="TicketingCity" type="{http://www.travelport.com/schema/common_v54_0}typeCity" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prohibitedRuleCategories",
    "accountCodes",
    "permittedCabins",
    "contractCodes",
    "exemptTaxes",
    "penaltyFareInformation",
    "discountCard",
    "promoCodes",
    "manualFareAdjustment",
    "pointOfSale",
    "brandModifiers",
    "multiGDSSearchIndicator",
    "preferredCabins"
})
@XmlRootElement(name = "AirPricingModifiers")
public class AirPricingModifiers {

    @XmlElement(name = "ProhibitedRuleCategories")
    protected AirPricingModifiers.ProhibitedRuleCategories prohibitedRuleCategories;
    @XmlElement(name = "AccountCodes")
    protected AirPricingModifiers.AccountCodes accountCodes;
    @XmlElement(name = "PermittedCabins")
    protected PermittedCabins permittedCabins;
    @XmlElement(name = "ContractCodes")
    protected AirPricingModifiers.ContractCodes contractCodes;
    /**
     * Request tax exemption for specific tax
     *                 category and/or all taxes of a specific country
     * 
     */
    @XmlElement(name = "ExemptTaxes")
    protected ExemptTaxes exemptTaxes;
    /**
     * Request Fares with specific Penalty
     *                             Information.
     * 
     */
    @XmlElement(name = "PenaltyFareInformation")
    protected PenaltyFareInformation penaltyFareInformation;
    /**
     * Discount request for rail.
     * 
     */
    @XmlElement(name = "DiscountCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<DiscountCard> discountCard;
    @XmlElement(name = "PromoCodes")
    protected AirPricingModifiers.PromoCodes promoCodes;
    /**
     * Represents increment/discount applied manually by agent.
     * 
     */
    @XmlElement(name = "ManualFareAdjustment")
    protected List<ManualFareAdjustment> manualFareAdjustment;
    /**
     * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at stored fare level. As multiple UAPI AirPricingInfos (all having same AirPricingInfoGroup) can converge to a single stored fare, UAPI will map PoinOfSale information from the first available one from each group
     * 
     */
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PointOfSale pointOfSale;
    /**
     * Used to specify the level of branding requested.
     * 
     */
    @XmlElement(name = "BrandModifiers")
    protected BrandModifiers brandModifiers;
    /**
     * Indicates whether public fares and/or private fares should be returned.
     * 
     */
    @XmlElement(name = "MultiGDSSearchIndicator")
    protected List<MultiGDSSearchIndicator> multiGDSSearchIndicator;
    @XmlElement(name = "PreferredCabins")
    protected List<PreferredCabins> preferredCabins;
    @XmlAttribute(name = "ProhibitMinStayFares")
    protected Boolean prohibitMinStayFares;
    @XmlAttribute(name = "ProhibitMaxStayFares")
    protected Boolean prohibitMaxStayFares;
    @XmlAttribute(name = "CurrencyType")
    protected String currencyType;
    @XmlAttribute(name = "ProhibitAdvancePurchaseFares")
    protected Boolean prohibitAdvancePurchaseFares;
    @XmlAttribute(name = "ProhibitNonRefundableFares")
    protected Boolean prohibitNonRefundableFares;
    @XmlAttribute(name = "ProhibitRestrictedFares")
    protected Boolean prohibitRestrictedFares;
    /**
     * Indicates whether only public fares
     *                         should be returned or specific type of private fares
     * 
     */
    @XmlAttribute(name = "FaresIndicator")
    protected TypeFaresIndicator faresIndicator;
    /**
     * Currency in which Fares/Prices will be filed if supported by the supplier else approximated to.
     * 
     */
    @XmlAttribute(name = "FiledCurrency")
    protected String filedCurrency;
    /**
     * The Plating Carrier for this journey.
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * The Plating Carrier for this journey.
     * 
     */
    @XmlAttribute(name = "OverrideCarrier")
    protected String overrideCarrier;
    /**
     * Request a search based on whether only
     *                         E-ticketable fares are required.
     * 
     */
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    /**
     * Indicates whether or not the private
     *                         fares returned should be restricted to only those specific to the
     *                         input account code and contract code.
     * 
     */
    @XmlAttribute(name = "AccountCodeFaresOnly")
    protected Boolean accountCodeFaresOnly;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ProhibitNonExchangeableFares")
    protected Boolean prohibitNonExchangeableFares;
    /**
     * This indicator allows agent to force segment select option in host while selecting all air segments to store price on a PNR. This is relevent only when agent selects all air segmnets to price. if agent selects specific segments to price then this attribute will be ignored by the system. This is currently used by Worldspan only.
     * 
     */
    @XmlAttribute(name = "ForceSegmentSelect")
    protected Boolean forceSegmentSelect;
    /**
     * This allows user to make request for a particular source of inventory for pricing modifier purposes.
     * 
     */
    @XmlAttribute(name = "InventoryRequestType")
    protected TypeInventoryRequest inventoryRequestType;
    /**
     * Via this attribute one way shop can be requested. Applicable provider is 1G
     * 
     */
    @XmlAttribute(name = "OneWayShop")
    protected Boolean oneWayShop;
    /**
     * A "True" value wiill remove fares with EOU and ERU fare types from consideration. A "False" value is the same as no value.  Default is no value. Applicable providers:  1P/1G/1V
     * 
     */
    @XmlAttribute(name = "ProhibitUnbundledFareTypes")
    protected Boolean prohibitUnbundledFareTypes;
    /**
     * When set to false, ATPCO filed Optional Services will not be returned. Default is false. Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "ReturnServices")
    protected Boolean returnServices;
    /**
     * A Channel ID is 2 to 4 alpha-numeric characters used to activate the Search Control Console filter for a specific group of travelers being served by the agency credential.
     * 
     */
    @XmlAttribute(name = "ChannelId")
    protected String channelId;
    /**
     * Returns attributes that are associated to a fare
     * 
     */
    @XmlAttribute(name = "ReturnFareAttributes")
    protected Boolean returnFareAttributes;
    /**
     * Checks if the segment is bookable before pricing
     * 
     */
    @XmlAttribute(name = "SellCheck")
    protected Boolean sellCheck;
    /**
     * If "true", returns failed segments information.
     * 
     */
    @XmlAttribute(name = "ReturnFailedSegments")
    protected Boolean returnFailedSegments;
    /**
     * City Code identifying where the ticket is to be sold.
     * 
     */
    @XmlAttribute(name = "SellCity")
    protected String sellCity;
    /**
     * City Code identifying where the ticket will be issued.
     * 
     */
    @XmlAttribute(name = "TicketingCity")
    protected String ticketingCity;

    /**
     * Gets the value of the prohibitedRuleCategories property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.ProhibitedRuleCategories }
     *     
     */
    public AirPricingModifiers.ProhibitedRuleCategories getProhibitedRuleCategories() {
        return prohibitedRuleCategories;
    }

    /**
     * Sets the value of the prohibitedRuleCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.ProhibitedRuleCategories }
     *     
     */
    public void setProhibitedRuleCategories(AirPricingModifiers.ProhibitedRuleCategories value) {
        this.prohibitedRuleCategories = value;
    }

    /**
     * Gets the value of the accountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.AccountCodes }
     *     
     */
    public AirPricingModifiers.AccountCodes getAccountCodes() {
        return accountCodes;
    }

    /**
     * Sets the value of the accountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.AccountCodes }
     *     
     */
    public void setAccountCodes(AirPricingModifiers.AccountCodes value) {
        this.accountCodes = value;
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
     * Gets the value of the contractCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.ContractCodes }
     *     
     */
    public AirPricingModifiers.ContractCodes getContractCodes() {
        return contractCodes;
    }

    /**
     * Sets the value of the contractCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.ContractCodes }
     *     
     */
    public void setContractCodes(AirPricingModifiers.ContractCodes value) {
        this.contractCodes = value;
    }

    /**
     * Request tax exemption for specific tax
     *                 category and/or all taxes of a specific country
     * 
     * @return
     *     possible object is
     *     {@link ExemptTaxes }
     *     
     */
    public ExemptTaxes getExemptTaxes() {
        return exemptTaxes;
    }

    /**
     * Sets the value of the exemptTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptTaxes }
     *     
     * @see #getExemptTaxes()
     */
    public void setExemptTaxes(ExemptTaxes value) {
        this.exemptTaxes = value;
    }

    /**
     * Request Fares with specific Penalty
     *                             Information.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyFareInformation }
     *     
     */
    public PenaltyFareInformation getPenaltyFareInformation() {
        return penaltyFareInformation;
    }

    /**
     * Sets the value of the penaltyFareInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyFareInformation }
     *     
     * @see #getPenaltyFareInformation()
     */
    public void setPenaltyFareInformation(PenaltyFareInformation value) {
        this.penaltyFareInformation = value;
    }

    /**
     * Discount request for rail.
     * 
     * Gets the value of the discountCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiscountCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the discountCard property.
     */
    public List<DiscountCard> getDiscountCard() {
        if (discountCard == null) {
            discountCard = new ArrayList<>();
        }
        return this.discountCard;
    }

    /**
     * Gets the value of the promoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.PromoCodes }
     *     
     */
    public AirPricingModifiers.PromoCodes getPromoCodes() {
        return promoCodes;
    }

    /**
     * Sets the value of the promoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.PromoCodes }
     *     
     */
    public void setPromoCodes(AirPricingModifiers.PromoCodes value) {
        this.promoCodes = value;
    }

    /**
     * Represents increment/discount applied manually by agent.
     * 
     * Gets the value of the manualFareAdjustment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualFareAdjustment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManualFareAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualFareAdjustment }
     * </p>
     * 
     * 
     * @return
     *     The value of the manualFareAdjustment property.
     */
    public List<ManualFareAdjustment> getManualFareAdjustment() {
        if (manualFareAdjustment == null) {
            manualFareAdjustment = new ArrayList<>();
        }
        return this.manualFareAdjustment;
    }

    /**
     * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at stored fare level. As multiple UAPI AirPricingInfos (all having same AirPricingInfoGroup) can converge to a single stored fare, UAPI will map PoinOfSale information from the first available one from each group
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     * @see #getPointOfSale()
     */
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Used to specify the level of branding requested.
     * 
     * @return
     *     possible object is
     *     {@link BrandModifiers }
     *     
     */
    public BrandModifiers getBrandModifiers() {
        return brandModifiers;
    }

    /**
     * Sets the value of the brandModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandModifiers }
     *     
     * @see #getBrandModifiers()
     */
    public void setBrandModifiers(BrandModifiers value) {
        this.brandModifiers = value;
    }

    /**
     * Indicates whether public fares and/or private fares should be returned.
     * 
     * Gets the value of the multiGDSSearchIndicator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiGDSSearchIndicator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMultiGDSSearchIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiGDSSearchIndicator }
     * </p>
     * 
     * 
     * @return
     *     The value of the multiGDSSearchIndicator property.
     */
    public List<MultiGDSSearchIndicator> getMultiGDSSearchIndicator() {
        if (multiGDSSearchIndicator == null) {
            multiGDSSearchIndicator = new ArrayList<>();
        }
        return this.multiGDSSearchIndicator;
    }

    /**
     * Gets the value of the preferredCabins property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCabins property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreferredCabins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferredCabins }
     * </p>
     * 
     * 
     * @return
     *     The value of the preferredCabins property.
     */
    public List<PreferredCabins> getPreferredCabins() {
        if (preferredCabins == null) {
            preferredCabins = new ArrayList<>();
        }
        return this.preferredCabins;
    }

    /**
     * Gets the value of the prohibitMinStayFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitMinStayFares() {
        if (prohibitMinStayFares == null) {
            return false;
        } else {
            return prohibitMinStayFares;
        }
    }

    /**
     * Sets the value of the prohibitMinStayFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMinStayFares(Boolean value) {
        this.prohibitMinStayFares = value;
    }

    /**
     * Gets the value of the prohibitMaxStayFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitMaxStayFares() {
        if (prohibitMaxStayFares == null) {
            return false;
        } else {
            return prohibitMaxStayFares;
        }
    }

    /**
     * Sets the value of the prohibitMaxStayFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMaxStayFares(Boolean value) {
        this.prohibitMaxStayFares = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitAdvancePurchaseFares() {
        if (prohibitAdvancePurchaseFares == null) {
            return false;
        } else {
            return prohibitAdvancePurchaseFares;
        }
    }

    /**
     * Sets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitAdvancePurchaseFares(Boolean value) {
        this.prohibitAdvancePurchaseFares = value;
    }

    /**
     * Gets the value of the prohibitNonRefundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonRefundableFares() {
        if (prohibitNonRefundableFares == null) {
            return false;
        } else {
            return prohibitNonRefundableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonRefundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonRefundableFares(Boolean value) {
        this.prohibitNonRefundableFares = value;
    }

    /**
     * Gets the value of the prohibitRestrictedFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitRestrictedFares() {
        if (prohibitRestrictedFares == null) {
            return false;
        } else {
            return prohibitRestrictedFares;
        }
    }

    /**
     * Sets the value of the prohibitRestrictedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitRestrictedFares(Boolean value) {
        this.prohibitRestrictedFares = value;
    }

    /**
     * Indicates whether only public fares
     *                         should be returned or specific type of private fares
     * 
     * @return
     *     possible object is
     *     {@link TypeFaresIndicator }
     *     
     */
    public TypeFaresIndicator getFaresIndicator() {
        return faresIndicator;
    }

    /**
     * Sets the value of the faresIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFaresIndicator }
     *     
     * @see #getFaresIndicator()
     */
    public void setFaresIndicator(TypeFaresIndicator value) {
        this.faresIndicator = value;
    }

    /**
     * Currency in which Fares/Prices will be filed if supported by the supplier else approximated to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledCurrency() {
        return filedCurrency;
    }

    /**
     * Sets the value of the filedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFiledCurrency()
     */
    public void setFiledCurrency(String value) {
        this.filedCurrency = value;
    }

    /**
     * The Plating Carrier for this journey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * The Plating Carrier for this journey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCarrier() {
        return overrideCarrier;
    }

    /**
     * Sets the value of the overrideCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOverrideCarrier()
     */
    public void setOverrideCarrier(String value) {
        this.overrideCarrier = value;
    }

    /**
     * Request a search based on whether only
     *                         E-ticketable fares are required.
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     * @see #getETicketability()
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
    }

    /**
     * Indicates whether or not the private
     *                         fares returned should be restricted to only those specific to the
     *                         input account code and contract code.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountCodeFaresOnly() {
        return accountCodeFaresOnly;
    }

    /**
     * Sets the value of the accountCodeFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAccountCodeFaresOnly()
     */
    public void setAccountCodeFaresOnly(Boolean value) {
        this.accountCodeFaresOnly = value;
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
     * Gets the value of the prohibitNonExchangeableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonExchangeableFares() {
        if (prohibitNonExchangeableFares == null) {
            return false;
        } else {
            return prohibitNonExchangeableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonExchangeableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonExchangeableFares(Boolean value) {
        this.prohibitNonExchangeableFares = value;
    }

    /**
     * This indicator allows agent to force segment select option in host while selecting all air segments to store price on a PNR. This is relevent only when agent selects all air segmnets to price. if agent selects specific segments to price then this attribute will be ignored by the system. This is currently used by Worldspan only.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceSegmentSelect() {
        if (forceSegmentSelect == null) {
            return false;
        } else {
            return forceSegmentSelect;
        }
    }

    /**
     * Sets the value of the forceSegmentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isForceSegmentSelect()
     */
    public void setForceSegmentSelect(Boolean value) {
        this.forceSegmentSelect = value;
    }

    /**
     * This allows user to make request for a particular source of inventory for pricing modifier purposes.
     * 
     * @return
     *     possible object is
     *     {@link TypeInventoryRequest }
     *     
     */
    public TypeInventoryRequest getInventoryRequestType() {
        return inventoryRequestType;
    }

    /**
     * Sets the value of the inventoryRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInventoryRequest }
     *     
     * @see #getInventoryRequestType()
     */
    public void setInventoryRequestType(TypeInventoryRequest value) {
        this.inventoryRequestType = value;
    }

    /**
     * Via this attribute one way shop can be requested. Applicable provider is 1G
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOneWayShop() {
        if (oneWayShop == null) {
            return false;
        } else {
            return oneWayShop;
        }
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
     * A "True" value wiill remove fares with EOU and ERU fare types from consideration. A "False" value is the same as no value.  Default is no value. Applicable providers:  1P/1G/1V
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProhibitUnbundledFareTypes() {
        return prohibitUnbundledFareTypes;
    }

    /**
     * Sets the value of the prohibitUnbundledFareTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProhibitUnbundledFareTypes()
     */
    public void setProhibitUnbundledFareTypes(Boolean value) {
        this.prohibitUnbundledFareTypes = value;
    }

    /**
     * When set to false, ATPCO filed Optional Services will not be returned. Default is false. Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnServices() {
        if (returnServices == null) {
            return false;
        } else {
            return returnServices;
        }
    }

    /**
     * Sets the value of the returnServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnServices()
     */
    public void setReturnServices(Boolean value) {
        this.returnServices = value;
    }

    /**
     * A Channel ID is 2 to 4 alpha-numeric characters used to activate the Search Control Console filter for a specific group of travelers being served by the agency credential.
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
     * Returns attributes that are associated to a fare
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnFareAttributes() {
        if (returnFareAttributes == null) {
            return false;
        } else {
            return returnFareAttributes;
        }
    }

    /**
     * Sets the value of the returnFareAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnFareAttributes()
     */
    public void setReturnFareAttributes(Boolean value) {
        this.returnFareAttributes = value;
    }

    /**
     * Checks if the segment is bookable before pricing
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSellCheck() {
        if (sellCheck == null) {
            return false;
        } else {
            return sellCheck;
        }
    }

    /**
     * Sets the value of the sellCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSellCheck()
     */
    public void setSellCheck(Boolean value) {
        this.sellCheck = value;
    }

    /**
     * If "true", returns failed segments information.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnFailedSegments() {
        if (returnFailedSegments == null) {
            return false;
        } else {
            return returnFailedSegments;
        }
    }

    /**
     * Sets the value of the returnFailedSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnFailedSegments()
     */
    public void setReturnFailedSegments(Boolean value) {
        this.returnFailedSegments = value;
    }

    /**
     * City Code identifying where the ticket is to be sold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellCity() {
        return sellCity;
    }

    /**
     * Sets the value of the sellCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSellCity()
     */
    public void setSellCity(String value) {
        this.sellCity = value;
    }

    /**
     * City Code identifying where the ticket will be issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingCity() {
        return ticketingCity;
    }

    /**
     * Sets the value of the ticketingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketingCity()
     */
    public void setTicketingCity(String value) {
        this.ticketingCity = value;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" maxOccurs="999"/>
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
        "accountCode"
    })
    public static class AccountCodes {

        /**
         * Used to get negotiated pricing. Provider:ACH.
         * 
         */
        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * Used to get negotiated pricing. Provider:ACH.
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}ContractCode" maxOccurs="999"/>
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
        "contractCode"
    })
    public static class ContractCodes {

        /**
         * Some private fares (non-ATPCO) are secured to a
         *                 contract code.
         * 
         */
        @XmlElement(name = "ContractCode", required = true)
        protected List<ContractCode> contractCode;

        /**
         * Some private fares (non-ATPCO) are secured to a
         *                 contract code.
         * 
         * Gets the value of the contractCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContractCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractCode }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractCode property.
         */
        public List<ContractCode> getContractCode() {
            if (contractCode == null) {
                contractCode = new ArrayList<>();
            }
            return this.contractCode;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleCategory" maxOccurs="999"/>
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
        "fareRuleCategory"
    })
    public static class ProhibitedRuleCategories {

        /**
         * Rule Categories to filter on.
         * 
         */
        @XmlElement(name = "FareRuleCategory", required = true)
        protected List<FareRuleCategory> fareRuleCategory;

        /**
         * Rule Categories to filter on.
         * 
         * Gets the value of the fareRuleCategory property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareRuleCategory property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFareRuleCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareRuleCategory }
         * </p>
         * 
         * 
         * @return
         *     The value of the fareRuleCategory property.
         */
        public List<FareRuleCategory> getFareRuleCategory() {
            if (fareRuleCategory == null) {
                fareRuleCategory = new ArrayList<>();
            }
            return this.fareRuleCategory;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}PromoCode" maxOccurs="999"/>
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
        "promoCode"
    })
    public static class PromoCodes {

        /**
         * A container to specify Promotional code with Provider code and Supplier code.
         * 
         */
        @XmlElement(name = "PromoCode", required = true)
        protected List<PromoCode> promoCode;

        /**
         * A container to specify Promotional code with Provider code and Supplier code.
         * 
         * Gets the value of the promoCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promoCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPromoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromoCode }
         * </p>
         * 
         * 
         * @return
         *     The value of the promoCode property.
         */
        public List<PromoCode> getPromoCode() {
            if (promoCode == null) {
                promoCode = new ArrayList<>();
            }
            return this.promoCode;
        }

    }

}
