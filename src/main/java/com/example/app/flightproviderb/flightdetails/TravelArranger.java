
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "TravelArranger")
public class TravelArranger {

    @XmlValue
    protected String value;
    /**
     * Company Name
     * 
     */
    @XmlAttribute(name = "CompanyShortName")
    protected String companyShortName;
    /**
     * IATA Code for Arranger
     * 
     */
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Company Name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyShortName() {
        return companyShortName;
    }

    /**
     * Sets the value of the companyShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompanyShortName()
     */
    public void setCompanyShortName(String value) {
        this.companyShortName = value;
    }

    /**
     * IATA Code for Arranger
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

}
