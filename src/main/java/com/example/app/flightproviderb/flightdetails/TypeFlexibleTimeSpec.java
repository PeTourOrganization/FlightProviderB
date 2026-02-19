
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A type which can be used for flexible date/time specification -extends the generic type typeTimeSpec to provide extra options for search.
 * 
 * <p>Java class for typeFlexibleTimeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeFlexibleTimeSpec">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeTimeSpec">
 *       <sequence>
 *         <element name="SearchExtraDays" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 <attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFlexibleTimeSpec", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "searchExtraDays"
})
public class TypeFlexibleTimeSpec
    extends TypeTimeSpec
{

    /**
     * Options to search for extra days on top of the specified date
     * 
     */
    @XmlElement(name = "SearchExtraDays")
    protected TypeFlexibleTimeSpec.SearchExtraDays searchExtraDays;

    /**
     * Options to search for extra days on top of the specified date
     * 
     * @return
     *     possible object is
     *     {@link TypeFlexibleTimeSpec.SearchExtraDays }
     *     
     */
    public TypeFlexibleTimeSpec.SearchExtraDays getSearchExtraDays() {
        return searchExtraDays;
    }

    /**
     * Sets the value of the searchExtraDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFlexibleTimeSpec.SearchExtraDays }
     *     
     * @see #getSearchExtraDays()
     */
    public void setSearchExtraDays(TypeFlexibleTimeSpec.SearchExtraDays value) {
        this.searchExtraDays = value;
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
     *       <attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       <attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SearchExtraDays {

        /**
         * Number of days to search before the specified date
         * 
         */
        @XmlAttribute(name = "DaysBefore")
        protected Integer daysBefore;
        /**
         * Number of days to search after the specified date
         * 
         */
        @XmlAttribute(name = "DaysAfter")
        protected Integer daysAfter;

        /**
         * Number of days to search before the specified date
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDaysBefore() {
            return daysBefore;
        }

        /**
         * Sets the value of the daysBefore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getDaysBefore()
         */
        public void setDaysBefore(Integer value) {
            this.daysBefore = value;
        }

        /**
         * Number of days to search after the specified date
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDaysAfter() {
            return daysAfter;
        }

        /**
         * Sets the value of the daysAfter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getDaysAfter()
         */
        public void setDaysAfter(Integer value) {
            this.daysAfter = value;
        }

    }

}
