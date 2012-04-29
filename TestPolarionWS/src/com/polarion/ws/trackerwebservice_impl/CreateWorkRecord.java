
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.polarion.ws.projectwebservice_types.User;


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
 *         &lt;element name="user" type="{http://ws.polarion.com/ProjectWebService-types}User"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="timeSpent" type="{http://ws.polarion.com/types}duration"/>
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
    "user",
    "date",
    "timeSpent"
})
@XmlRootElement(name = "createWorkRecord")
public class CreateWorkRecord {

    @XmlElement(required = true)
    protected String workitemURI;
    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected String timeSpent;

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

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the timeSpent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSpent() {
        return timeSpent;
    }

    /**
     * Sets the value of the timeSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSpent(String value) {
        this.timeSpent = value;
    }

}
