
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ExchangedCoupon" maxOccurs="4" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="OriginalTicketNumber" type="{http://www.travelport.com/schema/common_v54_0}typeTicketNumber" />
 *       <attribute name="OriginalCityCode" type="{http://www.travelport.com/schema/common_v54_0}typeCity" />
 *       <attribute name="OriginalTicketDate" type="{http://www.travelport.com/schema/common_v54_0}typeDate" />
 *       <attribute name="IATACode" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPayment",
    "exchangedCoupon"
})
@XmlRootElement(name = "MCOExchangeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCOExchangeInfo {

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPayment formOfPayment;
    /**
     * The coupon numbers that were used in the exchange process to create the MCO.
     * 
     */
    @XmlElement(name = "ExchangedCoupon", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ExchangedCoupon> exchangedCoupon;
    /**
     * Airline form and serial number of the original ticket issued.
     * 
     */
    @XmlAttribute(name = "OriginalTicketNumber")
    protected String originalTicketNumber;
    /**
     * Location of honoring carrier or operator.
     * 
     */
    @XmlAttribute(name = "OriginalCityCode")
    protected String originalCityCode;
    /**
     * Date that the Original ticket was issued.
     * 
     */
    @XmlAttribute(name = "OriginalTicketDate")
    protected XMLGregorianCalendar originalTicketDate;
    /**
     * IATA code of the issuing agency.
     * 
     */
    @XmlAttribute(name = "IATACode")
    protected String iataCode;

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
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

    /**
     * The coupon numbers that were used in the exchange process to create the MCO.
     * 
     * Gets the value of the exchangedCoupon property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangedCoupon property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExchangedCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangedCoupon }
     * </p>
     * 
     * 
     * @return
     *     The value of the exchangedCoupon property.
     */
    public List<ExchangedCoupon> getExchangedCoupon() {
        if (exchangedCoupon == null) {
            exchangedCoupon = new ArrayList<>();
        }
        return this.exchangedCoupon;
    }

    /**
     * Airline form and serial number of the original ticket issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketNumber() {
        return originalTicketNumber;
    }

    /**
     * Sets the value of the originalTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalTicketNumber()
     */
    public void setOriginalTicketNumber(String value) {
        this.originalTicketNumber = value;
    }

    /**
     * Location of honoring carrier or operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCityCode() {
        return originalCityCode;
    }

    /**
     * Sets the value of the originalCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalCityCode()
     */
    public void setOriginalCityCode(String value) {
        this.originalCityCode = value;
    }

    /**
     * Date that the Original ticket was issued.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTicketDate() {
        return originalTicketDate;
    }

    /**
     * Sets the value of the originalTicketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOriginalTicketDate()
     */
    public void setOriginalTicketDate(XMLGregorianCalendar value) {
        this.originalTicketDate = value;
    }

    /**
     * IATA code of the issuing agency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATACode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATACode()
     */
    public void setIATACode(String value) {
        this.iataCode = value;
    }

}
