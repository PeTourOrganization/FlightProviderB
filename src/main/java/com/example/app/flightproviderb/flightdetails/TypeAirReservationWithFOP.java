
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Air Reservation With Form Of Payment.
 * 
 * <p>Java class for typeAirReservationWithFOP complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeAirReservationWithFOP">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}typeBaseAirReservation">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAirReservationWithFOP", propOrder = {
    "formOfPayment"
})
public class TypeAirReservationWithFOP
    extends TypeBaseAirReservation
{

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     * Gets the value of the formOfPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the formOfPayment property.
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<>();
        }
        return this.formOfPayment;
    }

}
