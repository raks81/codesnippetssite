
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
 *         &lt;element name="workitemURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="enumID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "enumID"
})
@XmlRootElement(name = "getEnumOptionsForId")
public class GetEnumOptionsForId {

    @XmlElement(required = true)
    protected String workitemURI;
    @XmlElement(required = true)
    protected String enumID;

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
     * Gets the value of the enumID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumID() {
        return enumID;
    }

    /**
     * Sets the value of the enumID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumID(String value) {
        this.enumID = value;
    }

}
