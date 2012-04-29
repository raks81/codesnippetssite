
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.CustomField;


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
 *         &lt;element name="getCustomFieldReturn" type="{http://ws.polarion.com/TrackerWebService-types}CustomField"/>
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
    "getCustomFieldReturn"
})
@XmlRootElement(name = "getCustomFieldResponse")
public class GetCustomFieldResponse {

    @XmlElement(required = true)
    protected CustomField getCustomFieldReturn;

    /**
     * Gets the value of the getCustomFieldReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomField }
     *     
     */
    public CustomField getGetCustomFieldReturn() {
        return getCustomFieldReturn;
    }

    /**
     * Sets the value of the getCustomFieldReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setGetCustomFieldReturn(CustomField value) {
        this.getCustomFieldReturn = value;
    }

}
