
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityOpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityOpt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polarion.com/TrackerWebService-types}EnumOption">
 *       &lt;sequence>
 *         &lt;element name="float" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityOpt", propOrder = {
    "_float"
})
public class PriorityOpt
    extends EnumOption
{

    @XmlElement(name = "float")
    protected float _float;

    /**
     * Gets the value of the float property.
     * 
     */
    public float getFloat() {
        return _float;
    }

    /**
     * Sets the value of the float property.
     * 
     */
    public void setFloat(float value) {
        this._float = value;
    }

}
