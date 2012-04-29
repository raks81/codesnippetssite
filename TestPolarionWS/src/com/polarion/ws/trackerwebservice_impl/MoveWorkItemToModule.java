
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
 *         &lt;element name="workItemURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="moduleURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="parentWorkItemURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "workItemURI",
    "moduleURI",
    "parentWorkItemURI",
    "position"
})
@XmlRootElement(name = "moveWorkItemToModule")
public class MoveWorkItemToModule {

    @XmlElement(required = true)
    protected String workItemURI;
    @XmlElement(required = true)
    protected String moduleURI;
    @XmlElement(required = true)
    protected String parentWorkItemURI;
    protected int position;

    /**
     * Gets the value of the workItemURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemURI() {
        return workItemURI;
    }

    /**
     * Sets the value of the workItemURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemURI(String value) {
        this.workItemURI = value;
    }

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
     * Gets the value of the position property.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

}
