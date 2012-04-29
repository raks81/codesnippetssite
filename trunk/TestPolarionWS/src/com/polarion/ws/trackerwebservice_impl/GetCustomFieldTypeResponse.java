
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
 *         &lt;element name="getCustomFieldTypeReturn" type="{http://ws.polarion.com/TrackerWebService-types}CustomFieldType"/>
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
    "getCustomFieldTypeReturn"
})
@XmlRootElement(name = "getCustomFieldTypeResponse")
public class GetCustomFieldTypeResponse {

    @XmlElement(required = true)
    protected CustomFieldType getCustomFieldTypeReturn;

    /**
     * Gets the value of the getCustomFieldTypeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldType }
     *     
     */
    public CustomFieldType getGetCustomFieldTypeReturn() {
        return getCustomFieldTypeReturn;
    }

    /**
     * Sets the value of the getCustomFieldTypeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldType }
     *     
     */
    public void setGetCustomFieldTypeReturn(CustomFieldType value) {
        this.getCustomFieldTypeReturn = value;
    }

}
