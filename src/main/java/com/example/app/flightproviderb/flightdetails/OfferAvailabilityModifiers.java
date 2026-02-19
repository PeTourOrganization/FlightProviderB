
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="ServiceType" type="{http://www.travelport.com/schema/common_v54_0}typeMerchandisingService" maxOccurs="999" minOccurs="0"/>
 *         <element name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CurrencyType" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceType",
    "carrier"
})
@XmlRootElement(name = "OfferAvailabilityModifiers")
public class OfferAvailabilityModifiers {

    /**
     * To restrict offers to only this type.
     * 
     */
    @XmlElement(name = "ServiceType")
    protected List<String> serviceType;
    /**
     * The carrier whose paid seat optional services is to be returned by uAPI.
     * 
     */
    @XmlElement(name = "Carrier")
    protected List<String> carrier;
    /**
     * Currency code override. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "CurrencyType")
    protected String currencyType;

    /**
     * To restrict offers to only this type.
     * 
     * Gets the value of the serviceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceType property.
     */
    public List<String> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<>();
        }
        return this.serviceType;
    }

    /**
     * The carrier whose paid seat optional services is to be returned by uAPI.
     * 
     * Gets the value of the carrier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the carrier property.
     */
    public List<String> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<>();
        }
        return this.carrier;
    }

    /**
     * Currency code override. Providers: ACH, 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrencyType()
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

}
