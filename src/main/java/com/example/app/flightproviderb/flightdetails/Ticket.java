
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Coupon" maxOccurs="4"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketEndorsement" maxOccurs="6" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TourCode" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExchangedTicketInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TicketNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeTicketNumber" />
 *       <attribute name="TicketStatus" type="{http://www.travelport.com/schema/common_v54_0}typeTicketStatus" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coupon",
    "ticketEndorsement",
    "tourCode",
    "exchangedTicketInfo"
})
@XmlRootElement(name = "Ticket")
public class Ticket {

    /**
     * The flight coupon that resulted from the
     *                 ticketing operation.
     * 
     */
    @XmlElement(name = "Coupon", required = true)
    protected List<Coupon> coupon;
    @XmlElement(name = "TicketEndorsement")
    protected List<TicketEndorsement> ticketEndorsement;
    /**
     * Tour Code Fare Basis
     * 
     */
    @XmlElement(name = "TourCode")
    protected List<TourCode> tourCode;
    /**
     * Contains Exchanged/Reissued Ticket Information
     * 
     */
    @XmlElement(name = "ExchangedTicketInfo")
    protected List<ExchangedTicketInfo> exchangedTicketInfo;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "TicketNumber", required = true)
    protected String ticketNumber;
    @XmlAttribute(name = "TicketStatus")
    protected TypeTicketStatus ticketStatus;
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

    /**
     * The flight coupon that resulted from the
     *                 ticketing operation.
     * 
     * Gets the value of the coupon property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coupon }
     * </p>
     * 
     * 
     * @return
     *     The value of the coupon property.
     */
    public List<Coupon> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<>();
        }
        return this.coupon;
    }

    /**
     * Gets the value of the ticketEndorsement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketEndorsement property.
     */
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Tour Code Fare Basis
     * 
     * Gets the value of the tourCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTourCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the tourCode property.
     */
    public List<TourCode> getTourCode() {
        if (tourCode == null) {
            tourCode = new ArrayList<>();
        }
        return this.tourCode;
    }

    /**
     * Contains Exchanged/Reissued Ticket Information
     * 
     * Gets the value of the exchangedTicketInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangedTicketInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExchangedTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangedTicketInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the exchangedTicketInfo property.
     */
    public List<ExchangedTicketInfo> getExchangedTicketInfo() {
        if (exchangedTicketInfo == null) {
            exchangedTicketInfo = new ArrayList<>();
        }
        return this.exchangedTicketInfo;
    }

    /**
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketStatus }
     *     
     */
    public TypeTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketStatus }
     *     
     */
    public void setTicketStatus(TypeTicketStatus value) {
        this.ticketStatus = value;
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

}
