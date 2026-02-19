
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
 *         <element name="PermittedAccountCodes" minOccurs="0">
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
 *         <element name="PreferredAccountCodes" minOccurs="0">
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
 *         <element name="ProhibitedAccountCodes" minOccurs="0">
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
 *         <element name="PermittedPointOfSales" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ProhibitedPointOfSales" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="TripType" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTripType" />
 *       <attribute name="Diversification" type="{http://www.travelport.com/schema/air_v54_0}typeDiversity" />
 *       <attribute name="Tag">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="20"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedAccountCodes",
    "preferredAccountCodes",
    "prohibitedAccountCodes",
    "permittedPointOfSales",
    "prohibitedPointOfSales"
})
@XmlRootElement(name = "SolutionGroup")
public class SolutionGroup {

    @XmlElement(name = "PermittedAccountCodes")
    protected SolutionGroup.PermittedAccountCodes permittedAccountCodes;
    @XmlElement(name = "PreferredAccountCodes")
    protected SolutionGroup.PreferredAccountCodes preferredAccountCodes;
    @XmlElement(name = "ProhibitedAccountCodes")
    protected SolutionGroup.ProhibitedAccountCodes prohibitedAccountCodes;
    @XmlElement(name = "PermittedPointOfSales")
    protected SolutionGroup.PermittedPointOfSales permittedPointOfSales;
    @XmlElement(name = "ProhibitedPointOfSales")
    protected SolutionGroup.ProhibitedPointOfSales prohibitedPointOfSales;
    /**
     * The number of solution to include in this
     *                         group. If only one group specified, this can be left blank. If
     *                         multiple groups specified, all counts must add up to the
     *                         MaxResults of the request.
     * 
     */
    @XmlAttribute(name = "Count")
    protected BigInteger count;
    /**
     * Specifies the trip type for this group
     *                         of results. Allows targeting a result set to a particular set of
     *                         characterists.
     * 
     */
    @XmlAttribute(name = "TripType", required = true)
    protected TypeTripType tripType;
    /**
     * Specifies the diversification of this
     *                         group of results, if specified. Allows targeting a result set to
     *                         ensure they contain more unique results.
     * 
     */
    @XmlAttribute(name = "Diversification")
    protected TypeDiversity diversification;
    /**
     * An arbitrary name for this group of solutions.
     *                         Will be returned with the solution for idetification.
     * 
     */
    @XmlAttribute(name = "Tag")
    protected String tag;
    /**
     * Indicates that this is a primary
     *                         SolutionGroup when using alternate pricing concepts
     * 
     */
    @XmlAttribute(name = "Primary")
    protected Boolean primary;

    /**
     * Gets the value of the permittedAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.PermittedAccountCodes }
     *     
     */
    public SolutionGroup.PermittedAccountCodes getPermittedAccountCodes() {
        return permittedAccountCodes;
    }

    /**
     * Sets the value of the permittedAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.PermittedAccountCodes }
     *     
     */
    public void setPermittedAccountCodes(SolutionGroup.PermittedAccountCodes value) {
        this.permittedAccountCodes = value;
    }

    /**
     * Gets the value of the preferredAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.PreferredAccountCodes }
     *     
     */
    public SolutionGroup.PreferredAccountCodes getPreferredAccountCodes() {
        return preferredAccountCodes;
    }

    /**
     * Sets the value of the preferredAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.PreferredAccountCodes }
     *     
     */
    public void setPreferredAccountCodes(SolutionGroup.PreferredAccountCodes value) {
        this.preferredAccountCodes = value;
    }

    /**
     * Gets the value of the prohibitedAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.ProhibitedAccountCodes }
     *     
     */
    public SolutionGroup.ProhibitedAccountCodes getProhibitedAccountCodes() {
        return prohibitedAccountCodes;
    }

    /**
     * Sets the value of the prohibitedAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.ProhibitedAccountCodes }
     *     
     */
    public void setProhibitedAccountCodes(SolutionGroup.ProhibitedAccountCodes value) {
        this.prohibitedAccountCodes = value;
    }

    /**
     * Gets the value of the permittedPointOfSales property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.PermittedPointOfSales }
     *     
     */
    public SolutionGroup.PermittedPointOfSales getPermittedPointOfSales() {
        return permittedPointOfSales;
    }

    /**
     * Sets the value of the permittedPointOfSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.PermittedPointOfSales }
     *     
     */
    public void setPermittedPointOfSales(SolutionGroup.PermittedPointOfSales value) {
        this.permittedPointOfSales = value;
    }

    /**
     * Gets the value of the prohibitedPointOfSales property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.ProhibitedPointOfSales }
     *     
     */
    public SolutionGroup.ProhibitedPointOfSales getProhibitedPointOfSales() {
        return prohibitedPointOfSales;
    }

    /**
     * Sets the value of the prohibitedPointOfSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.ProhibitedPointOfSales }
     *     
     */
    public void setProhibitedPointOfSales(SolutionGroup.ProhibitedPointOfSales value) {
        this.prohibitedPointOfSales = value;
    }

    /**
     * The number of solution to include in this
     *                         group. If only one group specified, this can be left blank. If
     *                         multiple groups specified, all counts must add up to the
     *                         MaxResults of the request.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getCount()
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Specifies the trip type for this group
     *                         of results. Allows targeting a result set to a particular set of
     *                         characterists.
     * 
     * @return
     *     possible object is
     *     {@link TypeTripType }
     *     
     */
    public TypeTripType getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTripType }
     *     
     * @see #getTripType()
     */
    public void setTripType(TypeTripType value) {
        this.tripType = value;
    }

    /**
     * Specifies the diversification of this
     *                         group of results, if specified. Allows targeting a result set to
     *                         ensure they contain more unique results.
     * 
     * @return
     *     possible object is
     *     {@link TypeDiversity }
     *     
     */
    public TypeDiversity getDiversification() {
        return diversification;
    }

    /**
     * Sets the value of the diversification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDiversity }
     *     
     * @see #getDiversification()
     */
    public void setDiversification(TypeDiversity value) {
        this.diversification = value;
    }

    /**
     * An arbitrary name for this group of solutions.
     *                         Will be returned with the solution for idetification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTag()
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Indicates that this is a primary
     *                         SolutionGroup when using alternate pricing concepts
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrimary() {
        if (primary == null) {
            return false;
        } else {
            return primary;
        }
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrimary()
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
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
    public static class PermittedAccountCodes {

        /**
         * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
         * 
         */
        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="999"/>
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
        "pointOfSale"
    })
    public static class PermittedPointOfSales {

        /**
         * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
         * 
         */
        @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<PointOfSale> pointOfSale;

        /**
         * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
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
    public static class PreferredAccountCodes {

        /**
         * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
         * 
         */
        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
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
    public static class ProhibitedAccountCodes {

        /**
         * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
         * 
         */
        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="999"/>
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
        "pointOfSale"
    })
    public static class ProhibitedPointOfSales {

        /**
         * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
         * 
         */
        @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<PointOfSale> pointOfSale;

        /**
         * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
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

    }

}
