
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
 *         &lt;element name="addPlaningContraintReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addPlaningContraintReturn"
})
@XmlRootElement(name = "addPlaningContraintResponse")
public class AddPlaningContraintResponse {

    protected boolean addPlaningContraintReturn;

    /**
     * Gets the value of the addPlaningContraintReturn property.
     * 
     */
    public boolean isAddPlaningContraintReturn() {
        return addPlaningContraintReturn;
    }

    /**
     * Sets the value of the addPlaningContraintReturn property.
     * 
     */
    public void setAddPlaningContraintReturn(boolean value) {
        this.addPlaningContraintReturn = value;
    }

}
