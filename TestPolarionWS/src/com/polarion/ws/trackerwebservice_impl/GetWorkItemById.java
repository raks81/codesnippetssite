
package com.polarion.ws.trackerwebservice_impl;

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
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workitemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "projectId",
    "workitemId"
})
@XmlRootElement(name = "getWorkItemById")
public class GetWorkItemById {

    @XmlElement(required = true)
    protected String projectId;
    @XmlElement(required = true)
    protected String workitemId;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the workitemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkitemId() {
        return workitemId;
    }

    /**
     * Sets the value of the workitemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkitemId(String value) {
        this.workitemId = value;
    }

}
