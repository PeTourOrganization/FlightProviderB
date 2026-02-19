
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}KeyMapping" maxOccurs="999" minOccurs="0"/>
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
    "keyMapping"
})
@XmlRootElement(name = "RequestKeyMappings", namespace = "http://www.travelport.com/schema/common_v54_0")
public class RequestKeyMappings {

    /**
     * Element for which mapping key sent in the request is different from the mapping key comes in the response.
     * 
     */
    @XmlElement(name = "KeyMapping", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<KeyMapping> keyMapping;

    /**
     * Element for which mapping key sent in the request is different from the mapping key comes in the response.
     * 
     * Gets the value of the keyMapping property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyMapping property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKeyMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyMapping }
     * </p>
     * 
     * 
     * @return
     *     The value of the keyMapping property.
     */
    public List<KeyMapping> getKeyMapping() {
        if (keyMapping == null) {
            keyMapping = new ArrayList<>();
        }
        return this.keyMapping;
    }

}
