
package com.polarion.ws.trackerwebservice_impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getOneDayLengthReturn" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "getOneDayLengthReturn"
})
@XmlRootElement(name = "getOneDayLengthResponse")
public class GetOneDayLengthResponse {

    protected long getOneDayLengthReturn;

    /**
     * Gets the value of the getOneDayLengthReturn property.
     * 
     */
    public long getGetOneDayLengthReturn() {
        return getOneDayLengthReturn;
    }

    /**
     * Sets the value of the getOneDayLengthReturn property.
     * 
     */
    public void setGetOneDayLengthReturn(long value) {
        this.getOneDayLengthReturn = value;
    }

}
