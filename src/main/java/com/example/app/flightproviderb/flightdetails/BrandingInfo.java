
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PriceRange" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Text" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Title" maxOccurs="2" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ImageLocation" maxOccurs="3" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ServiceGroup" minOccurs="0"/>
 *         <element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeSegmentRef" maxOccurs="99"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ServiceSubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ExternalServiceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CommercialName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Chargeable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "priceRange",
    "text",
    "title",
    "imageLocation",
    "serviceGroup",
    "airSegmentRef"
})
@XmlRootElement(name = "BrandingInfo")
public class BrandingInfo {

    /**
     * The price range of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlElement(name = "PriceRange")
    protected List<PriceRange> priceRange;
    /**
     * Type of Text, Eg-'Upsell','Marketing Agent','Marketing Consumer','Strapline','Rule'.
     * 
     */
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    /**
     * The additional titles associated to the brand or optional service. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Title")
    protected List<TypeTextElement> title;
    @XmlElement(name = "ImageLocation")
    protected List<ImageLocation> imageLocation;
    /**
     * The Service Group of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlElement(name = "ServiceGroup")
    protected ServiceGroup serviceGroup;
    /**
     * Specifies the AirSegment the branding information is for. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "AirSegmentRef", required = true)
    protected List<TypeSegmentRef> airSegmentRef;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The Service Sub Code of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    /**
     * The external name of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "ExternalServiceName")
    protected String externalServiceName;
    /**
     * The type of Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    /**
     * The commercial name of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "CommercialName", required = true)
    protected String commercialName;
    /**
     * Indicates if the optional service is not offered, is available for a charge, or is included in the brand.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "Chargeable")
    protected String chargeable;

    /**
     * The price range of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * Gets the value of the priceRange property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRange property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRange }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceRange property.
     */
    public List<PriceRange> getPriceRange() {
        if (priceRange == null) {
            priceRange = new ArrayList<>();
        }
        return this.priceRange;
    }

    /**
     * Type of Text, Eg-'Upsell','Marketing Agent','Marketing Consumer','Strapline','Rule'.
     * 
     * Gets the value of the text property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the text property.
     */
    public List<TypeTextElement> getText() {
        if (text == null) {
            text = new ArrayList<>();
        }
        return this.text;
    }

    /**
     * The additional titles associated to the brand or optional service. Providers: ACH, 1G, 1V, 1P
     * 
     * Gets the value of the title property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the title property.
     */
    public List<TypeTextElement> getTitle() {
        if (title == null) {
            title = new ArrayList<>();
        }
        return this.title;
    }

    /**
     * Gets the value of the imageLocation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageLocation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImageLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageLocation }
     * </p>
     * 
     * 
     * @return
     *     The value of the imageLocation property.
     */
    public List<ImageLocation> getImageLocation() {
        if (imageLocation == null) {
            imageLocation = new ArrayList<>();
        }
        return this.imageLocation;
    }

    /**
     * The Service Group of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link ServiceGroup }
     *     
     */
    public ServiceGroup getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceGroup }
     *     
     * @see #getServiceGroup()
     */
    public void setServiceGroup(ServiceGroup value) {
        this.serviceGroup = value;
    }

    /**
     * Specifies the AirSegment the branding information is for. Providers: ACH, 1G, 1V, 1P
     * 
     * Gets the value of the airSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentRef property.
     */
    public List<TypeSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<>();
        }
        return this.airSegmentRef;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * The Service Sub Code of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceSubCode()
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * The external name of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalServiceName() {
        return externalServiceName;
    }

    /**
     * Sets the value of the externalServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExternalServiceName()
     */
    public void setExternalServiceName(String value) {
        this.externalServiceName = value;
    }

    /**
     * The type of Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * The commercial name of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommercialName()
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
    }

    /**
     * Indicates if the optional service is not offered, is available for a charge, or is included in the brand.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeable() {
        return chargeable;
    }

    /**
     * Sets the value of the chargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChargeable()
     */
    public void setChargeable(String value) {
        this.chargeable = value;
    }

}
