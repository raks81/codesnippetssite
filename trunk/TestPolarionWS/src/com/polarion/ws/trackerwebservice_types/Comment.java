
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.polarion.ws.projectwebservice_types.User;
import com.polarion.ws.types.ArrayOfSubterraURI;
import com.polarion.ws.types.ArrayOfstring;
import com.polarion.ws.types.Text;


/**
 * <p>Java class for Comment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Comment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/>
 *         &lt;element name="childCommentURIs" type="{http://ws.polarion.com/types}ArrayOfSubterraURI" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentCommentURI" type="{http://ws.polarion.com/types}SubterraURI" minOccurs="0"/>
 *         &lt;element name="text" type="{http://ws.polarion.com/types}Text" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibleTo" type="{http://ws.polarion.com/types}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" type="{http://ws.polarion.com/types}SubterraURI" />
 *       &lt;attribute name="unresolvable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comment", propOrder = {
    "author",
    "childCommentURIs",
    "created",
    "id",
    "parentCommentURI",
    "text",
    "title",
    "visibleTo"
})
public class Comment {

    protected User author;
    protected ArrayOfSubterraURI childCommentURIs;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected String id;
    protected String parentCommentURI;
    protected Text text;
    protected String title;
    protected ArrayOfstring visibleTo;
    @XmlAttribute
    protected String uri;
    @XmlAttribute
    protected Boolean unresolvable;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAuthor(User value) {
        this.author = value;
    }

    /**
     * Gets the value of the childCommentURIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubterraURI }
     *     
     */
    public ArrayOfSubterraURI getChildCommentURIs() {
        return childCommentURIs;
    }

    /**
     * Sets the value of the childCommentURIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubterraURI }
     *     
     */
    public void setChildCommentURIs(ArrayOfSubterraURI value) {
        this.childCommentURIs = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the parentCommentURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCommentURI() {
        return parentCommentURI;
    }

    /**
     * Sets the value of the parentCommentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCommentURI(String value) {
        this.parentCommentURI = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
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
     * Gets the value of the visibleTo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getVisibleTo() {
        return visibleTo;
    }

    /**
     * Sets the value of the visibleTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setVisibleTo(ArrayOfstring value) {
        this.visibleTo = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the unresolvable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnresolvable() {
        return unresolvable;
    }

    /**
     * Sets the value of the unresolvable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnresolvable(Boolean value) {
        this.unresolvable = value;
    }

}
