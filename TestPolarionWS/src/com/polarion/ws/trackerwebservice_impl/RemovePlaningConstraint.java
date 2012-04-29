
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="constraint" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId"/>
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
    "date",
    "constraint"
})
@XmlRootElement(name = "removePlaningConstraint")
public class RemovePlaningConstraint {

    @XmlElement(required = true)
    protected String workitemURI;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected EnumOptionId constraint;

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
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setConstraint(EnumOptionId value) {
        this.constraint = value;
    }

}
