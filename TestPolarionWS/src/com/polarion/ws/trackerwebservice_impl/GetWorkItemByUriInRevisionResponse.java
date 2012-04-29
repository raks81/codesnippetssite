
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
 *         &lt;element name="getWorkItemByUriInRevisionReturn" type="{http://ws.polarion.com/TrackerWebService-types}WorkItem"/>
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
    "getWorkItemByUriInRevisionReturn"
})
@XmlRootElement(name = "getWorkItemByUriInRevisionResponse")
public class GetWorkItemByUriInRevisionResponse {

    @XmlElement(required = true)
    protected WorkItem getWorkItemByUriInRevisionReturn;

    /**
     * Gets the value of the getWorkItemByUriInRevisionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItem }
     *     
     */
    public WorkItem getGetWorkItemByUriInRevisionReturn() {
        return getWorkItemByUriInRevisionReturn;
    }

    /**
     * Sets the value of the getWorkItemByUriInRevisionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItem }
     *     
     */
    public void setGetWorkItemByUriInRevisionReturn(WorkItem value) {
        this.getWorkItemByUriInRevisionReturn = value;
    }

}
