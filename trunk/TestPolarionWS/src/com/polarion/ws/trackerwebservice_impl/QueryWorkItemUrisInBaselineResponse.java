
package com.polarion.ws.trackerwebservice_impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="queryWorkItemUrisInBaselineReturn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "queryWorkItemUrisInBaselineReturn"
})
@XmlRootElement(name = "queryWorkItemUrisInBaselineResponse")
public class QueryWorkItemUrisInBaselineResponse {

    @XmlElement(required = true)
    protected List<String> queryWorkItemUrisInBaselineReturn;

    /**
     * Gets the value of the queryWorkItemUrisInBaselineReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryWorkItemUrisInBaselineReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryWorkItemUrisInBaselineReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueryWorkItemUrisInBaselineReturn() {
        if (queryWorkItemUrisInBaselineReturn == null) {
            queryWorkItemUrisInBaselineReturn = new ArrayList<String>();
        }
        return this.queryWorkItemUrisInBaselineReturn;
    }

}
