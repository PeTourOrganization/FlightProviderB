
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
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="PseudoCityCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="IATA" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PointOfSale {

    /**
     * The provider in which the PCC is defined.
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * The PCC in the host system.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode", required = true)
    protected String pseudoCityCode;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Used for rapid reprice. This field is the IATA associated to this Point of Sale PCC. Providers: 1G/1V
     * 
     */
    @XmlAttribute(name = "IATA")
    protected String iata;

    /**
     * The provider in which the PCC is defined.
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
     * The PCC in the host system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPseudoCityCode()
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
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
     * Used for rapid reprice. This field is the IATA associated to this Point of Sale PCC. Providers: 1G/1V
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATA() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATA()
     */
    public void setIATA(String value) {
        this.iata = value;
    }

}
