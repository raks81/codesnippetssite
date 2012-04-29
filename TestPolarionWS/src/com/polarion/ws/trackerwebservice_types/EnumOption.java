
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.types.Properties;


/**
 * <p>Java class for EnumOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enumId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phantom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="properties" type="{http://ws.polarion.com/types}Properties"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumOption", propOrder = {
    "_default",
    "enumId",
    "hidden",
    "id",
    "name",
    "phantom",
    "properties",
    "sequenceNumber"
})
@XmlSeeAlso({
    PriorityOpt.class
})
public class EnumOption {

    @XmlElement(name = "default")
    protected boolean _default;
    @XmlElement(required = true, nillable = true)
    protected String enumId;
    protected boolean hidden;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean phantom;
    @XmlElement(required = true, nillable = true)
    protected Properties properties;
    protected int sequenceNumber;

    /**
     * Gets the value of the default property.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the enumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumId() {
        return enumId;
    }

    /**
     * Sets the value of the enumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumId(String value) {
        this.enumId = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the id property.
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
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
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
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phantom property.
     * 
     */
    public boolean isPhantom() {
        return phantom;
    }

    /**
     * Sets the value of the phantom property.
     * 
     */
    public void setPhantom(boolean value) {
        this.phantom = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

}
