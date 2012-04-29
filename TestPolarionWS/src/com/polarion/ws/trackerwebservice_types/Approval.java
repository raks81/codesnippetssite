
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.projectwebservice_types.User;


/**
 * <p>Java class for Approval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Approval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="user" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Approval", propOrder = {
    "status",
    "user"
})
public class Approval {

    protected EnumOptionId status;
    protected User user;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setStatus(EnumOptionId value) {
        this.status = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
