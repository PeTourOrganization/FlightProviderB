
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
 *         <element name="DaysOfWeekRestriction" maxOccurs="3" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrDOW"/>
 *                 <attribute name="RestrictionExistsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="Application" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="IncludeExcludeUseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RestrictionPassengerTypes" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="MaxNbrTravelers" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="TotalNbrPTC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "daysOfWeekRestriction",
    "restrictionPassengerTypes"
})
@XmlRootElement(name = "Restriction")
public class Restriction2 {

    @XmlElement(name = "DaysOfWeekRestriction")
    protected List<Restriction2 .DaysOfWeekRestriction> daysOfWeekRestriction;
    @XmlElement(name = "RestrictionPassengerTypes")
    protected List<Restriction2 .RestrictionPassengerTypes> restrictionPassengerTypes;

    /**
     * Gets the value of the daysOfWeekRestriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeekRestriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDaysOfWeekRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction2 .DaysOfWeekRestriction }
     * </p>
     * 
     * 
     * @return
     *     The value of the daysOfWeekRestriction property.
     */
    public List<Restriction2 .DaysOfWeekRestriction> getDaysOfWeekRestriction() {
        if (daysOfWeekRestriction == null) {
            daysOfWeekRestriction = new ArrayList<>();
        }
        return this.daysOfWeekRestriction;
    }

    /**
     * Gets the value of the restrictionPassengerTypes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionPassengerTypes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRestrictionPassengerTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction2 .RestrictionPassengerTypes }
     * </p>
     * 
     * 
     * @return
     *     The value of the restrictionPassengerTypes property.
     */
    public List<Restriction2 .RestrictionPassengerTypes> getRestrictionPassengerTypes() {
        if (restrictionPassengerTypes == null) {
            restrictionPassengerTypes = new ArrayList<>();
        }
        return this.restrictionPassengerTypes;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrDOW"/>
     *       <attribute name="RestrictionExistsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="Application" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="IncludeExcludeUseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DaysOfWeekRestriction {

        @XmlAttribute(name = "RestrictionExistsInd")
        protected Boolean restrictionExistsInd;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "IncludeExcludeUseInd")
        protected Boolean includeExcludeUseInd;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Wed")
        protected Boolean wed;
        @XmlAttribute(name = "Thu")
        protected Boolean thu;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;

        /**
         * Gets the value of the restrictionExistsInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRestrictionExistsInd() {
            return restrictionExistsInd;
        }

        /**
         * Sets the value of the restrictionExistsInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRestrictionExistsInd(Boolean value) {
            this.restrictionExistsInd = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the includeExcludeUseInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeExcludeUseInd() {
            return includeExcludeUseInd;
        }

        /**
         * Sets the value of the includeExcludeUseInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeExcludeUseInd(Boolean value) {
            this.includeExcludeUseInd = value;
        }

        /**
         * Gets the value of the mon property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Sets the value of the mon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Gets the value of the tue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Sets the value of the tue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Gets the value of the wed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWed() {
            return wed;
        }

        /**
         * Sets the value of the wed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWed(Boolean value) {
            this.wed = value;
        }

        /**
         * Gets the value of the thu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThu() {
            return thu;
        }

        /**
         * Sets the value of the thu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThu(Boolean value) {
            this.thu = value;
        }

        /**
         * Gets the value of the fri property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Sets the value of the fri property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * Gets the value of the sun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Sets the value of the sun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="MaxNbrTravelers" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="TotalNbrPTC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionPassengerTypes {

        @XmlAttribute(name = "MaxNbrTravelers")
        protected String maxNbrTravelers;
        @XmlAttribute(name = "TotalNbrPTC")
        protected String totalNbrPTC;

        /**
         * Gets the value of the maxNbrTravelers property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxNbrTravelers() {
            return maxNbrTravelers;
        }

        /**
         * Sets the value of the maxNbrTravelers property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxNbrTravelers(String value) {
            this.maxNbrTravelers = value;
        }

        /**
         * Gets the value of the totalNbrPTC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalNbrPTC() {
            return totalNbrPTC;
        }

        /**
         * Sets the value of the totalNbrPTC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalNbrPTC(String value) {
            this.totalNbrPTC = value;
        }

    }

}
