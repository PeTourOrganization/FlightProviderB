
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
 * Account Related Rules for pre pay profiles
 * 
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingRulesFareReference" maxOccurs="999" minOccurs="0"/>
 *         <element name="RuleInfo" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}ChargesRules" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Restriction" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DocumentRequired" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="GenderDobRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingRulesFareReference",
    "ruleInfo",
    "restriction",
    "documentRequired"
})
@XmlRootElement(name = "BookingRules")
public class BookingRules {

    /**
     * Fare Reference associated with the BookingRules. Containing a text container for vendor response text.
     * 
     */
    @XmlElement(name = "BookingRulesFareReference")
    protected List<BookingRulesFareReference> bookingRulesFareReference;
    /**
     * Pre pay booking rule information
     * 
     */
    @XmlElement(name = "RuleInfo")
    protected List<BookingRules.RuleInfo> ruleInfo;
    /**
     * Booking restrictions for associated pre pay account
     * 
     */
    @XmlElement(name = "Restriction")
    protected List<Restriction2> restriction;
    /**
     * Detail about required documents for this pre pay id
     * 
     */
    @XmlElement(name = "DocumentRequired")
    protected List<DocumentRequired> documentRequired;
    /**
     * Vendor populates if gender/DOB data is required in book.
     * 
     */
    @XmlAttribute(name = "GenderDobRequired")
    protected Boolean genderDobRequired;

    /**
     * Fare Reference associated with the BookingRules. Containing a text container for vendor response text.
     * 
     * Gets the value of the bookingRulesFareReference property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRulesFareReference property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingRulesFareReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRulesFareReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingRulesFareReference property.
     */
    public List<BookingRulesFareReference> getBookingRulesFareReference() {
        if (bookingRulesFareReference == null) {
            bookingRulesFareReference = new ArrayList<>();
        }
        return this.bookingRulesFareReference;
    }

    /**
     * Pre pay booking rule information
     * 
     * Gets the value of the ruleInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRuleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRules.RuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ruleInfo property.
     */
    public List<BookingRules.RuleInfo> getRuleInfo() {
        if (ruleInfo == null) {
            ruleInfo = new ArrayList<>();
        }
        return this.ruleInfo;
    }

    /**
     * Booking restrictions for associated pre pay account
     * 
     * Gets the value of the restriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the restriction property.
     */
    public List<Restriction2> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<>();
        }
        return this.restriction;
    }

    /**
     * Detail about required documents for this pre pay id
     * 
     * Gets the value of the documentRequired property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentRequired property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentRequired().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRequired }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentRequired property.
     */
    public List<DocumentRequired> getDocumentRequired() {
        if (documentRequired == null) {
            documentRequired = new ArrayList<>();
        }
        return this.documentRequired;
    }

    /**
     * Vendor populates if gender/DOB data is required in book.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenderDobRequired() {
        return genderDobRequired;
    }

    /**
     * Sets the value of the genderDobRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isGenderDobRequired()
     */
    public void setGenderDobRequired(Boolean value) {
        this.genderDobRequired = value;
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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}ChargesRules" minOccurs="0"/>
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
        "chargesRules"
    })
    public static class RuleInfo {

        /**
         * Fare Reference associated with the BookingRules
         * 
         */
        @XmlElement(name = "ChargesRules")
        protected ChargesRules chargesRules;

        /**
         * Fare Reference associated with the BookingRules
         * 
         * @return
         *     possible object is
         *     {@link ChargesRules }
         *     
         */
        public ChargesRules getChargesRules() {
            return chargesRules;
        }

        /**
         * Sets the value of the chargesRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChargesRules }
         *     
         * @see #getChargesRules()
         */
        public void setChargesRules(ChargesRules value) {
            this.chargesRules = value;
        }

    }

}
