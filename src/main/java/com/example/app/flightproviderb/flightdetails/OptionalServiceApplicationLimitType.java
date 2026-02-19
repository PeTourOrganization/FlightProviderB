
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The optional service application limit
 * 
 * <p>Java class for OptionalServiceApplicationLimitType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OptionalServiceApplicationLimitType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicabilityLimitGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalServiceApplicationLimitType", namespace = "http://www.travelport.com/schema/common_v54_0")
public class OptionalServiceApplicationLimitType {

    /**
     * Indicates the applicable level for the option
     * 
     */
    @XmlAttribute(name = "ApplicableLevel", required = true)
    protected OptionalServiceApplicabilityType applicableLevel;
    /**
     * Indicates the actual provider defined ApplicableLevels which is mapped to Other
     * 
     */
    @XmlAttribute(name = "ProviderDefinedApplicableLevels")
    protected String providerDefinedApplicableLevels;
    /**
     * The maximum quantity allowed for the type
     * 
     */
    @XmlAttribute(name = "MaximumQuantity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumQuantity;
    /**
     * Indicates the minimum number of the option that can be selected.
     * 
     */
    @XmlAttribute(name = "MinimumQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimumQuantity;

    /**
     * Indicates the applicable level for the option
     * 
     * @return
     *     possible object is
     *     {@link OptionalServiceApplicabilityType }
     *     
     */
    public OptionalServiceApplicabilityType getApplicableLevel() {
        return applicableLevel;
    }

    /**
     * Sets the value of the applicableLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServiceApplicabilityType }
     *     
     * @see #getApplicableLevel()
     */
    public void setApplicableLevel(OptionalServiceApplicabilityType value) {
        this.applicableLevel = value;
    }

    /**
     * Indicates the actual provider defined ApplicableLevels which is mapped to Other
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedApplicableLevels() {
        return providerDefinedApplicableLevels;
    }

    /**
     * Sets the value of the providerDefinedApplicableLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderDefinedApplicableLevels()
     */
    public void setProviderDefinedApplicableLevels(String value) {
        this.providerDefinedApplicableLevels = value;
    }

    /**
     * The maximum quantity allowed for the type
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumQuantity()
     */
    public void setMaximumQuantity(BigInteger value) {
        this.maximumQuantity = value;
    }

    /**
     * Indicates the minimum number of the option that can be selected.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMinimumQuantity()
     */
    public void setMinimumQuantity(BigInteger value) {
        this.minimumQuantity = value;
    }

}
