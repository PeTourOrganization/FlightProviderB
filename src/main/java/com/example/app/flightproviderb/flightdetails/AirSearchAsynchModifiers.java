
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element name="InitialAsynchResult" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="MaxWait" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
    "initialAsynchResult"
})
@XmlRootElement(name = "AirSearchAsynchModifiers")
public class AirSearchAsynchModifiers {

    @XmlElement(name = "InitialAsynchResult")
    protected AirSearchAsynchModifiers.InitialAsynchResult initialAsynchResult;

    /**
     * Gets the value of the initialAsynchResult property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchAsynchModifiers.InitialAsynchResult }
     *     
     */
    public AirSearchAsynchModifiers.InitialAsynchResult getInitialAsynchResult() {
        return initialAsynchResult;
    }

    /**
     * Sets the value of the initialAsynchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchAsynchModifiers.InitialAsynchResult }
     *     
     */
    public void setInitialAsynchResult(AirSearchAsynchModifiers.InitialAsynchResult value) {
        this.initialAsynchResult = value;
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
     *       <attribute name="MaxWait" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InitialAsynchResult {

        /**
         * Max wait time in seconds.
         * 
         */
        @XmlAttribute(name = "MaxWait")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxWait;

        /**
         * Max wait time in seconds.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxWait() {
            return maxWait;
        }

        /**
         * Sets the value of the maxWait property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getMaxWait()
         */
        public void setMaxWait(BigInteger value) {
            this.maxWait = value;
        }

    }

}
