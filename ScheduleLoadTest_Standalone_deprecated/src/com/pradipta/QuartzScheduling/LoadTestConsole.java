package com.pradipta.QuartzScheduling;

import com.oracle.xmlns.paymentenablement_soa.paymentbookingprocess.bankpaymentbookingprocess.BankPaymentBookingProcess;
import com.oracle.xmlns.paymentenablement_soa.paymentbookingprocess.bankpaymentbookingprocess.BankpaymentbookingprocessClientEp;
import com.oracle.xmlns.payments_api_enablement.paymentscustomervalidation.paymentscustomervalidationbpelprocess.PaymentsCustomerValidationBPELProcess;
import com.oracle.xmlns.payments_api_enablement.paymentscustomervalidation.paymentscustomervalidationbpelprocess.PaymentscustomervalidationbpelprocessClientEp;

import java.math.BigInteger;

import org.bank.payments.PaymentRequest;
import org.bank.payments.PaymentValidationResponse;

import org.gringottbank.oracle.demo.PaymentBookingRequest;
import org.gringottbank.oracle.demo.PaymentBookingResponse;


public class LoadTestConsole implements Runnable {

    protected BigInteger paymentRequestId;
    protected String customerID;
    protected float paymentAmount;
    protected String finTechID;
    protected String paymentCategory;
    protected String salesChannel;
    protected String technicalChannel;
    protected String region;


    public LoadTestConsole(BigInteger paymentRequestId, String customerID, float paymentAmount, String finTechID,
                           String paymentCategory, String salesChannel, String technicalChannel, String region) {
        super();
        this.paymentRequestId = paymentRequestId;
        this.customerID = customerID;
        this.paymentAmount = paymentAmount;
        this.finTechID = finTechID;
        this.paymentCategory = paymentCategory;
        this.salesChannel = salesChannel;
        this.technicalChannel = technicalChannel;
        this.region = region;
    }

    @Override
    public void run() {
        try {
            PaymentscustomervalidationbpelprocessClientEp paymentscustomervalidationbpelprocessClientEp =
                new PaymentscustomervalidationbpelprocessClientEp();
            PaymentsCustomerValidationBPELProcess paymentsCustomerValidationBPELProcess =
                paymentscustomervalidationbpelprocessClientEp.getPaymentsCustomerValidationBPELProcessPt();
            // Add your code to call the desired methods.
            PaymentRequest payload = new PaymentRequest();
            payload.setCustomerID(customerID);
            payload.setFinTechID(finTechID);
            payload.setPaymentAmount(6000);
            payload.setPaymentCategory(paymentCategory);
            payload.setPaymentRequestId(paymentRequestId);
            payload.setRegion(region);
            payload.setSalesChannel(salesChannel);
            payload.setTechnicalChannel(technicalChannel);

            PaymentValidationResponse response = paymentsCustomerValidationBPELProcess.process(payload);

            if (response.getPaymentValidationStatus().equalsIgnoreCase("MANUAL APPROVAL REQUIRED")) {
                BankpaymentbookingprocessClientEp bankpaymentbookingprocessClientEp =
                    new BankpaymentbookingprocessClientEp();
                BankPaymentBookingProcess bankPaymentBookingProcess =
                    bankpaymentbookingprocessClientEp.getBankPaymentBookingProcessPt();


                PaymentBookingRequest finalReq = new PaymentBookingRequest();
                finalReq.setCustomerAsset(response.getCustomerAsset());
                finalReq.setCustomerID(customerID);
                finalReq.setFinTechID(finTechID);
                finalReq.setLoanAmount(response.getLoanAmount());
                finalReq.setPaymentCategory(paymentCategory);
                finalReq.setPaymentID(paymentRequestId);
                finalReq.setRegion(region);
                finalReq.setSalesChannel(salesChannel);
                finalReq.setTechnicalChannel(technicalChannel);
                PaymentBookingResponse finalResp = bankPaymentBookingProcess.process(finalReq);

                System.out.println("*****    CustomerID " + customerID + " %%%%%% PaymentID " + paymentRequestId +
                                   " finalResponse : " + finalResp.getPaymentBookingStatus());
            }
        } catch (Exception e) {
            System.out.println("*******************************    CustomerID " + customerID + " %%%%%% PaymentID" +
                               paymentRequestId + "     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            e.printStackTrace();
        }
    }
}
