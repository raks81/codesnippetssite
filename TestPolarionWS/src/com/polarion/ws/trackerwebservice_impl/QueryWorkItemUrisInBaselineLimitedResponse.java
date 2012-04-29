
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
 *         &lt;element name="queryWorkItemUrisInBaselineLimitedReturn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "queryWorkItemUrisInBaselineLimitedReturn"
})
@XmlRootElement(name = "queryWorkItemUrisInBaselineLimitedResponse")
public class QueryWorkItemUrisInBaselineLimitedResponse {

    @XmlElement(required = true)
    protected List<String> queryWorkItemUrisInBaselineLimitedReturn;

    /**
     * Gets the value of the queryWorkItemUrisInBaselineLimitedReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryWorkItemUrisInBaselineLimitedReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryWorkItemUrisInBaselineLimitedReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueryWorkItemUrisInBaselineLimitedReturn() {
        if (queryWorkItemUrisInBaselineLimitedReturn == null) {
            queryWorkItemUrisInBaselineLimitedReturn = new ArrayList<String>();
        }
        return this.queryWorkItemUrisInBaselineLimitedReturn;
    }

}
