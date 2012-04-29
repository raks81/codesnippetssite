
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
 *         &lt;element name="sqlQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baselineRevision" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "baselineRevision"
})
@XmlRootElement(name = "queryWorkItemUrisInBaselineBySQL")
public class QueryWorkItemUrisInBaselineBySQL {

    @XmlElement(required = true)
    protected String sqlQuery;
    @XmlElement(required = true)
    protected String baselineRevision;

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

}
