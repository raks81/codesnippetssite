
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
 *         &lt;element name="removeLinkedItemReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeLinkedItemReturn"
})
@XmlRootElement(name = "removeLinkedItemResponse")
public class RemoveLinkedItemResponse {

    protected boolean removeLinkedItemReturn;

    /**
     * Gets the value of the removeLinkedItemReturn property.
     * 
     */
    public boolean isRemoveLinkedItemReturn() {
        return removeLinkedItemReturn;
    }

    /**
     * Sets the value of the removeLinkedItemReturn property.
     * 
     */
    public void setRemoveLinkedItemReturn(boolean value) {
        this.removeLinkedItemReturn = value;
    }

}
