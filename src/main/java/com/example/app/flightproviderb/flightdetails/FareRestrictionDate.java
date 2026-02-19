
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Direction" type="{http://www.travelport.com/schema/air_v54_0}typeFareDirectionality" />
 *       <attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EndDateIndicator">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Commence"/>
 *             <enumeration value="Complete"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FareRestrictionDate")
public class FareRestrictionDate {

    @XmlAttribute(name = "Direction")
    protected TypeFareDirectionality direction;
    @XmlAttribute(name = "StartDate")
    protected String startDate;
    @XmlAttribute(name = "EndDate")
    protected String endDate;
    /**
     * This field indicates the end date/last date
     *                         for which travel on the fare component being validated must be
     *                         commenced or completed
     * 
     */
    @XmlAttribute(name = "EndDateIndicator")
    protected String endDateIndicator;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareDirectionality }
     *     
     */
    public TypeFareDirectionality getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareDirectionality }
     *     
     */
    public void setDirection(TypeFareDirectionality value) {
        this.direction = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * This field indicates the end date/last date
     *                         for which travel on the fare component being validated must be
     *                         commenced or completed
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateIndicator() {
        return endDateIndicator;
    }

    /**
     * Sets the value of the endDateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEndDateIndicator()
     */
    public void setEndDateIndicator(String value) {
        this.endDateIndicator = value;
    }

}
