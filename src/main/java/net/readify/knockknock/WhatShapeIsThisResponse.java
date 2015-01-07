
package net.readify.knockknock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="WhatShapeIsThisResult" type="{http://KnockKnock.readify.net}TriangleType" minOccurs="0"/>
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
    "whatShapeIsThisResult"
})
@XmlRootElement(name = "WhatShapeIsThisResponse")
public class WhatShapeIsThisResponse {

    @XmlElement(name = "WhatShapeIsThisResult")
    @XmlSchemaType(name = "string")
    protected TriangleType whatShapeIsThisResult;

    /**
     * Gets the value of the whatShapeIsThisResult property.
     * 
     * @return
     *     possible object is
     *     {@link TriangleType }
     *     
     */
    public TriangleType getWhatShapeIsThisResult() {
        return whatShapeIsThisResult;
    }

    /**
     * Sets the value of the whatShapeIsThisResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangleType }
     *     
     */
    public void setWhatShapeIsThisResult(TriangleType value) {
        this.whatShapeIsThisResult = value;
    }

}
