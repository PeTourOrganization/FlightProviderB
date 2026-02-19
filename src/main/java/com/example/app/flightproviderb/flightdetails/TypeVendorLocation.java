
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVendorLocation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeVendorLocation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="VendorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="PreferredOption" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="VendorLocationID">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="MoreRatesToken">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="30"/>
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
@XmlType(name = "typeVendorLocation", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    VendorLocation.class
})
public class TypeVendorLocation {

    /**
     * The code of the provider (e.g. 1G, 1S)
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * The code of the vendor (e.g.  HZ, etc.)
     * 
     */
    @XmlAttribute(name = "VendorCode", required = true)
    protected String vendorCode;
    /**
     * Preferred Option marker for Location.
     * 
     */
    @XmlAttribute(name = "PreferredOption")
    protected Boolean preferredOption;
    /**
     * Location identifier
     * 
     */
    @XmlAttribute(name = "VendorLocationID")
    protected String vendorLocationID;
    /**
     * Key which maps vendor location with vehicles
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Enter the Token when provided by hotel property, more rates exist. HADS/HSS  support only.
     * 
     */
    @XmlAttribute(name = "MoreRatesToken")
    protected String moreRatesToken;

    /**
     * The code of the provider (e.g. 1G, 1S)
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
     * The code of the vendor (e.g.  HZ, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVendorCode()
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Preferred Option marker for Location.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPreferredOption()
     */
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

    /**
     * Location identifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorLocationID() {
        return vendorLocationID;
    }

    /**
     * Sets the value of the vendorLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVendorLocationID()
     */
    public void setVendorLocationID(String value) {
        this.vendorLocationID = value;
    }

    /**
     * Key which maps vendor location with vehicles
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
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Enter the Token when provided by hotel property, more rates exist. HADS/HSS  support only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreRatesToken() {
        return moreRatesToken;
    }

    /**
     * Sets the value of the moreRatesToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMoreRatesToken()
     */
    public void setMoreRatesToken(String value) {
        this.moreRatesToken = value;
    }

}
