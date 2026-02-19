
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
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MediaItem" maxOccurs="3" minOccurs="0"/>
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
    "description",
    "mediaItem"
})
@XmlRootElement(name = "ServiceInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ServiceInfo {

    /**
     * Description of the Service.  Usually used in tandem with  one or more media items.
     * 
     */
    @XmlElement(name = "Description", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<String> description;
    /**
     * Photos and other media urls for the property referenced above.
     * 
     */
    @XmlElement(name = "MediaItem", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<MediaItem> mediaItem;

    /**
     * Description of the Service.  Usually used in tandem with  one or more media items.
     * 
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
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
     *     The value of the description property.
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    /**
     * Photos and other media urls for the property referenced above.
     * 
     * Gets the value of the mediaItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the mediaItem property.
     */
    public List<MediaItem> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<>();
        }
        return this.mediaItem;
    }

}
