
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TicketValidity")
public class TicketValidity {

    /**
     * Fare not valid before this date.
     * 
     */
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidBefore;
    /**
     * Fare not valid after this date.
     * 
     */
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidAfter;

    /**
     * Fare not valid before this date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidBefore()
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * Fare not valid after this date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidAfter()
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

}
