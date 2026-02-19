
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base Request for Air Search
 * 
 * <p>Java class for BaseCoreSearchReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseCoreSearchReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseCoreReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}NextResultReference" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCoreSearchReq", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "nextResultReference"
})
@XmlSeeAlso({
    BaseAirSearchReq.class
})
public class BaseCoreSearchReq
    extends BaseCoreReq
{

    /**
     * Container to return/send additional retrieve/request additional search results
     * 
     */
    @XmlElement(name = "NextResultReference")
    protected List<NextResultReference> nextResultReference;

    /**
     * Container to return/send additional retrieve/request additional search results
     * 
     * Gets the value of the nextResultReference property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextResultReference property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNextResultReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextResultReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the nextResultReference property.
     */
    public List<NextResultReference> getNextResultReference() {
        if (nextResultReference == null) {
            nextResultReference = new ArrayList<>();
        }
        return this.nextResultReference;
    }

}
