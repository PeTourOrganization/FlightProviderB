
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}MCOInformation">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Endorsement" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MCOExchangeInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MCOFeeInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MCORemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MCOPriceData" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}StockControl" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MCOText" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MCOIssued" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MCOIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="MCODocNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="IssueReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="TourOperator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="ProviderLocatorCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderLocatorCode" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPayment",
    "endorsement",
    "mcoExchangeInfo",
    "mcoFeeInfo",
    "mcoRemark",
    "mcoPriceData",
    "stockControl",
    "mcoText"
})
@XmlRootElement(name = "MCO", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCO
    extends MCOInformation
{

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
    /**
     * Restrictions or instructions about the fare or ticket
     * 
     */
    @XmlElement(name = "Endorsement", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Endorsement endorsement;
    /**
     * Information related to the exchange tickets available for the MCO
     * 
     */
    @XmlElement(name = "MCOExchangeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected MCOExchangeInfo mcoExchangeInfo;
    /**
     * Information related to the PTA/TOD (Prepaid Ticket Advice / Ticket on Departure) related to the MCO
     * 
     */
    @XmlElement(name = "MCOFeeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected MCOFeeInfo mcoFeeInfo;
    /**
     * Information related to fare construction, free form text etc. of the MCO
     * 
     */
    @XmlElement(name = "MCORemark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<MCORemark> mcoRemark;
    @XmlElement(name = "MCOPriceData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected MCOPriceData mcoPriceData;
    /**
     * The Stock Control Numbers related details of the MCO.
     * 
     */
    @XmlElement(name = "StockControl", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<StockControl> stockControl;
    /**
     * All type of free format text messages related to MCO like - Command Text, Agent Entry, MCO Modifiers, Text Message
     * 
     */
    @XmlElement(name = "MCOText", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<MCOText> mcoText;
    /**
     * Ticket issue indicator. Possible values "Pre-paid ticket advice", "Ticket on departure" and "Other" .
     * 
     */
    @XmlAttribute(name = "TicketType")
    protected String ticketType;
    /**
     * The ticket that this MCO was issued in connection with. Could be the ticket that caused the fee, a residual from an exchange, or an airline service fee.
     * 
     */
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    /**
     * Set to true when the MCO is to be issued and set to false if it is stored for issue at a later time.
     * 
     */
    @XmlAttribute(name = "MCOIssued", required = true)
    protected boolean mcoIssued;
    /**
     * Date and time in which the MCO was issued.
     * 
     */
    @XmlAttribute(name = "MCOIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mcoIssueDate;
    /**
     * MCO document number.
     * 
     */
    @XmlAttribute(name = "MCODocNum")
    protected String mcoDocNum;
    /**
     * O - Other, P thru Z - airline specific, 1 thru 9 - market specific
     * 
     */
    @XmlAttribute(name = "IssueReasonCode")
    protected String issueReasonCode;
    /**
     * The Plating Carrier for this MCO
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * Tour Operator - name of honoring carrier or operator.
     * 
     */
    @XmlAttribute(name = "TourOperator")
    protected String tourOperator;
    /**
     * Location of honoring carrier or operator.
     * 
     */
    @XmlAttribute(name = "Location")
    protected String location;
    /**
     * The Tour Code of the MCO.
     * 
     */
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    /**
     * Contains the Provider Code of the provider that houses this MCO.
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * Contains the Provider Locator Code of the Provider Reservation that houses this MCO.
     * 
     */
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    /**
     * The PCC in the host system.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * E-Voucher’s Expiry Date. This expiry date is specific to Rail product
     * 
     */
    @XmlAttribute(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     * Gets the value of the formOfPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the formOfPayment property.
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<>();
        }
        return this.formOfPayment;
    }

    /**
     * Restrictions or instructions about the fare or ticket
     * 
     * @return
     *     possible object is
     *     {@link Endorsement }
     *     
     */
    public Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endorsement }
     *     
     * @see #getEndorsement()
     */
    public void setEndorsement(Endorsement value) {
        this.endorsement = value;
    }

    /**
     * Information related to the exchange tickets available for the MCO
     * 
     * @return
     *     possible object is
     *     {@link MCOExchangeInfo }
     *     
     */
    public MCOExchangeInfo getMCOExchangeInfo() {
        return mcoExchangeInfo;
    }

    /**
     * Sets the value of the mcoExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOExchangeInfo }
     *     
     * @see #getMCOExchangeInfo()
     */
    public void setMCOExchangeInfo(MCOExchangeInfo value) {
        this.mcoExchangeInfo = value;
    }

    /**
     * Information related to the PTA/TOD (Prepaid Ticket Advice / Ticket on Departure) related to the MCO
     * 
     * @return
     *     possible object is
     *     {@link MCOFeeInfo }
     *     
     */
    public MCOFeeInfo getMCOFeeInfo() {
        return mcoFeeInfo;
    }

    /**
     * Sets the value of the mcoFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOFeeInfo }
     *     
     * @see #getMCOFeeInfo()
     */
    public void setMCOFeeInfo(MCOFeeInfo value) {
        this.mcoFeeInfo = value;
    }

    /**
     * Information related to fare construction, free form text etc. of the MCO
     * 
     * Gets the value of the mcoRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcoRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMCORemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCORemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the mcoRemark property.
     */
    public List<MCORemark> getMCORemark() {
        if (mcoRemark == null) {
            mcoRemark = new ArrayList<>();
        }
        return this.mcoRemark;
    }

    /**
     * Gets the value of the mcoPriceData property.
     * 
     * @return
     *     possible object is
     *     {@link MCOPriceData }
     *     
     */
    public MCOPriceData getMCOPriceData() {
        return mcoPriceData;
    }

    /**
     * Sets the value of the mcoPriceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOPriceData }
     *     
     */
    public void setMCOPriceData(MCOPriceData value) {
        this.mcoPriceData = value;
    }

    /**
     * The Stock Control Numbers related details of the MCO.
     * 
     * Gets the value of the stockControl property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockControl property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStockControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockControl }
     * </p>
     * 
     * 
     * @return
     *     The value of the stockControl property.
     */
    public List<StockControl> getStockControl() {
        if (stockControl == null) {
            stockControl = new ArrayList<>();
        }
        return this.stockControl;
    }

    /**
     * All type of free format text messages related to MCO like - Command Text, Agent Entry, MCO Modifiers, Text Message
     * 
     * Gets the value of the mcoText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcoText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMCOText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCOText }
     * </p>
     * 
     * 
     * @return
     *     The value of the mcoText property.
     */
    public List<MCOText> getMCOText() {
        if (mcoText == null) {
            mcoText = new ArrayList<>();
        }
        return this.mcoText;
    }

    /**
     * Ticket issue indicator. Possible values "Pre-paid ticket advice", "Ticket on departure" and "Other" .
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketType()
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * The ticket that this MCO was issued in connection with. Could be the ticket that caused the fee, a residual from an exchange, or an airline service fee.
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
     * @see #getTicketNumber()
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Set to true when the MCO is to be issued and set to false if it is stored for issue at a later time.
     * 
     */
    public boolean isMCOIssued() {
        return mcoIssued;
    }

    /**
     * Sets the value of the mcoIssued property.
     * 
     */
    public void setMCOIssued(boolean value) {
        this.mcoIssued = value;
    }

    /**
     * Date and time in which the MCO was issued.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCOIssueDate() {
        return mcoIssueDate;
    }

    /**
     * Sets the value of the mcoIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getMCOIssueDate()
     */
    public void setMCOIssueDate(XMLGregorianCalendar value) {
        this.mcoIssueDate = value;
    }

    /**
     * MCO document number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCODocNum() {
        return mcoDocNum;
    }

    /**
     * Sets the value of the mcoDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCODocNum()
     */
    public void setMCODocNum(String value) {
        this.mcoDocNum = value;
    }

    /**
     * O - Other, P thru Z - airline specific, 1 thru 9 - market specific
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueReasonCode() {
        return issueReasonCode;
    }

    /**
     * Sets the value of the issueReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssueReasonCode()
     */
    public void setIssueReasonCode(String value) {
        this.issueReasonCode = value;
    }

    /**
     * The Plating Carrier for this MCO
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Tour Operator - name of honoring carrier or operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperator() {
        return tourOperator;
    }

    /**
     * Sets the value of the tourOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTourOperator()
     */
    public void setTourOperator(String value) {
        this.tourOperator = value;
    }

    /**
     * Location of honoring carrier or operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocation()
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * The Tour Code of the MCO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTourCode()
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Contains the Provider Code of the provider that houses this MCO.
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
     * @see #getProviderCode()
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Contains the Provider Locator Code of the Provider Reservation that houses this MCO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderLocatorCode()
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * The PCC in the host system.
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
     * E-Voucher’s Expiry Date. This expiry date is specific to Rail product
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExpiryDate()
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

}
