
package com.oracle.xmlns.payments_api_enablement.paymentscustomervalidation.paymentscustomervalidationbpelprocess;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "paymentscustomervalidationbpelprocess_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/Payments_API_Enablement/PaymentsCustomerValidation/PaymentsCustomerValidationBPELProcess",
                  wsdlLocation =
                  "http://oa8104.us.oracle.com:7003/soa-infra/services/default/PaymentsCustomerValidation/paymentscustomervalidationbpelprocess_client_ep?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FPayments_API_Enablement%2FPaymentsCustomerValidation%2FPaymentsCustomerValidationBPELProcess%7Dpaymentscustomervalidationbpelprocess_client_ep")
public class PaymentscustomervalidationbpelprocessClientEp extends Service {

    private final static URL PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_EXCEPTION;
    private final static QName PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/Payments_API_Enablement/PaymentsCustomerValidation/PaymentsCustomerValidationBPELProcess",
                  "paymentscustomervalidationbpelprocess_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://oa8104.us.oracle.com:7003/soa-infra/services/default/PaymentsCustomerValidation/paymentscustomervalidationbpelprocess_client_ep?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FPayments_API_Enablement%2FPaymentsCustomerValidation%2FPaymentsCustomerValidationBPELProcess%7Dpaymentscustomervalidationbpelprocess_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_WSDL_LOCATION = url;
        PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_EXCEPTION = e;
    }

    public PaymentscustomervalidationbpelprocessClientEp() {
        super(__getWsdlLocation(), PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_QNAME);
    }

    public PaymentscustomervalidationbpelprocessClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_QNAME, features);
    }

    public PaymentscustomervalidationbpelprocessClientEp(URL wsdlLocation) {
        super(wsdlLocation, PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_QNAME);
    }

    public PaymentscustomervalidationbpelprocessClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_QNAME, features);
    }

    public PaymentscustomervalidationbpelprocessClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentscustomervalidationbpelprocessClientEp(URL wsdlLocation, QName serviceName,
                                                         WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PaymentsCustomerValidationBPELProcess
     */
    @WebEndpoint(name = "PaymentsCustomerValidationBPELProcess_pt")
    public PaymentsCustomerValidationBPELProcess getPaymentsCustomerValidationBPELProcessPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/Payments_API_Enablement/PaymentsCustomerValidation/PaymentsCustomerValidationBPELProcess",
                                       "PaymentsCustomerValidationBPELProcess_pt"),
                             PaymentsCustomerValidationBPELProcess.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentsCustomerValidationBPELProcess
     */
    @WebEndpoint(name = "PaymentsCustomerValidationBPELProcess_pt")
    public PaymentsCustomerValidationBPELProcess getPaymentsCustomerValidationBPELProcessPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/Payments_API_Enablement/PaymentsCustomerValidation/PaymentsCustomerValidationBPELProcess",
                                       "PaymentsCustomerValidationBPELProcess_pt"),
                             PaymentsCustomerValidationBPELProcess.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_EXCEPTION != null) {
            throw PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_EXCEPTION;
        }
        return PAYMENTSCUSTOMERVALIDATIONBPELPROCESSCLIENTEP_WSDL_LOCATION;
    }

}
