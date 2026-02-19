
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CompanyName" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Id" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCardNumber" />
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companyName"
})
@XmlRootElement(name = "PrePayId")
public class PrePayId {

    /**
     * Supplier info that is specific to the pre pay Id
     * 
     */
    @XmlElement(name = "CompanyName")
    protected CompanyName companyName;
    /**
     * This is the exact pre pay number. Example flight pass number
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Type of pre pay unique identifier,presently only available value is FlightPass.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Supplier info that is specific to the pre pay Id
     * 
     * @return
     *     possible object is
     *     {@link CompanyName }
     *     
     */
    public CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyName }
     *     
     * @see #getCompanyName()
     */
    public void setCompanyName(CompanyName value) {
        this.companyName = value;
    }

    /**
     * This is the exact pre pay number. Example flight pass number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Type of pre pay unique identifier,presently only available value is FlightPass.
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

}
