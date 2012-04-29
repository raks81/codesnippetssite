
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.Module;


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
 *         &lt;element name="getModuleByUriWithFieldsReturn" type="{http://ws.polarion.com/TrackerWebService-types}Module"/>
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
    "getModuleByUriWithFieldsReturn"
})
@XmlRootElement(name = "getModuleByUriWithFieldsResponse")
public class GetModuleByUriWithFieldsResponse {

    @XmlElement(required = true)
    protected Module getModuleByUriWithFieldsReturn;

    /**
     * Gets the value of the getModuleByUriWithFieldsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Module }
     *     
     */
    public Module getGetModuleByUriWithFieldsReturn() {
        return getModuleByUriWithFieldsReturn;
    }

    /**
     * Sets the value of the getModuleByUriWithFieldsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Module }
     *     
     */
    public void setGetModuleByUriWithFieldsReturn(Module value) {
        this.getModuleByUriWithFieldsReturn = value;
    }

}
