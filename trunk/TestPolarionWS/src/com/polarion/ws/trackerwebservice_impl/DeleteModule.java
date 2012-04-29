
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
 *         &lt;element name="moduleURI" type="{http://ws.polarion.com/types}SubterraURI"/>
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
    "moduleURI"
})
@XmlRootElement(name = "deleteModule")
public class DeleteModule {

    @XmlElement(required = true)
    protected String moduleURI;

    /**
     * Gets the value of the moduleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleURI() {
        return moduleURI;
    }

    /**
     * Sets the value of the moduleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleURI(String value) {
        this.moduleURI = value;
    }

}
