
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
 *         <element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="35"/>
 *       </sequence>
 *       <attribute name="FareInfoRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "categoryCode"
})
@XmlRootElement(name = "FareRulesFilterCategory")
public class FareRulesFilterCategory {

    /**
     * Fare Rules Filter category can be requested. Currently only '˜MIN, MAX, ADV, CHG, OTH' is supported. Applicable for Providers 1G,1V,1P.
     * 
     */
    @XmlElement(name = "CategoryCode", required = true)
    protected List<String> categoryCode;
    /**
     * This tells if Low Fare Finder was used.
     * 
     */
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;

    /**
     * Fare Rules Filter category can be requested. Currently only '˜MIN, MAX, ADV, CHG, OTH' is supported. Applicable for Providers 1G,1V,1P.
     * 
     * Gets the value of the categoryCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategoryCode().add(newItem);
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
     *     The value of the categoryCode property.
     */
    public List<String> getCategoryCode() {
        if (categoryCode == null) {
            categoryCode = new ArrayList<>();
        }
        return this.categoryCode;
    }

    /**
     * This tells if Low Fare Finder was used.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareInfoRef()
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

}
