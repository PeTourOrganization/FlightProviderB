
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Length Of Stay Restriction ( e.g. 2 day
 *                 minimum..)
 * 
 * <p>Java class for typeRestrictionLengthOfStay complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeRestrictionLengthOfStay">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="StayUnit" type="{http://www.travelport.com/schema/air_v54_0}typeStayUnit" />
 *       <attribute name="StayDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="MoreRulesPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRestrictionLengthOfStay")
public class TypeRestrictionLengthOfStay {

    @XmlAttribute(name = "Length")
    protected BigInteger length;
    @XmlAttribute(name = "StayUnit")
    protected TypeStayUnit stayUnit;
    @XmlAttribute(name = "StayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stayDate;
    /**
     * If true, specifies that advance purchase
     *                     information will be present in fare rules.
     * 
     */
    @XmlAttribute(name = "MoreRulesPresent")
    protected Boolean moreRulesPresent;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the stayUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStayUnit }
     *     
     */
    public TypeStayUnit getStayUnit() {
        return stayUnit;
    }

    /**
     * Sets the value of the stayUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStayUnit }
     *     
     */
    public void setStayUnit(TypeStayUnit value) {
        this.stayUnit = value;
    }

    /**
     * Gets the value of the stayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStayDate() {
        return stayDate;
    }

    /**
     * Sets the value of the stayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStayDate(XMLGregorianCalendar value) {
        this.stayDate = value;
    }

    /**
     * If true, specifies that advance purchase
     *                     information will be present in fare rules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRulesPresent() {
        return moreRulesPresent;
    }

    /**
     * Sets the value of the moreRulesPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMoreRulesPresent()
     */
    public void setMoreRulesPresent(Boolean value) {
        this.moreRulesPresent = value;
    }

}
