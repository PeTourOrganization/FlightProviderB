
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMerchandisingService" />
 *       <attribute name="SecondaryType" type="{http://www.travelport.com/schema/common_v54_0}typeMerchandisingService" />
 *       <attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="ServiceSubCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TravelDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OptionalServiceModifier")
public class OptionalServiceModifier {

    /**
     * Optional service type
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Secondary optional service type
     * 
     */
    @XmlAttribute(name = "SecondaryType")
    protected String secondaryType;
    /**
     * Optional service supplier code
     * 
     */
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    /**
     * As published by ATPCO
     * 
     */
    @XmlAttribute(name = "ServiceSubCode", required = true)
    protected String serviceSubCode;
    /**
     * The departure date of the air segment the optional service is valid for.
     * 
     */
    @XmlAttribute(name = "TravelDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    /**
     * This allows MDS to return specific image and text corresponding to the ancillary name (S5 ancillary name).
     * 
     */
    @XmlAttribute(name = "Description", required = true)
    protected String description;

    /**
     * Optional service type
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Secondary optional service type
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSecondaryType()
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * Optional service supplier code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSupplierCode()
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * As published by ATPCO
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
     * The departure date of the air segment the optional service is valid for.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTravelDate()
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * This allows MDS to return specific image and text corresponding to the ancillary name (S5 ancillary name).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
