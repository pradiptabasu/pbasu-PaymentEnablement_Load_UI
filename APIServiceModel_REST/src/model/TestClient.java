package model;

import java.math.BigInteger;

import java.net.URI;

import javax.ws.rs.client.Client;

import org.bank.payments.PaymentRequest;
import org.bank.payments.PaymentValidationResponse;

import org.gringottbank.oracle.demo.PaymentBookingRequest;
import org.gringottbank.oracle.demo.PaymentBookingResponse;

public class TestClient {
    public static void main(String args[])
    {
        Client getPaymentIdClient = GetPaymentID.createClient();
        GetPaymentID.Root getpaymentidroot = GetPaymentID.root(getPaymentIdClient);
        Client fundsAvailableClient = FundsAvailableAPI.createClient();
        FundsAvailableAPI.Root fundsavailableapiroot = FundsAvailableAPI.root(fundsAvailableClient,URI.create("http://oa8102.us.oracle.com:8001/FundsAvailableAPI/1/"));
        Client paymentProcessingclient = PaymentProcessingAPI.createClient();
        PaymentProcessingAPI.Root paymentprocessingapiroot = PaymentProcessingAPI.root(paymentProcessingclient,URI.create("http://oa8102.us.oracle.com:8001/PaymentProcessingAPI/1/"));
        
        long paymentReqId = 0;
        PaymentValidationResponse fundsAvailableResponse = new PaymentValidationResponse();
        PaymentBookingResponse paymentBookingResponse = new PaymentBookingResponse();
        String CustomerToken = "26";
        String FinTechID = "InnrCircleCars";
        String Region = "EMEA";
        String PaymentCategory = "CARS";
        float RequiredFunds = 20000;
        // add your code here
        
        try{
            paymentReqId = getpaymentidroot.getAsPaymentIdResponse().getPaymentId();
            System.out.println(paymentReqId);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        try {
            PaymentRequest fundsAvailableRequest = new PaymentRequest();
            fundsAvailableRequest.setCustomerToken(CustomerToken);
            fundsAvailableRequest.setFintechPaymentRequestId(BigInteger.valueOf(paymentReqId));
            fundsAvailableRequest.setFinTechID(FinTechID);
            fundsAvailableRequest.setRegion(Region);
            fundsAvailableRequest.setRequiredFunds(RequiredFunds);
            fundsAvailableRequest.setPaymentCategory(PaymentCategory);
            //        fundsAvailableRequest.setSalesChannel("");
            //        fundsAvailableRequest.setTechnicalChannel("");
            fundsAvailableResponse = fundsavailableapiroot.postJsonAsPaymentValidationResponse(fundsAvailableRequest);
            System.out.println(fundsAvailableResponse.getPaymentValidationStatus());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        try {
            if((fundsAvailableResponse.getPaymentValidationStatus().equalsIgnoreCase("Approved based on Customer Asset and Credit")) || (fundsAvailableResponse.getPaymentValidationStatus().equalsIgnoreCase("Approved based on Customer Asset"))) {
                PaymentBookingRequest paymentBookingRequest = new PaymentBookingRequest();
                paymentBookingRequest.setFintechPaymentRequestId(BigInteger.valueOf(paymentReqId));
                paymentBookingRequest.setCashAmount(fundsAvailableResponse.getCashAmount());
                paymentBookingRequest.setCreditAmount(fundsAvailableResponse.getCreditAmount());
                paymentBookingRequest.setCustomerToken(CustomerToken);
                paymentBookingRequest.setFinTechID(FinTechID);
                paymentBookingRequest.setPaymentCategory(PaymentCategory);
                paymentBookingRequest.setRegion(Region);
//                paymentBookingRequest.setSalesChannel(value);
//                paymentBookingRequest.setTechnicalChannel(value);
                paymentBookingResponse = paymentprocessingapiroot.postJsonAsPaymentBookingResponse(paymentBookingRequest);
                System.out.println(paymentBookingResponse.getPaymentBookingStatus());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }    
}
