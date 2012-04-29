
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
 *         &lt;element name="createWorkItemInModuleReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "createWorkItemInModuleReturn"
})
@XmlRootElement(name = "createWorkItemInModuleResponse")
public class CreateWorkItemInModuleResponse {

    @XmlElement(required = true)
    protected String createWorkItemInModuleReturn;

    /**
     * Gets the value of the createWorkItemInModuleReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateWorkItemInModuleReturn() {
        return createWorkItemInModuleReturn;
    }

    /**
     * Sets the value of the createWorkItemInModuleReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateWorkItemInModuleReturn(String value) {
        this.createWorkItemInModuleReturn = value;
    }

}
