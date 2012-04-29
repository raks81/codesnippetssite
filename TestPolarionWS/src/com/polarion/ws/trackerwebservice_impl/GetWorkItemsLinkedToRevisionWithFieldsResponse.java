
package com.polarion.ws.trackerwebservice_impl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="getWorkItemsLinkedToRevisionWithFieldsReturn" type="{http://ws.polarion.com/TrackerWebService-types}WorkItem" maxOccurs="unbounded"/>
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
    "getWorkItemsLinkedToRevisionWithFieldsReturn"
})
@XmlRootElement(name = "getWorkItemsLinkedToRevisionWithFieldsResponse")
public class GetWorkItemsLinkedToRevisionWithFieldsResponse {

    @XmlElement(required = true)
    protected List<WorkItem> getWorkItemsLinkedToRevisionWithFieldsReturn;

    /**
     * Gets the value of the getWorkItemsLinkedToRevisionWithFieldsReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getWorkItemsLinkedToRevisionWithFieldsReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetWorkItemsLinkedToRevisionWithFieldsReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkItem }
     * 
     * 
     */
    public List<WorkItem> getGetWorkItemsLinkedToRevisionWithFieldsReturn() {
        if (getWorkItemsLinkedToRevisionWithFieldsReturn == null) {
            getWorkItemsLinkedToRevisionWithFieldsReturn = new ArrayList<WorkItem>();
        }
        return this.getWorkItemsLinkedToRevisionWithFieldsReturn;
    }

}
