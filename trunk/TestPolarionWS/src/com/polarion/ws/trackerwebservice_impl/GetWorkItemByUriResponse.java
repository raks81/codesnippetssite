
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
 *         &lt;element name="getWorkItemByUriReturn" type="{http://ws.polarion.com/TrackerWebService-types}WorkItem"/>
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
    "getWorkItemByUriReturn"
})
@XmlRootElement(name = "getWorkItemByUriResponse")
public class GetWorkItemByUriResponse {

    @XmlElement(required = true)
    protected WorkItem getWorkItemByUriReturn;

    /**
     * Gets the value of the getWorkItemByUriReturn property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItem }
     *     
     */
    public WorkItem getGetWorkItemByUriReturn() {
        return getWorkItemByUriReturn;
    }

    /**
     * Sets the value of the getWorkItemByUriReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItem }
     *     
     */
    public void setGetWorkItemByUriReturn(WorkItem value) {
        this.getWorkItemByUriReturn = value;
    }

}
