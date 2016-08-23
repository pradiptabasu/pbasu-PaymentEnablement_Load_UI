
package com.oracle.xmlns.payments_api_enablement.paymentscustomervalidation.paymentscustomervalidationbpelprocess;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import org.bank.payments.ObjectFactory;
import org.bank.payments.PaymentRequest;
import org.bank.payments.PaymentValidationResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebService(name = "PaymentsCustomerValidationBPELProcess",
            targetNamespace =
            "http://xmlns.oracle.com/Payments_API_Enablement/PaymentsCustomerValidation/PaymentsCustomerValidationBPELProcess")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface PaymentsCustomerValidationBPELProcess {


    /**
     *
     * @param payload
     * @return
     *     returns org.bank.payments.PaymentValidationResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "paymentValidationResponse", targetNamespace = "http://www.bank.org/payments",
               partName = "payload")
    public PaymentValidationResponse process(@WebParam(name = "PaymentRequest",
                                                       targetNamespace = "http://www.bank.org/payments",
                                                       partName = "payload") PaymentRequest payload);

}
