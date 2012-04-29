
package com.polarion.ws.trackerwebservice_impl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://ws.polarion.com/types}Location"/>
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowedWITypes" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" maxOccurs="unbounded"/>
 *         &lt;element name="structureLinkRole" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId"/>
 *         &lt;element name="parentToChild" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="homePageContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "location",
    "moduleName",
    "allowedWITypes",
    "structureLinkRole",
    "parentToChild",
    "homePageContent"
})
@XmlRootElement(name = "createModule")
public class CreateModule {

    @XmlElement(required = true)
    protected String projectId;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String moduleName;
    @XmlElement(required = true)
    protected List<EnumOptionId> allowedWITypes;
    @XmlElement(required = true)
    protected EnumOptionId structureLinkRole;
    protected boolean parentToChild;
    @XmlElement(required = true)
    protected String homePageContent;

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
     * Gets the value of the allowedWITypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedWITypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedWITypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumOptionId }
     * 
     * 
     */
    public List<EnumOptionId> getAllowedWITypes() {
        if (allowedWITypes == null) {
            allowedWITypes = new ArrayList<EnumOptionId>();
        }
        return this.allowedWITypes;
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
     * Gets the value of the parentToChild property.
     * 
     */
    public boolean isParentToChild() {
        return parentToChild;
    }

    /**
     * Sets the value of the parentToChild property.
     * 
     */
    public void setParentToChild(boolean value) {
        this.parentToChild = value;
    }

    /**
     * Gets the value of the homePageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePageContent() {
        return homePageContent;
    }

    /**
     * Sets the value of the homePageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePageContent(String value) {
        this.homePageContent = value;
    }

}
