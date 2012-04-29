
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.polarion.ws.trackerwebservice.ArrayOfTns3FieldDiff;


/**
 * <p>Java class for Change complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="diffs" type="{http://ws.polarion.com/TrackerWebService}ArrayOf_tns3_FieldDiff"/>
 *         &lt;element name="empty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change", propOrder = {
    "creation",
    "date",
    "diffs",
    "empty",
    "invalid",
    "revision",
    "user"
})
public class Change {

    protected boolean creation;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3FieldDiff diffs;
    protected boolean empty;
    protected boolean invalid;
    @XmlElement(required = true, nillable = true)
    protected String revision;
    @XmlElement(required = true, nillable = true)
    protected String user;

    /**
     * Gets the value of the creation property.
     * 
     */
    public boolean isCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     */
    public void setCreation(boolean value) {
        this.creation = value;
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
     * Gets the value of the diffs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3FieldDiff }
     *     
     */
    public ArrayOfTns3FieldDiff getDiffs() {
        return diffs;
    }

    /**
     * Sets the value of the diffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3FieldDiff }
     *     
     */
    public void setDiffs(ArrayOfTns3FieldDiff value) {
        this.diffs = value;
    }

    /**
     * Gets the value of the empty property.
     * 
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * Sets the value of the empty property.
     * 
     */
    public void setEmpty(boolean value) {
        this.empty = value;
    }

    /**
     * Gets the value of the invalid property.
     * 
     */
    public boolean isInvalid() {
        return invalid;
    }

    /**
     * Sets the value of the invalid property.
     * 
     */
    public void setInvalid(boolean value) {
        this.invalid = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
