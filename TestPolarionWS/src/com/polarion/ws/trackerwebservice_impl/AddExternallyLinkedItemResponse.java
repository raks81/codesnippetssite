
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="addExternallyLinkedItemReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addExternallyLinkedItemReturn"
})
@XmlRootElement(name = "addExternallyLinkedItemResponse")
public class AddExternallyLinkedItemResponse {

    protected boolean addExternallyLinkedItemReturn;

    /**
     * Gets the value of the addExternallyLinkedItemReturn property.
     * 
     */
    public boolean isAddExternallyLinkedItemReturn() {
        return addExternallyLinkedItemReturn;
    }

    /**
     * Sets the value of the addExternallyLinkedItemReturn property.
     * 
     */
    public void setAddExternallyLinkedItemReturn(boolean value) {
        this.addExternallyLinkedItemReturn = value;
    }

}
