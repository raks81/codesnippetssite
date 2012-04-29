
package com.polarion.ws.trackerwebservice_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.polarion.ws.projectwebservice_types.ArrayOfUser;
import com.polarion.ws.projectwebservice_types.Project;
import com.polarion.ws.projectwebservice_types.User;
import com.polarion.ws.types.ArrayOfRevision;
import com.polarion.ws.types.Text;


/**
 * <p>Java class for WorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvals" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfApproval" minOccurs="0"/>
 *         &lt;element name="assignee" type="{http://ws.polarion.com/ProjectWebService-types}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfAttachment" minOccurs="0"/>
 *         &lt;element name="author" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/>
 *         &lt;element name="autoSuspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="categories" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfCategory" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfComment" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://ws.polarion.com/types}Text" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="externallyLinkedWorkItems" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfExternallyLinkedWorkItem" minOccurs="0"/>
 *         &lt;element name="hyperlinks" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfHyperlink" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialEstimate" type="{http://ws.polarion.com/types}duration" minOccurs="0"/>
 *         &lt;element name="linkedRevisions" type="{http://ws.polarion.com/types}ArrayOfRevision" minOccurs="0"/>
 *         &lt;element name="linkedRevisionsDerived" type="{http://ws.polarion.com/types}ArrayOfRevision" minOccurs="0"/>
 *         &lt;element name="linkedWorkItems" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfLinkedWorkItem" minOccurs="0"/>
 *         &lt;element name="linkedWorkItemsDerived" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfLinkedWorkItem" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.polarion.com/types}Location" minOccurs="0"/>
 *         &lt;element name="moduleURI" type="{http://ws.polarion.com/types}SubterraURI" minOccurs="0"/>
 *         &lt;element name="outlineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plannedEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="plannedStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="planningConstraints" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfPlanningConstraint" minOccurs="0"/>
 *         &lt;element name="previousStatus" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://ws.polarion.com/TrackerWebService-types}PriorityOptionId" minOccurs="0"/>
 *         &lt;element name="project" type="{http://ws.polarion.com/ProjectWebService-types}Project" minOccurs="0"/>
 *         &lt;element name="remainingEstimate" type="{http://ws.polarion.com/types}duration" minOccurs="0"/>
 *         &lt;element name="resolution" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="resolvedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="timePoint" type="{http://ws.polarion.com/TrackerWebService-types}TimePoint" minOccurs="0"/>
 *         &lt;element name="timeSpent" type="{http://ws.polarion.com/types}duration" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="workRecords" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfWorkRecord" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://ws.polarion.com/TrackerWebService-types}ArrayOfCustom" minOccurs="0"/>
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
@XmlType(name = "WorkItem", propOrder = {
    "approvals",
    "assignee",
    "attachments",
    "author",
    "autoSuspect",
    "categories",
    "comments",
    "created",
    "description",
    "dueDate",
    "externallyLinkedWorkItems",
    "hyperlinks",
    "id",
    "initialEstimate",
    "linkedRevisions",
    "linkedRevisionsDerived",
    "linkedWorkItems",
    "linkedWorkItemsDerived",
    "location",
    "moduleURI",
    "outlineNumber",
    "plannedEnd",
    "plannedStart",
    "planningConstraints",
    "previousStatus",
    "priority",
    "project",
    "remainingEstimate",
    "resolution",
    "resolvedOn",
    "severity",
    "status",
    "timePoint",
    "timeSpent",
    "title",
    "type",
    "updated",
    "workRecords",
    "customFields"
})
public class WorkItem {

    protected ArrayOfApproval approvals;
    protected ArrayOfUser assignee;
    protected ArrayOfAttachment attachments;
    protected User author;
    protected Boolean autoSuspect;
    protected ArrayOfCategory categories;
    protected ArrayOfComment comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected Text description;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    protected ArrayOfExternallyLinkedWorkItem externallyLinkedWorkItems;
    protected ArrayOfHyperlink hyperlinks;
    protected String id;
    protected String initialEstimate;
    protected ArrayOfRevision linkedRevisions;
    protected ArrayOfRevision linkedRevisionsDerived;
    protected ArrayOfLinkedWorkItem linkedWorkItems;
    protected ArrayOfLinkedWorkItem linkedWorkItemsDerived;
    protected String location;
    protected String moduleURI;
    protected String outlineNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedStart;
    protected ArrayOfPlanningConstraint planningConstraints;
    protected EnumOptionId previousStatus;
    protected PriorityOptionId priority;
    protected Project project;
    protected String remainingEstimate;
    protected EnumOptionId resolution;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedOn;
    protected EnumOptionId severity;
    protected EnumOptionId status;
    protected TimePoint timePoint;
    protected String timeSpent;
    protected String title;
    protected EnumOptionId type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    protected ArrayOfWorkRecord workRecords;
    protected ArrayOfCustom customFields;
    @XmlAttribute
    protected String uri;
    @XmlAttribute
    protected Boolean unresolvable;

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApproval }
     *     
     */
    public ArrayOfApproval getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApproval }
     *     
     */
    public void setApprovals(ArrayOfApproval value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the assignee property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getAssignee() {
        return assignee;
    }

    /**
     * Sets the value of the assignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setAssignee(ArrayOfUser value) {
        this.assignee = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

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
     * Gets the value of the autoSuspect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSuspect() {
        return autoSuspect;
    }

    /**
     * Sets the value of the autoSuspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSuspect(Boolean value) {
        this.autoSuspect = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *     
     */
    public ArrayOfCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *     
     */
    public void setCategories(ArrayOfCategory value) {
        this.categories = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComment }
     *     
     */
    public ArrayOfComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComment }
     *     
     */
    public void setComments(ArrayOfComment value) {
        this.comments = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the externallyLinkedWorkItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExternallyLinkedWorkItem }
     *     
     */
    public ArrayOfExternallyLinkedWorkItem getExternallyLinkedWorkItems() {
        return externallyLinkedWorkItems;
    }

    /**
     * Sets the value of the externallyLinkedWorkItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExternallyLinkedWorkItem }
     *     
     */
    public void setExternallyLinkedWorkItems(ArrayOfExternallyLinkedWorkItem value) {
        this.externallyLinkedWorkItems = value;
    }

    /**
     * Gets the value of the hyperlinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHyperlink }
     *     
     */
    public ArrayOfHyperlink getHyperlinks() {
        return hyperlinks;
    }

    /**
     * Sets the value of the hyperlinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHyperlink }
     *     
     */
    public void setHyperlinks(ArrayOfHyperlink value) {
        this.hyperlinks = value;
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
     * Gets the value of the initialEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialEstimate() {
        return initialEstimate;
    }

    /**
     * Sets the value of the initialEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialEstimate(String value) {
        this.initialEstimate = value;
    }

    /**
     * Gets the value of the linkedRevisions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRevision }
     *     
     */
    public ArrayOfRevision getLinkedRevisions() {
        return linkedRevisions;
    }

    /**
     * Sets the value of the linkedRevisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRevision }
     *     
     */
    public void setLinkedRevisions(ArrayOfRevision value) {
        this.linkedRevisions = value;
    }

    /**
     * Gets the value of the linkedRevisionsDerived property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRevision }
     *     
     */
    public ArrayOfRevision getLinkedRevisionsDerived() {
        return linkedRevisionsDerived;
    }

    /**
     * Sets the value of the linkedRevisionsDerived property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRevision }
     *     
     */
    public void setLinkedRevisionsDerived(ArrayOfRevision value) {
        this.linkedRevisionsDerived = value;
    }

    /**
     * Gets the value of the linkedWorkItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedWorkItem }
     *     
     */
    public ArrayOfLinkedWorkItem getLinkedWorkItems() {
        return linkedWorkItems;
    }

    /**
     * Sets the value of the linkedWorkItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedWorkItem }
     *     
     */
    public void setLinkedWorkItems(ArrayOfLinkedWorkItem value) {
        this.linkedWorkItems = value;
    }

    /**
     * Gets the value of the linkedWorkItemsDerived property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedWorkItem }
     *     
     */
    public ArrayOfLinkedWorkItem getLinkedWorkItemsDerived() {
        return linkedWorkItemsDerived;
    }

    /**
     * Sets the value of the linkedWorkItemsDerived property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedWorkItem }
     *     
     */
    public void setLinkedWorkItemsDerived(ArrayOfLinkedWorkItem value) {
        this.linkedWorkItemsDerived = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the moduleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleURI() {
        return moduleURI;
    }

    /**
     * Sets the value of the moduleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleURI(String value) {
        this.moduleURI = value;
    }

    /**
     * Gets the value of the outlineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineNumber() {
        return outlineNumber;
    }

    /**
     * Sets the value of the outlineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlineNumber(String value) {
        this.outlineNumber = value;
    }

    /**
     * Gets the value of the plannedEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedEnd() {
        return plannedEnd;
    }

    /**
     * Sets the value of the plannedEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedEnd(XMLGregorianCalendar value) {
        this.plannedEnd = value;
    }

    /**
     * Gets the value of the plannedStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedStart() {
        return plannedStart;
    }

    /**
     * Sets the value of the plannedStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedStart(XMLGregorianCalendar value) {
        this.plannedStart = value;
    }

    /**
     * Gets the value of the planningConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlanningConstraint }
     *     
     */
    public ArrayOfPlanningConstraint getPlanningConstraints() {
        return planningConstraints;
    }

    /**
     * Sets the value of the planningConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlanningConstraint }
     *     
     */
    public void setPlanningConstraints(ArrayOfPlanningConstraint value) {
        this.planningConstraints = value;
    }

    /**
     * Gets the value of the previousStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getPreviousStatus() {
        return previousStatus;
    }

    /**
     * Sets the value of the previousStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setPreviousStatus(EnumOptionId value) {
        this.previousStatus = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityOptionId }
     *     
     */
    public PriorityOptionId getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityOptionId }
     *     
     */
    public void setPriority(PriorityOptionId value) {
        this.priority = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the remainingEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    /**
     * Sets the value of the remainingEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingEstimate(String value) {
        this.remainingEstimate = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setResolution(EnumOptionId value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the resolvedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedOn() {
        return resolvedOn;
    }

    /**
     * Sets the value of the resolvedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedOn(XMLGregorianCalendar value) {
        this.resolvedOn = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setSeverity(EnumOptionId value) {
        this.severity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setStatus(EnumOptionId value) {
        this.status = value;
    }

    /**
     * Gets the value of the timePoint property.
     * 
     * @return
     *     possible object is
     *     {@link TimePoint }
     *     
     */
    public TimePoint getTimePoint() {
        return timePoint;
    }

    /**
     * Sets the value of the timePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePoint }
     *     
     */
    public void setTimePoint(TimePoint value) {
        this.timePoint = value;
    }

    /**
     * Gets the value of the timeSpent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSpent() {
        return timeSpent;
    }

    /**
     * Sets the value of the timeSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSpent(String value) {
        this.timeSpent = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setType(EnumOptionId value) {
        this.type = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the workRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkRecord }
     *     
     */
    public ArrayOfWorkRecord getWorkRecords() {
        return workRecords;
    }

    /**
     * Sets the value of the workRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkRecord }
     *     
     */
    public void setWorkRecords(ArrayOfWorkRecord value) {
        this.workRecords = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustom }
     *     
     */
    public ArrayOfCustom getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustom }
     *     
     */
    public void setCustomFields(ArrayOfCustom value) {
        this.customFields = value;
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
