
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.EnumOption;


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
 *         &lt;element name="getEnumOptionWithEnumIdReturn" type="{http://ws.polarion.com/TrackerWebService-types}EnumOption"/>
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
    "getEnumOptionWithEnumIdReturn"
})
@XmlRootElement(name = "getEnumOptionWithEnumIdResponse")
public class GetEnumOptionWithEnumIdResponse {

    @XmlElement(required = true)
    protected EnumOption getEnumOptionWithEnumIdReturn;

    /**
     * Gets the value of the getEnumOptionWithEnumIdReturn property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOption }
     *     
     */
    public EnumOption getGetEnumOptionWithEnumIdReturn() {
        return getEnumOptionWithEnumIdReturn;
    }

    /**
     * Sets the value of the getEnumOptionWithEnumIdReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOption }
     *     
     */
    public void setGetEnumOptionWithEnumIdReturn(EnumOption value) {
        this.getEnumOptionWithEnumIdReturn = value;
    }

}
