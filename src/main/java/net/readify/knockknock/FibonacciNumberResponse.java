
package net.readify.knockknock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="FibonacciNumberResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "fibonacciNumberResult"
})
@XmlRootElement(name = "FibonacciNumberResponse")
public class FibonacciNumberResponse {

    @XmlElement(name = "FibonacciNumberResult")
    protected Long fibonacciNumberResult;

    /**
     * Gets the value of the fibonacciNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFibonacciNumberResult() {
        return fibonacciNumberResult;
    }

    /**
     * Sets the value of the fibonacciNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFibonacciNumberResult(Long value) {
        this.fibonacciNumberResult = value;
    }

}
