
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="SponsoredLNB" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="NeutralLNB" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="FltKey" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="5"/>
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
@XmlType(name = "")
@XmlRootElement(name = "SponsoredFltInfo")
public class SponsoredFltInfo {

    /**
     * The line number of the sponsored flight item
     * 
     */
    @XmlAttribute(name = "SponsoredLNB", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sponsoredLNB;
    /**
     * The neutral line number for the flight item.
     * 
     */
    @XmlAttribute(name = "NeutralLNB", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger neutralLNB;
    /**
     * The unique identifying key for the sponsored flight.
     * 
     */
    @XmlAttribute(name = "FltKey", required = true)
    protected String fltKey;

    /**
     * The line number of the sponsored flight item
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSponsoredLNB() {
        return sponsoredLNB;
    }

    /**
     * Sets the value of the sponsoredLNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSponsoredLNB()
     */
    public void setSponsoredLNB(BigInteger value) {
        this.sponsoredLNB = value;
    }

    /**
     * The neutral line number for the flight item.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeutralLNB() {
        return neutralLNB;
    }

    /**
     * Sets the value of the neutralLNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNeutralLNB()
     */
    public void setNeutralLNB(BigInteger value) {
        this.neutralLNB = value;
    }

    /**
     * The unique identifying key for the sponsored flight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltKey() {
        return fltKey;
    }

    /**
     * Sets the value of the fltKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFltKey()
     */
    public void setFltKey(String value) {
        this.fltKey = value;
    }

}
