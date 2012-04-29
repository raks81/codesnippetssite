
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
 *         &lt;element name="getModuleByLocationReturn" type="{http://ws.polarion.com/TrackerWebService-types}Module"/>
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
    "getModuleByLocationReturn"
})
@XmlRootElement(name = "getModuleByLocationResponse")
public class GetModuleByLocationResponse {

    @XmlElement(required = true)
    protected Module getModuleByLocationReturn;

    /**
     * Gets the value of the getModuleByLocationReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Module }
     *     
     */
    public Module getGetModuleByLocationReturn() {
        return getModuleByLocationReturn;
    }

    /**
     * Sets the value of the getModuleByLocationReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Module }
     *     
     */
    public void setGetModuleByLocationReturn(Module value) {
        this.getModuleByLocationReturn = value;
    }

}
