
package com.example.app.flightproviderb.flightdetails;

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
 *       <choice>
 *         <sequence>
 *           <element name="FareFamilyDisplay">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <attribute name="ModifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *         <sequence>
 *           <element name="BasicDetailsOnly">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <attribute name="ReturnBasicDetails" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareFamilyDisplay",
    "basicDetailsOnly"
})
@XmlRootElement(name = "BrandModifiers")
public class BrandModifiers {

    /**
     * Used to request a fare family display.
     * 
     */
    @XmlElement(name = "FareFamilyDisplay")
    protected BrandModifiers.FareFamilyDisplay fareFamilyDisplay;
    /**
     * Used to request basic details of the brand.
     * 
     */
    @XmlElement(name = "BasicDetailsOnly")
    protected BrandModifiers.BasicDetailsOnly basicDetailsOnly;

    /**
     * Used to request a fare family display.
     * 
     * @return
     *     possible object is
     *     {@link BrandModifiers.FareFamilyDisplay }
     *     
     */
    public BrandModifiers.FareFamilyDisplay getFareFamilyDisplay() {
        return fareFamilyDisplay;
    }

    /**
     * Sets the value of the fareFamilyDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandModifiers.FareFamilyDisplay }
     *     
     * @see #getFareFamilyDisplay()
     */
    public void setFareFamilyDisplay(BrandModifiers.FareFamilyDisplay value) {
        this.fareFamilyDisplay = value;
    }

    /**
     * Used to request basic details of the brand.
     * 
     * @return
     *     possible object is
     *     {@link BrandModifiers.BasicDetailsOnly }
     *     
     */
    public BrandModifiers.BasicDetailsOnly getBasicDetailsOnly() {
        return basicDetailsOnly;
    }

    /**
     * Sets the value of the basicDetailsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandModifiers.BasicDetailsOnly }
     *     
     * @see #getBasicDetailsOnly()
     */
    public void setBasicDetailsOnly(BrandModifiers.BasicDetailsOnly value) {
        this.basicDetailsOnly = value;
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
     *       <attribute name="ReturnBasicDetails" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BasicDetailsOnly {

        @XmlAttribute(name = "ReturnBasicDetails", required = true)
        protected boolean returnBasicDetails;

        /**
         * Gets the value of the returnBasicDetails property.
         * 
         */
        public boolean isReturnBasicDetails() {
            return returnBasicDetails;
        }

        /**
         * Sets the value of the returnBasicDetails property.
         * 
         */
        public void setReturnBasicDetails(boolean value) {
            this.returnBasicDetails = value;
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
     *       <attribute name="ModifierType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareFamilyDisplay {

        /**
         * "FareFamily" returns the lowest branded fares in a fare family.
         * 													"MaintainBookingCode" attempts to return the lowest branded fare in a fare family display based on the permitted booking code. Any brand that does not have a fare for the permitted booking code will then have the lowest fare returned.
         * 													"LowestFareInBrand" returns the lowest fare within each branded fare in a fare family display.
         * 
         */
        @XmlAttribute(name = "ModifierType", required = true)
        protected String modifierType;

        /**
         * "FareFamily" returns the lowest branded fares in a fare family.
         * 													"MaintainBookingCode" attempts to return the lowest branded fare in a fare family display based on the permitted booking code. Any brand that does not have a fare for the permitted booking code will then have the lowest fare returned.
         * 													"LowestFareInBrand" returns the lowest fare within each branded fare in a fare family display.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierType() {
            return modifierType;
        }

        /**
         * Sets the value of the modifierType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getModifierType()
         */
        public void setModifierType(String value) {
            this.modifierType = value;
        }

    }

}
