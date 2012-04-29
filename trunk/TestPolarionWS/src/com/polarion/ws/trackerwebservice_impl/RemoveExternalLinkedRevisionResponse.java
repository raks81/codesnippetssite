
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
 *         &lt;element name="removeExternalLinkedRevisionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeExternalLinkedRevisionReturn"
})
@XmlRootElement(name = "removeExternalLinkedRevisionResponse")
public class RemoveExternalLinkedRevisionResponse {

    protected boolean removeExternalLinkedRevisionReturn;

    /**
     * Gets the value of the removeExternalLinkedRevisionReturn property.
     * 
     */
    public boolean isRemoveExternalLinkedRevisionReturn() {
        return removeExternalLinkedRevisionReturn;
    }

    /**
     * Sets the value of the removeExternalLinkedRevisionReturn property.
     * 
     */
    public void setRemoveExternalLinkedRevisionReturn(boolean value) {
        this.removeExternalLinkedRevisionReturn = value;
    }

}
