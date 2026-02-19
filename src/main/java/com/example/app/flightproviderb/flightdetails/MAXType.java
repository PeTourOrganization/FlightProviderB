
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MAXType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MAXType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="HoursMax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DaysMax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MonthsMax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OccurIndMax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SameDayMax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="StartIndMax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="CompletionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TmDOWMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="NumOccurMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAXType")
public class MAXType {

    /**
     * Maximum hours. True if unit of time is hours. False if unit of time is not hours.
     * 
     */
    @XmlAttribute(name = "HoursMax")
    protected Boolean hoursMax;
    /**
     * Maximum days. True if unit of time is days. False if unit of time is not days.
     * 
     */
    @XmlAttribute(name = "DaysMax")
    protected Boolean daysMax;
    /**
     * Maximum months. True if unit of time is months. False if unit of time is not months.
     * 
     */
    @XmlAttribute(name = "MonthsMax")
    protected Boolean monthsMax;
    /**
     * Maximum cccurance indicator. True if day of the week is used. False if day of the week is not used.
     * 
     */
    @XmlAttribute(name = "OccurIndMax")
    protected Boolean occurIndMax;
    /**
     * Same day maximum. True if Stay is same day. False if Stay is not same day.
     * 
     */
    @XmlAttribute(name = "SameDayMax")
    protected Boolean sameDayMax;
    /**
     * Start indicator. True if start indicator. False if not a start indicator.
     * 
     */
    @XmlAttribute(name = "StartIndMax")
    protected Boolean startIndMax;
    /**
     * Completion indicator. True if Completion C Indicator. False if not Completion C Indicator.
     * 
     */
    @XmlAttribute(name = "CompletionInd")
    protected Boolean completionInd;
    /**
     * If a max unit of time is true then number corrolates to day of the week starting with 1 for Sunday.
     * 
     */
    @XmlAttribute(name = "TmDOWMax")
    protected BigInteger tmDOWMax;
    /**
     * Number of maximum occurances.
     * 
     */
    @XmlAttribute(name = "NumOccurMax")
    protected BigInteger numOccurMax;

    /**
     * Maximum hours. True if unit of time is hours. False if unit of time is not hours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoursMax() {
        return hoursMax;
    }

    /**
     * Sets the value of the hoursMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHoursMax()
     */
    public void setHoursMax(Boolean value) {
        this.hoursMax = value;
    }

    /**
     * Maximum days. True if unit of time is days. False if unit of time is not days.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaysMax() {
        return daysMax;
    }

    /**
     * Sets the value of the daysMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDaysMax()
     */
    public void setDaysMax(Boolean value) {
        this.daysMax = value;
    }

    /**
     * Maximum months. True if unit of time is months. False if unit of time is not months.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonthsMax() {
        return monthsMax;
    }

    /**
     * Sets the value of the monthsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMonthsMax()
     */
    public void setMonthsMax(Boolean value) {
        this.monthsMax = value;
    }

    /**
     * Maximum cccurance indicator. True if day of the week is used. False if day of the week is not used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccurIndMax() {
        return occurIndMax;
    }

    /**
     * Sets the value of the occurIndMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOccurIndMax()
     */
    public void setOccurIndMax(Boolean value) {
        this.occurIndMax = value;
    }

    /**
     * Same day maximum. True if Stay is same day. False if Stay is not same day.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameDayMax() {
        return sameDayMax;
    }

    /**
     * Sets the value of the sameDayMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSameDayMax()
     */
    public void setSameDayMax(Boolean value) {
        this.sameDayMax = value;
    }

    /**
     * Start indicator. True if start indicator. False if not a start indicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartIndMax() {
        return startIndMax;
    }

    /**
     * Sets the value of the startIndMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isStartIndMax()
     */
    public void setStartIndMax(Boolean value) {
        this.startIndMax = value;
    }

    /**
     * Completion indicator. True if Completion C Indicator. False if not Completion C Indicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompletionInd() {
        return completionInd;
    }

    /**
     * Sets the value of the completionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCompletionInd()
     */
    public void setCompletionInd(Boolean value) {
        this.completionInd = value;
    }

    /**
     * If a max unit of time is true then number corrolates to day of the week starting with 1 for Sunday.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTmDOWMax() {
        return tmDOWMax;
    }

    /**
     * Sets the value of the tmDOWMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTmDOWMax()
     */
    public void setTmDOWMax(BigInteger value) {
        this.tmDOWMax = value;
    }

    /**
     * Number of maximum occurances.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOccurMax() {
        return numOccurMax;
    }

    /**
     * Sets the value of the numOccurMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumOccurMax()
     */
    public void setNumOccurMax(BigInteger value) {
        this.numOccurMax = value;
    }

}
