
package com.polarion.ws.trackerwebservice_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPriorityOptionId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriorityOptionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriorityOptionId" type="{http://ws.polarion.com/TrackerWebService-types}PriorityOptionId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriorityOptionId", propOrder = {
    "priorityOptionId"
})
public class ArrayOfPriorityOptionId {

    @XmlElement(name = "PriorityOptionId")
    protected List<PriorityOptionId> priorityOptionId;

    /**
     * Gets the value of the priorityOptionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityOptionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityOptionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityOptionId }
     * 
     * 
     */
    public List<PriorityOptionId> getPriorityOptionId() {
        if (priorityOptionId == null) {
            priorityOptionId = new ArrayList<PriorityOptionId>();
        }
        return this.priorityOptionId;
    }

}
