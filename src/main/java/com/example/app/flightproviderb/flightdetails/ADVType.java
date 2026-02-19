
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADVType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ADVType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="AdvRsvnOnlyIfTk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnAnyTm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnHrs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnDays" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnEarliestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnLatestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnDataExists" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnEndItem" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkEarliestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkLatestTm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkRsvnHrs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkRsvnDays" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkRsvnMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkStartHrs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkStartDays" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkStartMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkWaived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkAnyTm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvTkEndItem" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AdvRsvnTm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="AdvTkRsvnTm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="AdvTkStartTm" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="EarliestRsvnDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="EarliestTkDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LatestRsvnDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LatestTkDtPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="EarliestRsvnDt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="EarliestTkDt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="LatestRsvnDt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="LatestTkDt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADVType")
public class ADVType {

    /**
     * Reservation only if ticketed. True is advanced reservations only if tickets. False is no advanced reservations
     * 
     */
    @XmlAttribute(name = "AdvRsvnOnlyIfTk")
    protected Boolean advRsvnOnlyIfTk;
    /**
     * Reservation anytime. True if advanced reservatiosn anytime. False if advanced reservations for a limited time.
     * 
     */
    @XmlAttribute(name = "AdvRsvnAnyTm")
    protected Boolean advRsvnAnyTm;
    /**
     * Reservation hours. True if advanced reservation time in hours. False if advanced reservation time not in hours.
     * 
     */
    @XmlAttribute(name = "AdvRsvnHrs")
    protected Boolean advRsvnHrs;
    /**
     * Reservation days. True if advanced reservation time in days. False if advanced reservation time not in days.
     * 
     */
    @XmlAttribute(name = "AdvRsvnDays")
    protected Boolean advRsvnDays;
    /**
     * Reservation months. True if advanced reservation time in months. False if advanced reservation time not in months.
     * 
     */
    @XmlAttribute(name = "AdvRsvnMonths")
    protected Boolean advRsvnMonths;
    /**
     * Earliest reservation time. True if advanced reservations time is earliest permitted. False is advanced reservation time not earliest permitted time.
     * 
     */
    @XmlAttribute(name = "AdvRsvnEarliestTm")
    protected Boolean advRsvnEarliestTm;
    /**
     * Latest reservation time. True if advanced reservations time is latest permitted. False is advanced reservation time not latest permitted time.
     * 
     */
    @XmlAttribute(name = "AdvRsvnLatestTm")
    protected Boolean advRsvnLatestTm;
    /**
     * Reservation Waived. True if advanced reservation waived. False if advanced reservation not waived.
     * 
     */
    @XmlAttribute(name = "AdvRsvnWaived")
    protected Boolean advRsvnWaived;
    /**
     * Reservation data exists. True if advanced reservation data exists. False if advanced reservation data does not exist.
     * 
     */
    @XmlAttribute(name = "AdvRsvnDataExists")
    protected Boolean advRsvnDataExists;
    /**
     * Reservation end item. True if advanced reservation end item and more values. False if it does not exist.
     * 
     */
    @XmlAttribute(name = "AdvRsvnEndItem")
    protected Boolean advRsvnEndItem;
    /**
     * Earliest ticketing time. True if earliest permitted. False if not earliest permitted.
     * 
     */
    @XmlAttribute(name = "AdvTkEarliestTm")
    protected Boolean advTkEarliestTm;
    /**
     * Latest ticketing time. True if time is latest permitted. False if time is not latest permitted.
     * 
     */
    @XmlAttribute(name = "AdvTkLatestTm")
    protected Boolean advTkLatestTm;
    /**
     * Ticketing reservation hours. True if in hours. False if not in hours.
     * 
     */
    @XmlAttribute(name = "AdvTkRsvnHrs")
    protected Boolean advTkRsvnHrs;
    /**
     * Ticketing reservation days. True if in days. False if not in days.
     * 
     */
    @XmlAttribute(name = "AdvTkRsvnDays")
    protected Boolean advTkRsvnDays;
    /**
     * Ticketing reservation months. True if in months. False if not in months.
     * 
     */
    @XmlAttribute(name = "AdvTkRsvnMonths")
    protected Boolean advTkRsvnMonths;
    /**
     * Latest ticketing departure. True if time is latest permitted. False if time is not latest permitted.
     * 
     */
    @XmlAttribute(name = "AdvTkStartHrs")
    protected Boolean advTkStartHrs;
    /**
     * Ticketing departure days. True if in days. False if not in days.
     * 
     */
    @XmlAttribute(name = "AdvTkStartDays")
    protected Boolean advTkStartDays;
    /**
     * Ticketing reservation months. True if in months. False if not in months.
     * 
     */
    @XmlAttribute(name = "AdvTkStartMonths")
    protected Boolean advTkStartMonths;
    /**
     * Ticketing waived. True if waived. False if not waived.
     * 
     */
    @XmlAttribute(name = "AdvTkWaived")
    protected Boolean advTkWaived;
    /**
     * Ticketing anytime. True if anytime. False if limited time.
     * 
     */
    @XmlAttribute(name = "AdvTkAnyTm")
    protected Boolean advTkAnyTm;
    /**
     * Ticketing end item. True if advanced ticketing item and more values. False if end item does not exist.
     * 
     */
    @XmlAttribute(name = "AdvTkEndItem")
    protected Boolean advTkEndItem;
    /**
     * Advanced reservation time.
     * 
     */
    @XmlAttribute(name = "AdvRsvnTm")
    protected BigInteger advRsvnTm;
    /**
     * Advanced ticketing reservation time.
     * 
     */
    @XmlAttribute(name = "AdvTkRsvnTm")
    protected BigInteger advTkRsvnTm;
    /**
     * Advanced ticketing departure time.
     * 
     */
    @XmlAttribute(name = "AdvTkStartTm")
    protected BigInteger advTkStartTm;
    /**
     * Earliest reservation date. True if date is present. False if date is not present.
     * 
     */
    @XmlAttribute(name = "EarliestRsvnDtPresent")
    protected Boolean earliestRsvnDtPresent;
    /**
     * Earliest ticketing date. True if date is present. False if date is not present.
     * 
     */
    @XmlAttribute(name = "EarliestTkDtPresent")
    protected Boolean earliestTkDtPresent;
    /**
     * Latest reservation date. True if date is present. False if date is not present.
     * 
     */
    @XmlAttribute(name = "LatestRsvnDtPresent")
    protected Boolean latestRsvnDtPresent;
    /**
     * Latest ticketing date.  True if date is present. False if date is not present.
     * 
     */
    @XmlAttribute(name = "LatestTkDtPresent")
    protected Boolean latestTkDtPresent;
    /**
     * Earliest reservation date.
     * 
     */
    @XmlAttribute(name = "EarliestRsvnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestRsvnDt;
    /**
     * Earliest ticketing date.
     * 
     */
    @XmlAttribute(name = "EarliestTkDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestTkDt;
    /**
     * Latest reservation date.
     * 
     */
    @XmlAttribute(name = "LatestRsvnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestRsvnDt;
    /**
     * Latest ticketing date.
     * 
     */
    @XmlAttribute(name = "LatestTkDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestTkDt;

    /**
     * Reservation only if ticketed. True is advanced reservations only if tickets. False is no advanced reservations
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnOnlyIfTk() {
        return advRsvnOnlyIfTk;
    }

    /**
     * Sets the value of the advRsvnOnlyIfTk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnOnlyIfTk()
     */
    public void setAdvRsvnOnlyIfTk(Boolean value) {
        this.advRsvnOnlyIfTk = value;
    }

    /**
     * Reservation anytime. True if advanced reservatiosn anytime. False if advanced reservations for a limited time.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnAnyTm() {
        return advRsvnAnyTm;
    }

    /**
     * Sets the value of the advRsvnAnyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnAnyTm()
     */
    public void setAdvRsvnAnyTm(Boolean value) {
        this.advRsvnAnyTm = value;
    }

    /**
     * Reservation hours. True if advanced reservation time in hours. False if advanced reservation time not in hours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnHrs() {
        return advRsvnHrs;
    }

    /**
     * Sets the value of the advRsvnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnHrs()
     */
    public void setAdvRsvnHrs(Boolean value) {
        this.advRsvnHrs = value;
    }

    /**
     * Reservation days. True if advanced reservation time in days. False if advanced reservation time not in days.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnDays() {
        return advRsvnDays;
    }

    /**
     * Sets the value of the advRsvnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnDays()
     */
    public void setAdvRsvnDays(Boolean value) {
        this.advRsvnDays = value;
    }

    /**
     * Reservation months. True if advanced reservation time in months. False if advanced reservation time not in months.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnMonths() {
        return advRsvnMonths;
    }

    /**
     * Sets the value of the advRsvnMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnMonths()
     */
    public void setAdvRsvnMonths(Boolean value) {
        this.advRsvnMonths = value;
    }

    /**
     * Earliest reservation time. True if advanced reservations time is earliest permitted. False is advanced reservation time not earliest permitted time.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnEarliestTm() {
        return advRsvnEarliestTm;
    }

    /**
     * Sets the value of the advRsvnEarliestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnEarliestTm()
     */
    public void setAdvRsvnEarliestTm(Boolean value) {
        this.advRsvnEarliestTm = value;
    }

    /**
     * Latest reservation time. True if advanced reservations time is latest permitted. False is advanced reservation time not latest permitted time.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnLatestTm() {
        return advRsvnLatestTm;
    }

    /**
     * Sets the value of the advRsvnLatestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnLatestTm()
     */
    public void setAdvRsvnLatestTm(Boolean value) {
        this.advRsvnLatestTm = value;
    }

    /**
     * Reservation Waived. True if advanced reservation waived. False if advanced reservation not waived.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnWaived() {
        return advRsvnWaived;
    }

    /**
     * Sets the value of the advRsvnWaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnWaived()
     */
    public void setAdvRsvnWaived(Boolean value) {
        this.advRsvnWaived = value;
    }

    /**
     * Reservation data exists. True if advanced reservation data exists. False if advanced reservation data does not exist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnDataExists() {
        return advRsvnDataExists;
    }

    /**
     * Sets the value of the advRsvnDataExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnDataExists()
     */
    public void setAdvRsvnDataExists(Boolean value) {
        this.advRsvnDataExists = value;
    }

    /**
     * Reservation end item. True if advanced reservation end item and more values. False if it does not exist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvRsvnEndItem() {
        return advRsvnEndItem;
    }

    /**
     * Sets the value of the advRsvnEndItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvRsvnEndItem()
     */
    public void setAdvRsvnEndItem(Boolean value) {
        this.advRsvnEndItem = value;
    }

    /**
     * Earliest ticketing time. True if earliest permitted. False if not earliest permitted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkEarliestTm() {
        return advTkEarliestTm;
    }

    /**
     * Sets the value of the advTkEarliestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkEarliestTm()
     */
    public void setAdvTkEarliestTm(Boolean value) {
        this.advTkEarliestTm = value;
    }

    /**
     * Latest ticketing time. True if time is latest permitted. False if time is not latest permitted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkLatestTm() {
        return advTkLatestTm;
    }

    /**
     * Sets the value of the advTkLatestTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkLatestTm()
     */
    public void setAdvTkLatestTm(Boolean value) {
        this.advTkLatestTm = value;
    }

    /**
     * Ticketing reservation hours. True if in hours. False if not in hours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkRsvnHrs() {
        return advTkRsvnHrs;
    }

    /**
     * Sets the value of the advTkRsvnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkRsvnHrs()
     */
    public void setAdvTkRsvnHrs(Boolean value) {
        this.advTkRsvnHrs = value;
    }

    /**
     * Ticketing reservation days. True if in days. False if not in days.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkRsvnDays() {
        return advTkRsvnDays;
    }

    /**
     * Sets the value of the advTkRsvnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkRsvnDays()
     */
    public void setAdvTkRsvnDays(Boolean value) {
        this.advTkRsvnDays = value;
    }

    /**
     * Ticketing reservation months. True if in months. False if not in months.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkRsvnMonths() {
        return advTkRsvnMonths;
    }

    /**
     * Sets the value of the advTkRsvnMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkRsvnMonths()
     */
    public void setAdvTkRsvnMonths(Boolean value) {
        this.advTkRsvnMonths = value;
    }

    /**
     * Latest ticketing departure. True if time is latest permitted. False if time is not latest permitted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkStartHrs() {
        return advTkStartHrs;
    }

    /**
     * Sets the value of the advTkStartHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkStartHrs()
     */
    public void setAdvTkStartHrs(Boolean value) {
        this.advTkStartHrs = value;
    }

    /**
     * Ticketing departure days. True if in days. False if not in days.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkStartDays() {
        return advTkStartDays;
    }

    /**
     * Sets the value of the advTkStartDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkStartDays()
     */
    public void setAdvTkStartDays(Boolean value) {
        this.advTkStartDays = value;
    }

    /**
     * Ticketing reservation months. True if in months. False if not in months.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkStartMonths() {
        return advTkStartMonths;
    }

    /**
     * Sets the value of the advTkStartMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkStartMonths()
     */
    public void setAdvTkStartMonths(Boolean value) {
        this.advTkStartMonths = value;
    }

    /**
     * Ticketing waived. True if waived. False if not waived.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkWaived() {
        return advTkWaived;
    }

    /**
     * Sets the value of the advTkWaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkWaived()
     */
    public void setAdvTkWaived(Boolean value) {
        this.advTkWaived = value;
    }

    /**
     * Ticketing anytime. True if anytime. False if limited time.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkAnyTm() {
        return advTkAnyTm;
    }

    /**
     * Sets the value of the advTkAnyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkAnyTm()
     */
    public void setAdvTkAnyTm(Boolean value) {
        this.advTkAnyTm = value;
    }

    /**
     * Ticketing end item. True if advanced ticketing item and more values. False if end item does not exist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTkEndItem() {
        return advTkEndItem;
    }

    /**
     * Sets the value of the advTkEndItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdvTkEndItem()
     */
    public void setAdvTkEndItem(Boolean value) {
        this.advTkEndItem = value;
    }

    /**
     * Advanced reservation time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvRsvnTm() {
        return advRsvnTm;
    }

    /**
     * Sets the value of the advRsvnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getAdvRsvnTm()
     */
    public void setAdvRsvnTm(BigInteger value) {
        this.advRsvnTm = value;
    }

    /**
     * Advanced ticketing reservation time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvTkRsvnTm() {
        return advTkRsvnTm;
    }

    /**
     * Sets the value of the advTkRsvnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getAdvTkRsvnTm()
     */
    public void setAdvTkRsvnTm(BigInteger value) {
        this.advTkRsvnTm = value;
    }

    /**
     * Advanced ticketing departure time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvTkStartTm() {
        return advTkStartTm;
    }

    /**
     * Sets the value of the advTkStartTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getAdvTkStartTm()
     */
    public void setAdvTkStartTm(BigInteger value) {
        this.advTkStartTm = value;
    }

    /**
     * Earliest reservation date. True if date is present. False if date is not present.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestRsvnDtPresent() {
        return earliestRsvnDtPresent;
    }

    /**
     * Sets the value of the earliestRsvnDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEarliestRsvnDtPresent()
     */
    public void setEarliestRsvnDtPresent(Boolean value) {
        this.earliestRsvnDtPresent = value;
    }

    /**
     * Earliest ticketing date. True if date is present. False if date is not present.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestTkDtPresent() {
        return earliestTkDtPresent;
    }

    /**
     * Sets the value of the earliestTkDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEarliestTkDtPresent()
     */
    public void setEarliestTkDtPresent(Boolean value) {
        this.earliestTkDtPresent = value;
    }

    /**
     * Latest reservation date. True if date is present. False if date is not present.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestRsvnDtPresent() {
        return latestRsvnDtPresent;
    }

    /**
     * Sets the value of the latestRsvnDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLatestRsvnDtPresent()
     */
    public void setLatestRsvnDtPresent(Boolean value) {
        this.latestRsvnDtPresent = value;
    }

    /**
     * Latest ticketing date.  True if date is present. False if date is not present.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestTkDtPresent() {
        return latestTkDtPresent;
    }

    /**
     * Sets the value of the latestTkDtPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLatestTkDtPresent()
     */
    public void setLatestTkDtPresent(Boolean value) {
        this.latestTkDtPresent = value;
    }

    /**
     * Earliest reservation date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestRsvnDt() {
        return earliestRsvnDt;
    }

    /**
     * Sets the value of the earliestRsvnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEarliestRsvnDt()
     */
    public void setEarliestRsvnDt(XMLGregorianCalendar value) {
        this.earliestRsvnDt = value;
    }

    /**
     * Earliest ticketing date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestTkDt() {
        return earliestTkDt;
    }

    /**
     * Sets the value of the earliestTkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEarliestTkDt()
     */
    public void setEarliestTkDt(XMLGregorianCalendar value) {
        this.earliestTkDt = value;
    }

    /**
     * Latest reservation date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestRsvnDt() {
        return latestRsvnDt;
    }

    /**
     * Sets the value of the latestRsvnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLatestRsvnDt()
     */
    public void setLatestRsvnDt(XMLGregorianCalendar value) {
        this.latestRsvnDt = value;
    }

    /**
     * Latest ticketing date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTkDt() {
        return latestTkDt;
    }

    /**
     * Sets the value of the latestTkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLatestTkDt()
     */
    public void setLatestTkDt(XMLGregorianCalendar value) {
        this.latestTkDt = value;
    }

}
