
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
 *       <attribute name="RFIC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RFISC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SvcDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AddSvc", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AddSvc {

    /**
     *  1P - Reason for issuance
     * 
     */
    @XmlAttribute(name = "RFIC")
    protected String rfic;
    /**
     *  1P - Resaon for issuance sub-code
     * 
     */
    @XmlAttribute(name = "RFISC")
    protected String rfisc;
    /**
     *  1P - SVC fee description
     * 
     */
    @XmlAttribute(name = "SvcDescription")
    protected String svcDescription;
    /**
     * Origin location - Airport code. If this value not
     * 					provided, the last air segment arrival location is taken as
     * 					default. 1P only.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * Destination location - Airport code.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * The start date of the SVC segment. If the value
     * 					not specified, the default value is set as the date next to the
     * 					last airsegment arrival date. 1P only
     * 
     */
    @XmlAttribute(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;

    /**
     *  1P - Reason for issuance
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIC()
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     *  1P - Resaon for issuance sub-code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFISC()
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     *  1P - SVC fee description
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDescription() {
        return svcDescription;
    }

    /**
     * Sets the value of the svcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSvcDescription()
     */
    public void setSvcDescription(String value) {
        this.svcDescription = value;
    }

    /**
     * Origin location - Airport code. If this value not
     * 					provided, the last air segment arrival location is taken as
     * 					default. 1P only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Destination location - Airport code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * The start date of the SVC segment. If the value
     * 					not specified, the default value is set as the date next to the
     * 					last airsegment arrival date. 1P only
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
