
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BaseCoreReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseCoreReq">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BillingPointOfSaleInfo"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgentIDOverride" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TerminalSessionInfo" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AuthorizedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TargetBranch" type="{http://www.travelport.com/schema/common_v54_0}typeBranchCode" />
 *       <attribute name="OverrideLogging" type="{http://www.travelport.com/schema/common_v54_0}typeLoggingLevel" />
 *       <attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       <attribute name="ReturnAmenities" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ReturnSponsoredFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SponsoredFltTrnxId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCoreReq", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "billingPointOfSaleInfo",
    "agentIDOverride",
    "terminalSessionInfo"
})
@XmlSeeAlso({
    BaseAirExchangeMultiQuoteReq.class,
    BaseCoreSearchReq.class,
    BaseAirExchangeQuoteReq.class,
    BaseReq.class,
    BaseAirPriceReq.class
})
public class BaseCoreReq {

    /**
     * Point of Sale information for Billing
     * 
     */
    @XmlElement(name = "BillingPointOfSaleInfo", required = true)
    protected BillingPointOfSaleInfo billingPointOfSaleInfo;
    /**
     * Vendor specific agent identifier overrides to be used to access vendor systems.
     * 
     */
    @XmlElement(name = "AgentIDOverride")
    protected List<AgentIDOverride> agentIDOverride;
    /**
     * Travelport use only. This element contains CDATA information representing existing GDS session data or ACH credentials information of the terminal user
     * 
     */
    @XmlElement(name = "TerminalSessionInfo")
    protected String terminalSessionInfo;
    /**
     * Unique identifier for this atomic transaction traced by the user. Use is optional.
     * 
     */
    @XmlAttribute(name = "TraceId")
    protected String traceId;
    /**
     * Authentication Token ID used when running in statefull operation. Obtained from the LoginRsp. Use is optional.
     * 
     */
    @XmlAttribute(name = "TokenId")
    protected String tokenId;
    /**
     * Used in showing who authorized the request. Use is optional.
     * 
     */
    @XmlAttribute(name = "AuthorizedBy")
    protected String authorizedBy;
    /**
     * Used for Emulation - If authorised will execute the request as if the agent's parent branch is the TargetBranch specified.
     * 
     */
    @XmlAttribute(name = "TargetBranch")
    protected String targetBranch;
    /**
     * Use to override the default logging level
     * 
     */
    @XmlAttribute(name = "OverrideLogging")
    protected TypeLoggingLevel overrideLogging;
    /**
     * ISO 639 two-character language codes are used to retrieve specific information in the requested language. For Rich Content and Branding, language codes ZH-HANT (Chinese Traditional), ZH-HANS (Chinese Simplified), FR-CA (French Canadian) and PT-BR (Portuguese Brazil) can also be used. For RCH, language codes ENGB, ENUS, DEDE, DECH can also be used. Only certain services support this attribute. Providers: ACH, RCH, 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    /**
     * When set to true, Amenities information will be returned in the response.
     * 
     */
    @XmlAttribute(name = "ReturnAmenities")
    protected Boolean returnAmenities;
    /**
     * When set to true, Sponsored flight information will be returned in the response.
     * 
     */
    @XmlAttribute(name = "ReturnSponsoredFlight")
    protected Boolean returnSponsoredFlight;
    /**
     * Identifier for Sponsored Flight transaction information.
     * 
     */
    @XmlAttribute(name = "SponsoredFltTrnxId")
    protected String sponsoredFltTrnxId;

    /**
     * Point of Sale information for Billing
     * 
     * @return
     *     possible object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    public BillingPointOfSaleInfo getBillingPointOfSaleInfo() {
        return billingPointOfSaleInfo;
    }

    /**
     * Sets the value of the billingPointOfSaleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPointOfSaleInfo }
     *     
     * @see #getBillingPointOfSaleInfo()
     */
    public void setBillingPointOfSaleInfo(BillingPointOfSaleInfo value) {
        this.billingPointOfSaleInfo = value;
    }

    /**
     * Vendor specific agent identifier overrides to be used to access vendor systems.
     * 
     * Gets the value of the agentIDOverride property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentIDOverride property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAgentIDOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentIDOverride }
     * </p>
     * 
     * 
     * @return
     *     The value of the agentIDOverride property.
     */
    public List<AgentIDOverride> getAgentIDOverride() {
        if (agentIDOverride == null) {
            agentIDOverride = new ArrayList<>();
        }
        return this.agentIDOverride;
    }

    /**
     * Travelport use only. This element contains CDATA information representing existing GDS session data or ACH credentials information of the terminal user
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalSessionInfo() {
        return terminalSessionInfo;
    }

    /**
     * Sets the value of the terminalSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTerminalSessionInfo()
     */
    public void setTerminalSessionInfo(String value) {
        this.terminalSessionInfo = value;
    }

    /**
     * Unique identifier for this atomic transaction traced by the user. Use is optional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTraceId()
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Authentication Token ID used when running in statefull operation. Obtained from the LoginRsp. Use is optional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTokenId()
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

    /**
     * Used in showing who authorized the request. Use is optional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuthorizedBy()
     */
    public void setAuthorizedBy(String value) {
        this.authorizedBy = value;
    }

    /**
     * Used for Emulation - If authorised will execute the request as if the agent's parent branch is the TargetBranch specified.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * Sets the value of the targetBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTargetBranch()
     */
    public void setTargetBranch(String value) {
        this.targetBranch = value;
    }

    /**
     * Use to override the default logging level
     * 
     * @return
     *     possible object is
     *     {@link TypeLoggingLevel }
     *     
     */
    public TypeLoggingLevel getOverrideLogging() {
        return overrideLogging;
    }

    /**
     * Sets the value of the overrideLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLoggingLevel }
     *     
     * @see #getOverrideLogging()
     */
    public void setOverrideLogging(TypeLoggingLevel value) {
        this.overrideLogging = value;
    }

    /**
     * ISO 639 two-character language codes are used to retrieve specific information in the requested language. For Rich Content and Branding, language codes ZH-HANT (Chinese Traditional), ZH-HANS (Chinese Simplified), FR-CA (French Canadian) and PT-BR (Portuguese Brazil) can also be used. For RCH, language codes ENGB, ENUS, DEDE, DECH can also be used. Only certain services support this attribute. Providers: ACH, RCH, 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLanguageCode()
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * When set to true, Amenities information will be returned in the response.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnAmenities() {
        if (returnAmenities == null) {
            return false;
        } else {
            return returnAmenities;
        }
    }

    /**
     * Sets the value of the returnAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnAmenities()
     */
    public void setReturnAmenities(Boolean value) {
        this.returnAmenities = value;
    }

    /**
     * When set to true, Sponsored flight information will be returned in the response.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSponsoredFlight() {
        return returnSponsoredFlight;
    }

    /**
     * Sets the value of the returnSponsoredFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnSponsoredFlight()
     */
    public void setReturnSponsoredFlight(Boolean value) {
        this.returnSponsoredFlight = value;
    }

    /**
     * Identifier for Sponsored Flight transaction information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsoredFltTrnxId() {
        return sponsoredFltTrnxId;
    }

    /**
     * Sets the value of the sponsoredFltTrnxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSponsoredFltTrnxId()
     */
    public void setSponsoredFltTrnxId(String value) {
        this.sponsoredFltTrnxId = value;
    }

}
