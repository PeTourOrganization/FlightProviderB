
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
 *         <element name="EmailRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Recipients" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="All"/>
 *             <enumeration value="Default"/>
 *             <enumeration value="Specific"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emailRef"
})
@XmlRootElement(name = "EmailNotification", namespace = "http://www.travelport.com/schema/common_v54_0")
public class EmailNotification {

    /**
     * Reference to Booking Traveler Email.
     * 
     */
    @XmlElement(name = "EmailRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> emailRef;
    /**
     * Indicates the recipients of the mail addresses for which the user requires the system to send the itinerary.List of Possible Values:
     * 						All = Send Email to All addresses
     * 						Default = Send Email to Primary Booking Traveler
     * 						Specific = Send Email to specific address Referred in EmailRef.
     * 
     */
    @XmlAttribute(name = "Recipients", required = true)
    protected String recipients;

    /**
     * Reference to Booking Traveler Email.
     * 
     * Gets the value of the emailRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEmailRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the emailRef property.
     */
    public List<String> getEmailRef() {
        if (emailRef == null) {
            emailRef = new ArrayList<>();
        }
        return this.emailRef;
    }

    /**
     * Indicates the recipients of the mail addresses for which the user requires the system to send the itinerary.List of Possible Values:
     * 						All = Send Email to All addresses
     * 						Default = Send Email to Primary Booking Traveler
     * 						Specific = Send Email to specific address Referred in EmailRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecipients()
     */
    public void setRecipients(String value) {
        this.recipients = value;
    }

}
