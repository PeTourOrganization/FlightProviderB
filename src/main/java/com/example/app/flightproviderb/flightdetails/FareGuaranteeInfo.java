
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
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
 *       <attribute name="GuaranteeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="GuaranteeType" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeFareGuarantee" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FareGuaranteeInfo")
public class FareGuaranteeInfo {

    /**
     * The date till which the fare is guaranteed.
     * 
     */
    @XmlAttribute(name = "GuaranteeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar guaranteeDate;
    /**
     * Determines the status of a fare for a passenger.
     * 
     */
    @XmlAttribute(name = "GuaranteeType", required = true)
    protected TypeFareGuarantee guaranteeType;

    /**
     * The date till which the fare is guaranteed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeDate() {
        return guaranteeDate;
    }

    /**
     * Sets the value of the guaranteeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getGuaranteeDate()
     */
    public void setGuaranteeDate(XMLGregorianCalendar value) {
        this.guaranteeDate = value;
    }

    /**
     * Determines the status of a fare for a passenger.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareGuarantee }
     *     
     */
    public TypeFareGuarantee getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareGuarantee }
     *     
     * @see #getGuaranteeType()
     */
    public void setGuaranteeType(TypeFareGuarantee value) {
        this.guaranteeType = value;
    }

}
