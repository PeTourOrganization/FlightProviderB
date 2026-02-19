
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MINType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MINType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="HoursMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DaysMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MonthsMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OccurIndMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SameDayMin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TmDOWMin" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="FareComponent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="NumOccurMin" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MINType")
public class MINType {

    /**
     * Minimum hours. True if unit of time is hours.  False if unit of time is not hours.
     * 
     */
    @XmlAttribute(name = "HoursMin")
    protected Boolean hoursMin;
    /**
     * Minimum days. True if unit of time is days. False if unit of time is not days.
     * 
     */
    @XmlAttribute(name = "DaysMin")
    protected Boolean daysMin;
    /**
     * Minimum months. True if unit of time is months. False if unit of time is not months.
     * 
     */
    @XmlAttribute(name = "MonthsMin")
    protected Boolean monthsMin;
    /**
     * Minimum occurance indicator. True if day of the week is used. False if day of the week is not used.
     * 
     */
    @XmlAttribute(name = "OccurIndMin")
    protected Boolean occurIndMin;
    /**
     * Same day minimum. True if Stay is same day. False if Stay is not same day.
     * 
     */
    @XmlAttribute(name = "SameDayMin")
    protected Boolean sameDayMin;
    /**
     * If a min unit of time is true then number corrolates to day of the week starting with 1 for Sunday.
     * 
     */
    @XmlAttribute(name = "TmDOWMin")
    protected BigInteger tmDOWMin;
    /**
     * Fare component number of the most restrictive fare.
     * 
     */
    @XmlAttribute(name = "FareComponent")
    protected BigInteger fareComponent;
    /**
     * Number of min occurances. This field is used in conjunction with the Day of Week.
     * 
     */
    @XmlAttribute(name = "NumOccurMin")
    protected BigInteger numOccurMin;

    /**
     * Minimum hours. True if unit of time is hours.  False if unit of time is not hours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoursMin() {
        return hoursMin;
    }

    /**
     * Sets the value of the hoursMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHoursMin()
     */
    public void setHoursMin(Boolean value) {
        this.hoursMin = value;
    }

    /**
     * Minimum days. True if unit of time is days. False if unit of time is not days.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaysMin() {
        return daysMin;
    }

    /**
     * Sets the value of the daysMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDaysMin()
     */
    public void setDaysMin(Boolean value) {
        this.daysMin = value;
    }

    /**
     * Minimum months. True if unit of time is months. False if unit of time is not months.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonthsMin() {
        return monthsMin;
    }

    /**
     * Sets the value of the monthsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMonthsMin()
     */
    public void setMonthsMin(Boolean value) {
        this.monthsMin = value;
    }

    /**
     * Minimum occurance indicator. True if day of the week is used. False if day of the week is not used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccurIndMin() {
        return occurIndMin;
    }

    /**
     * Sets the value of the occurIndMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOccurIndMin()
     */
    public void setOccurIndMin(Boolean value) {
        this.occurIndMin = value;
    }

    /**
     * Same day minimum. True if Stay is same day. False if Stay is not same day.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameDayMin() {
        return sameDayMin;
    }

    /**
     * Sets the value of the sameDayMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSameDayMin()
     */
    public void setSameDayMin(Boolean value) {
        this.sameDayMin = value;
    }

    /**
     * If a min unit of time is true then number corrolates to day of the week starting with 1 for Sunday.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTmDOWMin() {
        return tmDOWMin;
    }

    /**
     * Sets the value of the tmDOWMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTmDOWMin()
     */
    public void setTmDOWMin(BigInteger value) {
        this.tmDOWMin = value;
    }

    /**
     * Fare component number of the most restrictive fare.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFareComponent() {
        return fareComponent;
    }

    /**
     * Sets the value of the fareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getFareComponent()
     */
    public void setFareComponent(BigInteger value) {
        this.fareComponent = value;
    }

    /**
     * Number of min occurances. This field is used in conjunction with the Day of Week.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOccurMin() {
        return numOccurMin;
    }

    /**
     * Sets the value of the numOccurMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumOccurMin()
     */
    public void setNumOccurMin(BigInteger value) {
        this.numOccurMin = value;
    }

}
