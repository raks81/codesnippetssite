
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
 *         &lt;element name="removeAssigneeReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeAssigneeReturn"
})
@XmlRootElement(name = "removeAssigneeResponse")
public class RemoveAssigneeResponse {

    protected boolean removeAssigneeReturn;

    /**
     * Gets the value of the removeAssigneeReturn property.
     * 
     */
    public boolean isRemoveAssigneeReturn() {
        return removeAssigneeReturn;
    }

    /**
     * Sets the value of the removeAssigneeReturn property.
     * 
     */
    public void setRemoveAssigneeReturn(boolean value) {
        this.removeAssigneeReturn = value;
    }

}
