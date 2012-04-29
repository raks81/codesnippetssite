
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
 *         &lt;element name="getWorkItemsCountReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getWorkItemsCountReturn"
})
@XmlRootElement(name = "getWorkItemsCountResponse")
public class GetWorkItemsCountResponse {

    protected int getWorkItemsCountReturn;

    /**
     * Gets the value of the getWorkItemsCountReturn property.
     * 
     */
    public int getGetWorkItemsCountReturn() {
        return getWorkItemsCountReturn;
    }

    /**
     * Sets the value of the getWorkItemsCountReturn property.
     * 
     */
    public void setGetWorkItemsCountReturn(int value) {
        this.getWorkItemsCountReturn = value;
    }

}
