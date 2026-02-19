
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationDetail"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}IssuanceModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SelectionModifiers" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="UniversalRecordLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *       <attribute name="ShowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="IssueAllOpenSVC" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationDetail",
    "ticketNumber",
    "issuanceModifiers",
    "selectionModifiers"
})
@XmlRootElement(name = "EMDIssuanceReq")
public class EMDIssuanceReq
    extends BaseReq
{

    /**
     * PNR information for which EMD is going to be issued.
     * 
     */
    @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected TypeProviderReservationDetail providerReservationDetail;
    /**
     * Ticket number for which EMD is going to be issued.Required for EMD-A issuance.
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String ticketNumber;
    /**
     * General modifiers related to EMD issuance.
     * 
     */
    @XmlElement(name = "IssuanceModifiers")
    protected IssuanceModifiers issuanceModifiers;
    /**
     * Modifiers related to selection of services during EMD issuance.
     * 
     */
    @XmlElement(name = "SelectionModifiers")
    protected SelectionModifiers selectionModifiers;
    /**
     * Represents a valid Universal Record locator code.
     * 
     */
    @XmlAttribute(name = "UniversalRecordLocatorCode", required = true)
    protected String universalRecordLocatorCode;
    /**
     * This attribute gives the control to request for complete information on Issued EMDs or minimal information.Requesting complete information leads to possible multiple supplier calls for fetching all the details.
     * 
     */
    @XmlAttribute(name = "ShowDetails")
    protected Boolean showDetails;
    /**
     * Issues EMDS to all SVC segments. If it is true, TicketNumber and SVC segment reference need not be provided. Supported provider 1P.
     * 
     */
    @XmlAttribute(name = "IssueAllOpenSVC")
    protected Boolean issueAllOpenSVC;

    /**
     * PNR information for which EMD is going to be issued.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderReservationDetail }
     *     
     */
    public TypeProviderReservationDetail getProviderReservationDetail() {
        return providerReservationDetail;
    }

    /**
     * Sets the value of the providerReservationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderReservationDetail }
     *     
     * @see #getProviderReservationDetail()
     */
    public void setProviderReservationDetail(TypeProviderReservationDetail value) {
        this.providerReservationDetail = value;
    }

    /**
     * Ticket number for which EMD is going to be issued.Required for EMD-A issuance.
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
     * General modifiers related to EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link IssuanceModifiers }
     *     
     */
    public IssuanceModifiers getIssuanceModifiers() {
        return issuanceModifiers;
    }

    /**
     * Sets the value of the issuanceModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuanceModifiers }
     *     
     * @see #getIssuanceModifiers()
     */
    public void setIssuanceModifiers(IssuanceModifiers value) {
        this.issuanceModifiers = value;
    }

    /**
     * Modifiers related to selection of services during EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link SelectionModifiers }
     *     
     */
    public SelectionModifiers getSelectionModifiers() {
        return selectionModifiers;
    }

    /**
     * Sets the value of the selectionModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionModifiers }
     *     
     * @see #getSelectionModifiers()
     */
    public void setSelectionModifiers(SelectionModifiers value) {
        this.selectionModifiers = value;
    }

    /**
     * Represents a valid Universal Record locator code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUniversalRecordLocatorCode()
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * This attribute gives the control to request for complete information on Issued EMDs or minimal information.Requesting complete information leads to possible multiple supplier calls for fetching all the details.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowDetails() {
        if (showDetails == null) {
            return false;
        } else {
            return showDetails;
        }
    }

    /**
     * Sets the value of the showDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShowDetails()
     */
    public void setShowDetails(Boolean value) {
        this.showDetails = value;
    }

    /**
     * Issues EMDS to all SVC segments. If it is true, TicketNumber and SVC segment reference need not be provided. Supported provider 1P.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIssueAllOpenSVC() {
        if (issueAllOpenSVC == null) {
            return false;
        } else {
            return issueAllOpenSVC;
        }
    }

    /**
     * Sets the value of the issueAllOpenSVC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIssueAllOpenSVC()
     */
    public void setIssueAllOpenSVC(Boolean value) {
        this.issueAllOpenSVC = value;
    }

}
