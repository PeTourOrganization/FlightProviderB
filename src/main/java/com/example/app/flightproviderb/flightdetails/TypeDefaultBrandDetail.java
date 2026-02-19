
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDefaultBrandDetail complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeDefaultBrandDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Text" maxOccurs="4" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ImageLocation" maxOccurs="3" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ApplicableSegment" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="BrandID" type="{http://www.travelport.com/schema/air_v54_0}typeBrandId" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDefaultBrandDetail", propOrder = {
    "text",
    "imageLocation",
    "applicableSegment"
})
public class TypeDefaultBrandDetail {

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
     * Defines for which air segment the brand is applicable.
     * 
     */
    @XmlElement(name = "ApplicableSegment")
    protected List<TypeApplicableSegment> applicableSegment;
    /**
     * The unique identifier of the brand
     * 
     */
    @XmlAttribute(name = "BrandID")
    protected String brandID;

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
     * Defines for which air segment the brand is applicable.
     * 
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

}
