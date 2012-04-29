
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.polarion.ws.projectwebservice_types.Project;
import com.polarion.ws.projectwebservice_types.User;
import com.polarion.ws.types.ArrayOfstring;
import com.polarion.ws.types.Text;


/**
 * <p>Java class for Module complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Module">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowedWITypes" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfEnumOptionId" minOccurs="0"/>
 *         &lt;element name="areLinksFromParentToChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="author" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/>
 *         &lt;element name="autoSuspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="branchedFrom" type="{http://ws.polarion.com/TrackerWebService-types}Module" minOccurs="0"/>
 *         &lt;element name="branchedWithQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="derivedFields" type="{http://ws.polarion.com/types}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="derivedFromURI" type="{http://ws.polarion.com/types}SubterraURI" minOccurs="0"/>
 *         &lt;element name="derivedFromLinkRole" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="homePageContent" type="{http://ws.polarion.com/types}Text" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.polarion.com/types}Location" minOccurs="0"/>
 *         &lt;element name="moduleFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleLocation" type="{http://ws.polarion.com/types}Location" minOccurs="0"/>
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="project" type="{http://ws.polarion.com/ProjectWebService-types}Project" minOccurs="0"/>
 *         &lt;element name="structureLinkRole" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/>
 *         &lt;element name="usesOutlineNumbering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Module", propOrder = {
    "allowedWITypes",
    "areLinksFromParentToChild",
    "author",
    "autoSuspect",
    "branchedFrom",
    "branchedWithQuery",
    "created",
    "derivedFields",
    "derivedFromURI",
    "derivedFromLinkRole",
    "homePageContent",
    "id",
    "location",
    "moduleFolder",
    "moduleLocation",
    "moduleName",
    "project",
    "structureLinkRole",
    "updated",
    "updatedBy",
    "usesOutlineNumbering"
})
public class Module {

    protected ArrayOfEnumOptionId allowedWITypes;
    protected Boolean areLinksFromParentToChild;
    protected User author;
    protected Boolean autoSuspect;
    protected Module branchedFrom;
    protected String branchedWithQuery;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected ArrayOfstring derivedFields;
    protected String derivedFromURI;
    protected EnumOptionId derivedFromLinkRole;
    protected Text homePageContent;
    protected String id;
    protected String location;
    protected String moduleFolder;
    protected String moduleLocation;
    protected String moduleName;
    protected Project project;
    protected EnumOptionId structureLinkRole;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    protected User updatedBy;
    protected Boolean usesOutlineNumbering;
    @XmlAttribute
    protected String uri;
    @XmlAttribute
    protected Boolean unresolvable;

    /**
     * Gets the value of the allowedWITypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEnumOptionId }
     *     
     */
    public ArrayOfEnumOptionId getAllowedWITypes() {
        return allowedWITypes;
    }

    /**
     * Sets the value of the allowedWITypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEnumOptionId }
     *     
     */
    public void setAllowedWITypes(ArrayOfEnumOptionId value) {
        this.allowedWITypes = value;
    }

    /**
     * Gets the value of the areLinksFromParentToChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreLinksFromParentToChild() {
        return areLinksFromParentToChild;
    }

    /**
     * Sets the value of the areLinksFromParentToChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreLinksFromParentToChild(Boolean value) {
        this.areLinksFromParentToChild = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAuthor(User value) {
        this.author = value;
    }

    /**
     * Gets the value of the autoSuspect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSuspect() {
        return autoSuspect;
    }

    /**
     * Sets the value of the autoSuspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSuspect(Boolean value) {
        this.autoSuspect = value;
    }

    /**
     * Gets the value of the branchedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Module }
     *     
     */
    public Module getBranchedFrom() {
        return branchedFrom;
    }

    /**
     * Sets the value of the branchedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Module }
     *     
     */
    public void setBranchedFrom(Module value) {
        this.branchedFrom = value;
    }

    /**
     * Gets the value of the branchedWithQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchedWithQuery() {
        return branchedWithQuery;
    }

    /**
     * Sets the value of the branchedWithQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchedWithQuery(String value) {
        this.branchedWithQuery = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the derivedFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDerivedFields() {
        return derivedFields;
    }

    /**
     * Sets the value of the derivedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDerivedFields(ArrayOfstring value) {
        this.derivedFields = value;
    }

    /**
     * Gets the value of the derivedFromURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromURI() {
        return derivedFromURI;
    }

    /**
     * Sets the value of the derivedFromURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromURI(String value) {
        this.derivedFromURI = value;
    }

    /**
     * Gets the value of the derivedFromLinkRole property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getDerivedFromLinkRole() {
        return derivedFromLinkRole;
    }

    /**
     * Sets the value of the derivedFromLinkRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setDerivedFromLinkRole(EnumOptionId value) {
        this.derivedFromLinkRole = value;
    }

    /**
     * Gets the value of the homePageContent property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getHomePageContent() {
        return homePageContent;
    }

    /**
     * Sets the value of the homePageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setHomePageContent(Text value) {
        this.homePageContent = value;
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
     * Gets the value of the moduleFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleFolder() {
        return moduleFolder;
    }

    /**
     * Sets the value of the moduleFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleFolder(String value) {
        this.moduleFolder = value;
    }

    /**
     * Gets the value of the moduleLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleLocation() {
        return moduleLocation;
    }

    /**
     * Sets the value of the moduleLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleLocation(String value) {
        this.moduleLocation = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the structureLinkRole property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getStructureLinkRole() {
        return structureLinkRole;
    }

    /**
     * Sets the value of the structureLinkRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setStructureLinkRole(EnumOptionId value) {
        this.structureLinkRole = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUpdatedBy(User value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the usesOutlineNumbering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesOutlineNumbering() {
        return usesOutlineNumbering;
    }

    /**
     * Sets the value of the usesOutlineNumbering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesOutlineNumbering(Boolean value) {
        this.usesOutlineNumbering = value;
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
