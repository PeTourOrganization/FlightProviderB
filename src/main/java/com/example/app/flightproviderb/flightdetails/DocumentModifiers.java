
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="GenerateItineraryInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="GenerateAccountingInterface" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DocumentModifiers")
public class DocumentModifiers {

    /**
     * Generate itinerary/invoice documents along with
     *                         ticket
     * 
     */
    @XmlAttribute(name = "GenerateItineraryInvoice")
    protected Boolean generateItineraryInvoice;
    /**
     * Generate interface message along with ticket
     * 
     */
    @XmlAttribute(name = "GenerateAccountingInterface")
    protected Boolean generateAccountingInterface;

    /**
     * Generate itinerary/invoice documents along with
     *                         ticket
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGenerateItineraryInvoice() {
        if (generateItineraryInvoice == null) {
            return false;
        } else {
            return generateItineraryInvoice;
        }
    }

    /**
     * Sets the value of the generateItineraryInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isGenerateItineraryInvoice()
     */
    public void setGenerateItineraryInvoice(Boolean value) {
        this.generateItineraryInvoice = value;
    }

    /**
     * Generate interface message along with ticket
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGenerateAccountingInterface() {
        if (generateAccountingInterface == null) {
            return false;
        } else {
            return generateAccountingInterface;
        }
    }

    /**
     * Sets the value of the generateAccountingInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isGenerateAccountingInterface()
     */
    public void setGenerateAccountingInterface(Boolean value) {
        this.generateAccountingInterface = value;
    }

}
