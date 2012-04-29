
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
 *         &lt;element name="moduleURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="parentWorkItemURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="workItem" type="{http://ws.polarion.com/TrackerWebService-types}WorkItem"/>
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
    "moduleURI",
    "parentWorkItemURI",
    "workItem"
})
@XmlRootElement(name = "createWorkItemInModule")
public class CreateWorkItemInModule {

    @XmlElement(required = true)
    protected String moduleURI;
    @XmlElement(required = true)
    protected String parentWorkItemURI;
    @XmlElement(required = true)
    protected WorkItem workItem;

    /**
     * Gets the value of the moduleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleURI() {
        return moduleURI;
    }

    /**
     * Sets the value of the moduleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleURI(String value) {
        this.moduleURI = value;
    }

    /**
     * Gets the value of the parentWorkItemURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentWorkItemURI() {
        return parentWorkItemURI;
    }

    /**
     * Sets the value of the parentWorkItemURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentWorkItemURI(String value) {
        this.parentWorkItemURI = value;
    }

    /**
     * Gets the value of the workItem property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItem }
     *     
     */
    public WorkItem getWorkItem() {
        return workItem;
    }

    /**
     * Sets the value of the workItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItem }
     *     
     */
    public void setWorkItem(WorkItem value) {
        this.workItem = value;
    }

}
