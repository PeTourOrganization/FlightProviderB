
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This contains common elements that are used for Baggage Allowance info, carry-on allowance info and embargo Info. Supported providers are 1V/1G/1P
 * 
 * <p>Java class for BaseBaggageAllowanceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseBaggageAllowanceInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}URLInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TextInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBaggageAllowanceInfo", propOrder = {
    "urlInfo",
    "textInfo"
})
@XmlSeeAlso({
    CarryOnAllowanceInfo.class,
    BaggageAllowanceInfo.class
})
public class BaseBaggageAllowanceInfo {

    /**
     * Contains the text and URL information as published by carrier.
     * 
     */
    @XmlElement(name = "URLInfo")
    protected List<URLInfo> urlInfo;
    /**
     * Text information as published by carrier.
     * 
     */
    @XmlElement(name = "TextInfo")
    protected List<TextInfo> textInfo;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "Carrier")
    protected String carrier;

    /**
     * Contains the text and URL information as published by carrier.
     * 
     * Gets the value of the urlInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getURLInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the urlInfo property.
     */
    public List<URLInfo> getURLInfo() {
        if (urlInfo == null) {
            urlInfo = new ArrayList<>();
        }
        return this.urlInfo;
    }

    /**
     * Text information as published by carrier.
     * 
     * Gets the value of the textInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTextInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the textInfo property.
     */
    public List<TextInfo> getTextInfo() {
        if (textInfo == null) {
            textInfo = new ArrayList<>();
        }
        return this.textInfo;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
