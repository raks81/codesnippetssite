
package com.polarion.ws.trackerwebservice_impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.types.Text;


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
 *         &lt;element name="parentURI" type="{http://ws.polarion.com/types}SubterraURI"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="content" type="{http://ws.polarion.com/types}Text"/>
 *         &lt;element name="visibleTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "parentURI",
    "title",
    "content",
    "visibleTo"
})
@XmlRootElement(name = "createCommentNew")
public class CreateCommentNew {

    @XmlElement(required = true)
    protected String parentURI;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected Text content;
    @XmlElement(required = true)
    protected List<String> visibleTo;

    /**
     * Gets the value of the parentURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentURI() {
        return parentURI;
    }

    /**
     * Sets the value of the parentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentURI(String value) {
        this.parentURI = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setContent(Text value) {
        this.content = value;
    }

    /**
     * Gets the value of the visibleTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visibleTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibleTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVisibleTo() {
        if (visibleTo == null) {
            visibleTo = new ArrayList<String>();
        }
        return this.visibleTo;
    }

}
