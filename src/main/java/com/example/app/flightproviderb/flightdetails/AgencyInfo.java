
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgentAction" maxOccurs="999"/>
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
    "agentAction"
})
@XmlRootElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AgencyInfo {

    /**
     * Depending on context, this will represent
     * 	            information about which agent perform different actions.
     * 
     */
    @XmlElement(name = "AgentAction", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<AgentAction> agentAction;

    /**
     * Depending on context, this will represent
     * 	            information about which agent perform different actions.
     * 
     * Gets the value of the agentAction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentAction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAgentAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentAction }
     * </p>
     * 
     * 
     * @return
     *     The value of the agentAction property.
     */
    public List<AgentAction> getAgentAction() {
        if (agentAction == null) {
            agentAction = new ArrayList<>();
        }
        return this.agentAction;
    }

}
