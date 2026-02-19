
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
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="AgentSine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EventDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="EventTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       <attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ActionDetails")
public class ActionDetails {

    /**
     * PCC in the host of the agent who stored the fare for Provider: 1P
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * The sign in of the user who stored the fare for Provider: 1P
     * 
     */
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    /**
     * Date at which the fare was stored for Provider: 1P
     * 
     */
    @XmlAttribute(name = "EventDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    /**
     * Time at which the fare was stored for Provider: 1P
     * 
     */
    @XmlAttribute(name = "EventTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar eventTime;
    /**
     * The type of action the agent performed for Provider: 1P
     * 
     */
    @XmlAttribute(name = "Text")
    protected String text;

    /**
     * PCC in the host of the agent who stored the fare for Provider: 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPseudoCityCode()
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * The sign in of the user who stored the fare for Provider: 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * Sets the value of the agentSine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgentSine()
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * Date at which the fare was stored for Provider: 1P
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEventDate()
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Time at which the fare was stored for Provider: 1P
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEventTime()
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * The type of action the agent performed for Provider: 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
    }

}
