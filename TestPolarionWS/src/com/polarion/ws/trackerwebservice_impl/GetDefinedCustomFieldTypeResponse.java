
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.CustomFieldType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDefinedCustomFieldTypeReturn" type="{http://ws.polarion.com/TrackerWebService-types}CustomFieldType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDefinedCustomFieldTypeReturn"
})
@XmlRootElement(name = "getDefinedCustomFieldTypeResponse")
public class GetDefinedCustomFieldTypeResponse {

    @XmlElement(required = true)
    protected CustomFieldType getDefinedCustomFieldTypeReturn;

    /**
     * Gets the value of the getDefinedCustomFieldTypeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldType }
     *     
     */
    public CustomFieldType getGetDefinedCustomFieldTypeReturn() {
        return getDefinedCustomFieldTypeReturn;
    }

    /**
     * Sets the value of the getDefinedCustomFieldTypeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldType }
     *     
     */
    public void setGetDefinedCustomFieldTypeReturn(CustomFieldType value) {
        this.getDefinedCustomFieldTypeReturn = value;
    }

}
