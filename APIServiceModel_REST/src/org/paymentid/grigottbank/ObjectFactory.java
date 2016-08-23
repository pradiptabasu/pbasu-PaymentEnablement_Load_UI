
package org.paymentid.grigottbank;

import javax.annotation.Generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.paymentid.grigottbank package.
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
@Generated("run|67a325e0-d537-46d2-9131-eba107f445ea")
public class ObjectFactory {

    private final static QName _PaymentIdRequest_QNAME =
        new QName("http://www.grigottbank.paymentid.org", "paymentIdRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.paymentid.grigottbank
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultResponse }
     *
     */
    public FaultResponse createFaultResponse() {
        return new FaultResponse();
    }

    /**
     * Create an instance of {@link PaymentIdResponse }
     *
     */
    public PaymentIdResponse createPaymentIdResponse() {
        return new PaymentIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.grigottbank.paymentid.org", name = "paymentIdRequest")
    public JAXBElement<Object> createPaymentIdRequest(Object value) {
        return new JAXBElement<Object>(_PaymentIdRequest_QNAME, Object.class, null, value);
    }

}
