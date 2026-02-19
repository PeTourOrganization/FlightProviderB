
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
 *         <element name="CountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" maxOccurs="999" minOccurs="0"/>
 *         <element name="TaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="AllTaxes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TaxTerritory">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CompanyName">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="24"/>
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
@XmlType(name = "", propOrder = {
    "countryCode",
    "taxCategory"
})
@XmlRootElement(name = "ExemptTaxes")
public class ExemptTaxes {

    /**
     * Specify ISO country code for which tax
     *                          exemption is requested.
     * 
     */
    @XmlElement(name = "CountryCode")
    protected List<String> countryCode;
    /**
     * Specify tax category for which tax
     *                          exemption is requested.
     * 
     */
    @XmlElement(name = "TaxCategory")
    protected List<String> taxCategory;
    /**
     * Request exemption of all taxes.
     * 
     */
    @XmlAttribute(name = "AllTaxes")
    protected Boolean allTaxes;
    /**
     * exemption is achieved by sending in the TaxTerritory in the tax exempt price request.
     * 
     */
    @XmlAttribute(name = "TaxTerritory")
    protected String taxTerritory;
    /**
     * The federal government body name must be provided in this element. This field is required by AC
     * 
     */
    @XmlAttribute(name = "CompanyName")
    protected String companyName;

    /**
     * Specify ISO country code for which tax
     *                          exemption is requested.
     * 
     * Gets the value of the countryCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the countryCode property.
     */
    public List<String> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<>();
        }
        return this.countryCode;
    }

    /**
     * Specify tax category for which tax
     *                          exemption is requested.
     * 
     * Gets the value of the taxCategory property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategory property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxCategory property.
     */
    public List<String> getTaxCategory() {
        if (taxCategory == null) {
            taxCategory = new ArrayList<>();
        }
        return this.taxCategory;
    }

    /**
     * Request exemption of all taxes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllTaxes() {
        return allTaxes;
    }

    /**
     * Sets the value of the allTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllTaxes()
     */
    public void setAllTaxes(Boolean value) {
        this.allTaxes = value;
    }

    /**
     * exemption is achieved by sending in the TaxTerritory in the tax exempt price request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTerritory() {
        return taxTerritory;
    }

    /**
     * Sets the value of the taxTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxTerritory()
     */
    public void setTaxTerritory(String value) {
        this.taxTerritory = value;
    }

    /**
     * The federal government body name must be provided in this element. This field is required by AC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompanyName()
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

}
