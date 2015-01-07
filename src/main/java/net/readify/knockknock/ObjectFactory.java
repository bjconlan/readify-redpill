
package net.readify.knockknock;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.readify.knockknock package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TriangleType_QNAME = new QName("http://KnockKnock.readify.net", "TriangleType");
    private final static QName _ReverseWordsS_QNAME = new QName("http://KnockKnock.readify.net", "s");
    private final static QName _ReverseWordsResponseReverseWordsResult_QNAME = new QName("http://KnockKnock.readify.net", "ReverseWordsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.readify.knockknock
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FibonacciNumberResponse }
     * 
     */
    public FibonacciNumberResponse createFibonacciNumberResponse() {
        return new FibonacciNumberResponse();
    }

    /**
     * Create an instance of {@link ReverseWords }
     * 
     */
    public ReverseWords createReverseWords() {
        return new ReverseWords();
    }

    /**
     * Create an instance of {@link WhatShapeIsThisResponse }
     * 
     */
    public WhatShapeIsThisResponse createWhatShapeIsThisResponse() {
        return new WhatShapeIsThisResponse();
    }

    /**
     * Create an instance of {@link WhatShapeIsThis }
     * 
     */
    public WhatShapeIsThis createWhatShapeIsThis() {
        return new WhatShapeIsThis();
    }

    /**
     * Create an instance of {@link ReverseWordsResponse }
     * 
     */
    public ReverseWordsResponse createReverseWordsResponse() {
        return new ReverseWordsResponse();
    }

    /**
     * Create an instance of {@link WhatIsYourTokenResponse }
     * 
     */
    public WhatIsYourTokenResponse createWhatIsYourTokenResponse() {
        return new WhatIsYourTokenResponse();
    }

    /**
     * Create an instance of {@link FibonacciNumber }
     * 
     */
    public FibonacciNumber createFibonacciNumber() {
        return new FibonacciNumber();
    }

    /**
     * Create an instance of {@link WhatIsYourToken }
     * 
     */
    public WhatIsYourToken createWhatIsYourToken() {
        return new WhatIsYourToken();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriangleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://KnockKnock.readify.net", name = "TriangleType")
    public JAXBElement<TriangleType> createTriangleType(TriangleType value) {
        return new JAXBElement<TriangleType>(_TriangleType_QNAME, TriangleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://KnockKnock.readify.net", name = "s", scope = ReverseWords.class)
    public JAXBElement<String> createReverseWordsS(String value) {
        return new JAXBElement<String>(_ReverseWordsS_QNAME, String.class, ReverseWords.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://KnockKnock.readify.net", name = "ReverseWordsResult", scope = ReverseWordsResponse.class)
    public JAXBElement<String> createReverseWordsResponseReverseWordsResult(String value) {
        return new JAXBElement<String>(_ReverseWordsResponseReverseWordsResult_QNAME, String.class, ReverseWordsResponse.class, value);
    }

}
