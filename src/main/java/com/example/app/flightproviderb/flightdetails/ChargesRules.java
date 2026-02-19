
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
 *         <element name="VoluntaryChanges" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}Penalty" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="VoluntaryRefunds" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}Penalty" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "voluntaryChanges",
    "voluntaryRefunds"
})
@XmlRootElement(name = "ChargesRules")
public class ChargesRules {

    @XmlElement(name = "VoluntaryChanges")
    protected List<ChargesRules.VoluntaryChanges> voluntaryChanges;
    @XmlElement(name = "VoluntaryRefunds")
    protected List<ChargesRules.VoluntaryRefunds> voluntaryRefunds;

    /**
     * Gets the value of the voluntaryChanges property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voluntaryChanges property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVoluntaryChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesRules.VoluntaryChanges }
     * </p>
     * 
     * 
     * @return
     *     The value of the voluntaryChanges property.
     */
    public List<ChargesRules.VoluntaryChanges> getVoluntaryChanges() {
        if (voluntaryChanges == null) {
            voluntaryChanges = new ArrayList<>();
        }
        return this.voluntaryChanges;
    }

    /**
     * Gets the value of the voluntaryRefunds property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voluntaryRefunds property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVoluntaryRefunds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesRules.VoluntaryRefunds }
     * </p>
     * 
     * 
     * @return
     *     The value of the voluntaryRefunds property.
     */
    public List<ChargesRules.VoluntaryRefunds> getVoluntaryRefunds() {
        if (voluntaryRefunds == null) {
            voluntaryRefunds = new ArrayList<>();
        }
        return this.voluntaryRefunds;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}Penalty" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penalty"
    })
    public static class VoluntaryChanges {

        @XmlElement(name = "Penalty")
        protected Penalty2 penalty;
        @XmlAttribute(name = "VolChangeInd")
        protected Boolean volChangeInd;

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link Penalty2 }
         *     
         */
        public Penalty2 getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Penalty2 }
         *     
         */
        public void setPenalty(Penalty2 value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the volChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVolChangeInd() {
            return volChangeInd;
        }

        /**
         * Sets the value of the volChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVolChangeInd(Boolean value) {
            this.volChangeInd = value;
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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}Penalty" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penalty"
    })
    public static class VoluntaryRefunds {

        @XmlElement(name = "Penalty")
        protected Penalty2 penalty;
        @XmlAttribute(name = "VolChangeInd")
        protected Boolean volChangeInd;

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link Penalty2 }
         *     
         */
        public Penalty2 getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Penalty2 }
         *     
         */
        public void setPenalty(Penalty2 value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the volChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVolChangeInd() {
            return volChangeInd;
        }

        /**
         * Sets the value of the volChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVolChangeInd(Boolean value) {
            this.volChangeInd = value;
        }

    }

}
