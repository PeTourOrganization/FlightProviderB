
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRestrictionDaysOfWeek" maxOccurs="3" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRestrictionDate" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRestrictionSaleDate" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRestrictionSeasonal" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="FareRestrictiontype" type="{http://www.travelport.com/schema/air_v54_0}typeFareRestrictionType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareRestrictionDaysOfWeek",
    "fareRestrictionDate",
    "fareRestrictionSaleDate",
    "fareRestrictionSeasonal"
})
@XmlRootElement(name = "FareRestriction")
public class FareRestriction {

    /**
     * Days of the week that the restriction applies
     *                 too.
     * 
     */
    @XmlElement(name = "FareRestrictionDaysOfWeek")
    protected List<FareRestrictionDaysOfWeek> fareRestrictionDaysOfWeek;
    /**
     * Fare restriction based on date ranges.
     *                 StartDate and EndDate are strings representing respective dates. If
     *                 a year component is present then it signifies an exact date. If only
     *                 day and month components are present then it signifies a seasonal
     *                 date, which means applicable for that date in any year
     * 
     */
    @XmlElement(name = "FareRestrictionDate")
    protected List<FareRestrictionDate> fareRestrictionDate;
    /**
     * Restrict when this fare can be sold
     * 
     */
    @XmlElement(name = "FareRestrictionSaleDate")
    protected FareRestrictionSaleDate fareRestrictionSaleDate;
    /**
     * Fares Restricted based on the season requested.
     * 				StartDate and EndDate are strings representing respective dates. If
     *                 a year component is present then it signifies an exact date. If only
     *                 day and month components are present then it signifies a seasonal
     *                 date, which means applicable for that date in any year
     * 
     */
    @XmlElement(name = "FareRestrictionSeasonal")
    protected List<FareRestrictionSeasonal> fareRestrictionSeasonal;
    @XmlAttribute(name = "FareRestrictiontype")
    protected TypeFareRestrictionType fareRestrictiontype;

    /**
     * Days of the week that the restriction applies
     *                 too.
     * 
     * Gets the value of the fareRestrictionDaysOfWeek property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictionDaysOfWeek property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRestrictionDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictionDaysOfWeek }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRestrictionDaysOfWeek property.
     */
    public List<FareRestrictionDaysOfWeek> getFareRestrictionDaysOfWeek() {
        if (fareRestrictionDaysOfWeek == null) {
            fareRestrictionDaysOfWeek = new ArrayList<>();
        }
        return this.fareRestrictionDaysOfWeek;
    }

    /**
     * Fare restriction based on date ranges.
     *                 StartDate and EndDate are strings representing respective dates. If
     *                 a year component is present then it signifies an exact date. If only
     *                 day and month components are present then it signifies a seasonal
     *                 date, which means applicable for that date in any year
     * 
     * Gets the value of the fareRestrictionDate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictionDate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRestrictionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictionDate }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRestrictionDate property.
     */
    public List<FareRestrictionDate> getFareRestrictionDate() {
        if (fareRestrictionDate == null) {
            fareRestrictionDate = new ArrayList<>();
        }
        return this.fareRestrictionDate;
    }

    /**
     * Restrict when this fare can be sold
     * 
     * @return
     *     possible object is
     *     {@link FareRestrictionSaleDate }
     *     
     */
    public FareRestrictionSaleDate getFareRestrictionSaleDate() {
        return fareRestrictionSaleDate;
    }

    /**
     * Sets the value of the fareRestrictionSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRestrictionSaleDate }
     *     
     * @see #getFareRestrictionSaleDate()
     */
    public void setFareRestrictionSaleDate(FareRestrictionSaleDate value) {
        this.fareRestrictionSaleDate = value;
    }

    /**
     * Fares Restricted based on the season requested.
     * 				StartDate and EndDate are strings representing respective dates. If
     *                 a year component is present then it signifies an exact date. If only
     *                 day and month components are present then it signifies a seasonal
     *                 date, which means applicable for that date in any year
     * 
     * Gets the value of the fareRestrictionSeasonal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictionSeasonal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRestrictionSeasonal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictionSeasonal }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRestrictionSeasonal property.
     */
    public List<FareRestrictionSeasonal> getFareRestrictionSeasonal() {
        if (fareRestrictionSeasonal == null) {
            fareRestrictionSeasonal = new ArrayList<>();
        }
        return this.fareRestrictionSeasonal;
    }

    /**
     * Gets the value of the fareRestrictiontype property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRestrictionType }
     *     
     */
    public TypeFareRestrictionType getFareRestrictiontype() {
        return fareRestrictiontype;
    }

    /**
     * Sets the value of the fareRestrictiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRestrictionType }
     *     
     */
    public void setFareRestrictiontype(TypeFareRestrictionType value) {
        this.fareRestrictiontype = value;
    }

}
