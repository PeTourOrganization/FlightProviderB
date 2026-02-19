
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="IncludeDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="IncludeHeader" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PrintBlankFormItinerary")
public class PrintBlankFormItinerary {

    /**
     * If it is true then document will be printed including descriptions.
     * 
     */
    @XmlAttribute(name = "IncludeDescription", required = true)
    protected boolean includeDescription;
    /**
     * If it is true then document will be printed including it's header.
     * 
     */
    @XmlAttribute(name = "IncludeHeader", required = true)
    protected boolean includeHeader;

    /**
     * If it is true then document will be printed including descriptions.
     * 
     */
    public boolean isIncludeDescription() {
        return includeDescription;
    }

    /**
     * Sets the value of the includeDescription property.
     * 
     */
    public void setIncludeDescription(boolean value) {
        this.includeDescription = value;
    }

    /**
     * If it is true then document will be printed including it's header.
     * 
     */
    public boolean isIncludeHeader() {
        return includeHeader;
    }

    /**
     * Sets the value of the includeHeader property.
     * 
     */
    public void setIncludeHeader(boolean value) {
        this.includeHeader = value;
    }

}
