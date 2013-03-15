//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.13 at 03:55:07 PM EDT 
//


package com.ibm.jbatch.jsl.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.ibm.jbatch.container.jsl.TransitionElement;


/**
 * <p>Java class for Step complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Step">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{http://xmlns.jcp.org/xml/ns/javaee}Properties" minOccurs="0"/>
 *         &lt;element name="listeners" type="{http://xmlns.jcp.org/xml/ns/javaee}Listeners" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="batchlet" type="{http://xmlns.jcp.org/xml/ns/javaee}Batchlet"/>
 *           &lt;element name="chunk" type="{http://xmlns.jcp.org/xml/ns/javaee}Chunk"/>
 *         &lt;/choice>
 *         &lt;element name="partition" type="{http://xmlns.jcp.org/xml/ns/javaee}Partition" minOccurs="0"/>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}TransitionElements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="start-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allow-start-if-complete" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Step", propOrder = {
    "properties",
    "listeners",
    "batchlet",
    "chunk",
    "partition",
    "controlElements"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
/**
 * Modified post-XJC-gen by custom JSR352 RI build logic 
 * since we can't seem to get JAXB's XJC to generate 
 * elements implementing a common interface. 
 *
 * This custom logic adds the interface implementation : 
 *      implements com.ibm.jbatch.container.jsl.ExecutionElement 
 */
 public class Step implements com.ibm.jbatch.container.jsl.ExecutionElement {

    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected JSLProperties properties;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Listeners listeners;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Batchlet batchlet;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Chunk chunk;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Partition partition;
    @XmlElements({
        @XmlElement(name = "next", type = Next.class),
        @XmlElement(name = "fail", type = Fail.class),
        @XmlElement(name = "end", type = End.class),
        @XmlElement(name = "stop", type = Stop.class)
    })
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected List<TransitionElement> controlElements;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String id;
    @XmlAttribute(name = "start-limit")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String startLimit;
    @XmlAttribute(name = "allow-start-if-complete")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String allowStartIfComplete;
    @XmlAttribute(name = "next")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String nextFromAttribute;
    @XmlAttribute(name = "abstract")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String _abstract;
    @XmlAttribute(name = "parent")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String parent;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JSLProperties }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public JSLProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JSLProperties }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setProperties(JSLProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the listeners property.
     * 
     * @return
     *     possible object is
     *     {@link Listeners }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Listeners getListeners() {
        return listeners;
    }

    /**
     * Sets the value of the listeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listeners }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setListeners(Listeners value) {
        this.listeners = value;
    }

    /**
     * Gets the value of the batchlet property.
     * 
     * @return
     *     possible object is
     *     {@link Batchlet }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Batchlet getBatchlet() {
        return batchlet;
    }

    /**
     * Sets the value of the batchlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Batchlet }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setBatchlet(Batchlet value) {
        this.batchlet = value;
    }

    /**
     * Gets the value of the chunk property.
     * 
     * @return
     *     possible object is
     *     {@link Chunk }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Chunk getChunk() {
        return chunk;
    }

    /**
     * Sets the value of the chunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chunk }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setChunk(Chunk value) {
        this.chunk = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link Partition }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Partition getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partition }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setPartition(Partition value) {
        this.partition = value;
    }

    /**
     * Gets the value of the controlElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Next }
     * {@link Fail }
     * {@link End }
     * {@link Stop }
     * 
     * 
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public List<TransitionElement> getControlElements() {
        if (controlElements == null) {
            controlElements = new ArrayList<TransitionElement>();
        }
        return this.controlElements;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
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
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the startLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getStartLimit() {
        return startLimit;
    }

    /**
     * Sets the value of the startLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setStartLimit(String value) {
        this.startLimit = value;
    }

    /**
     * Gets the value of the allowStartIfComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getAllowStartIfComplete() {
        return allowStartIfComplete;
    }

    /**
     * Sets the value of the allowStartIfComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setAllowStartIfComplete(String value) {
        this.allowStartIfComplete = value;
    }

    /**
     * Gets the value of the nextFromAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getNextFromAttribute() {
        return nextFromAttribute;
    }

    /**
     * Sets the value of the nextFromAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setNextFromAttribute(String value) {
        this.nextFromAttribute = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-13T03:55:07-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setParent(String value) {
        this.parent = value;
    }

    /*
     * Appended by build tooling.
     */
	public String toString() {
	    StringBuffer buf = new StringBuffer(100);
	    buf.append("Step: id=" + id);
	    buf.append(", startLimit=" + startLimit);
	    buf.append(", allowStartIfComplete=" + allowStartIfComplete);
	    buf.append("\n");
	    buf.append("Properties = " + com.ibm.jbatch.jsl.util.PropertiesToStringHelper.getString(properties));
	    buf.append("\n");
	    if (batchlet != null) {
	    	buf.append("Contains batchlet=" + batchlet);
	    }
	    if (chunk != null) {
	    	buf.append("Contains chunk=" + chunk);
	    }
	    return buf.toString();
    }
}