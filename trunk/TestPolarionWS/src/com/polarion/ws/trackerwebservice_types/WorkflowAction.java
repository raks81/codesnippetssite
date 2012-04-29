
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.trackerwebservice.ArrayOfXsdString;


/**
 * <p>Java class for WorkflowAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cleanedFeatures" type="{http://ws.polarion.com/TrackerWebService}ArrayOf_xsd_string"/>
 *         &lt;element name="nativeActionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requiredFeatures" type="{http://ws.polarion.com/TrackerWebService}ArrayOf_xsd_string"/>
 *         &lt;element name="suggestedFeatures" type="{http://ws.polarion.com/TrackerWebService}ArrayOf_xsd_string"/>
 *         &lt;element name="targetStatus" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowAction", propOrder = {
    "actionId",
    "actionName",
    "cleanedFeatures",
    "nativeActionId",
    "requiredFeatures",
    "suggestedFeatures",
    "targetStatus"
})
public class WorkflowAction {

    protected int actionId;
    @XmlElement(required = true, nillable = true)
    protected String actionName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString cleanedFeatures;
    @XmlElement(required = true, nillable = true)
    protected String nativeActionId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString requiredFeatures;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString suggestedFeatures;
    @XmlElement(required = true, nillable = true)
    protected EnumOptionId targetStatus;

    /**
     * Gets the value of the actionId property.
     * 
     */
    public int getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     * 
     */
    public void setActionId(int value) {
        this.actionId = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the cleanedFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getCleanedFeatures() {
        return cleanedFeatures;
    }

    /**
     * Sets the value of the cleanedFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setCleanedFeatures(ArrayOfXsdString value) {
        this.cleanedFeatures = value;
    }

    /**
     * Gets the value of the nativeActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeActionId() {
        return nativeActionId;
    }

    /**
     * Sets the value of the nativeActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeActionId(String value) {
        this.nativeActionId = value;
    }

    /**
     * Gets the value of the requiredFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getRequiredFeatures() {
        return requiredFeatures;
    }

    /**
     * Sets the value of the requiredFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setRequiredFeatures(ArrayOfXsdString value) {
        this.requiredFeatures = value;
    }

    /**
     * Gets the value of the suggestedFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getSuggestedFeatures() {
        return suggestedFeatures;
    }

    /**
     * Sets the value of the suggestedFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setSuggestedFeatures(ArrayOfXsdString value) {
        this.suggestedFeatures = value;
    }

    /**
     * Gets the value of the targetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getTargetStatus() {
        return targetStatus;
    }

    /**
     * Sets the value of the targetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setTargetStatus(EnumOptionId value) {
        this.targetStatus = value;
    }

}
