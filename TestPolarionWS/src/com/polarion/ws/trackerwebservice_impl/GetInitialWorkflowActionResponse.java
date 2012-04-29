
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.WorkflowAction;


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
 *         &lt;element name="getInitialWorkflowActionReturn" type="{http://ws.polarion.com/TrackerWebService-types}WorkflowAction"/>
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
    "getInitialWorkflowActionReturn"
})
@XmlRootElement(name = "getInitialWorkflowActionResponse")
public class GetInitialWorkflowActionResponse {

    @XmlElement(required = true)
    protected WorkflowAction getInitialWorkflowActionReturn;

    /**
     * Gets the value of the getInitialWorkflowActionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowAction }
     *     
     */
    public WorkflowAction getGetInitialWorkflowActionReturn() {
        return getInitialWorkflowActionReturn;
    }

    /**
     * Sets the value of the getInitialWorkflowActionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowAction }
     *     
     */
    public void setGetInitialWorkflowActionReturn(WorkflowAction value) {
        this.getInitialWorkflowActionReturn = value;
    }

}
