
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information pertaining to the payment of type Guarantee.
 * 
 * <p>Java class for typeGuaranteeInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeGuaranteeInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Guarantee"/>
 *             <enumeration value="Deposit"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AgencyType" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="AgencyIATA"/>
 *             <enumeration value="OtherAgencyIATA"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="IATANumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to128" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeGuaranteeInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TypeGuaranteeInformation {

    /**
     * Guarantee only or Deposit
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Guarantee to Agency IATA or Guarantee to Another Agency IATA
     * 
     */
    @XmlAttribute(name = "AgencyType", required = true)
    protected String agencyType;
    /**
     * Payment IATA number. (ie. IATA of Agency or Other Agency)
     * 
     */
    @XmlAttribute(name = "IATANumber", required = true)
    protected String iataNumber;

    /**
     * Guarantee only or Deposit
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
     * Guarantee to Agency IATA or Guarantee to Another Agency IATA
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * Sets the value of the agencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgencyType()
     */
    public void setAgencyType(String value) {
        this.agencyType = value;
    }

    /**
     * Payment IATA number. (ie. IATA of Agency or Other Agency)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATANumber()
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

}
