
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
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baselineRevision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultsLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "query",
    "sort",
    "baselineRevision",
    "resultsLimit"
})
@XmlRootElement(name = "queryWorkItemUrisInBaselineLimited")
public class QueryWorkItemUrisInBaselineLimited {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(required = true)
    protected String sort;
    @XmlElement(required = true)
    protected String baselineRevision;
    protected int resultsLimit;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
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
     * Gets the value of the resultsLimit property.
     * 
     */
    public int getResultsLimit() {
        return resultsLimit;
    }

    /**
     * Sets the value of the resultsLimit property.
     * 
     */
    public void setResultsLimit(int value) {
        this.resultsLimit = value;
    }

}
