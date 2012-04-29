
package com.polarion.ws.trackerwebservice_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExternallyLinkedWorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExternallyLinkedWorkItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternallyLinkedWorkItem" type="{http://ws.polarion.com/TrackerWebService-types}ExternallyLinkedWorkItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExternallyLinkedWorkItem", propOrder = {
    "externallyLinkedWorkItem"
})
public class ArrayOfExternallyLinkedWorkItem {

    @XmlElement(name = "ExternallyLinkedWorkItem")
    protected List<ExternallyLinkedWorkItem> externallyLinkedWorkItem;

    /**
     * Gets the value of the externallyLinkedWorkItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externallyLinkedWorkItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternallyLinkedWorkItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyLinkedWorkItem }
     * 
     * 
     */
    public List<ExternallyLinkedWorkItem> getExternallyLinkedWorkItem() {
        if (externallyLinkedWorkItem == null) {
            externallyLinkedWorkItem = new ArrayList<ExternallyLinkedWorkItem>();
        }
        return this.externallyLinkedWorkItem;
    }

}
