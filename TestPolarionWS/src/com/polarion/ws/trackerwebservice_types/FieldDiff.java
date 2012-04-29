
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice.ArrayOfXsdAnyType;


/**
 * <p>Java class for FieldDiff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDiff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="added" type="{http://ws.polarion.com/TrackerWebService}ArrayOf_xsd_anyType"/>
 *         &lt;element name="after" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="before" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="removed" type="{http://ws.polarion.com/TrackerWebService}ArrayOf_xsd_anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDiff", propOrder = {
    "added",
    "after",
    "before",
    "collection",
    "fieldName",
    "removed"
})
public class FieldDiff {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdAnyType added;
    @XmlElement(required = true, nillable = true)
    protected Object after;
    @XmlElement(required = true, nillable = true)
    protected Object before;
    protected boolean collection;
    @XmlElement(required = true, nillable = true)
    protected String fieldName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdAnyType removed;

    /**
     * Gets the value of the added property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdAnyType }
     *     
     */
    public ArrayOfXsdAnyType getAdded() {
        return added;
    }

    /**
     * Sets the value of the added property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdAnyType }
     *     
     */
    public void setAdded(ArrayOfXsdAnyType value) {
        this.added = value;
    }

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAfter(Object value) {
        this.after = value;
    }

    /**
     * Gets the value of the before property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBefore(Object value) {
        this.before = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     */
    public boolean isCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     */
    public void setCollection(boolean value) {
        this.collection = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the removed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdAnyType }
     *     
     */
    public ArrayOfXsdAnyType getRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdAnyType }
     *     
     */
    public void setRemoved(ArrayOfXsdAnyType value) {
        this.removed = value;
    }

}
