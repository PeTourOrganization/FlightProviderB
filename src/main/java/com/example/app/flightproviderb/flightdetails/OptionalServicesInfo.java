
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPaymentRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingSolution",
    "formOfPayment",
    "formOfPaymentRef"
})
@XmlRootElement(name = "OptionalServicesInfo")
public class OptionalServicesInfo {

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution", required = true)
    protected AirPricingSolution airPricingSolution;
    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
    /**
     * A reference to a Form of Payment in the existing UR
     * 
     */
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPaymentRef> formOfPaymentRef;

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     * @see #getAirPricingSolution()
     */
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
    }

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

    /**
     * A reference to a Form of Payment in the existing UR
     * 
     * Gets the value of the formOfPaymentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPaymentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormOfPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the formOfPaymentRef property.
     */
    public List<FormOfPaymentRef> getFormOfPaymentRef() {
        if (formOfPaymentRef == null) {
            formOfPaymentRef = new ArrayList<>();
        }
        return this.formOfPaymentRef;
    }

}
