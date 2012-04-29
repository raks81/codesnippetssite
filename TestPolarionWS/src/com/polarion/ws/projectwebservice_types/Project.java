
package com.polarion.ws.projectwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.polarion.ws.types.Text;


/**
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://ws.polarion.com/types}Text" minOccurs="0"/>
 *         &lt;element name="finish" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lead" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.polarion.com/types}Location" minOccurs="0"/>
 *         &lt;element name="lockWorkRecordsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectGroupURI" type="{http://ws.polarion.com/types}SubterraURI" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="trackerPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" type="{http://ws.polarion.com/types}SubterraURI" />
 *       &lt;attribute name="unresolvable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "active",
    "description",
    "finish",
    "id",
    "lead",
    "location",
    "lockWorkRecordsDate",
    "name",
    "projectGroupURI",
    "start",
    "trackerPrefix"
})
public class Project {

    protected Boolean active;
    protected Text description;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finish;
    protected String id;
    protected User lead;
    protected String location;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lockWorkRecordsDate;
    protected String name;
    protected String projectGroupURI;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar start;
    protected String trackerPrefix;
    @XmlAttribute
    protected String uri;
    @XmlAttribute
    protected Boolean unresolvable;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setDescription(Text value) {
        this.description = value;
    }

    /**
     * Gets the value of the finish property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinish() {
        return finish;
    }

    /**
     * Sets the value of the finish property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinish(XMLGregorianCalendar value) {
        this.finish = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lead property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getLead() {
        return lead;
    }

    /**
     * Sets the value of the lead property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setLead(User value) {
        this.lead = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the lockWorkRecordsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockWorkRecordsDate() {
        return lockWorkRecordsDate;
    }

    /**
     * Sets the value of the lockWorkRecordsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockWorkRecordsDate(XMLGregorianCalendar value) {
        this.lockWorkRecordsDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the projectGroupURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectGroupURI() {
        return projectGroupURI;
    }

    /**
     * Sets the value of the projectGroupURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectGroupURI(String value) {
        this.projectGroupURI = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the trackerPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackerPrefix() {
        return trackerPrefix;
    }

    /**
     * Sets the value of the trackerPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackerPrefix(String value) {
        this.trackerPrefix = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the unresolvable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnresolvable() {
        return unresolvable;
    }

    /**
     * Sets the value of the unresolvable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnresolvable(Boolean value) {
        this.unresolvable = value;
    }

}
