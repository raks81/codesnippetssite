
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
 *         &lt;element name="addLinkedRevisionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addLinkedRevisionReturn"
})
@XmlRootElement(name = "addLinkedRevisionResponse")
public class AddLinkedRevisionResponse {

    protected boolean addLinkedRevisionReturn;

    /**
     * Gets the value of the addLinkedRevisionReturn property.
     * 
     */
    public boolean isAddLinkedRevisionReturn() {
        return addLinkedRevisionReturn;
    }

    /**
     * Sets the value of the addLinkedRevisionReturn property.
     * 
     */
    public void setAddLinkedRevisionReturn(boolean value) {
        this.addLinkedRevisionReturn = value;
    }

}
