
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="TAW"/>
 *             <enumeration value="TTL"/>
 *             <enumeration value="TLCXL"/>
 *             <enumeration value="ACTIVE"/>
 *             <enumeration value="CXL"/>
 *             <enumeration value="TAU"/>
 *             <enumeration value="TRH"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TicketDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="QueueCategory" type="{http://www.travelport.com/schema/common_v54_0}typeNonBlanks" />
 *       <attribute name="AirportCode" type="{http://www.travelport.com/schema/common_v54_0}typeAirport" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "remark"
})
@XmlRootElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ActionStatus {

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Remark remark;
    /**
     * Identifies the type of action (if any) to take on this air reservation. Only TTL, TAU, TAX and TAW can be set by the user.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Identifies when the action type will happen, or
     *                         has happened according to the type.
     * 
     */
    @XmlAttribute(name = "TicketDate")
    protected String ticketDate;
    /**
     * Identifies when the action type will happen, or
     *                         has happened according to the type.
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Add Category placement to ticketing queue (required in 1P - default is 00)
     * 
     */
    @XmlAttribute(name = "QueueCategory")
    protected String queueCategory;
    /**
     * Used with Time Limit to specify the airport location where the ticket is to be issued.
     * 
     */
    @XmlAttribute(name = "AirportCode")
    protected String airportCode;
    /**
     * The Branch PCC in the host system where PNR can be queued for ticketing. When used with TAU it will auto queue to Q10. When used with TAW agent performs manual move to Q.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * Used with TAW. Used to specify a corporate or in house account code to the PNR as part of ticketing arrangement field.
     * 
     */
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     */
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     */
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * @return
     *     possible object is
     *     {@link Remark }
     *     
     */
    public Remark getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remark }
     *     
     * @see #getRemark()
     */
    public void setRemark(Remark value) {
        this.remark = value;
    }

    /**
     * Identifies the type of action (if any) to take on this air reservation. Only TTL, TAU, TAX and TAW can be set by the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Identifies when the action type will happen, or
     *                         has happened according to the type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDate() {
        return ticketDate;
    }

    /**
     * Sets the value of the ticketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketDate()
     */
    public void setTicketDate(String value) {
        this.ticketDate = value;
    }

    /**
     * Identifies when the action type will happen, or
     *                         has happened according to the type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Provider reservation reference key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderReservationInfoRef()
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Add Category placement to ticketing queue (required in 1P - default is 00)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCategory() {
        return queueCategory;
    }

    /**
     * Sets the value of the queueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQueueCategory()
     */
    public void setQueueCategory(String value) {
        this.queueCategory = value;
    }

    /**
     * Used with Time Limit to specify the airport location where the ticket is to be issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirportCode()
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * The Branch PCC in the host system where PNR can be queued for ticketing. When used with TAU it will auto queue to Q10. When used with TAW agent performs manual move to Q.
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
     * Used with TAW. Used to specify a corporate or in house account code to the PNR as part of ticketing arrangement field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountCode()
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     * @see #getElStat()
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeyOverride()
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

}
