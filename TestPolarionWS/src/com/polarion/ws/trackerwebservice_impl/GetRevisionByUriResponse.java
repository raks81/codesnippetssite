
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.types.Revision;


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
 *         &lt;element name="getRevisionByUriReturn" type="{http://ws.polarion.com/types}Revision"/>
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
    "getRevisionByUriReturn"
})
@XmlRootElement(name = "getRevisionByUriResponse")
public class GetRevisionByUriResponse {

    @XmlElement(required = true)
    protected Revision getRevisionByUriReturn;

    /**
     * Gets the value of the getRevisionByUriReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Revision }
     *     
     */
    public Revision getGetRevisionByUriReturn() {
        return getRevisionByUriReturn;
    }

    /**
     * Sets the value of the getRevisionByUriReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revision }
     *     
     */
    public void setGetRevisionByUriReturn(Revision value) {
        this.getRevisionByUriReturn = value;
    }

}
