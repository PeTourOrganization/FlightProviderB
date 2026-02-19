
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LegPrice" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="CreatedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "legPrice"
})
@XmlRootElement(name = "ExpertSolution")
public class ExpertSolution {

    /**
     * Information about the journey Leg Price
     * 
     */
    @XmlElement(name = "LegPrice", required = true)
    protected List<LegPrice> legPrice;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The Total Price for the Solution.
     * 
     */
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    /**
     * The Converted Total Price in Agency's Default
     *                         Currency Value
     * 
     */
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    /**
     * The Date on which this solution was created
     * 
     */
    @XmlAttribute(name = "CreatedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdDate;

    /**
     * Information about the journey Leg Price
     * 
     * Gets the value of the legPrice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legPrice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLegPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegPrice }
     * </p>
     * 
     * 
     * @return
     *     The value of the legPrice property.
     */
    public List<LegPrice> getLegPrice() {
        if (legPrice == null) {
            legPrice = new ArrayList<>();
        }
        return this.legPrice;
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
     * The Total Price for the Solution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTotalPrice()
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * The Converted Total Price in Agency's Default
     *                         Currency Value
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateTotalPrice()
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * The Date on which this solution was created
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreatedDate()
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

}
