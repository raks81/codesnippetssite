
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.EnumOptionId;


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
 *         &lt;element name="workitemURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="linkedWorkitemURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="role" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId"/>
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
    "workitemURI",
    "linkedWorkitemURI",
    "role"
})
@XmlRootElement(name = "addLinkedItem")
public class AddLinkedItem {

    @XmlElement(required = true)
    protected String workitemURI;
    @XmlElement(required = true)
    protected String linkedWorkitemURI;
    @XmlElement(required = true)
    protected EnumOptionId role;

    /**
     * Gets the value of the workitemURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkitemURI() {
        return workitemURI;
    }

    /**
     * Sets the value of the workitemURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkitemURI(String value) {
        this.workitemURI = value;
    }

    /**
     * Gets the value of the linkedWorkitemURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedWorkitemURI() {
        return linkedWorkitemURI;
    }

    /**
     * Sets the value of the linkedWorkitemURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedWorkitemURI(String value) {
        this.linkedWorkitemURI = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setRole(EnumOptionId value) {
        this.role = value;
    }

}
