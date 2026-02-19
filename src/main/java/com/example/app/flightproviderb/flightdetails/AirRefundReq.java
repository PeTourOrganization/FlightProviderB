
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirRefundBundle" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TCRRefundBundle" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirRefundModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" maxOccurs="9" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airRefundBundle",
    "tcrRefundBundle",
    "airRefundModifiers",
    "commission",
    "formOfPayment"
})
@XmlRootElement(name = "AirRefundReq")
public class AirRefundReq
    extends BaseReq
{

    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "AirRefundBundle")
    protected List<AirRefundBundle> airRefundBundle;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "TCRRefundBundle")
    protected List<TCRRefundBundle> tcrRefundBundle;
    /**
     * Provides controls and switches for the
     *                 Refund process
     * 
     */
    @XmlElement(name = "AirRefundModifiers")
    protected AirRefundModifiers airRefundModifiers;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Commission> commission;
    /**
     * Provider: ACH-Form of Payment for any Additional Collection charges for the Refund.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPayment formOfPayment;

    /**
     * Provider: ACH.
     * 
     * Gets the value of the airRefundBundle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airRefundBundle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRefundBundle }
     * </p>
     * 
     * 
     * @return
     *     The value of the airRefundBundle property.
     */
    public List<AirRefundBundle> getAirRefundBundle() {
        if (airRefundBundle == null) {
            airRefundBundle = new ArrayList<>();
        }
        return this.airRefundBundle;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the tcrRefundBundle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrRefundBundle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTCRRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRRefundBundle }
     * </p>
     * 
     * 
     * @return
     *     The value of the tcrRefundBundle property.
     */
    public List<TCRRefundBundle> getTCRRefundBundle() {
        if (tcrRefundBundle == null) {
            tcrRefundBundle = new ArrayList<>();
        }
        return this.tcrRefundBundle;
    }

    /**
     * Provides controls and switches for the
     *                 Refund process
     * 
     * @return
     *     possible object is
     *     {@link AirRefundModifiers }
     *     
     */
    public AirRefundModifiers getAirRefundModifiers() {
        return airRefundModifiers;
    }

    /**
     * Sets the value of the airRefundModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundModifiers }
     *     
     * @see #getAirRefundModifiers()
     */
    public void setAirRefundModifiers(AirRefundModifiers value) {
        this.airRefundModifiers = value;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * Provider: ACH-Form of Payment for any Additional Collection charges for the Refund.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     * @see #getFormOfPayment()
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

}
