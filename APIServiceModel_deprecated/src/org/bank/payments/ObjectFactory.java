
package org.bank.payments;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.bank.payments package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.bank.payments
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentRequest }
     *
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link PaymentValidationResponse }
     *
     */
    public PaymentValidationResponse createPaymentValidationResponse() {
        return new PaymentValidationResponse();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     *
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

}
