
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="getEnumControlKeyForKeyReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "getEnumControlKeyForKeyReturn"
})
@XmlRootElement(name = "getEnumControlKeyForKeyResponse")
public class GetEnumControlKeyForKeyResponse {

    @XmlElement(required = true)
    protected String getEnumControlKeyForKeyReturn;

    /**
     * Gets the value of the getEnumControlKeyForKeyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetEnumControlKeyForKeyReturn() {
        return getEnumControlKeyForKeyReturn;
    }

    /**
     * Sets the value of the getEnumControlKeyForKeyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetEnumControlKeyForKeyReturn(String value) {
        this.getEnumControlKeyForKeyReturn = value;
    }

}
