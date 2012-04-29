
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
 *         &lt;element name="createCommentNewReturn" type="{http://ws.polarion.com/types}SubterraURI"/>
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
    "createCommentNewReturn"
})
@XmlRootElement(name = "createCommentNewResponse")
public class CreateCommentNewResponse {

    @XmlElement(required = true)
    protected String createCommentNewReturn;

    /**
     * Gets the value of the createCommentNewReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateCommentNewReturn() {
        return createCommentNewReturn;
    }

    /**
     * Sets the value of the createCommentNewReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateCommentNewReturn(String value) {
        this.createCommentNewReturn = value;
    }

}
