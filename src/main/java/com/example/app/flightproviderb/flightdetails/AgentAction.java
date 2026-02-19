
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrAgentOverride"/>
 *       <attribute name="ActionType" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Created"/>
 *             <enumeration value="Modified"/>
 *             <enumeration value="Ticketed"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AgentCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BranchCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeBranchCode" />
 *       <attribute name="AgencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AgentSine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EventTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AgentAction", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AgentAction {

    /**
     * The type of action the agent performed.
     * 
     */
    @XmlAttribute(name = "ActionType", required = true)
    protected String actionType;
    /**
     * The AgenctCode who performed the action.
     * 
     */
    @XmlAttribute(name = "AgentCode", required = true)
    protected String agentCode;
    /**
     * The BranchCode of the branch (working branch, branchcode used for the request. If nothing specified, branchcode for the agent) who performed the action.
     * 
     */
    @XmlAttribute(name = "BranchCode", required = true)
    protected String branchCode;
    /**
     * The AgencyCode of the agent who performed the action.
     * 
     */
    @XmlAttribute(name = "AgencyCode", required = true)
    protected String agencyCode;
    /**
     * The sign in user name of the agent logged into the terminal. PROVIDER SUPPORTED: ACH
     * 
     */
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    /**
     * Date and time at which this event took place.
     * 
     */
    @XmlAttribute(name = "EventTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    /**
     * AgentSine value that was used during PNR creation or End Transact.
     * 
     */
    @XmlAttribute(name = "AgentOverride")
    protected String agentOverride;

    /**
     * The type of action the agent performed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActionType()
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * The AgenctCode who performed the action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgentCode()
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * The BranchCode of the branch (working branch, branchcode used for the request. If nothing specified, branchcode for the agent) who performed the action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBranchCode()
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * The AgencyCode of the agent who performed the action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgencyCode()
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * The sign in user name of the agent logged into the terminal. PROVIDER SUPPORTED: ACH
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
     * Date and time at which this event took place.
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
     * AgentSine value that was used during PNR creation or End Transact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOverride() {
        return agentOverride;
    }

    /**
     * Sets the value of the agentOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgentOverride()
     */
    public void setAgentOverride(String value) {
        this.agentOverride = value;
    }

}
