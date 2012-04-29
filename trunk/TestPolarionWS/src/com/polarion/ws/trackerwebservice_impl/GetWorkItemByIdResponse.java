
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.WorkItem;


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
 *         &lt;element name="getWorkItemByIdReturn" type="{http://ws.polarion.com/TrackerWebService-types}WorkItem"/>
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
    "getWorkItemByIdReturn"
})
@XmlRootElement(name = "getWorkItemByIdResponse")
public class GetWorkItemByIdResponse {

    @XmlElement(required = true)
    protected WorkItem getWorkItemByIdReturn;

    /**
     * Gets the value of the getWorkItemByIdReturn property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItem }
     *     
     */
    public WorkItem getGetWorkItemByIdReturn() {
        return getWorkItemByIdReturn;
    }

    /**
     * Sets the value of the getWorkItemByIdReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItem }
     *     
     */
    public void setGetWorkItemByIdReturn(WorkItem value) {
        this.getWorkItemByIdReturn = value;
    }

}
