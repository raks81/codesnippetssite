
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCustomFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumCustomFieldType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polarion.com/TrackerWebService-types}CustomFieldType">
 *       &lt;sequence>
 *         &lt;element name="enumId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumCustomFieldType", propOrder = {
    "enumId"
})
public class EnumCustomFieldType
    extends CustomFieldType
{

    @XmlElement(required = true, nillable = true)
    protected String enumId;

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

}
