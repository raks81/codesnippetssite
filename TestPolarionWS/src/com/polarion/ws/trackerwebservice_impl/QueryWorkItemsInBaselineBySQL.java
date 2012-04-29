
package com.polarion.ws.trackerwebservice_impl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="sqlQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baselineRevision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "sqlQuery",
    "baselineRevision",
    "fields"
})
@XmlRootElement(name = "queryWorkItemsInBaselineBySQL")
public class QueryWorkItemsInBaselineBySQL {

    @XmlElement(required = true)
    protected String sqlQuery;
    @XmlElement(required = true)
    protected String baselineRevision;
    @XmlElement(required = true)
    protected List<String> fields;

    /**
     * Gets the value of the sqlQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlQuery() {
        return sqlQuery;
    }

    /**
     * Sets the value of the sqlQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlQuery(String value) {
        this.sqlQuery = value;
    }

    /**
     * Gets the value of the baselineRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineRevision() {
        return baselineRevision;
    }

    /**
     * Sets the value of the baselineRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineRevision(String value) {
        this.baselineRevision = value;
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

}
