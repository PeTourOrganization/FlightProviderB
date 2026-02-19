
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="Refundability" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Value" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeRefundabilityValue" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="LatestTicketingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="CHG" type="{http://www.travelport.com/schema/air_v54_0}CHGType" minOccurs="0"/>
 *         <element name="MIN" type="{http://www.travelport.com/schema/air_v54_0}MINType" minOccurs="0"/>
 *         <element name="MAX" type="{http://www.travelport.com/schema/air_v54_0}MAXType" minOccurs="0"/>
 *         <element name="ADV" type="{http://www.travelport.com/schema/air_v54_0}ADVType" minOccurs="0"/>
 *         <element name="OTH" type="{http://www.travelport.com/schema/air_v54_0}OTHType" minOccurs="0"/>
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
    "refundability",
    "latestTicketingTime",
    "chg",
    "min",
    "max",
    "adv",
    "oth"
})
@XmlRootElement(name = "FareRulesFilter")
public class FareRulesFilter {

    /**
     * Refundability/Penalty Fare Rules about this fare component.
     * 
     */
    @XmlElement(name = "Refundability")
    protected FareRulesFilter.Refundability refundability;
    /**
     * For Future Use
     * 
     */
    @XmlElement(name = "LatestTicketingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestTicketingTime;
    /**
     * For Penalties
     * 
     */
    @XmlElement(name = "CHG")
    protected CHGType chg;
    /**
     * For Minimum Stay
     * 
     */
    @XmlElement(name = "MIN")
    protected MINType min;
    /**
     * For Maximum Stay
     * 
     */
    @XmlElement(name = "MAX")
    protected MAXType max;
    /**
     * For Advance Res/Tkt
     * 
     */
    @XmlElement(name = "ADV")
    protected ADVType adv;
    /**
     * Other
     * 
     */
    @XmlElement(name = "OTH")
    protected OTHType oth;

    /**
     * Refundability/Penalty Fare Rules about this fare component.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesFilter.Refundability }
     *     
     */
    public FareRulesFilter.Refundability getRefundability() {
        return refundability;
    }

    /**
     * Sets the value of the refundability property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesFilter.Refundability }
     *     
     * @see #getRefundability()
     */
    public void setRefundability(FareRulesFilter.Refundability value) {
        this.refundability = value;
    }

    /**
     * For Future Use
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTicketingTime() {
        return latestTicketingTime;
    }

    /**
     * Sets the value of the latestTicketingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLatestTicketingTime()
     */
    public void setLatestTicketingTime(XMLGregorianCalendar value) {
        this.latestTicketingTime = value;
    }

    /**
     * For Penalties
     * 
     * @return
     *     possible object is
     *     {@link CHGType }
     *     
     */
    public CHGType getCHG() {
        return chg;
    }

    /**
     * Sets the value of the chg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHGType }
     *     
     * @see #getCHG()
     */
    public void setCHG(CHGType value) {
        this.chg = value;
    }

    /**
     * For Minimum Stay
     * 
     * @return
     *     possible object is
     *     {@link MINType }
     *     
     */
    public MINType getMIN() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link MINType }
     *     
     * @see #getMIN()
     */
    public void setMIN(MINType value) {
        this.min = value;
    }

    /**
     * For Maximum Stay
     * 
     * @return
     *     possible object is
     *     {@link MAXType }
     *     
     */
    public MAXType getMAX() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAXType }
     *     
     * @see #getMAX()
     */
    public void setMAX(MAXType value) {
        this.max = value;
    }

    /**
     * For Advance Res/Tkt
     * 
     * @return
     *     possible object is
     *     {@link ADVType }
     *     
     */
    public ADVType getADV() {
        return adv;
    }

    /**
     * Sets the value of the adv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADVType }
     *     
     * @see #getADV()
     */
    public void setADV(ADVType value) {
        this.adv = value;
    }

    /**
     * Other
     * 
     * @return
     *     possible object is
     *     {@link OTHType }
     *     
     */
    public OTHType getOTH() {
        return oth;
    }

    /**
     * Sets the value of the oth property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTHType }
     *     
     * @see #getOTH()
     */
    public void setOTH(OTHType value) {
        this.oth = value;
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
     *       <attribute name="Value" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeRefundabilityValue" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Refundability {

        /**
         * Currently returned: FullyRefundable (1G,1V), RefundableWithPenalty (1G,1V), Refundable (1P),  NonRefundable (1G,1V,1P).Refundable.
         * 
         */
        @XmlAttribute(name = "Value", required = true)
        protected String value;

        /**
         * Currently returned: FullyRefundable (1G,1V), RefundableWithPenalty (1G,1V), Refundable (1P),  NonRefundable (1G,1V,1P).Refundable.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getValue()
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
