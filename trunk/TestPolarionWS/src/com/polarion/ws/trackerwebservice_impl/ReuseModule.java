
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
 *         &lt;element name="sourceURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="targetProjectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetLocation" type="{http://ws.polarion.com/types}Location"/>
 *         &lt;element name="targetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkRole" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="exceptFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="derivedFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "sourceURI",
    "targetProjectId",
    "targetLocation",
    "targetName",
    "linkRole",
    "fields",
    "exceptFields",
    "derivedFields"
})
@XmlRootElement(name = "reuseModule")
public class ReuseModule {

    @XmlElement(required = true)
    protected String sourceURI;
    @XmlElement(required = true)
    protected String targetProjectId;
    @XmlElement(required = true)
    protected String targetLocation;
    @XmlElement(required = true)
    protected String targetName;
    @XmlElement(required = true)
    protected EnumOptionId linkRole;
    @XmlElement(required = true)
    protected List<String> fields;
    @XmlElement(required = true)
    protected List<String> exceptFields;
    @XmlElement(required = true)
    protected List<String> derivedFields;

    /**
     * Gets the value of the sourceURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURI() {
        return sourceURI;
    }

    /**
     * Sets the value of the sourceURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURI(String value) {
        this.sourceURI = value;
    }

    /**
     * Gets the value of the targetProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    /**
     * Sets the value of the targetProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetProjectId(String value) {
        this.targetProjectId = value;
    }

    /**
     * Gets the value of the targetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLocation() {
        return targetLocation;
    }

    /**
     * Sets the value of the targetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLocation(String value) {
        this.targetLocation = value;
    }

    /**
     * Gets the value of the targetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * Sets the value of the targetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * Gets the value of the linkRole property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getLinkRole() {
        return linkRole;
    }

    /**
     * Sets the value of the linkRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setLinkRole(EnumOptionId value) {
        this.linkRole = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFields() {
        if (fields == null) {
            fields = new ArrayList<String>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the exceptFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExceptFields() {
        if (exceptFields == null) {
            exceptFields = new ArrayList<String>();
        }
        return this.exceptFields;
    }

    /**
     * Gets the value of the derivedFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDerivedFields() {
        if (derivedFields == null) {
            derivedFields = new ArrayList<String>();
        }
        return this.derivedFields;
    }

}
