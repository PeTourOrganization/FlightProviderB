
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="DefaultProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PrivateFareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PrivateFareCodeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MultiGDSSearchIndicator")
public class MultiGDSSearchIndicator {

    /**
     * Indicates whether only public fares or both public and private fares should be returned or a specific type of private fares. Examples of valid values are PublicFaresOnly, PrivateFaresOnly, AirlinePrivateFaresOnly, AgencyPrivateFaresOnly, PublicandPrivateFares, and NetFaresOnly.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * Use the value “true” if the provider is the default (primary) provider.  Use the value “false” if the provider is the alternate (secondary).  Use of this attribute requires specifically provisioned credentials.
     * 
     */
    @XmlAttribute(name = "DefaultProvider")
    protected Boolean defaultProvider;
    /**
     * The code of the corporate private fare.  This is the same as an account code.  Use of this attribute requires specifically provisioned credentials.
     * 
     */
    @XmlAttribute(name = "PrivateFareCode")
    protected String privateFareCode;
    /**
     * :  Indicates whether or not the private fares returned should be restricted to only those specific to the PrivateFareCode in the previous attribute.  This has the same validation as the AccountCodeFaresOnly attribute.  Use of this attribute requires specifically provisioned credentials.
     * 
     */
    @XmlAttribute(name = "PrivateFareCodeOnly")
    protected Boolean privateFareCodeOnly;

    /**
     * Indicates whether only public fares or both public and private fares should be returned or a specific type of private fares. Examples of valid values are PublicFaresOnly, PrivateFaresOnly, AirlinePrivateFaresOnly, AgencyPrivateFaresOnly, PublicandPrivateFares, and NetFaresOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the providerCode property.
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
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Use the value “true” if the provider is the default (primary) provider.  Use the value “false” if the provider is the alternate (secondary).  Use of this attribute requires specifically provisioned credentials.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultProvider() {
        return defaultProvider;
    }

    /**
     * Sets the value of the defaultProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDefaultProvider()
     */
    public void setDefaultProvider(Boolean value) {
        this.defaultProvider = value;
    }

    /**
     * The code of the corporate private fare.  This is the same as an account code.  Use of this attribute requires specifically provisioned credentials.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateFareCode() {
        return privateFareCode;
    }

    /**
     * Sets the value of the privateFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrivateFareCode()
     */
    public void setPrivateFareCode(String value) {
        this.privateFareCode = value;
    }

    /**
     * :  Indicates whether or not the private fares returned should be restricted to only those specific to the PrivateFareCode in the previous attribute.  This has the same validation as the AccountCodeFaresOnly attribute.  Use of this attribute requires specifically provisioned credentials.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateFareCodeOnly() {
        return privateFareCodeOnly;
    }

    /**
     * Sets the value of the privateFareCodeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrivateFareCodeOnly()
     */
    public void setPrivateFareCodeOnly(Boolean value) {
        this.privateFareCodeOnly = value;
    }

}
