
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CO2Emission" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TotalValue" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Unit" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to64" />
 *       <attribute name="Category" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to64" />
 *       <attribute name="Source" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "co2Emission"
})
@XmlRootElement(name = "CO2Emissions")
public class CO2Emissions {

    /**
     * Carbon emission values
     * 
     */
    @XmlElement(name = "CO2Emission")
    protected List<CO2Emission> co2Emission;
    /**
     * The total CO2 emission value for the journey
     * 
     */
    @XmlAttribute(name = "TotalValue")
    protected Float totalValue;
    /**
     * The unit used in the TotalValue attribute
     * 
     */
    @XmlAttribute(name = "Unit")
    protected String unit;
    /**
     * The category name of the type of cabin, either Economy or Premium.  Premium is any cabin that is not considered Economy
     * 
     */
    @XmlAttribute(name = "Category")
    protected String category;
    /**
     * The source responsible for the values
     * 
     */
    @XmlAttribute(name = "Source")
    protected String source;

    /**
     * Carbon emission values
     * 
     * Gets the value of the co2Emission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the co2Emission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCO2Emission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CO2Emission }
     * </p>
     * 
     * 
     * @return
     *     The value of the co2Emission property.
     */
    public List<CO2Emission> getCO2Emission() {
        if (co2Emission == null) {
            co2Emission = new ArrayList<>();
        }
        return this.co2Emission;
    }

    /**
     * The total CO2 emission value for the journey
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getTotalValue()
     */
    public void setTotalValue(Float value) {
        this.totalValue = value;
    }

    /**
     * The unit used in the TotalValue attribute
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnit()
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * The category name of the type of cabin, either Economy or Premium.  Premium is any cabin that is not considered Economy
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategory()
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * The source responsible for the values
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
    }

}
