
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
 *       <attribute name="Id" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="19"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Name" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Description">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="1024"/>
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
@XmlType(name = "")
@XmlRootElement(name = "RoleInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class RoleInfo {

    /**
     * Unique identifier of the role.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Agent's role name
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Role inheritance level. Needed in the response, not in the request
     * 
     */
    @XmlAttribute(name = "Source")
    protected String source;
    /**
     * Description of role
     * 
     */
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Unique identifier of the role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Agent's role name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Role inheritance level. Needed in the response, not in the request
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Description of role
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
