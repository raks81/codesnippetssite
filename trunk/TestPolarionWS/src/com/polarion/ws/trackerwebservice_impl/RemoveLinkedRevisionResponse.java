
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
 *         &lt;element name="removeLinkedRevisionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeLinkedRevisionReturn"
})
@XmlRootElement(name = "removeLinkedRevisionResponse")
public class RemoveLinkedRevisionResponse {

    protected boolean removeLinkedRevisionReturn;

    /**
     * Gets the value of the removeLinkedRevisionReturn property.
     * 
     */
    public boolean isRemoveLinkedRevisionReturn() {
        return removeLinkedRevisionReturn;
    }

    /**
     * Sets the value of the removeLinkedRevisionReturn property.
     * 
     */
    public void setRemoveLinkedRevisionReturn(boolean value) {
        this.removeLinkedRevisionReturn = value;
    }

}
