
package com.polarion.ws.trackerwebservice_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPlanningConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPlanningConstraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanningConstraint" type="{http://ws.polarion.com/TrackerWebService-types}PlanningConstraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlanningConstraint", propOrder = {
    "planningConstraint"
})
public class ArrayOfPlanningConstraint {

    @XmlElement(name = "PlanningConstraint")
    protected List<PlanningConstraint> planningConstraint;

    /**
     * Gets the value of the planningConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planningConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanningConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanningConstraint }
     * 
     * 
     */
    public List<PlanningConstraint> getPlanningConstraint() {
        if (planningConstraint == null) {
            planningConstraint = new ArrayList<PlanningConstraint>();
        }
        return this.planningConstraint;
    }

}
