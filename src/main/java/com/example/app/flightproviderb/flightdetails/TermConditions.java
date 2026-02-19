
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LanguageOption" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="IncludeTermConditions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "languageOption"
})
@XmlRootElement(name = "TermConditions")
public class TermConditions {

    /**
     * Enables itineraries and invoices to print in different languages.
     * 
     */
    @XmlElement(name = "LanguageOption")
    protected List<LanguageOption> languageOption;
    /**
     * Specifies whether Term and Conditions included in the Fax or not .
     * 
     */
    @XmlAttribute(name = "IncludeTermConditions", required = true)
    protected boolean includeTermConditions;

    /**
     * Enables itineraries and invoices to print in different languages.
     * 
     * Gets the value of the languageOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLanguageOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the languageOption property.
     */
    public List<LanguageOption> getLanguageOption() {
        if (languageOption == null) {
            languageOption = new ArrayList<>();
        }
        return this.languageOption;
    }

    /**
     * Specifies whether Term and Conditions included in the Fax or not .
     * 
     */
    public boolean isIncludeTermConditions() {
        return includeTermConditions;
    }

    /**
     * Sets the value of the includeTermConditions property.
     * 
     */
    public void setIncludeTermConditions(boolean value) {
        this.includeTermConditions = value;
    }

}
