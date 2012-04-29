
package com.polarion.ws.trackerwebservice_impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice_types.EnumOption;


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
 *         &lt;element name="getAllEnumOptionsForKeyReturn" type="{http://ws.polarion.com/TrackerWebService-types}EnumOption" maxOccurs="unbounded"/>
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
    "getAllEnumOptionsForKeyReturn"
})
@XmlRootElement(name = "getAllEnumOptionsForKeyResponse")
public class GetAllEnumOptionsForKeyResponse {

    @XmlElement(required = true)
    protected List<EnumOption> getAllEnumOptionsForKeyReturn;

    /**
     * Gets the value of the getAllEnumOptionsForKeyReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getAllEnumOptionsForKeyReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetAllEnumOptionsForKeyReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumOption }
     * 
     * 
     */
    public List<EnumOption> getGetAllEnumOptionsForKeyReturn() {
        if (getAllEnumOptionsForKeyReturn == null) {
            getAllEnumOptionsForKeyReturn = new ArrayList<EnumOption>();
        }
        return this.getAllEnumOptionsForKeyReturn;
    }

}