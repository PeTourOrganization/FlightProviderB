
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Title" maxOccurs="2" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Text" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ImageLocation" maxOccurs="3" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Rules" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ServiceAssociations" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}UpsellBrand" minOccurs="0"/>
 *         <element name="ApplicableSegment" type="{http://www.travelport.com/schema/air_v54_0}typeApplicableSegment" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DefaultBrandDetail" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BrandID" type="{http://www.travelport.com/schema/air_v54_0}typeBrandId" />
 *       <attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AirItineraryDetailsRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="UpSellBrandID" type="{http://www.travelport.com/schema/air_v54_0}typeBrandId" />
 *       <attribute name="BrandFound" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="UpSellBrandFound" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="BrandedDetailsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="BrandTier" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to10" />
 *       <attribute name="BrandMaintained" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to99" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "text",
    "imageLocation",
    "optionalServices",
    "rules",
    "serviceAssociations",
    "upsellBrand",
    "applicableSegment",
    "defaultBrandDetail"
})
@XmlRootElement(name = "Brand")
public class Brand {

    /**
     * The additional titles associated to the brand
     * 
     */
    @XmlElement(name = "Title")
    protected List<TypeTextElement> title;
    /**
     * Text associated to the brand
     * 
     */
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    /**
     * Images associated to the brand
     * 
     */
    @XmlElement(name = "ImageLocation")
    protected List<ImageLocation> imageLocation;
    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * Brand rules
     * 
     */
    @XmlElement(name = "Rules")
    protected List<Rules> rules;
    /**
     * Service associated with this brand
     * 
     */
    @XmlElement(name = "ServiceAssociations")
    protected ServiceAssociations serviceAssociations;
    /**
     * The unique identifier of the Upsell brand
     * 
     */
    @XmlElement(name = "UpsellBrand")
    protected UpsellBrand upsellBrand;
    @XmlElement(name = "ApplicableSegment")
    protected List<TypeApplicableSegment> applicableSegment;
    /**
     * Default brand details.
     * 
     */
    @XmlElement(name = "DefaultBrandDetail")
    protected List<TypeDefaultBrandDetail> defaultBrandDetail;
    /**
     * Brand Key
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The unique identifier of the brand
     * 
     */
    @XmlAttribute(name = "BrandID")
    protected String brandID;
    /**
     * The Title of the brand
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * AirItinerary associated with this brand
     * 
     */
    @XmlAttribute(name = "AirItineraryDetailsRef")
    protected String airItineraryDetailsRef;
    @XmlAttribute(name = "UpSellBrandID")
    protected String upSellBrandID;
    /**
     * Indicates whether brand for the fare was found for carrier or not
     * 
     */
    @XmlAttribute(name = "BrandFound")
    protected Boolean brandFound;
    /**
     * Indicates whether upsell brand for the fare was found for carrier or not
     * 
     */
    @XmlAttribute(name = "UpSellBrandFound")
    protected Boolean upSellBrandFound;
    /**
     * Indicates if full details of the brand is available
     * 
     */
    @XmlAttribute(name = "BrandedDetailsAvailable")
    protected Boolean brandedDetailsAvailable;
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    /**
     * Modifier to price by specific brand tier number.
     * 
     */
    @XmlAttribute(name = "BrandTier")
    protected String brandTier;
    /**
     * Indicates whether the brand was maintained from the original ticket.
     * 
     */
    @XmlAttribute(name = "BrandMaintained")
    protected String brandMaintained;

    /**
     * The additional titles associated to the brand
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
     * Text associated to the brand
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
     * Images associated to the brand
     * 
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
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     * @see #getOptionalServices()
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Brand rules
     * 
     * Gets the value of the rules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rules }
     * </p>
     * 
     * 
     * @return
     *     The value of the rules property.
     */
    public List<Rules> getRules() {
        if (rules == null) {
            rules = new ArrayList<>();
        }
        return this.rules;
    }

    /**
     * Service associated with this brand
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssociations }
     *     
     */
    public ServiceAssociations getServiceAssociations() {
        return serviceAssociations;
    }

    /**
     * Sets the value of the serviceAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssociations }
     *     
     * @see #getServiceAssociations()
     */
    public void setServiceAssociations(ServiceAssociations value) {
        this.serviceAssociations = value;
    }

    /**
     * The unique identifier of the Upsell brand
     * 
     * @return
     *     possible object is
     *     {@link UpsellBrand }
     *     
     */
    public UpsellBrand getUpsellBrand() {
        return upsellBrand;
    }

    /**
     * Sets the value of the upsellBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpsellBrand }
     *     
     * @see #getUpsellBrand()
     */
    public void setUpsellBrand(UpsellBrand value) {
        this.upsellBrand = value;
    }

    /**
     * Gets the value of the applicableSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getApplicableSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeApplicableSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the applicableSegment property.
     */
    public List<TypeApplicableSegment> getApplicableSegment() {
        if (applicableSegment == null) {
            applicableSegment = new ArrayList<>();
        }
        return this.applicableSegment;
    }

    /**
     * Default brand details.
     * 
     * Gets the value of the defaultBrandDetail property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultBrandDetail property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDefaultBrandDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDefaultBrandDetail }
     * </p>
     * 
     * 
     * @return
     *     The value of the defaultBrandDetail property.
     */
    public List<TypeDefaultBrandDetail> getDefaultBrandDetail() {
        if (defaultBrandDetail == null) {
            defaultBrandDetail = new ArrayList<>();
        }
        return this.defaultBrandDetail;
    }

    /**
     * Brand Key
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
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * The unique identifier of the brand
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandID()
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * The Title of the brand
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * AirItinerary associated with this brand
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirItineraryDetailsRef() {
        return airItineraryDetailsRef;
    }

    /**
     * Sets the value of the airItineraryDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirItineraryDetailsRef()
     */
    public void setAirItineraryDetailsRef(String value) {
        this.airItineraryDetailsRef = value;
    }

    /**
     * Gets the value of the upSellBrandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpSellBrandID() {
        return upSellBrandID;
    }

    /**
     * Sets the value of the upSellBrandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpSellBrandID(String value) {
        this.upSellBrandID = value;
    }

    /**
     * Indicates whether brand for the fare was found for carrier or not
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandFound() {
        return brandFound;
    }

    /**
     * Sets the value of the brandFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBrandFound()
     */
    public void setBrandFound(Boolean value) {
        this.brandFound = value;
    }

    /**
     * Indicates whether upsell brand for the fare was found for carrier or not
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpSellBrandFound() {
        return upSellBrandFound;
    }

    /**
     * Sets the value of the upSellBrandFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUpSellBrandFound()
     */
    public void setUpSellBrandFound(Boolean value) {
        this.upSellBrandFound = value;
    }

    /**
     * Indicates if full details of the brand is available
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandedDetailsAvailable() {
        return brandedDetailsAvailable;
    }

    /**
     * Sets the value of the brandedDetailsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBrandedDetailsAvailable()
     */
    public void setBrandedDetailsAvailable(Boolean value) {
        this.brandedDetailsAvailable = value;
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

    /**
     * Modifier to price by specific brand tier number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandTier() {
        return brandTier;
    }

    /**
     * Sets the value of the brandTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandTier()
     */
    public void setBrandTier(String value) {
        this.brandTier = value;
    }

    /**
     * Indicates whether the brand was maintained from the original ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandMaintained() {
        return brandMaintained;
    }

    /**
     * Sets the value of the brandMaintained property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandMaintained()
     */
    public void setBrandMaintained(String value) {
        this.brandMaintained = value;
    }

}
