
package com.polarion.ws.projectwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.polarion.ws.types.ArrayOfSubterraURI;
import com.polarion.ws.types.Text;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://ws.polarion.com/types}Text" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voteURIs" type="{http://ws.polarion.com/types}ArrayOfSubterraURI" minOccurs="0"/>
 *         &lt;element name="watcheURIs" type="{http://ws.polarion.com/types}ArrayOfSubterraURI" minOccurs="0"/>
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
@XmlType(name = "User", propOrder = {
    "description",
    "email",
    "id",
    "name",
    "voteURIs",
    "watcheURIs"
})
public class User {

    protected Text description;
    protected String email;
    protected String id;
    protected String name;
    protected ArrayOfSubterraURI voteURIs;
    protected ArrayOfSubterraURI watcheURIs;
    @XmlAttribute
    protected String uri;
    @XmlAttribute
    protected Boolean unresolvable;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setDescription(Text value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the voteURIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubterraURI }
     *     
     */
    public ArrayOfSubterraURI getVoteURIs() {
        return voteURIs;
    }

    /**
     * Sets the value of the voteURIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubterraURI }
     *     
     */
    public void setVoteURIs(ArrayOfSubterraURI value) {
        this.voteURIs = value;
    }

    /**
     * Gets the value of the watcheURIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubterraURI }
     *     
     */
    public ArrayOfSubterraURI getWatcheURIs() {
        return watcheURIs;
    }

    /**
     * Sets the value of the watcheURIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubterraURI }
     *     
     */
    public void setWatcheURIs(ArrayOfSubterraURI value) {
        this.watcheURIs = value;
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
