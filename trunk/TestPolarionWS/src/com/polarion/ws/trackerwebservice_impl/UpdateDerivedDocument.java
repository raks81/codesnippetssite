
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
 *         &lt;element name="documentURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoSuspect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "documentURI",
    "revision",
    "autoSuspect"
})
@XmlRootElement(name = "updateDerivedDocument")
public class UpdateDerivedDocument {

    @XmlElement(required = true)
    protected String documentURI;
    @XmlElement(required = true)
    protected String revision;
    protected boolean autoSuspect;

    /**
     * Gets the value of the documentURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentURI() {
        return documentURI;
    }

    /**
     * Sets the value of the documentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentURI(String value) {
        this.documentURI = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the autoSuspect property.
     * 
     */
    public boolean isAutoSuspect() {
        return autoSuspect;
    }

    /**
     * Sets the value of the autoSuspect property.
     * 
     */
    public void setAutoSuspect(boolean value) {
        this.autoSuspect = value;
    }

}
