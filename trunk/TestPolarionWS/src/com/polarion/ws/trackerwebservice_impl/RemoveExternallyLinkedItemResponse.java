
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
 *         &lt;element name="removeExternallyLinkedItemReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeExternallyLinkedItemReturn"
})
@XmlRootElement(name = "removeExternallyLinkedItemResponse")
public class RemoveExternallyLinkedItemResponse {

    protected boolean removeExternallyLinkedItemReturn;

    /**
     * Gets the value of the removeExternallyLinkedItemReturn property.
     * 
     */
    public boolean isRemoveExternallyLinkedItemReturn() {
        return removeExternallyLinkedItemReturn;
    }

    /**
     * Sets the value of the removeExternallyLinkedItemReturn property.
     * 
     */
    public void setRemoveExternallyLinkedItemReturn(boolean value) {
        this.removeExternallyLinkedItemReturn = value;
    }

}
