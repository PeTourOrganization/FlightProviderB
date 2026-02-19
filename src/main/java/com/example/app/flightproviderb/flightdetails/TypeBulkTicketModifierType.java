
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Bulk ticketing modifier type.
 * 
 * <p>Java class for typeBulkTicketModifierType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeBulkTicketModifierType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="SuppressOnFareCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBulkTicketModifierType")
@XmlSeeAlso({
    com.example.app.flightproviderb.flightdetails.TicketingModifiers.BulkTicket.class
})
public class TypeBulkTicketModifierType {

    /**
     * Optional attribute to allow a modifier
     *                     impact such as Bulk Ticketing to have information suppressed on the
     *                     Fare Calc when generating supporting documents Check the specific
     *                     host system which may or may not support this function
     * 
     */
    @XmlAttribute(name = "SuppressOnFareCalc")
    protected Boolean suppressOnFareCalc;

    /**
     * Optional attribute to allow a modifier
     *                     impact such as Bulk Ticketing to have information suppressed on the
     *                     Fare Calc when generating supporting documents Check the specific
     *                     host system which may or may not support this function
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressOnFareCalc() {
        return suppressOnFareCalc;
    }

    /**
     * Sets the value of the suppressOnFareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSuppressOnFareCalc()
     */
    public void setSuppressOnFareCalc(Boolean value) {
        this.suppressOnFareCalc = value;
    }

}
