
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBookingTransactionsAllowed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeBookingTransactionsAllowed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="BookingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBookingTransactionsAllowed", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    TypeTransactionsAllowed.class
})
public class TypeBookingTransactionsAllowed {

    /**
     * Allow or prohibit booking transaction for the given product type on this Provider/Supplier. Inheritable.
     * 
     */
    @XmlAttribute(name = "BookingEnabled")
    protected Boolean bookingEnabled;

    /**
     * Allow or prohibit booking transaction for the given product type on this Provider/Supplier. Inheritable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookingEnabled() {
        return bookingEnabled;
    }

    /**
     * Sets the value of the bookingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBookingEnabled()
     */
    public void setBookingEnabled(Boolean value) {
        this.bookingEnabled = value;
    }

}
