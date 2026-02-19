
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTaxInfoWithPaymentRef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTaxInfoWithPaymentRef">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeTaxInfo">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PaymentRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTaxInfoWithPaymentRef", propOrder = {
    "paymentRef"
})
public class TypeTaxInfoWithPaymentRef
    extends TypeTaxInfo
{

    /**
     * This reference elements will associate relevant payment to this tax
     * 
     */
    @XmlElement(name = "PaymentRef")
    protected List<PaymentRef2> paymentRef;

    /**
     * This reference elements will associate relevant payment to this tax
     * 
     * Gets the value of the paymentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRef2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentRef property.
     */
    public List<PaymentRef2> getPaymentRef() {
        if (paymentRef == null) {
            paymentRef = new ArrayList<>();
        }
        return this.paymentRef;
    }

}
